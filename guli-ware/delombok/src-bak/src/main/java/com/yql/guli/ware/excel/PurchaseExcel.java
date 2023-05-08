package com.yql.guli.ware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class PurchaseExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "")
    private Long assigneeId;
    @Excel(name = "")
    private String assigneeName;
    @Excel(name = "")
    private String phone;
    @Excel(name = "")
    private Integer priority;
    @Excel(name = "")
    private Integer status;
    @Excel(name = "")
    private Long wareId;
    @Excel(name = "")
    private BigDecimal amount;
    @Excel(name = "")
    private Date createTime;
    @Excel(name = "")
    private Date updateTime;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public PurchaseExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getAssigneeId() {
        return this.assigneeId;
    }

    @SuppressWarnings("all")
    public String getAssigneeName() {
        return this.assigneeName;
    }

    @SuppressWarnings("all")
    public String getPhone() {
        return this.phone;
    }

    @SuppressWarnings("all")
    public Integer getPriority() {
        return this.priority;
    }

    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    @SuppressWarnings("all")
    public Long getWareId() {
        return this.wareId;
    }

    @SuppressWarnings("all")
    public BigDecimal getAmount() {
        return this.amount;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public Date getUpdateTime() {
        return this.updateTime;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setAssigneeId(final Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    @SuppressWarnings("all")
    public void setAssigneeName(final String assigneeName) {
        this.assigneeName = assigneeName;
    }

    @SuppressWarnings("all")
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    @SuppressWarnings("all")
    public void setPriority(final Integer priority) {
        this.priority = priority;
    }

    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @SuppressWarnings("all")
    public void setWareId(final Long wareId) {
        this.wareId = wareId;
    }

    @SuppressWarnings("all")
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PurchaseExcel)) return false;
        final PurchaseExcel other = (PurchaseExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$assigneeId = this.getAssigneeId();
        final Object other$assigneeId = other.getAssigneeId();
        if (this$assigneeId == null ? other$assigneeId != null : !this$assigneeId.equals(other$assigneeId)) return false;
        final Object this$priority = this.getPriority();
        final Object other$priority = other.getPriority();
        if (this$priority == null ? other$priority != null : !this$priority.equals(other$priority)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$assigneeName = this.getAssigneeName();
        final Object other$assigneeName = other.getAssigneeName();
        if (this$assigneeName == null ? other$assigneeName != null : !this$assigneeName.equals(other$assigneeName)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof PurchaseExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $assigneeId = this.getAssigneeId();
        result = result * PRIME + ($assigneeId == null ? 43 : $assigneeId.hashCode());
        final Object $priority = this.getPriority();
        result = result * PRIME + ($priority == null ? 43 : $priority.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $assigneeName = this.getAssigneeName();
        result = result * PRIME + ($assigneeName == null ? 43 : $assigneeName.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "PurchaseExcel(id=" + this.getId() + ", assigneeId=" + this.getAssigneeId() + ", assigneeName=" + this.getAssigneeName() + ", phone=" + this.getPhone() + ", priority=" + this.getPriority() + ", status=" + this.getStatus() + ", wareId=" + this.getWareId() + ", amount=" + this.getAmount() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }
    //</editor-fold>
}
