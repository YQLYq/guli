package com.yql.guli.member.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 会员统计信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("会员统计信息")
public class MemberStatisticsInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("会员id")
    private Long memberId;
    @ApiModelProperty("累计消费金额")
    private BigDecimal consumeAmount;
    @ApiModelProperty("累计优惠金额")
    private BigDecimal couponAmount;
    @ApiModelProperty("订单数量")
    private Integer orderCount;
    @ApiModelProperty("优惠券数量")
    private Integer couponCount;
    @ApiModelProperty("评价数")
    private Integer commentCount;
    @ApiModelProperty("退货数量")
    private Integer returnOrderCount;
    @ApiModelProperty("登录次数")
    private Integer loginCount;
    @ApiModelProperty("关注数量")
    private Integer attendCount;
    @ApiModelProperty("粉丝数量")
    private Integer fansCount;
    @ApiModelProperty("收藏的商品数量")
    private Integer collectProductCount;
    @ApiModelProperty("收藏的专题活动数量")
    private Integer collectSubjectCount;
    @ApiModelProperty("收藏的评论数量")
    private Integer collectCommentCount;
    @ApiModelProperty("邀请的朋友数量")
    private Integer inviteFriendCount;
    //</editor-fold>

    @SuppressWarnings("all")
    public MemberStatisticsInfoDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getMemberId() {
        return this.memberId;
    }

    @SuppressWarnings("all")
    public BigDecimal getConsumeAmount() {
        return this.consumeAmount;
    }

    @SuppressWarnings("all")
    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    @SuppressWarnings("all")
    public Integer getOrderCount() {
        return this.orderCount;
    }

    @SuppressWarnings("all")
    public Integer getCouponCount() {
        return this.couponCount;
    }

    @SuppressWarnings("all")
    public Integer getCommentCount() {
        return this.commentCount;
    }

    @SuppressWarnings("all")
    public Integer getReturnOrderCount() {
        return this.returnOrderCount;
    }

    @SuppressWarnings("all")
    public Integer getLoginCount() {
        return this.loginCount;
    }

    @SuppressWarnings("all")
    public Integer getAttendCount() {
        return this.attendCount;
    }

    @SuppressWarnings("all")
    public Integer getFansCount() {
        return this.fansCount;
    }

    @SuppressWarnings("all")
    public Integer getCollectProductCount() {
        return this.collectProductCount;
    }

    @SuppressWarnings("all")
    public Integer getCollectSubjectCount() {
        return this.collectSubjectCount;
    }

    @SuppressWarnings("all")
    public Integer getCollectCommentCount() {
        return this.collectCommentCount;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getInviteFriendCount() {
        return this.inviteFriendCount;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    @SuppressWarnings("all")
    public void setConsumeAmount(final BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    @SuppressWarnings("all")
    public void setCouponAmount(final BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @SuppressWarnings("all")
    public void setOrderCount(final Integer orderCount) {
        this.orderCount = orderCount;
    }

    @SuppressWarnings("all")
    public void setCouponCount(final Integer couponCount) {
        this.couponCount = couponCount;
    }

    @SuppressWarnings("all")
    public void setCommentCount(final Integer commentCount) {
        this.commentCount = commentCount;
    }

    @SuppressWarnings("all")
    public void setReturnOrderCount(final Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    @SuppressWarnings("all")
    public void setLoginCount(final Integer loginCount) {
        this.loginCount = loginCount;
    }

    @SuppressWarnings("all")
    public void setAttendCount(final Integer attendCount) {
        this.attendCount = attendCount;
    }

    @SuppressWarnings("all")
    public void setFansCount(final Integer fansCount) {
        this.fansCount = fansCount;
    }

    @SuppressWarnings("all")
    public void setCollectProductCount(final Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    @SuppressWarnings("all")
    public void setCollectSubjectCount(final Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    @SuppressWarnings("all")
    public void setCollectCommentCount(final Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    @SuppressWarnings("all")
    public void setInviteFriendCount(final Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberStatisticsInfoDTO)) return false;
        final MemberStatisticsInfoDTO other = (MemberStatisticsInfoDTO) o;
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
        return other instanceof MemberStatisticsInfoDTO;
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
        return "MemberStatisticsInfoDTO(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", consumeAmount=" + this.getConsumeAmount() + ", couponAmount=" + this.getCouponAmount() + ", orderCount=" + this.getOrderCount() + ", couponCount=" + this.getCouponCount() + ", commentCount=" + this.getCommentCount() + ", returnOrderCount=" + this.getReturnOrderCount() + ", loginCount=" + this.getLoginCount() + ", attendCount=" + this.getAttendCount() + ", fansCount=" + this.getFansCount() + ", collectProductCount=" + this.getCollectProductCount() + ", collectSubjectCount=" + this.getCollectSubjectCount() + ", collectCommentCount=" + this.getCollectCommentCount() + ", inviteFriendCount=" + this.getInviteFriendCount() + ")";
    }
    //</editor-fold>
}
