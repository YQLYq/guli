package com.yql.guli.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.product.dao.AttrAttrgroupRelationDao;
import com.yql.guli.product.dao.AttrDao;
import com.yql.guli.product.dao.AttrGroupDao;
import com.yql.guli.product.dao.CategoryDao;
import com.yql.guli.product.dto.AttrDTO;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import com.yql.guli.product.entity.AttrEntity;
import com.yql.guli.product.entity.AttrGroupEntity;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.AttrService;
import com.yql.guli.product.service.CategoryService;
import com.yql.guli.product.vo.AttrInfoVO;
import com.yql.guli.product.vo.AttrVo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@NoArgsConstructor
@Data
@SpringBootTest
class ProductApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void testConfig(){
        ValueOperations<String,String>ops = stringRedisTemplate.opsForValue();
        ops.set("hello", "word_"+UUID.randomUUID().toString());
        System.out.println(ops.get("hello"));
    }

    @Test
    public void testRedisson(){
        System.out.println(redissonClient);
    }


    @Autowired
    private AttrAttrgroupRelationDao relationDao;
    @Autowired
    private AttrGroupDao attrGroupDao;
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private AttrDao attrDao;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private AttrService attrService;
    
    public QueryWrapper<AttrEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<AttrEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    
    public void saveAttr(AttrDTO dto) {
        attrService.saveDto(dto);
        AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = new AttrAttrgroupRelationEntity();
        attrAttrgroupRelationEntity.setAttrId(dto.getAttrId());
        attrAttrgroupRelationEntity.setAttrGroupId(dto.getAttrGroupId());
        relationDao.insert(attrAttrgroupRelationEntity);
    }

    
    public AttrInfoVO getInfo(Long id) {
        AttrInfoVO attrInfoVO = new AttrInfoVO();
        AttrEntity attrEntity = attrDao.selectById(id);
        BeanUtils.copyProperties(attrEntity, attrInfoVO);
        AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = relationDao.selectOne(new LambdaQueryWrapper<AttrAttrgroupRelationEntity>()
                .eq(AttrAttrgroupRelationEntity::getAttrId, attrInfoVO.getAttrId()));
        if (attrAttrgroupRelationEntity != null) {
            attrInfoVO.setAttrGroupId(attrAttrgroupRelationEntity.getAttrGroupId());
            AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(attrAttrgroupRelationEntity.getAttrGroupId());
            if (attrGroupEntity != null) {
                attrInfoVO.setGroupName(attrGroupEntity.getAttrGroupName());
            }
        }
        Long[] cateLogIds = categoryService.findCateLogIds(attrInfoVO.getCatelogId());
        attrInfoVO.setCatelogPath(cateLogIds);
        CategoryEntity categoryEntity = categoryDao.selectById(attrInfoVO.getCatelogId());

        attrInfoVO.setCatelogName(categoryEntity.getName());
        return attrInfoVO;
    }

    
    public PageUtils<AttrVo> queryBaseAttrPage(Map<String, Object> map, Long catelogid) {
        PageUtils<AttrVo> pageUtils = new PageUtils<AttrVo>();

        LambdaQueryWrapper<AttrEntity> attrEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //如果catelogid不为空 查询
        if (catelogid != 0) {
            attrEntityLambdaQueryWrapper.eq(AttrEntity::getCatelogId, catelogid);
        }
        //获取key
        String key = (String) map.get("key");
        //判断key是否为空 否则查询
        if (!StringUtils.isEmpty(key)) {
            attrEntityLambdaQueryWrapper.and((wrapper) -> {
                wrapper.eq(AttrEntity::getAttrId, key).or().like(AttrEntity::getAttrName, key);
            });
        }
        //查询page
        IPage<AttrEntity> page = attrService.page(
                new PageUtil<AttrEntity>().getPage(map),
                attrEntityLambdaQueryWrapper
        );
        //获取数据
        List<AttrEntity> records = page.getRecords();
        //获取新的list 加入cateName 和 groupName
        List<AttrVo> collect = records.stream().map((attrEntity -> {
            AttrVo attrVo = new AttrVo();
            //复制过去
            BeanUtils.copyProperties(attrEntity, attrVo);
            AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = relationDao.selectOne(new LambdaQueryWrapper<AttrAttrgroupRelationEntity>()
                    .eq(AttrAttrgroupRelationEntity::getAttrId, attrEntity.getAttrId()));
            if (attrAttrgroupRelationEntity != null) {
                AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(attrAttrgroupRelationEntity.getAttrGroupId());
                attrVo.setGroupName(attrGroupEntity.getAttrGroupName());
            }
            CategoryEntity categoryEntity = categoryDao.selectById(attrEntity.getCatelogId());
            if (categoryEntity != null) {
                attrVo.setCatelogName(categoryEntity.getName());
            }
            return attrVo;
        })).collect(Collectors.toList());
        pageUtils.setList(collect);
        return pageUtils;
    }



}
