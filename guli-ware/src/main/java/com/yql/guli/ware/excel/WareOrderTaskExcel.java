package com.yql.guli.ware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 库存工作单
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class WareOrderTaskExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "order_id")
    private Long orderId;
    @Excel(name = "order_sn")
    private String orderSn;
    @Excel(name = "收货人")
    private String consignee;
    @Excel(name = "收货人电话")
    private String consigneeTel;
    @Excel(name = "配送地址")
    private String deliveryAddress;
    @Excel(name = "订单备注")
    private String orderComment;
    @Excel(name = "付款方式【 1:在线付款 2:货到付款】")
    private Integer paymentWay;
    @Excel(name = "任务状态")
    private Integer taskStatus;
    @Excel(name = "订单描述")
    private String orderBody;
    @Excel(name = "物流单号")
    private String trackingNo;
    @Excel(name = "create_time")
    private Date createTime;
    @Excel(name = "仓库id")
    private Long wareId;
    @Excel(name = "工作单备注")
    private String taskComment;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public WareOrderTaskExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getOrderId() {
        return this.orderId;
    }

    @SuppressWarnings("all")
    public String getOrderSn() {
        return this.orderSn;
    }

    @SuppressWarnings("all")
    public String getConsignee() {
        return this.consignee;
    }

    @SuppressWarnings("all")
    public String getConsigneeTel() {
        return this.consigneeTel;
    }

    @SuppressWarnings("all")
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    @SuppressWarnings("all")
    public String getOrderComment() {
        return this.orderComment;
    }

    @SuppressWarnings("all")
    public Integer getPaymentWay() {
        return this.paymentWay;
    }

    @SuppressWarnings("all")
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    @SuppressWarnings("all")
    public String getOrderBody() {
        return this.orderBody;
    }

    @SuppressWarnings("all")
    public String getTrackingNo() {
        return this.trackingNo;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public Long getWareId() {
        return this.wareId;
    }

    @SuppressWarnings("all")
    public String getTaskComment() {
        return this.taskComment;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    @SuppressWarnings("all")
    public void setOrderSn(final String orderSn) {
        this.orderSn = orderSn;
    }

    @SuppressWarnings("all")
    public void setConsignee(final String consignee) {
        this.consignee = consignee;
    }

    @SuppressWarnings("all")
    public void setConsigneeTel(final String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    @SuppressWarnings("all")
    public void setDeliveryAddress(final String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @SuppressWarnings("all")
    public void setOrderComment(final String orderComment) {
        this.orderComment = orderComment;
    }

    @SuppressWarnings("all")
    public void setPaymentWay(final Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    @SuppressWarnings("all")
    public void setTaskStatus(final Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    @SuppressWarnings("all")
    public void setOrderBody(final String orderBody) {
        this.orderBody = orderBody;
    }

    @SuppressWarnings("all")
    public void setTrackingNo(final String trackingNo) {
        this.trackingNo = trackingNo;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setWareId(final Long wareId) {
        this.wareId = wareId;
    }

    @SuppressWarnings("all")
    public void setTaskComment(final String taskComment) {
        this.taskComment = taskComment;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WareOrderTaskExcel)) return false;
        final WareOrderTaskExcel other = (WareOrderTaskExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$paymentWay = this.getPaymentWay();
        final Object other$paymentWay = other.getPaymentWay();
        if (this$paymentWay == null ? other$paymentWay != null : !this$paymentWay.equals(other$paymentWay)) return false;
        final Object this$taskStatus = this.getTaskStatus();
        final Object other$taskStatus = other.getTaskStatus();
        if (this$taskStatus == null ? other$taskStatus != null : !this$taskStatus.equals(other$taskStatus)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$orderSn = this.getOrderSn();
        final Object other$orderSn = other.getOrderSn();
        if (this$orderSn == null ? other$orderSn != null : !this$orderSn.equals(other$orderSn)) return false;
        final Object this$consignee = this.getConsignee();
        final Object other$consignee = other.getConsignee();
        if (this$consignee == null ? other$consignee != null : !this$consignee.equals(other$consignee)) return false;
        final Object this$consigneeTel = this.getConsigneeTel();
        final Object other$consigneeTel = other.getConsigneeTel();
        if (this$consigneeTel == null ? other$consigneeTel != null : !this$consigneeTel.equals(other$consigneeTel)) return false;
        final Object this$deliveryAddress = this.getDeliveryAddress();
        final Object other$deliveryAddress = other.getDeliveryAddress();
        if (this$deliveryAddress == null ? other$deliveryAddress != null : !this$deliveryAddress.equals(other$deliveryAddress)) return false;
        final Object this$orderComment = this.getOrderComment();
        final Object other$orderComment = other.getOrderComment();
        if (this$orderComment == null ? other$orderComment != null : !this$orderComment.equals(other$orderComment)) return false;
        final Object this$orderBody = this.getOrderBody();
        final Object other$orderBody = other.getOrderBody();
        if (this$orderBody == null ? other$orderBody != null : !this$orderBody.equals(other$orderBody)) return false;
        final Object this$trackingNo = this.getTrackingNo();
        final Object other$trackingNo = other.getTrackingNo();
        if (this$trackingNo == null ? other$trackingNo != null : !this$trackingNo.equals(other$trackingNo)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$taskComment = this.getTaskComment();
        final Object other$taskComment = other.getTaskComment();
        if (this$taskComment == null ? other$taskComment != null : !this$taskComment.equals(other$taskComment)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof WareOrderTaskExcel;
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
        final Object $paymentWay = this.getPaymentWay();
        result = result * PRIME + ($paymentWay == null ? 43 : $paymentWay.hashCode());
        final Object $taskStatus = this.getTaskStatus();
        result = result * PRIME + ($taskStatus == null ? 43 : $taskStatus.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $orderSn = this.getOrderSn();
        result = result * PRIME + ($orderSn == null ? 43 : $orderSn.hashCode());
        final Object $consignee = this.getConsignee();
        result = result * PRIME + ($consignee == null ? 43 : $consignee.hashCode());
        final Object $consigneeTel = this.getConsigneeTel();
        result = result * PRIME + ($consigneeTel == null ? 43 : $consigneeTel.hashCode());
        final Object $deliveryAddress = this.getDeliveryAddress();
        result = result * PRIME + ($deliveryAddress == null ? 43 : $deliveryAddress.hashCode());
        final Object $orderComment = this.getOrderComment();
        result = result * PRIME + ($orderComment == null ? 43 : $orderComment.hashCode());
        final Object $orderBody = this.getOrderBody();
        result = result * PRIME + ($orderBody == null ? 43 : $orderBody.hashCode());
        final Object $trackingNo = this.getTrackingNo();
        result = result * PRIME + ($trackingNo == null ? 43 : $trackingNo.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $taskComment = this.getTaskComment();
        result = result * PRIME + ($taskComment == null ? 43 : $taskComment.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "WareOrderTaskExcel(id=" + this.getId() + ", orderId=" + this.getOrderId() + ", orderSn=" + this.getOrderSn() + ", consignee=" + this.getConsignee() + ", consigneeTel=" + this.getConsigneeTel() + ", deliveryAddress=" + this.getDeliveryAddress() + ", orderComment=" + this.getOrderComment() + ", paymentWay=" + this.getPaymentWay() + ", taskStatus=" + this.getTaskStatus() + ", orderBody=" + this.getOrderBody() + ", trackingNo=" + this.getTrackingNo() + ", createTime=" + this.getCreateTime() + ", wareId=" + this.getWareId() + ", taskComment=" + this.getTaskComment() + ")";
    }
    //</editor-fold>
}
