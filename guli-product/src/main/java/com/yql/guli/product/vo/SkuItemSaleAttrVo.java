package com.yql.guli.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 查询skuId销售属性 以及其他对应的值的skuId
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class SkuItemSaleAttrVo{
    private Long attrId;
    private String attrName;
    private List<AttrValueWithSkuId> attrValue;
}