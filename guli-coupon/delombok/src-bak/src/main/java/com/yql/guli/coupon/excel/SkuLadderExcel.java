package com.yql.guli.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品阶梯价格
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class SkuLadderExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "spu_id")
    private Long skuId;
    @Excel(name = "满几件")
    private Integer fullCount;
    @Excel(name = "打几折")
    private BigDecimal discount;
    @Excel(name = "折后价")
    private BigDecimal price;
    @Excel(name = "是否叠加其他优惠[0-不可叠加，1-可叠加]")
    private Integer addOther;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SkuLadderExcel() {
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
    public Integer getFullCount() {
        return this.fullCount;
    }

    @SuppressWarnings("all")
    public BigDecimal getDiscount() {
        return this.discount;
    }

    @SuppressWarnings("all")
    public BigDecimal getPrice() {
        return this.price;
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
    public void setFullCount(final Integer fullCount) {
        this.fullCount = fullCount;
    }

    @SuppressWarnings("all")
    public void setDiscount(final BigDecimal discount) {
        this.discount = discount;
    }

    @SuppressWarnings("all")
    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    @SuppressWarnings("all")
    public void setAddOther(final Integer addOther) {
        this.addOther = addOther;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuLadderExcel)) return false;
        final SkuLadderExcel other = (SkuLadderExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$fullCount = this.getFullCount();
        final Object other$fullCount = other.getFullCount();
        if (this$fullCount == null ? other$fullCount != null : !this$fullCount.equals(other$fullCount)) return false;
        final Object this$addOther = this.getAddOther();
        final Object other$addOther = other.getAddOther();
        if (this$addOther == null ? other$addOther != null : !this$addOther.equals(other$addOther)) return false;
        final Object this$discount = this.getDiscount();
        final Object other$discount = other.getDiscount();
        if (this$discount == null ? other$discount != null : !this$discount.equals(other$discount)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SkuLadderExcel;
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
        final Object $fullCount = this.getFullCount();
        result = result * PRIME + ($fullCount == null ? 43 : $fullCount.hashCode());
        final Object $addOther = this.getAddOther();
        result = result * PRIME + ($addOther == null ? 43 : $addOther.hashCode());
        final Object $discount = this.getDiscount();
        result = result * PRIME + ($discount == null ? 43 : $discount.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SkuLadderExcel(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", fullCount=" + this.getFullCount() + ", discount=" + this.getDiscount() + ", price=" + this.getPrice() + ", addOther=" + this.getAddOther() + ")";
    }
    //</editor-fold>
}
