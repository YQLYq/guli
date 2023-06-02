package com.yql.guli.product.vo;

import com.yql.guli.product.entity.SkuImagesEntity;
import com.yql.guli.product.entity.SkuInfoEntity;
import com.yql.guli.product.entity.SpuInfoDescEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 获取sku的全部信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkuItemVo {
    /**
     * sku基本信息
     */
    private SkuInfoEntity skuInfoEntityList;
    /**
     * spu的规格参数信息
     */
    private List<SpuItemAttrGroupVo> attrGroupVos;
    /**
     * 商品图片
     */
    private List<SkuImagesEntity> skuImagesEntities;
    /**
     * 获取spu的介绍
     */
    private SpuInfoDescEntity spuInfoDescEntity;
    /**
     * sku的销售属性
     */
    private List<SkuItemSaleAttrVo> skuSaleAttrValueEntity;
    /**
     * 有无货
     */
    private boolean hasStock = true;

}
