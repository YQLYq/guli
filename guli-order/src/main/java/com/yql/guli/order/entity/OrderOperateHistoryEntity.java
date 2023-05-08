package com.yql.guli.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 订单操作历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 操作人[用户；系统；后台管理员]
     */
    private String operateMan;
    /**
     * 操作时间
     */
    private Date createTime;
    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    private Integer orderStatus;
    /**
     * 备注
     */
    private String note;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public OrderOperateHistoryEntity() {
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
     * 订单id
     */
    @SuppressWarnings("all")
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * 操作人[用户；系统；后台管理员]
     */
    @SuppressWarnings("all")
    public String getOperateMan() {
        return this.operateMan;
    }

    /**
     * 操作时间
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @SuppressWarnings("all")
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * 备注
     */
    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 订单id
     */
    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 操作人[用户；系统；后台管理员]
     */
    @SuppressWarnings("all")
    public void setOperateMan(final String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * 操作时间
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @SuppressWarnings("all")
    public void setOrderStatus(final Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 备注
     */
    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderOperateHistoryEntity)) return false;
        final OrderOperateHistoryEntity other = (OrderOperateHistoryEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$orderStatus = this.getOrderStatus();
        final Object other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus)) return false;
        final Object this$operateMan = this.getOperateMan();
        final Object other$operateMan = other.getOperateMan();
        if (this$operateMan == null ? other$operateMan != null : !this$operateMan.equals(other$operateMan)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderOperateHistoryEntity;
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
        final Object $orderStatus = this.getOrderStatus();
        result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
        final Object $operateMan = this.getOperateMan();
        result = result * PRIME + ($operateMan == null ? 43 : $operateMan.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderOperateHistoryEntity(id=" + this.getId() + ", orderId=" + this.getOrderId() + ", operateMan=" + this.getOperateMan() + ", createTime=" + this.getCreateTime() + ", orderStatus=" + this.getOrderStatus() + ", note=" + this.getNote() + ")";
    }
}
