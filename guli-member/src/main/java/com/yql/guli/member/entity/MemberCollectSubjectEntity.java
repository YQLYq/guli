package com.yql.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * subject_id
     */
    private Long subjectId;
    /**
     * subject_name
     */
    private String subjectName;
    /**
     * subject_img
     */
    private String subjectImg;
    /**
     * 活动url
     */
    private String subjectUrll;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberCollectSubjectEntity() {
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
     * subject_id
     */
    @SuppressWarnings("all")
    public Long getSubjectId() {
        return this.subjectId;
    }

    /**
     * subject_name
     */
    @SuppressWarnings("all")
    public String getSubjectName() {
        return this.subjectName;
    }

    /**
     * subject_img
     */
    @SuppressWarnings("all")
    public String getSubjectImg() {
        return this.subjectImg;
    }

    /**
     * 活动url
     */
    @SuppressWarnings("all")
    public String getSubjectUrll() {
        return this.subjectUrll;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * subject_id
     */
    @SuppressWarnings("all")
    public void setSubjectId(final Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * subject_name
     */
    @SuppressWarnings("all")
    public void setSubjectName(final String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * subject_img
     */
    @SuppressWarnings("all")
    public void setSubjectImg(final String subjectImg) {
        this.subjectImg = subjectImg;
    }

    /**
     * 活动url
     */
    @SuppressWarnings("all")
    public void setSubjectUrll(final String subjectUrll) {
        this.subjectUrll = subjectUrll;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberCollectSubjectEntity)) return false;
        final MemberCollectSubjectEntity other = (MemberCollectSubjectEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$subjectId = this.getSubjectId();
        final Object other$subjectId = other.getSubjectId();
        if (this$subjectId == null ? other$subjectId != null : !this$subjectId.equals(other$subjectId)) return false;
        final Object this$subjectName = this.getSubjectName();
        final Object other$subjectName = other.getSubjectName();
        if (this$subjectName == null ? other$subjectName != null : !this$subjectName.equals(other$subjectName)) return false;
        final Object this$subjectImg = this.getSubjectImg();
        final Object other$subjectImg = other.getSubjectImg();
        if (this$subjectImg == null ? other$subjectImg != null : !this$subjectImg.equals(other$subjectImg)) return false;
        final Object this$subjectUrll = this.getSubjectUrll();
        final Object other$subjectUrll = other.getSubjectUrll();
        if (this$subjectUrll == null ? other$subjectUrll != null : !this$subjectUrll.equals(other$subjectUrll)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberCollectSubjectEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $subjectId = this.getSubjectId();
        result = result * PRIME + ($subjectId == null ? 43 : $subjectId.hashCode());
        final Object $subjectName = this.getSubjectName();
        result = result * PRIME + ($subjectName == null ? 43 : $subjectName.hashCode());
        final Object $subjectImg = this.getSubjectImg();
        result = result * PRIME + ($subjectImg == null ? 43 : $subjectImg.hashCode());
        final Object $subjectUrll = this.getSubjectUrll();
        result = result * PRIME + ($subjectUrll == null ? 43 : $subjectUrll.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberCollectSubjectEntity(id=" + this.getId() + ", subjectId=" + this.getSubjectId() + ", subjectName=" + this.getSubjectName() + ", subjectImg=" + this.getSubjectImg() + ", subjectUrll=" + this.getSubjectUrll() + ")";
    }
}
