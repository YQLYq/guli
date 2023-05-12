package com.yql.guli.product.vo;

import com.yql.guli.common.to.MemberPriceTo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@Data
public class SpuInfoSaveVo {

    /**
     * spuName
     */
    private String spuName;
    /**
     * spuDescription
     */
    private String spuDescription;
    /**
     * catalogId
     */
    private Long catalogId;
    /**
     * brandId
     */
    private Long brandId;
    /**
     * weight
     */
    private BigDecimal weight;
    /**
     * publishStatus
     */
    private Integer publishStatus;
    /**
     * decript
     */
    private List<String> decript;
    /**
     * images
     */
    private List<String> images;
    /**
     * bounds
     */
    private BoundsVo bounds;
    /**
     * baseAttrs
     */
    private List<BaseAttrsVo> baseAttrs;
    /**
     * skus
     */
    private List<SkusVo> skus;

    /**
     * BoundsVo
     */
    @NoArgsConstructor
    @Data
    public static class BoundsVo {
        /**
         * buyBounds
         */
        private BigDecimal buyBounds;
        /**
         * growBounds
         */
        private BigDecimal growBounds;
    }

    /**
     * BaseAttrsVo
     */
    @NoArgsConstructor
    @Data
    public static class BaseAttrsVo {
        /**
         * attrId
         */
        private Long attrId;
        /**
         * attrValues
         */
        private String attrValues;
        /**
         * showDesc
         */
        private Integer showDesc;
    }

    /**
     * SkusVo
     */
    @NoArgsConstructor
    @Data
    public static class SkusVo {
        /**
         * attr
         */
        private List<AttrVo> attr;
        /**
         * skuName
         */
        private String skuName;
        /**
         * price
         */
        private BigDecimal price;
        /**
         * skuTitle
         */
        private String skuTitle;
        /**
         * skuSubtitle
         */
        private String skuSubtitle;
        /**
         * images
         */
        private List<ImagesVo> images;
        /**
         * descar
         */
        private List<String> descar;
        /**
         * fullCount
         */
        private Integer fullCount;
        /**
         * discount
         */
        private BigDecimal discount;
        /**
         * countStatus
         */
        private Integer countStatus;
        /**
         * fullPrice
         */
        private BigDecimal fullPrice;
        /**
         * reducePrice
         */
        private BigDecimal reducePrice;
        /**
         * priceStatus
         */
        private Long priceStatus;
        /**
         * memberPrice
         */
        private List<MemberPriceTo> memberPrice;

        /**
         * AttrVo
         */
        @NoArgsConstructor
        @Data
        public static class AttrVo {
            /**
             * attrId
             */
            private Long attrId;
            /**
             * attrName
             */
            private String attrName;
            /**
             * attrValue
             */
            private String attrValue;
        }

        /**
         * ImagesVo
         */
        @NoArgsConstructor
        @Data
        public static class ImagesVo {
            /**
             * imgUrl
             */
            private String imgUrl;
            /**
             * defaultImg
             */
            private Integer defaultImg;
        }
    }
}
