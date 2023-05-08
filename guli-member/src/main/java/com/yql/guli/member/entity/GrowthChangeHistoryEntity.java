package com.yql.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 成长值变化历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity {
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
     * 改变的值（正负计数）
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    private Integer sourceType;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public GrowthChangeHistoryEntity() {
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
     * 改变的值（正负计数）
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
     * 积分来源[0-购物，1-管理员修改]
     */
    @SuppressWarnings("all")
    public Integer getSourceType() {
        return this.sourceType;
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
     * 改变的值（正负计数）
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
     * 积分来源[0-购物，1-管理员修改]
     */
    @SuppressWarnings("all")
    public void setSourceType(final Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GrowthChangeHistoryEntity)) return false;
        final GrowthChangeHistoryEntity other = (GrowthChangeHistoryEntity) o;
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
        final Object this$sourceType = this.getSourceType();
        final Object other$sourceType = other.getSourceType();
        if (this$sourceType == null ? other$sourceType != null : !this$sourceType.equals(other$sourceType)) return false;
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
        return other instanceof GrowthChangeHistoryEntity;
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
        final Object $sourceType = this.getSourceType();
        result = result * PRIME + ($sourceType == null ? 43 : $sourceType.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "GrowthChangeHistoryEntity(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", createTime=" + this.getCreateTime() + ", changeCount=" + this.getChangeCount() + ", note=" + this.getNote() + ", sourceType=" + this.getSourceType() + ")";
    }
}
