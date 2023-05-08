package com.yql.guli.order.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付信息表
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class PaymentInfoExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "订单号（对外业务号）")
    private String orderSn;
    @Excel(name = "订单id")
    private Long orderId;
    @Excel(name = "支付宝交易流水号")
    private String alipayTradeNo;
    @Excel(name = "支付总金额")
    private BigDecimal totalAmount;
    @Excel(name = "交易内容")
    private String subject;
    @Excel(name = "支付状态")
    private String paymentStatus;
    @Excel(name = "创建时间")
    private Date createTime;
    @Excel(name = "确认时间")
    private Date confirmTime;
    @Excel(name = "回调内容")
    private String callbackContent;
    @Excel(name = "回调时间")
    private Date callbackTime;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public PaymentInfoExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public String getOrderSn() {
        return this.orderSn;
    }

    @SuppressWarnings("all")
    public Long getOrderId() {
        return this.orderId;
    }

    @SuppressWarnings("all")
    public String getAlipayTradeNo() {
        return this.alipayTradeNo;
    }

    @SuppressWarnings("all")
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @SuppressWarnings("all")
    public String getSubject() {
        return this.subject;
    }

    @SuppressWarnings("all")
    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public Date getConfirmTime() {
        return this.confirmTime;
    }

    @SuppressWarnings("all")
    public String getCallbackContent() {
        return this.callbackContent;
    }

    @SuppressWarnings("all")
    public Date getCallbackTime() {
        return this.callbackTime;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setOrderSn(final String orderSn) {
        this.orderSn = orderSn;
    }

    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    @SuppressWarnings("all")
    public void setAlipayTradeNo(final String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    @SuppressWarnings("all")
    public void setTotalAmount(final BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @SuppressWarnings("all")
    public void setSubject(final String subject) {
        this.subject = subject;
    }

    @SuppressWarnings("all")
    public void setPaymentStatus(final String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setConfirmTime(final Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    @SuppressWarnings("all")
    public void setCallbackContent(final String callbackContent) {
        this.callbackContent = callbackContent;
    }

    @SuppressWarnings("all")
    public void setCallbackTime(final Date callbackTime) {
        this.callbackTime = callbackTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PaymentInfoExcel)) return false;
        final PaymentInfoExcel other = (PaymentInfoExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$orderSn = this.getOrderSn();
        final Object other$orderSn = other.getOrderSn();
        if (this$orderSn == null ? other$orderSn != null : !this$orderSn.equals(other$orderSn)) return false;
        final Object this$alipayTradeNo = this.getAlipayTradeNo();
        final Object other$alipayTradeNo = other.getAlipayTradeNo();
        if (this$alipayTradeNo == null ? other$alipayTradeNo != null : !this$alipayTradeNo.equals(other$alipayTradeNo)) return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$paymentStatus = this.getPaymentStatus();
        final Object other$paymentStatus = other.getPaymentStatus();
        if (this$paymentStatus == null ? other$paymentStatus != null : !this$paymentStatus.equals(other$paymentStatus)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$confirmTime = this.getConfirmTime();
        final Object other$confirmTime = other.getConfirmTime();
        if (this$confirmTime == null ? other$confirmTime != null : !this$confirmTime.equals(other$confirmTime)) return false;
        final Object this$callbackContent = this.getCallbackContent();
        final Object other$callbackContent = other.getCallbackContent();
        if (this$callbackContent == null ? other$callbackContent != null : !this$callbackContent.equals(other$callbackContent)) return false;
        final Object this$callbackTime = this.getCallbackTime();
        final Object other$callbackTime = other.getCallbackTime();
        if (this$callbackTime == null ? other$callbackTime != null : !this$callbackTime.equals(other$callbackTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof PaymentInfoExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $orderSn = this.getOrderSn();
        result = result * PRIME + ($orderSn == null ? 43 : $orderSn.hashCode());
        final Object $alipayTradeNo = this.getAlipayTradeNo();
        result = result * PRIME + ($alipayTradeNo == null ? 43 : $alipayTradeNo.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $paymentStatus = this.getPaymentStatus();
        result = result * PRIME + ($paymentStatus == null ? 43 : $paymentStatus.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $confirmTime = this.getConfirmTime();
        result = result * PRIME + ($confirmTime == null ? 43 : $confirmTime.hashCode());
        final Object $callbackContent = this.getCallbackContent();
        result = result * PRIME + ($callbackContent == null ? 43 : $callbackContent.hashCode());
        final Object $callbackTime = this.getCallbackTime();
        result = result * PRIME + ($callbackTime == null ? 43 : $callbackTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "PaymentInfoExcel(id=" + this.getId() + ", orderSn=" + this.getOrderSn() + ", orderId=" + this.getOrderId() + ", alipayTradeNo=" + this.getAlipayTradeNo() + ", totalAmount=" + this.getTotalAmount() + ", subject=" + this.getSubject() + ", paymentStatus=" + this.getPaymentStatus() + ", createTime=" + this.getCreateTime() + ", confirmTime=" + this.getConfirmTime() + ", callbackContent=" + this.getCallbackContent() + ", callbackTime=" + this.getCallbackTime() + ")";
    }
    //</editor-fold>
}
