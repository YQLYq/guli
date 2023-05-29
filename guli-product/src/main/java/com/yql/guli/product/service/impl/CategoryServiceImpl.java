package com.yql.guli.product.service.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.CategoryBrandRelationDao;
import com.yql.guli.product.dao.CategoryDao;
import com.yql.guli.product.dto.CategoryDTO;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.CategoryService;
import com.yql.guli.product.vo.Level2Vo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 商品三级分类
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@Slf4j
public class CategoryServiceImpl extends CrudServiceImpl<CategoryDao, CategoryEntity, CategoryDTO> implements CategoryService {

    private final CategoryBrandRelationDao categoryBrandRelationDao;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private RedissonClient redisson;

    @Autowired
    public CategoryServiceImpl(CategoryBrandRelationDao categoryBrandRelationDao) {
        this.categoryBrandRelationDao = categoryBrandRelationDao;
    }

    @Override
    public QueryWrapper<CategoryEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<CategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public List<CategoryEntity> listWithTree() {
        return baseDao.selectList(null);
    }

    @Override
    public void deleteMenuById(List<Long> ids) {
        //TODO 1.检查 有没有被引用
        baseDao.deleteBatchIds(ids);
    }
    /**查询id路径*/
    @Override
    public Long[] findCateLogIds(Long catelogId) {
        ArrayList<Long>  list = new ArrayList<>();
        getCatPathId(list,catelogId);
        // 翻转 ArrayList 中所有元素的顺序
        Collections.reverse(list);
        // 将 ArrayList 转换成数组
        return list.toArray(new Long[0]);
    }
    /**
     * 级联更新所有关联的数据
     * @author yql
     * @date 14:43 2023/5/5
     * @param dto
     * @return void
     **/
    @Override
    @Transactional
    @Caching(evict = {
            @CacheEvict(value = "category", key = "'getLevel1Categorys'"),
            @CacheEvict(value = "category",key = "'getLevel2Categorys'")
    })
    public void updateCascade(CategoryDTO dto) {
        this.update(dto);
        categoryBrandRelationDao.updateCatelogNameAndCatelogId(dto.getName(),dto.getCatId());
    }

    /**查询父节点添加到list*/
    private void getCatPathId(@NotNull ArrayList<Long> list, Long catelogId) {
        //查询entity
        CategoryEntity categoryEntity = baseDao.selectById(catelogId);
        list.add(catelogId);
        while (categoryEntity.getParentCid() != 0) {
            Long parentId = categoryEntity.getParentCid();
            list.add(parentId);
            categoryEntity = baseDao.selectById(parentId);
        }
    }


    /**
     * 查询一级分类
     *
     * @return java.util.List<com.yql.guli.product.entity.CategoryEntity>
     * @author yql
     * @date 19:43 2023/5/17
     **/
    @Override
    @Cacheable(value = "category",key = "#root.method.name",sync = true)
    public List<CategoryEntity> getLevel1Categorys() {
        LambdaQueryWrapper<CategoryEntity> categoryEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        return this.list(categoryEntityLambdaQueryWrapper.eq(CategoryEntity::getCatLevel, 1));
    }

    @Cacheable(value = "category",key = "#root.method.name",sync = true)
    @Override
    public Map<String, List<Level2Vo>> getLevel2Categorys() {
        List<CategoryEntity> entityList = baseDao.selectList(null);
        System.out.println("diaoy");
        List<CategoryEntity> level1Categorys = getList(entityList, 0L);
        return level1Categorys.stream().collect(Collectors.toMap(k -> k.getCatId().toString(), categoryEntity -> {
            List<CategoryEntity> list = getList(entityList, categoryEntity.getCatId());
            List<Level2Vo> level2Vos = null;
            if (list != null) {
                level2Vos = list.stream().map(categoryEntity2 -> {
                    Level2Vo level2Vo = new Level2Vo(String.valueOf(categoryEntity.getCatId()), String.valueOf(categoryEntity2.getCatId()), categoryEntity2.getName());
                    List<CategoryEntity> list1 = getList(entityList, categoryEntity2.getCatId());
                    if (list1 != null) {
                        List<Level2Vo.CateLevel3> collect = list1.stream().map(categoryEntity3 -> new Level2Vo.CateLevel3(categoryEntity2.getCatId().toString(), categoryEntity3.getCatId().toString(), categoryEntity3.getName())).collect(Collectors.toList());
                        level2Vo.setCatalog3List(collect);
                    }
                    return level2Vo;
                }).collect(Collectors.toList());
            }
            return level2Vos;
        }));
    }

