package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.AttrDao;
import com.yql.guli.product.dao.SkuInfoDao;
import com.yql.guli.product.dao.SkuSaleAttrValueDao;
import com.yql.guli.product.dto.SkuSaleAttrValueDTO;
import com.yql.guli.product.entity.SkuSaleAttrValueEntity;
import com.yql.guli.product.service.SkuSaleAttrValueService;
import com.yql.guli.product.vo.SkuItemSaleAttrVo;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@AllArgsConstructor
public class SkuSaleAttrValueServiceImpl extends CrudServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity, SkuSaleAttrValueDTO> implements SkuSaleAttrValueService {
    private SkuInfoDao skuInfoDao;
    private AttrDao attrDao;

    @Override
    public QueryWrapper<SkuSaleAttrValueEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<SkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    /**
     * 查询spuId对应的所有销售属性
     *
     * @param spuId 商品Id
     * @return 返回全部的销售属性
     */
    @Override
    public List<SkuItemSaleAttrVo> getSpuSaleWithAttrBySpuId(Long spuId) {
        return baseMapper.selectdAttrWithSkuIdBySpuId(spuId);
    }

    /**    @Override
    public List<SkuItemVo.SkuItemSaleAttrVo> getSpuSaleWithAttrBySpuId(Long spuId) {
        // 获取销售属性列表
        List<AttrEntity> attrEntities = attrDao.selectList(new LambdaQueryWrapper<AttrEntity>()
                .select(AttrEntity::getAttrId, AttrEntity::getAttrName)
                .eq(AttrEntity::getAttrType, ProductConstant.AttrEnum.ATTR_TYPE_SALE));
        // 获取skuIds
        List<Long> skuIds = skuInfoDao.selectList(new LambdaQueryWrapper<SkuInfoEntity>()
                        .select(SkuInfoEntity::getSkuId)
                        .eq(SkuInfoEntity::getSpuId, spuId))
                .stream().map(SkuInfoEntity::getSkuId).collect(Collectors.toList());
        // 获取sku销售属性值列表
        List<SkuSaleAttrValueEntity> skuSaleAttrValueEntities = baseMapper.selectList(new LambdaQueryWrapper<SkuSaleAttrValueEntity>()
                .select(SkuSaleAttrValueEntity::getAttrId
                        , SkuSaleAttrValueEntity::getAttrName
                        , SkuSaleAttrValueEntity::getAttrValue)
                .in(SkuSaleAttrValueEntity::getSkuId, skuIds));
        // 将sku销售属性值列表转换为Map 将attrId下的attrValue对应的skuId 存入
        Map<Long, List<SkuItemVo.AttrValueWithSkuId>> attValueMap = new HashMap<>(skuSaleAttrValueEntities.size());
        for (SkuSaleAttrValueEntity skuSaleAttrValueEntity : skuSaleAttrValueEntities) {
            Long attrId = skuSaleAttrValueEntity.getAttrId();
            attValueMap.computeIfAbsent(attrId, k -> new ArrayList<>());
            List<SkuItemVo.AttrValueWithSkuId> attrValueWithSkuIds = attValueMap.get(attrId);
            String attrValue = skuSaleAttrValueEntity.getAttrValue();
            Long skuId = skuSaleAttrValueEntity.getSkuId();
            SkuItemVo.AttrValueWithSkuId attrValueWithSkuId = new SkuItemVo.AttrValueWithSkuId();
            //List
            attrValueWithSkuId.setSkuId();
            //List
            attrValueWithSkuId.setAttrValue();
        }
        // 将销售属性和属性值封装为SkuItemSaleAttrVo对象
        return attrEntities.stream().map(attrEntity -> {
            SkuItemVo.SkuItemSaleAttrVo skuItemSaleAttrVo = new SkuItemVo.SkuItemSaleAttrVo();
            Long attrId = attrEntity.getAttrId();
            skuItemSaleAttrVo.setAttrId(attrId);
            skuItemSaleAttrVo.setAttrName(attrEntity.getAttrName());
            skuItemSaleAttrVo.setAttrValue(attValueMap.get(attrId));
            return skuItemSaleAttrVo;
        }).collect(Collectors.toList());
    }*/

}