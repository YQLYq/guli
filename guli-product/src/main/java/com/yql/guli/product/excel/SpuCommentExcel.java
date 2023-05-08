package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 商品评价
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class SpuCommentExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "spu_id")
    private Long spuId;
    @Excel(name = "商品名字")
    private String spuName;
    @Excel(name = "会员昵称")
    private String memberNickName;
    @Excel(name = "星级")
    private Integer star;
    @Excel(name = "会员ip")
    private String memberIp;
    @Excel(name = "创建时间")
    private Date createTime;
    @Excel(name = "显示状态[0-不显示，1-显示]")
    private Integer showStatus;
    @Excel(name = "购买时属性组合")
    private String spuAttributes;
    @Excel(name = "点赞数")
    private Integer likesCount;
    @Excel(name = "回复数")
    private Integer replyCount;
    @Excel(name = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]")
    private String resources;
    @Excel(name = "内容")
    private String content;
    @Excel(name = "用户头像")
    private String memberIcon;
    @Excel(name = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]")
    private Integer commentType;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SpuCommentExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
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
    public String getMemberNickName() {
        return this.memberNickName;
    }

    @SuppressWarnings("all")
    public Integer getStar() {
        return this.star;
    }

    @SuppressWarnings("all")
    public String getMemberIp() {
        return this.memberIp;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public Integer getShowStatus() {
        return this.showStatus;
    }

    @SuppressWarnings("all")
    public String getSpuAttributes() {
        return this.spuAttributes;
    }

    @SuppressWarnings("all")
    public Integer getLikesCount() {
        return this.likesCount;
    }

    @SuppressWarnings("all")
    public Integer getReplyCount() {
        return this.replyCount;
    }

    @SuppressWarnings("all")
    public String getResources() {
        return this.resources;
    }

    @SuppressWarnings("all")
    public String getContent() {
        return this.content;
    }

    @SuppressWarnings("all")
    public String getMemberIcon() {
        return this.memberIcon;
    }

    @SuppressWarnings("all")
    public Integer getCommentType() {
        return this.commentType;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
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
    public void setMemberNickName(final String memberNickName) {
        this.memberNickName = memberNickName;
    }

    @SuppressWarnings("all")
    public void setStar(final Integer star) {
        this.star = star;
    }

    @SuppressWarnings("all")
    public void setMemberIp(final String memberIp) {
        this.memberIp = memberIp;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setShowStatus(final Integer showStatus) {
        this.showStatus = showStatus;
    }

    @SuppressWarnings("all")
    public void setSpuAttributes(final String spuAttributes) {
        this.spuAttributes = spuAttributes;
    }

    @SuppressWarnings("all")
    public void setLikesCount(final Integer likesCount) {
        this.likesCount = likesCount;
    }

    @SuppressWarnings("all")
    public void setReplyCount(final Integer replyCount) {
        this.replyCount = replyCount;
    }

    @SuppressWarnings("all")
    public void setResources(final String resources) {
        this.resources = resources;
    }

    @SuppressWarnings("all")
    public void setContent(final String content) {
        this.content = content;
    }

    @SuppressWarnings("all")
    public void setMemberIcon(final String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @SuppressWarnings("all")
    public void setCommentType(final Integer commentType) {
        this.commentType = commentType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuCommentExcel)) return false;
        final SpuCommentExcel other = (SpuCommentExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$star = this.getStar();
        final Object other$star = other.getStar();
        if (this$star == null ? other$star != null : !this$star.equals(other$star)) return false;
        final Object this$showStatus = this.getShowStatus();
        final Object other$showStatus = other.getShowStatus();
        if (this$showStatus == null ? other$showStatus != null : !this$showStatus.equals(other$showStatus)) return false;
        final Object this$likesCount = this.getLikesCount();
        final Object other$likesCount = other.getLikesCount();
        if (this$likesCount == null ? other$likesCount != null : !this$likesCount.equals(other$likesCount)) return false;
        final Object this$replyCount = this.getReplyCount();
        final Object other$replyCount = other.getReplyCount();
        if (this$replyCount == null ? other$replyCount != null : !this$replyCount.equals(other$replyCount)) return false;
        final Object this$commentType = this.getCommentType();
        final Object other$commentType = other.getCommentType();
        if (this$commentType == null ? other$commentType != null : !this$commentType.equals(other$commentType)) return false;
        final Object this$spuName = this.getSpuName();
        final Object other$spuName = other.getSpuName();
        if (this$spuName == null ? other$spuName != null : !this$spuName.equals(other$spuName)) return false;
        final Object this$memberNickName = this.getMemberNickName();
        final Object other$memberNickName = other.getMemberNickName();
        if (this$memberNickName == null ? other$memberNickName != null : !this$memberNickName.equals(other$memberNickName)) return false;
        final Object this$memberIp = this.getMemberIp();
        final Object other$memberIp = other.getMemberIp();
        if (this$memberIp == null ? other$memberIp != null : !this$memberIp.equals(other$memberIp)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$spuAttributes = this.getSpuAttributes();
        final Object other$spuAttributes = other.getSpuAttributes();
        if (this$spuAttributes == null ? other$spuAttributes != null : !this$spuAttributes.equals(other$spuAttributes)) return false;
        final Object this$resources = this.getResources();
        final Object other$resources = other.getResources();
        if (this$resources == null ? other$resources != null : !this$resources.equals(other$resources)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$memberIcon = this.getMemberIcon();
        final Object other$memberIcon = other.getMemberIcon();
        if (this$memberIcon == null ? other$memberIcon != null : !this$memberIcon.equals(other$memberIcon)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SpuCommentExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $star = this.getStar();
        result = result * PRIME + ($star == null ? 43 : $star.hashCode());
        final Object $showStatus = this.getShowStatus();
        result = result * PRIME + ($showStatus == null ? 43 : $showStatus.hashCode());
        final Object $likesCount = this.getLikesCount();
        result = result * PRIME + ($likesCount == null ? 43 : $likesCount.hashCode());
        final Object $replyCount = this.getReplyCount();
        result = result * PRIME + ($replyCount == null ? 43 : $replyCount.hashCode());
        final Object $commentType = this.getCommentType();
        result = result * PRIME + ($commentType == null ? 43 : $commentType.hashCode());
        final Object $spuName = this.getSpuName();
        result = result * PRIME + ($spuName == null ? 43 : $spuName.hashCode());
        final Object $memberNickName = this.getMemberNickName();
        result = result * PRIME + ($memberNickName == null ? 43 : $memberNickName.hashCode());
        final Object $memberIp = this.getMemberIp();
        result = result * PRIME + ($memberIp == null ? 43 : $memberIp.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $spuAttributes = this.getSpuAttributes();
        result = result * PRIME + ($spuAttributes == null ? 43 : $spuAttributes.hashCode());
        final Object $resources = this.getResources();
        result = result * PRIME + ($resources == null ? 43 : $resources.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $memberIcon = this.getMemberIcon();
        result = result * PRIME + ($memberIcon == null ? 43 : $memberIcon.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SpuCommentExcel(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", spuId=" + this.getSpuId() + ", spuName=" + this.getSpuName() + ", memberNickName=" + this.getMemberNickName() + ", star=" + this.getStar() + ", memberIp=" + this.getMemberIp() + ", createTime=" + this.getCreateTime() + ", showStatus=" + this.getShowStatus() + ", spuAttributes=" + this.getSpuAttributes() + ", likesCount=" + this.getLikesCount() + ", replyCount=" + this.getReplyCount() + ", resources=" + this.getResources() + ", content=" + this.getContent() + ", memberIcon=" + this.getMemberIcon() + ", commentType=" + this.getCommentType() + ")";
    }
    //</editor-fold>
}
