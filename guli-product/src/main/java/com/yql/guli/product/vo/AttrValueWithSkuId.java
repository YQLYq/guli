package com.yql.guli.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询skuId对应销售属性所有值，以及其他skuId所拥有的该值SkuIds
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class AttrValueWithSkuId{
    private String skuIds;
    private String attrValues;
}
