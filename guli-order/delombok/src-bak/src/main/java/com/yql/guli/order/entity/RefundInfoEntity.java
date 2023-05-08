package com.yql.guli.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 退款信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("oms_refund_info")
public class RefundInfoEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 退款的订单
     */
    private Long orderReturnId;
    /**
     * 退款金额
     */
    private BigDecimal refund;
    /**
     * 退款交易流水号
     */
    private String refundSn;
    /**
     * 退款状态
     */
    private Integer refundStatus;
    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    private Integer refundChannel;
    /**
     */
    private String refundContent;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public RefundInfoEntity() {
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
     * 退款的订单
     */
    @SuppressWarnings("all")
    public Long getOrderReturnId() {
        return this.orderReturnId;
    }

    /**
     * 退款金额
     */
    @SuppressWarnings("all")
    public BigDecimal getRefund() {
        return this.refund;
    }

    /**
     * 退款交易流水号
     */
    @SuppressWarnings("all")
    public String getRefundSn() {
        return this.refundSn;
    }

    /**
     * 退款状态
     */
    @SuppressWarnings("all")
    public Integer getRefundStatus() {
        return this.refundStatus;
    }

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    @SuppressWarnings("all")
    public Integer getRefundChannel() {
        return this.refundChannel;
    }

    /**
     */
    @SuppressWarnings("all")
    public String getRefundContent() {
        return this.refundContent;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 退款的订单
     */
    @SuppressWarnings("all")
    public void setOrderReturnId(final Long orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    /**
     * 退款金额
     */
    @SuppressWarnings("all")
    public void setRefund(final BigDecimal refund) {
        this.refund = refund;
    }

    /**
     * 退款交易流水号
     */
    @SuppressWarnings("all")
    public void setRefundSn(final String refundSn) {
        this.refundSn = refundSn;
    }

    /**
     * 退款状态
     */
    @SuppressWarnings("all")
    public void setRefundStatus(final Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    @SuppressWarnings("all")
    public void setRefundChannel(final Integer refundChannel) {
        this.refundChannel = refundChannel;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setRefundContent(final String refundContent) {
        this.refundContent = refundContent;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RefundInfoEntity)) return false;
        final RefundInfoEntity other = (RefundInfoEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderReturnId = this.getOrderReturnId();
        final Object other$orderReturnId = other.getOrderReturnId();
        if (this$orderReturnId == null ? other$orderReturnId != null : !this$orderReturnId.equals(other$orderReturnId)) return false;
        final Object this$refundStatus = this.getRefundStatus();
        final Object other$refundStatus = other.getRefundStatus();
        if (this$refundStatus == null ? other$refundStatus != null : !this$refundStatus.equals(other$refundStatus)) return false;
        final Object this$refundChannel = this.getRefundChannel();
        final Object other$refundChannel = other.getRefundChannel();
        if (this$refundChannel == null ? other$refundChannel != null : !this$refundChannel.equals(other$refundChannel)) return false;
        final Object this$refund = this.getRefund();
        final Object other$refund = other.getRefund();
        if (this$refund == null ? other$refund != null : !this$refund.equals(other$refund)) return false;
        final Object this$refundSn = this.getRefundSn();
        final Object other$refundSn = other.getRefundSn();
        if (this$refundSn == null ? other$refundSn != null : !this$refundSn.equals(other$refundSn)) return false;
        final Object this$refundContent = this.getRefundContent();
        final Object other$refundContent = other.getRefundContent();
        if (this$refundContent == null ? other$refundContent != null : !this$refundContent.equals(other$refundContent)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof RefundInfoEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $orderReturnId = this.getOrderReturnId();
        result = result * PRIME + ($orderReturnId == null ? 43 : $orderReturnId.hashCode());
        final Object $refundStatus = this.getRefundStatus();
        result = result * PRIME + ($refundStatus == null ? 43 : $refundStatus.hashCode());
        final Object $refundChannel = this.getRefundChannel();
        result = result * PRIME + ($refundChannel == null ? 43 : $refundChannel.hashCode());
        final Object $refund = this.getRefund();
        result = result * PRIME + ($refund == null ? 43 : $refund.hashCode());
        final Object $refundSn = this.getRefundSn();
        result = result * PRIME + ($refundSn == null ? 43 : $refundSn.hashCode());
        final Object $refundContent = this.getRefundContent();
        result = result * PRIME + ($refundContent == null ? 43 : $refundContent.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "RefundInfoEntity(id=" + this.getId() + ", orderReturnId=" + this.getOrderReturnId() + ", refund=" + this.getRefund() + ", refundSn=" + this.getRefundSn() + ", refundStatus=" + this.getRefundStatus() + ", refundChannel=" + this.getRefundChannel() + ", refundContent=" + this.getRefundContent() + ")";
    }
}
