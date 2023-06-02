package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.constant.ProductConstant;
import com.yql.guli.common.page.PageData;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.product.dao.AttrAttrgroupRelationDao;
import com.yql.guli.product.dao.AttrDao;
import com.yql.guli.product.dao.AttrGroupDao;
import com.yql.guli.product.dto.AttrGroupDTO;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import com.yql.guli.product.entity.AttrEntity;
import com.yql.guli.product.entity.AttrGroupEntity;
import com.yql.guli.product.entity.ProductAttrValueEntity;
import com.yql.guli.product.service.AttrGroupService;
import com.yql.guli.product.service.ProductAttrValueService;
import com.yql.guli.product.vo.AttrGroupBaseVo;
import com.yql.guli.product.vo.AttrGroupRelationVo;
import com.yql.guli.product.vo.SpuItemAttrGroupVo;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class AttrGroupServiceImpl extends CrudServiceImpl<AttrGroupDao, AttrGroupEntity, AttrGroupDTO> implements AttrGroupService {

    private final AttrDao attrDao;
    private final AttrAttrgroupRelationDao attrAttrgroupRelationDao;
    private final AttrGroupDao attrGroupDao;
    private ProductAttrValueService productAttrValueService;

    @Override
    public QueryWrapper<AttrGroupEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    /**
     * 查询关键
     *
     * @param params catelogId
     * @return com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper<com.yql.guli.product.entity.AttrGroupEntity>
     * @author yql
     * @date 19:54 2023/5/3
     **/
    public LambdaQueryWrapper<AttrGroupEntity> getWrapper(Map<String, Object> params, Long catelogId) {
        String key = (String) params.get("key");

        LambdaQueryWrapper<AttrGroupEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(AttrGroupEntity::getCatelogId, catelogId);
        if (!StringUtils.isEmpty(key)) {
            wrapper.and(obj -> obj.eq(AttrGroupEntity::getAttrGroupId, key).or().like(AttrGroupEntity::getAttrGroupName, key));
            return wrapper;
        }

        return wrapper;
    }

    /**
     * 根据AttrGroupId 获取分组关联的所有属性
     *
     * @param id 分组id
     * @return Optional
     * @author yql
     * @date 23:10 2023/5/8
     **/
    @Override
    public Optional<List<AttrEntity>> getAttrByAttrGroup(Long id) {
        if (id == null || id == 0) {
            return Optional.empty();
        }
        List<AttrEntity> attrs = attrDao.selectList(
                new LambdaQueryWrapper<AttrEntity>()
                        .inSql(AttrEntity::getAttrId, String.format(
                                "select attr_id from pms_attr_attrgroup_relation WHERE attr_group_id =  %d", id)
                        )
        );
        return attrs.isEmpty() ? Optional.empty() : Optional.of(attrs);
    }

    @Override
    public PageData<AttrGroupDTO> page(Map<String, Object> params, Long catelogId) {

        if (catelogId == 0) {
            return this.page(params);
        } else {
            IPage<AttrGroupEntity> attrGroupEntityPage = baseDao.selectPage(
                    getPage(params, null, false),
                    this.getWrapper(params, catelogId)
            );
            return getPageData(attrGroupEntityPage, currentDtoClass());
        }

    }

    /**
     * 删除 分组关联的属性
     *
     * @param relationVos 存储 attrid attrgroupid
     * @author yql
     * @date 11:38 2023/5/9
     **/
    @Override
    public void deleteAttrRelation(AttrGroupRelationVo[] relationVos) {
        List<AttrAttrgroupRelationEntity> attrgroupRelationEntities = Arrays.stream(relationVos).map(relationVo -> {
            AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = new AttrAttrgroupRelationEntity();
            BeanUtils.copyProperties(relationVo, attrAttrgroupRelationEntity);
            return attrAttrgroupRelationEntity;
        }).collect(Collectors.toList());
        Optional.of(attrgroupRelationEntities).ifPresent(attrAttrgroupRelationEntities -> attrAttrgroupRelationDao.deleteBatchRelation(attrgroupRelationEntities));
    }

    /**
     * 获取当前分类未关联的属性
     *
     * @param map 请求参数
     * @param id  分组id
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.product.entity.AttrEntity>
     * @author yql
     * @date 13:34 2023/5/9
     **/
    @Override
    public Optional<PageUtils<AttrEntity>> getNoAttrRelation(Map<String, Object> map, Long id) {
        //判断
        if (id == 0 || map.isEmpty()) {
            return Optional.empty();
        }
        //当前分组只能关联自己所属分类里面的所有属性
        String key = (String) map.get("key");
        LambdaQueryWrapper<AttrEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (key != null) {
            queryWrapper.eq(AttrEntity::getAttrId, key).or().like(AttrEntity::getAttrName, key);
        }
        AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(id);
        Long catelogId = attrGroupEntity.getCatelogId();
        //  当前分组只能关联其他分组没关联的属性
        //当前分类下的其他分组
        List<Long> attrGroupIds = attrGroupDao.selectList(new LambdaQueryWrapper<AttrGroupEntity>()
                .eq(AttrGroupEntity::getCatelogId, catelogId)).stream().map(AttrGroupEntity::getAttrGroupId).collect(Collectors.toList());
        // 这些分组关联的属性
        List<Long> attrIds = attrAttrgroupRelationDao.selectList(new LambdaQueryWrapper<AttrAttrgroupRelationEntity>()
                .in(AttrAttrgroupRelationEntity::getAttrGroupId, attrGroupIds)).stream().map(AttrAttrgroupRelationEntity::getAttrId).collect(Collectors.toList());
        //获取未关联的属性
        if (!attrIds.isEmpty()) {
            queryWrapper.eq(AttrEntity::getCatelogId, catelogId);
        }
        List<AttrEntity> attrEntities = attrDao.selectList(queryWrapper.eq(AttrEntity::getAttrType, ProductConstant.AttrEnum.ATTR_TYPE_BASE.getCode()).notIn(AttrEntity::getAttrId, attrIds));
        PageUtils<AttrEntity> pageUtils = setPageAndList(new PageUtil<AttrEntity>().getPage(map), attrEntities);
        return Optional.of(pageUtils);

    }

    /**
     * 获取分类下所有分组&关联属性
     *
     * @param cateId 分类id
     * @return java.util.List<com.yql.guli.product.vo.AttrGroupBaseVo>
     * @author yql
     * @date 20:24 2023/5/10
     **/
    @Override
    public List<AttrGroupBaseVo> getBaseAttrByCateId(Long cateId) {
        List<AttrGroupEntity> attrGroupEntities = attrGroupDao.selectList(new LambdaQueryWrapper<AttrGroupEntity>().eq(AttrGroupEntity::getCatelogId, cateId));
        List<AttrGroupBaseVo> attrGroupBaseVos = attrGroupEntities.stream().map(attrGroupEntity -> {
            AttrGroupBaseVo attrGroupBaseVo = new AttrGroupBaseVo();
            BeanUtils.copyProperties(attrGroupEntity, attrGroupBaseVo);
            return attrGroupBaseVo;
        }).collect(Collectors.toList());

        return attrGroupBaseVos.stream().map(attrGroupBaseVo -> {
            List<AttrEntity> attrEntities = this.getAttrByAttrGroup(attrGroupBaseVo.getAttrGroupId()).orElse(Collections.emptyList());
            attrGroupBaseVo.setAttrs(attrEntities);
            return attrGroupBaseVo;
        }).collect(Collectors.toList());
    }

    /**
     * 获取Spu属性分组对应的规格参数
     *
     * @param spuId
     * @return
     */
    @Override
    public List<SpuItemAttrGroupVo> getAttrGroupWithAttrBySpuId(Long spuId) {
        //查询规格参数组
        List<AttrGroupEntity> attrGroupEntities = baseMapper.selectList(new LambdaQueryWrapper<AttrGroupEntity>().select(AttrGroupEntity::getAttrGroupName, AttrGroupEntity::getAttrGroupId));
        // 查询与指定SPU相关的属性ID
        List<Long> attrIds = attrAttrgroupRelationDao.selectList(new LambdaQueryWrapper<AttrAttrgroupRelationEntity>()
                        .select(AttrAttrgroupRelationEntity::getAttrId)
                        .in(AttrAttrgroupRelationEntity::getAttrGroupId, attrGroupEntities.stream().map(AttrGroupEntity::getAttrGroupId).collect(Collectors.toList())))
                .stream().map(AttrAttrgroupRelationEntity::getAttrId).collect(Collectors.toList());
        // 查询与指定SPU相关的属性值和名称
        List<ProductAttrValueEntity> productAttrValueEntities = productAttrValueService.getBaseMapper()
                .selectList(new LambdaQueryWrapper<ProductAttrValueEntity>()
                        .select(ProductAttrValueEntity::getAttrId, ProductAttrValueEntity::getAttrName, ProductAttrValueEntity::getAttrValue)
                        .eq(ProductAttrValueEntity::getSpuId, spuId)
                        .in(ProductAttrValueEntity::getAttrId, attrIds));
        // 将属性值和名称与属性组相关联
        Map<Long, List<SpuItemAttrGroupVo.SpuBaseAttrVo>> attrMap = new HashMap<>();
        for (AttrGroupEntity attrGroupEntity : attrGroupEntities) {
            for (ProductAttrValueEntity productAttrValueEntity : productAttrValueEntities) {
                Long attrGroupId = attrGroupEntity.getAttrGroupId();
                SpuItemAttrGroupVo.SpuBaseAttrVo spuBaseAttrVo = new SpuItemAttrGroupVo.SpuBaseAttrVo();
                spuBaseAttrVo.setAttrName(productAttrValueEntity.getAttrName());
                spuBaseAttrVo.setAttrValue(productAttrValueEntity.getAttrValue());
                if (!attrMap.containsKey(attrGroupId)) {
                    attrMap.put(attrGroupId, new ArrayList<>());
                }
                attrMap.get(attrGroupId).add(spuBaseAttrVo);
            }
        }
        // 构建属性组和属性值的关联关系
        List<SpuItemAttrGroupVo> spuItemAttrGroupVos = new ArrayList<>();
        for (AttrGroupEntity attrGroupEntity : attrGroupEntities) {
            SpuItemAttrGroupVo spuItemAttrGroupVo = new SpuItemAttrGroupVo();
            spuItemAttrGroupVo.setGroupName(attrGroupEntity.getAttrGroupName());
            spuItemAttrGroupVo.setAttrs(attrMap.get(attrGroupEntity.getAttrGroupId()));
            spuItemAttrGroupVos.add(spuItemAttrGroupVo);
        }
        return spuItemAttrGroupVos;
    }
}