    /**
     * 获取二级分类
     *
     * @return java.util.Map<java.lang.String, java.util.List < com.yql.guli.product.vo.Level2Vo>>
     * @author yql
     * @date 22:00 2023/5/17
     **/

    public Map<String, List<Level2Vo>> getLevel2() {
        String catelogJson = redisTemplate.opsForValue().get("catelogJson");
        if (StringUtils.isEmpty(catelogJson)) {
            log.info("缓存没命中 查询数据库");
            Map<String, List<Level2Vo>> level2CategorysFromDb = null;
            try {
                level2CategorysFromDb = getLevel2CategorysFromDbWithRedisLock();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return level2CategorysFromDb;
        }
        log.info("缓存命中 返回数据");
        return JSON.parseObject(catelogJson, new TypeReference<Map<String, List<Level2Vo>>>() {
        });

    }

    public Map<String, List<Level2Vo>> getLevel2CategorysFromDbWithRedisLock() throws InterruptedException {
        RLock mylcok = redisson.getLock("catelogJsonLock");

        mylcok.lock(20,TimeUnit.SECONDS);
        Map<String, List<Level2Vo>> stringListMap = null;
        try {
             stringListMap = getStringListMap();
        } finally {
            mylcok.unlock();
        }
        return stringListMap;
    }

    private Map<String, List<Level2Vo>> getStringListMap() {
        String catelogJson = redisTemplate.opsForValue().get("catelogJson");
        if (StringUtils.isNotEmpty(catelogJson)) {
            return JSON.parseObject(catelogJson, new TypeReference<Map<String, List<Level2Vo>>>() {
            });
        }
        log.info("调用数据库");
        List<CategoryEntity> entityList = baseDao.selectList(null);
        List<CategoryEntity> level1Categorys = getList(entityList, 0L);
        Map<String, List<Level2Vo>> listMap = level1Categorys.stream().collect(Collectors.toMap(k -> k.getCatId().toString(), categoryEntity -> {
            List<CategoryEntity> list = getList(entityList, categoryEntity.getCatId());
            List<Level2Vo> level2Vos = null;
            if (list != null) {
                level2Vos = list.stream().map(categoryEntity2 -> {
                    Level2Vo level2Vo = new Level2Vo(String.valueOf(categoryEntity.getCatId()), String.valueOf(categoryEntity2.getCatId()), categoryEntity2.getName());
                    List<CategoryEntity> list1 = getList(entityList, categoryEntity2.getCatId());
                    if (list1 != null) {
                        List<Level2Vo.CateLevel3> collect = list1.stream().map(categoryEntity3 -> new Level2Vo.CateLevel3(categoryEntity2.getCatId().toString(), categoryEntity3.getCatId().toString(), categoryEntity3.getName())).collect(Collectors.toList());
                        level2Vo.setCatalog3List(collect);
                    }
                    return level2Vo;
                }).collect(Collectors.toList());
            }
            return level2Vos;
        }));
        redisTemplate.opsForValue().set("catelogJson", JSON.toJSONString(listMap), 1, TimeUnit.DAYS);
        return listMap;
    }

    public Map<String, List<Level2Vo>> getLevel2CategorysFromDb() {
        //TODO 1.本地锁 synchronized JUC(lock) 在分布式下想要锁住所有,所有分布式锁
        synchronized (this) {
            return getStringListMap();
        }

    }

    private List<CategoryEntity> getList(List<CategoryEntity> entityList, Long parent_cid) {
        return entityList.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(parent_cid)).collect(Collectors.toList());
    }
}