package com.yql.guli.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品满减信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class SkuFullReductionExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "spu_id")
    private Long skuId;
    @Excel(name = "满多少")
    private BigDecimal fullPrice;
    @Excel(name = "减多少")
    private BigDecimal reducePrice;
    @Excel(name = "是否参与其他优惠")
    private Integer addOther;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SkuFullReductionExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public BigDecimal getFullPrice() {
        return this.fullPrice;
    }

    @SuppressWarnings("all")
    public BigDecimal getReducePrice() {
        return this.reducePrice;
    }

    @SuppressWarnings("all")
    public Integer getAddOther() {
        return this.addOther;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setFullPrice(final BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    @SuppressWarnings("all")
    public void setReducePrice(final BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    @SuppressWarnings("all")
    public void setAddOther(final Integer addOther) {
        this.addOther = addOther;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuFullReductionExcel)) return false;
        final SkuFullReductionExcel other = (SkuFullReductionExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$addOther = this.getAddOther();
        final Object other$addOther = other.getAddOther();
        if (this$addOther == null ? other$addOther != null : !this$addOther.equals(other$addOther)) return false;
        final Object this$fullPrice = this.getFullPrice();
        final Object other$fullPrice = other.getFullPrice();
        if (this$fullPrice == null ? other$fullPrice != null : !this$fullPrice.equals(other$fullPrice)) return false;
        final Object this$reducePrice = this.getReducePrice();
        final Object other$reducePrice = other.getReducePrice();
        if (this$reducePrice == null ? other$reducePrice != null : !this$reducePrice.equals(other$reducePrice)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SkuFullReductionExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $addOther = this.getAddOther();
        result = result * PRIME + ($addOther == null ? 43 : $addOther.hashCode());
        final Object $fullPrice = this.getFullPrice();
        result = result * PRIME + ($fullPrice == null ? 43 : $fullPrice.hashCode());
        final Object $reducePrice = this.getReducePrice();
        result = result * PRIME + ($reducePrice == null ? 43 : $reducePrice.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SkuFullReductionExcel(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", fullPrice=" + this.getFullPrice() + ", reducePrice=" + this.getReducePrice() + ", addOther=" + this.getAddOther() + ")";
    }
    //</editor-fold>
}
