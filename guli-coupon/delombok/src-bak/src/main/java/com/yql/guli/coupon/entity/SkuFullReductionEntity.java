package com.yql.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品满减信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * spu_id
     */
    private Long skuId;
    /**
     * 满多少
     */
    private BigDecimal fullPrice;
    /**
     * 减多少
     */
    private BigDecimal reducePrice;
    /**
     * 是否参与其他优惠
     */
    private Integer addOther;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SkuFullReductionEntity() {
    }
    //</editor-fold>

    /**
     * id
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * 满多少
     */
    @SuppressWarnings("all")
    public BigDecimal getFullPrice() {
        return this.fullPrice;
    }

    /**
     * 减多少
     */
    @SuppressWarnings("all")
    public BigDecimal getReducePrice() {
        return this.reducePrice;
    }

    /**
     * 是否参与其他优惠
     */
    @SuppressWarnings("all")
    public Integer getAddOther() {
        return this.addOther;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 满多少
     */
    @SuppressWarnings("all")
    public void setFullPrice(final BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * 减多少
     */
    @SuppressWarnings("all")
    public void setReducePrice(final BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    /**
     * 是否参与其他优惠
     */
    @SuppressWarnings("all")
    public void setAddOther(final Integer addOther) {
        this.addOther = addOther;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuFullReductionEntity)) return false;
        final SkuFullReductionEntity other = (SkuFullReductionEntity) o;
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
        return other instanceof SkuFullReductionEntity;
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
        return "SkuFullReductionEntity(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", fullPrice=" + this.getFullPrice() + ", reducePrice=" + this.getReducePrice() + ", addOther=" + this.getAddOther() + ")";
    }
}
