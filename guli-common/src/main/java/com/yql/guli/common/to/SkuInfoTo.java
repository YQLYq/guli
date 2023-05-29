package com.yql.guli.common.to;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
public class SkuInfoTo implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("skuId")
    private Long skuId;
    @ApiModelProperty("spuId")
    private Long spuId;
    @ApiModelProperty("sku名称")
    private String skuName;
    @ApiModelProperty("sku介绍描述")
    private String skuDesc;
    @ApiModelProperty("所属分类id")
    private Long catalogId;
    @ApiModelProperty("品牌id")
    private Long brandId;
    @ApiModelProperty("默认图片")
    private String skuDefaultImg;
    @ApiModelProperty("标题")
    private String skuTitle;
    @ApiModelProperty("副标题")
    private String skuSubtitle;
    @ApiModelProperty("价格")
    private BigDecimal price;
    @ApiModelProperty("销量")
    private Long saleCount;
}
