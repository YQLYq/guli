package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 积分变化历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class IntegrationChangeHistoryExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "create_time")
    private Date createTime;
    @Excel(name = "变化的值")
    private Integer changeCount;
    @Excel(name = "备注")
    private String note;
    @Excel(name = "来源[0->购物；1->管理员修改;2->活动]")
    private Integer sourceTyoe;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public IntegrationChangeHistoryExcel() {
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
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public Integer getChangeCount() {
        return this.changeCount;
    }

    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    @SuppressWarnings("all")
    public Integer getSourceTyoe() {
        return this.sourceTyoe;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setChangeCount(final Integer changeCount) {
        this.changeCount = changeCount;
    }

    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    @SuppressWarnings("all")
    public void setSourceTyoe(final Integer sourceTyoe) {
        this.sourceTyoe = sourceTyoe;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegrationChangeHistoryExcel)) return false;
        final IntegrationChangeHistoryExcel other = (IntegrationChangeHistoryExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$changeCount = this.getChangeCount();
        final Object other$changeCount = other.getChangeCount();
        if (this$changeCount == null ? other$changeCount != null : !this$changeCount.equals(other$changeCount)) return false;
        final Object this$sourceTyoe = this.getSourceTyoe();
        final Object other$sourceTyoe = other.getSourceTyoe();
        if (this$sourceTyoe == null ? other$sourceTyoe != null : !this$sourceTyoe.equals(other$sourceTyoe)) return false;
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
        return other instanceof IntegrationChangeHistoryExcel;
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
        final Object $changeCount = this.getChangeCount();
        result = result * PRIME + ($changeCount == null ? 43 : $changeCount.hashCode());
        final Object $sourceTyoe = this.getSourceTyoe();
        result = result * PRIME + ($sourceTyoe == null ? 43 : $sourceTyoe.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "IntegrationChangeHistoryExcel(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", createTime=" + this.getCreateTime() + ", changeCount=" + this.getChangeCount() + ", note=" + this.getNote() + ", sourceTyoe=" + this.getSourceTyoe() + ")";
    }
    //</editor-fold>
}
