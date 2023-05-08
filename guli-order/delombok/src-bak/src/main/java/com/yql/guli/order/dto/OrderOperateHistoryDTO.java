package com.yql.guli.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单操作历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("订单操作历史记录")
public class OrderOperateHistoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("操作人[用户；系统；后台管理员]")
    private String operateMan;
    @ApiModelProperty("操作时间")
    private Date createTime;
    @ApiModelProperty("订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】")
    private Integer orderStatus;
    @ApiModelProperty("备注")
    private String note;
    //</editor-fold>

    @SuppressWarnings("all")
    public OrderOperateHistoryDTO() {
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
    public String getOperateMan() {
        return this.operateMan;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    @SuppressWarnings("all")
    public void setOperateMan(final String operateMan) {
        this.operateMan = operateMan;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setOrderStatus(final Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderOperateHistoryDTO)) return false;
        final OrderOperateHistoryDTO other = (OrderOperateHistoryDTO) o;
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
        return other instanceof OrderOperateHistoryDTO;
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
        return "OrderOperateHistoryDTO(id=" + this.getId() + ", orderId=" + this.getOrderId() + ", operateMan=" + this.getOperateMan() + ", createTime=" + this.getCreateTime() + ", orderStatus=" + this.getOrderStatus() + ", note=" + this.getNote() + ")";
    }
    //</editor-fold>
}
