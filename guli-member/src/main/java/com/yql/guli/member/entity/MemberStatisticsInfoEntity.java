package com.yql.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员统计信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 累计消费金额
     */
    private BigDecimal consumeAmount;
    /**
     * 累计优惠金额
     */
    private BigDecimal couponAmount;
    /**
     * 订单数量
     */
    private Integer orderCount;
    /**
     * 优惠券数量
     */
    private Integer couponCount;
    /**
     * 评价数
     */
    private Integer commentCount;
    /**
     * 退货数量
     */
    private Integer returnOrderCount;
    /**
     * 登录次数
     */
    private Integer loginCount;
    /**
     * 关注数量
     */
    private Integer attendCount;
    /**
     * 粉丝数量
     */
    private Integer fansCount;
    /**
     * 收藏的商品数量
     */
    private Integer collectProductCount;
    /**
     * 收藏的专题活动数量
     */
    private Integer collectSubjectCount;
    /**
     * 收藏的评论数量
     */
    private Integer collectCommentCount;
    /**
     * 邀请的朋友数量
     */
    private Integer inviteFriendCount;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberStatisticsInfoEntity() {
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
     * 会员id
     */
    @SuppressWarnings("all")
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * 累计消费金额
     */
    @SuppressWarnings("all")
    public BigDecimal getConsumeAmount() {
        return this.consumeAmount;
    }

    /**
     * 累计优惠金额
     */
    @SuppressWarnings("all")
    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    /**
     * 订单数量
     */
    @SuppressWarnings("all")
    public Integer getOrderCount() {
        return this.orderCount;
    }

    /**
     * 优惠券数量
     */
    @SuppressWarnings("all")
    public Integer getCouponCount() {
        return this.couponCount;
    }

    /**
     * 评价数
     */
    @SuppressWarnings("all")
    public Integer getCommentCount() {
        return this.commentCount;
    }

    /**
     * 退货数量
     */
    @SuppressWarnings("all")
    public Integer getReturnOrderCount() {
        return this.returnOrderCount;
    }

    /**
     * 登录次数
     */
    @SuppressWarnings("all")
    public Integer getLoginCount() {
        return this.loginCount;
    }

    /**
     * 关注数量
     */
    @SuppressWarnings("all")
    public Integer getAttendCount() {
        return this.attendCount;
    }

    /**
     * 粉丝数量
     */
    @SuppressWarnings("all")
    public Integer getFansCount() {
        return this.fansCount;
    }

    /**
     * 收藏的商品数量
     */
    @SuppressWarnings("all")
    public Integer getCollectProductCount() {
        return this.collectProductCount;
    }

    /**
     * 收藏的专题活动数量
     */
    @SuppressWarnings("all")
    public Integer getCollectSubjectCount() {
        return this.collectSubjectCount;
    }

    /**
     * 收藏的评论数量
     */
    @SuppressWarnings("all")
    public Integer getCollectCommentCount() {
        return this.collectCommentCount;
    }

    /**
     * 邀请的朋友数量
     */
    @SuppressWarnings("all")
    public Integer getInviteFriendCount() {
        return this.inviteFriendCount;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 会员id
     */
    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 累计消费金额
     */
    @SuppressWarnings("all")
    public void setConsumeAmount(final BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * 累计优惠金额
     */
    @SuppressWarnings("all")
    public void setCouponAmount(final BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 订单数量
     */
    @SuppressWarnings("all")
    public void setOrderCount(final Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 优惠券数量
     */
    @SuppressWarnings("all")
    public void setCouponCount(final Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 评价数
     */
    @SuppressWarnings("all")
    public void setCommentCount(final Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 退货数量
     */
    @SuppressWarnings("all")
    public void setReturnOrderCount(final Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * 登录次数
     */
    @SuppressWarnings("all")
    public void setLoginCount(final Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 关注数量
     */
    @SuppressWarnings("all")
    public void setAttendCount(final Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * 粉丝数量
     */
    @SuppressWarnings("all")
    public void setFansCount(final Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * 收藏的商品数量
     */
    @SuppressWarnings("all")
    public void setCollectProductCount(final Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * 收藏的专题活动数量
     */
    @SuppressWarnings("all")
    public void setCollectSubjectCount(final Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    /**
     * 收藏的评论数量
     */
    @SuppressWarnings("all")
    public void setCollectCommentCount(final Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    /**
     * 邀请的朋友数量
     */
    @SuppressWarnings("all")
    public void setInviteFriendCount(final Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberStatisticsInfoEntity)) return false;
        final MemberStatisticsInfoEntity other = (MemberStatisticsInfoEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$orderCount = this.getOrderCount();
        final Object other$orderCount = other.getOrderCount();
        if (this$orderCount == null ? other$orderCount != null : !this$orderCount.equals(other$orderCount)) return false;
        final Object this$couponCount = this.getCouponCount();
        final Object other$couponCount = other.getCouponCount();
        if (this$couponCount == null ? other$couponCount != null : !this$couponCount.equals(other$couponCount)) return false;
        final Object this$commentCount = this.getCommentCount();
        final Object other$commentCount = other.getCommentCount();
        if (this$commentCount == null ? other$commentCount != null : !this$commentCount.equals(other$commentCount)) return false;
        final Object this$returnOrderCount = this.getReturnOrderCount();
        final Object other$returnOrderCount = other.getReturnOrderCount();
        if (this$returnOrderCount == null ? other$returnOrderCount != null : !this$returnOrderCount.equals(other$returnOrderCount)) return false;
        final Object this$loginCount = this.getLoginCount();
        final Object other$loginCount = other.getLoginCount();
        if (this$loginCount == null ? other$loginCount != null : !this$loginCount.equals(other$loginCount)) return false;
        final Object this$attendCount = this.getAttendCount();
        final Object other$attendCount = other.getAttendCount();
        if (this$attendCount == null ? other$attendCount != null : !this$attendCount.equals(other$attendCount)) return false;
        final Object this$fansCount = this.getFansCount();
        final Object other$fansCount = other.getFansCount();
        if (this$fansCount == null ? other$fansCount != null : !this$fansCount.equals(other$fansCount)) return false;
        final Object this$collectProductCount = this.getCollectProductCount();
        final Object other$collectProductCount = other.getCollectProductCount();
        if (this$collectProductCount == null ? other$collectProductCount != null : !this$collectProductCount.equals(other$collectProductCount)) return false;
        final Object this$collectSubjectCount = this.getCollectSubjectCount();
        final Object other$collectSubjectCount = other.getCollectSubjectCount();
        if (this$collectSubjectCount == null ? other$collectSubjectCount != null : !this$collectSubjectCount.equals(other$collectSubjectCount)) return false;
        final Object this$collectCommentCount = this.getCollectCommentCount();
        final Object other$collectCommentCount = other.getCollectCommentCount();
        if (this$collectCommentCount == null ? other$collectCommentCount != null : !this$collectCommentCount.equals(other$collectCommentCount)) return false;
        final Object this$inviteFriendCount = this.getInviteFriendCount();
        final Object other$inviteFriendCount = other.getInviteFriendCount();
        if (this$inviteFriendCount == null ? other$inviteFriendCount != null : !this$inviteFriendCount.equals(other$inviteFriendCount)) return false;
        final Object this$consumeAmount = this.getConsumeAmount();
        final Object other$consumeAmount = other.getConsumeAmount();
        if (this$consumeAmount == null ? other$consumeAmount != null : !this$consumeAmount.equals(other$consumeAmount)) return false;
        final Object this$couponAmount = this.getCouponAmount();
        final Object other$couponAmount = other.getCouponAmount();
        if (this$couponAmount == null ? other$couponAmount != null : !this$couponAmount.equals(other$couponAmount)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberStatisticsInfoEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $memberId = this.getMemberId();
        result = result * PRIME + ($memberId == null ? 43 : $memberId.hashCode());
        final Object $orderCount = this.getOrderCount();
        result = result * PRIME + ($orderCount == null ? 43 : $orderCount.hashCode());
        final Object $couponCount = this.getCouponCount();
        result = result * PRIME + ($couponCount == null ? 43 : $couponCount.hashCode());
        final Object $commentCount = this.getCommentCount();
        result = result * PRIME + ($commentCount == null ? 43 : $commentCount.hashCode());
        final Object $returnOrderCount = this.getReturnOrderCount();
        result = result * PRIME + ($returnOrderCount == null ? 43 : $returnOrderCount.hashCode());
        final Object $loginCount = this.getLoginCount();
        result = result * PRIME + ($loginCount == null ? 43 : $loginCount.hashCode());
        final Object $attendCount = this.getAttendCount();
        result = result * PRIME + ($attendCount == null ? 43 : $attendCount.hashCode());
        final Object $fansCount = this.getFansCount();
        result = result * PRIME + ($fansCount == null ? 43 : $fansCount.hashCode());
        final Object $collectProductCount = this.getCollectProductCount();
        result = result * PRIME + ($collectProductCount == null ? 43 : $collectProductCount.hashCode());
        final Object $collectSubjectCount = this.getCollectSubjectCount();
        result = result * PRIME + ($collectSubjectCount == null ? 43 : $collectSubjectCount.hashCode());
        final Object $collectCommentCount = this.getCollectCommentCount();
        result = result * PRIME + ($collectCommentCount == null ? 43 : $collectCommentCount.hashCode());
        final Object $inviteFriendCount = this.getInviteFriendCount();
        result = result * PRIME + ($inviteFriendCount == null ? 43 : $inviteFriendCount.hashCode());
        final Object $consumeAmount = this.getConsumeAmount();
        result = result * PRIME + ($consumeAmount == null ? 43 : $consumeAmount.hashCode());
        final Object $couponAmount = this.getCouponAmount();
        result = result * PRIME + ($couponAmount == null ? 43 : $couponAmount.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberStatisticsInfoEntity(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", consumeAmount=" + this.getConsumeAmount() + ", couponAmount=" + this.getCouponAmount() + ", orderCount=" + this.getOrderCount() + ", couponCount=" + this.getCouponCount() + ", commentCount=" + this.getCommentCount() + ", returnOrderCount=" + this.getReturnOrderCount() + ", loginCount=" + this.getLoginCount() + ", attendCount=" + this.getAttendCount() + ", fansCount=" + this.getFansCount() + ", collectProductCount=" + this.getCollectProductCount() + ", collectSubjectCount=" + this.getCollectSubjectCount() + ", collectCommentCount=" + this.getCollectCommentCount() + ", inviteFriendCount=" + this.getInviteFriendCount() + ")";
    }
}
