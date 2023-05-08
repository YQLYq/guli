package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 会员收藏的商品
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class MemberCollectSpuExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "会员id")
    private Long memberId;
    @Excel(name = "spu_id")
    private Long spuId;
    @Excel(name = "spu_name")
    private String spuName;
    @Excel(name = "spu_img")
    private String spuImg;
    @Excel(name = "create_time")
    private Date createTime;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberCollectSpuExcel() {
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
    public Long getSpuId() {
        return this.spuId;
    }

    @SuppressWarnings("all")
    public String getSpuName() {
        return this.spuName;
    }

    @SuppressWarnings("all")
    public String getSpuImg() {
        return this.spuImg;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
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
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    @SuppressWarnings("all")
    public void setSpuName(final String spuName) {
        this.spuName = spuName;
    }

    @SuppressWarnings("all")
    public void setSpuImg(final String spuImg) {
        this.spuImg = spuImg;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberCollectSpuExcel)) return false;
        final MemberCollectSpuExcel other = (MemberCollectSpuExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$spuName = this.getSpuName();
        final Object other$spuName = other.getSpuName();
        if (this$spuName == null ? other$spuName != null : !this$spuName.equals(other$spuName)) return false;
        final Object this$spuImg = this.getSpuImg();
        final Object other$spuImg = other.getSpuImg();
        if (this$spuImg == null ? other$spuImg != null : !this$spuImg.equals(other$spuImg)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberCollectSpuExcel;
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
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $spuName = this.getSpuName();
        result = result * PRIME + ($spuName == null ? 43 : $spuName.hashCode());
        final Object $spuImg = this.getSpuImg();
        result = result * PRIME + ($spuImg == null ? 43 : $spuImg.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberCollectSpuExcel(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", spuId=" + this.getSpuId() + ", spuName=" + this.getSpuName() + ", spuImg=" + this.getSpuImg() + ", createTime=" + this.getCreateTime() + ")";
    }
    //</editor-fold>
}
