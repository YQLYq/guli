package com.yql.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品会员价格
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("sms_member_price")
public class MemberPriceEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * 会员等级id
     */
    private Long memberLevelId;
    /**
     * 会员等级名
     */
    private String memberLevelName;
    /**
     * 会员对应价格
     */
    private BigDecimal memberPrice;
    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    private Integer addOther;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberPriceEntity() {
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
     * sku_id
     */
    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * 会员等级id
     */
    @SuppressWarnings("all")
    public Long getMemberLevelId() {
        return this.memberLevelId;
    }

    /**
     * 会员等级名
     */
    @SuppressWarnings("all")
    public String getMemberLevelName() {
        return this.memberLevelName;
    }

    /**
     * 会员对应价格
     */
    @SuppressWarnings("all")
    public BigDecimal getMemberPrice() {
        return this.memberPrice;
    }

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
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
     * sku_id
     */
    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 会员等级id
     */
    @SuppressWarnings("all")
    public void setMemberLevelId(final Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 会员等级名
     */
    @SuppressWarnings("all")
    public void setMemberLevelName(final String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    /**
     * 会员对应价格
     */
    @SuppressWarnings("all")
    public void setMemberPrice(final BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    @SuppressWarnings("all")
    public void setAddOther(final Integer addOther) {
        this.addOther = addOther;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberPriceEntity)) return false;
        final MemberPriceEntity other = (MemberPriceEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$memberLevelId = this.getMemberLevelId();
        final Object other$memberLevelId = other.getMemberLevelId();
        if (this$memberLevelId == null ? other$memberLevelId != null : !this$memberLevelId.equals(other$memberLevelId)) return false;
        final Object this$addOther = this.getAddOther();
        final Object other$addOther = other.getAddOther();
        if (this$addOther == null ? other$addOther != null : !this$addOther.equals(other$addOther)) return false;
        final Object this$memberLevelName = this.getMemberLevelName();
        final Object other$memberLevelName = other.getMemberLevelName();
        if (this$memberLevelName == null ? other$memberLevelName != null : !this$memberLevelName.equals(other$memberLevelName)) return false;
        final Object this$memberPrice = this.getMemberPrice();
        final Object other$memberPrice = other.getMemberPrice();
        if (this$memberPrice == null ? other$memberPrice != null : !this$memberPrice.equals(other$memberPrice)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberPriceEntity;
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
        final Object $memberLevelId = this.getMemberLevelId();
        result = result * PRIME + ($memberLevelId == null ? 43 : $memberLevelId.hashCode());
        final Object $addOther = this.getAddOther();
        result = result * PRIME + ($addOther == null ? 43 : $addOther.hashCode());
        final Object $memberLevelName = this.getMemberLevelName();
        result = result * PRIME + ($memberLevelName == null ? 43 : $memberLevelName.hashCode());
        final Object $memberPrice = this.getMemberPrice();
        result = result * PRIME + ($memberPrice == null ? 43 : $memberPrice.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberPriceEntity(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", memberLevelId=" + this.getMemberLevelId() + ", memberLevelName=" + this.getMemberLevelName() + ", memberPrice=" + this.getMemberPrice() + ", addOther=" + this.getAddOther() + ")";
    }
}
