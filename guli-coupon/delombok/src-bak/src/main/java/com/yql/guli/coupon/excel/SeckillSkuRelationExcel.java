package com.yql.guli.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 秒杀活动商品关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class SeckillSkuRelationExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "活动id")
    private Long promotionId;
    @Excel(name = "活动场次id")
    private Long promotionSessionId;
    @Excel(name = "商品id")
    private Long skuId;
    @Excel(name = "秒杀价格")
    private BigDecimal seckillPrice;
    @Excel(name = "秒杀总量")
    private BigDecimal seckillCount;
    @Excel(name = "每人限购数量")
    private BigDecimal seckillLimit;
    @Excel(name = "排序")
    private Integer seckillSort;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SeckillSkuRelationExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getPromotionId() {
        return this.promotionId;
    }

    @SuppressWarnings("all")
    public Long getPromotionSessionId() {
        return this.promotionSessionId;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public BigDecimal getSeckillPrice() {
        return this.seckillPrice;
    }

    @SuppressWarnings("all")
    public BigDecimal getSeckillCount() {
        return this.seckillCount;
    }

    @SuppressWarnings("all")
    public BigDecimal getSeckillLimit() {
        return this.seckillLimit;
    }

    @SuppressWarnings("all")
    public Integer getSeckillSort() {
        return this.seckillSort;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setPromotionId(final Long promotionId) {
        this.promotionId = promotionId;
    }

    @SuppressWarnings("all")
    public void setPromotionSessionId(final Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setSeckillPrice(final BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    @SuppressWarnings("all")
    public void setSeckillCount(final BigDecimal seckillCount) {
        this.seckillCount = seckillCount;
    }

    @SuppressWarnings("all")
    public void setSeckillLimit(final BigDecimal seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    @SuppressWarnings("all")
    public void setSeckillSort(final Integer seckillSort) {
        this.seckillSort = seckillSort;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillSkuRelationExcel)) return false;
        final SeckillSkuRelationExcel other = (SeckillSkuRelationExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$promotionId = this.getPromotionId();
        final Object other$promotionId = other.getPromotionId();
        if (this$promotionId == null ? other$promotionId != null : !this$promotionId.equals(other$promotionId)) return false;
        final Object this$promotionSessionId = this.getPromotionSessionId();
        final Object other$promotionSessionId = other.getPromotionSessionId();
        if (this$promotionSessionId == null ? other$promotionSessionId != null : !this$promotionSessionId.equals(other$promotionSessionId)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$seckillSort = this.getSeckillSort();
        final Object other$seckillSort = other.getSeckillSort();
        if (this$seckillSort == null ? other$seckillSort != null : !this$seckillSort.equals(other$seckillSort)) return false;
        final Object this$seckillPrice = this.getSeckillPrice();
        final Object other$seckillPrice = other.getSeckillPrice();
        if (this$seckillPrice == null ? other$seckillPrice != null : !this$seckillPrice.equals(other$seckillPrice)) return false;
        final Object this$seckillCount = this.getSeckillCount();
        final Object other$seckillCount = other.getSeckillCount();
        if (this$seckillCount == null ? other$seckillCount != null : !this$seckillCount.equals(other$seckillCount)) return false;
        final Object this$seckillLimit = this.getSeckillLimit();
        final Object other$seckillLimit = other.getSeckillLimit();
        if (this$seckillLimit == null ? other$seckillLimit != null : !this$seckillLimit.equals(other$seckillLimit)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SeckillSkuRelationExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $promotionId = this.getPromotionId();
        result = result * PRIME + ($promotionId == null ? 43 : $promotionId.hashCode());
        final Object $promotionSessionId = this.getPromotionSessionId();
        result = result * PRIME + ($promotionSessionId == null ? 43 : $promotionSessionId.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $seckillSort = this.getSeckillSort();
        result = result * PRIME + ($seckillSort == null ? 43 : $seckillSort.hashCode());
        final Object $seckillPrice = this.getSeckillPrice();
        result = result * PRIME + ($seckillPrice == null ? 43 : $seckillPrice.hashCode());
        final Object $seckillCount = this.getSeckillCount();
        result = result * PRIME + ($seckillCount == null ? 43 : $seckillCount.hashCode());
        final Object $seckillLimit = this.getSeckillLimit();
        result = result * PRIME + ($seckillLimit == null ? 43 : $seckillLimit.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SeckillSkuRelationExcel(id=" + this.getId() + ", promotionId=" + this.getPromotionId() + ", promotionSessionId=" + this.getPromotionSessionId() + ", skuId=" + this.getSkuId() + ", seckillPrice=" + this.getSeckillPrice() + ", seckillCount=" + this.getSeckillCount() + ", seckillLimit=" + this.getSeckillLimit() + ", seckillSort=" + this.getSeckillSort() + ")";
    }
    //</editor-fold>
}
