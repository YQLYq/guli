package com.yql.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 优惠券领取历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("sms_coupon_history")
public class CouponHistoryEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 会员名字
     */
    private String memberNickName;
    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    private Integer getType;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    private Integer useType;
    /**
     * 使用时间
     */
    private Date useTime;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 订单号
     */
    private Long orderSn;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public CouponHistoryEntity() {
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
     * 优惠券id
     */
    @SuppressWarnings("all")
    public Long getCouponId() {
        return this.couponId;
    }

    /**
     * 会员id
     */
    @SuppressWarnings("all")
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * 会员名字
     */
    @SuppressWarnings("all")
    public String getMemberNickName() {
        return this.memberNickName;
    }

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    @SuppressWarnings("all")
    public Integer getGetType() {
        return this.getType;
    }

    /**
     * 创建时间
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    @SuppressWarnings("all")
    public Integer getUseType() {
        return this.useType;
    }

    /**
     * 使用时间
     */
    @SuppressWarnings("all")
    public Date getUseTime() {
        return this.useTime;
    }

    /**
     * 订单id
     */
    @SuppressWarnings("all")
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * 订单号
     */
    @SuppressWarnings("all")
    public Long getOrderSn() {
        return this.orderSn;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 优惠券id
     */
    @SuppressWarnings("all")
    public void setCouponId(final Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 会员id
     */
    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 会员名字
     */
    @SuppressWarnings("all")
    public void setMemberNickName(final String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    @SuppressWarnings("all")
    public void setGetType(final Integer getType) {
        this.getType = getType;
    }

    /**
     * 创建时间
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    @SuppressWarnings("all")
    public void setUseType(final Integer useType) {
        this.useType = useType;
    }

    /**
     * 使用时间
     */
    @SuppressWarnings("all")
    public void setUseTime(final Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 订单id
     */
    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单号
     */
    @SuppressWarnings("all")
    public void setOrderSn(final Long orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CouponHistoryEntity)) return false;
        final CouponHistoryEntity other = (CouponHistoryEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$couponId = this.getCouponId();
        final Object other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$getType = this.getGetType();
        final Object other$getType = other.getGetType();
        if (this$getType == null ? other$getType != null : !this$getType.equals(other$getType)) return false;
        final Object this$useType = this.getUseType();
        final Object other$useType = other.getUseType();
        if (this$useType == null ? other$useType != null : !this$useType.equals(other$useType)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$orderSn = this.getOrderSn();
        final Object other$orderSn = other.getOrderSn();
        if (this$orderSn == null ? other$orderSn != null : !this$orderSn.equals(other$orderSn)) return false;
        final Object this$memberNickName = this.getMemberNickName();
        final Object other$memberNickName = other.getMemberNickName();
        if (this$memberNickName == null ? other$memberNickName != null : !this$memberNickName.equals(other$memberNickName)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$useTime = this.getUseTime();
        final Object other$useTime = other.getUseTime();
        if (this$useTime == null ? other$useTime != null : !this$useTime.equals(other$useTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof CouponHistoryEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $couponId = this.getCouponId();
        result = result * PRIME + ($couponId == null ? 43 : $couponId.hashCode());
        final Object $memberId = this.getMemberId();
        result = result * PRIME + ($memberId == null ? 43 : $memberId.hashCode());
        final Object $getType = this.getGetType();
        result = result * PRIME + ($getType == null ? 43 : $getType.hashCode());
        final Object $useType = this.getUseType();
        result = result * PRIME + ($useType == null ? 43 : $useType.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $orderSn = this.getOrderSn();
        result = result * PRIME + ($orderSn == null ? 43 : $orderSn.hashCode());
        final Object $memberNickName = this.getMemberNickName();
        result = result * PRIME + ($memberNickName == null ? 43 : $memberNickName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $useTime = this.getUseTime();
        result = result * PRIME + ($useTime == null ? 43 : $useTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "CouponHistoryEntity(id=" + this.getId() + ", couponId=" + this.getCouponId() + ", memberId=" + this.getMemberId() + ", memberNickName=" + this.getMemberNickName() + ", getType=" + this.getGetType() + ", createTime=" + this.getCreateTime() + ", useType=" + this.getUseType() + ", useTime=" + this.getUseTime() + ", orderId=" + this.getOrderId() + ", orderSn=" + this.getOrderSn() + ")";
    }
}
