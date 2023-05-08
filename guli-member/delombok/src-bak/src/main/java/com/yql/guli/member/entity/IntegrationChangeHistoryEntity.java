package com.yql.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 积分变化历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * member_id
     */
    private Long memberId;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * 变化的值
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    private Integer sourceTyoe;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public IntegrationChangeHistoryEntity() {
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
     * member_id
     */
    @SuppressWarnings("all")
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * create_time
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 变化的值
     */
    @SuppressWarnings("all")
    public Integer getChangeCount() {
        return this.changeCount;
    }

    /**
     * 备注
     */
    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    @SuppressWarnings("all")
    public Integer getSourceTyoe() {
        return this.sourceTyoe;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * member_id
     */
    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    /**
     * create_time
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 变化的值
     */
    @SuppressWarnings("all")
    public void setChangeCount(final Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * 备注
     */
    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    @SuppressWarnings("all")
    public void setSourceTyoe(final Integer sourceTyoe) {
        this.sourceTyoe = sourceTyoe;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegrationChangeHistoryEntity)) return false;
        final IntegrationChangeHistoryEntity other = (IntegrationChangeHistoryEntity) o;
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
        return other instanceof IntegrationChangeHistoryEntity;
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
        return "IntegrationChangeHistoryEntity(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", createTime=" + this.getCreateTime() + ", changeCount=" + this.getChangeCount() + ", note=" + this.getNote() + ", sourceTyoe=" + this.getSourceTyoe() + ")";
    }
}
