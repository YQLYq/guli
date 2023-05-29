package com.yql.guli.common.to.es;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class SkuEsModel {
    private Long skuId;
    private Long spuId;
    private String skuTitle;
    private BigDecimal skuPrice;
    private String skuImg;
    private Long saleCount;
    private boolean hasStock;
    private Long hotScore;
    private Long brandId;
    private Long categoryId;
    private String brandName;
    private String brandImg;
    private String categoryName;
    private List<Attr> attrs;

    @Data
    public static class Attr {
        private Long attrId;
        private String attrName;
        private String attrValue;
    }
}