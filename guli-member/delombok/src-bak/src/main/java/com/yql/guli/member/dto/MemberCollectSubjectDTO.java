package com.yql.guli.member.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("会员收藏的专题活动")
public class MemberCollectSubjectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("subject_id")
    private Long subjectId;
    @ApiModelProperty("subject_name")
    private String subjectName;
    @ApiModelProperty("subject_img")
    private String subjectImg;
    @ApiModelProperty("活动url")
    private String subjectUrll;
    //</editor-fold>

    @SuppressWarnings("all")
    public MemberCollectSubjectDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSubjectId() {
        return this.subjectId;
    }

    @SuppressWarnings("all")
    public String getSubjectName() {
        return this.subjectName;
    }

    @SuppressWarnings("all")
    public String getSubjectImg() {
        return this.subjectImg;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public String getSubjectUrll() {
        return this.subjectUrll;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSubjectId(final Long subjectId) {
        this.subjectId = subjectId;
    }

    @SuppressWarnings("all")
    public void setSubjectName(final String subjectName) {
        this.subjectName = subjectName;
    }

    @SuppressWarnings("all")
    public void setSubjectImg(final String subjectImg) {
        this.subjectImg = subjectImg;
    }

    @SuppressWarnings("all")
    public void setSubjectUrll(final String subjectUrll) {
        this.subjectUrll = subjectUrll;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberCollectSubjectDTO)) return false;
        final MemberCollectSubjectDTO other = (MemberCollectSubjectDTO) o;
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
        return other instanceof MemberCollectSubjectDTO;
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
        return "MemberCollectSubjectDTO(id=" + this.getId() + ", subjectId=" + this.getSubjectId() + ", subjectName=" + this.getSubjectName() + ", subjectImg=" + this.getSubjectImg() + ", subjectUrll=" + this.getSubjectUrll() + ")";
    }
    //</editor-fold>
}
