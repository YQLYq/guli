package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 商品评价
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_spu_comment")
public class SpuCommentEntity {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * 商品名字
     */
    private String spuName;
    /**
     * 会员昵称
     */
    private String memberNickName;
    /**
     * 星级
     */
    private Integer star;
    /**
     * 会员ip
     */
    private String memberIp;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 显示状态[0-不显示，1-显示]
     */
    private Integer showStatus;
    /**
     * 购买时属性组合
     */
    private String spuAttributes;
    /**
     * 点赞数
     */
    private Integer likesCount;
    /**
     * 回复数
     */
    private Integer replyCount;
    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    private String resources;
    /**
     * 内容
     */
    private String content;
    /**
     * 用户头像
     */
    private String memberIcon;
    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    private Integer commentType;

    @SuppressWarnings("all")
    public SpuCommentEntity() {
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * sku_id
     */
    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    /**
     * 商品名字
     */
    @SuppressWarnings("all")
    public String getSpuName() {
        return this.spuName;
    }

    /**
     * 会员昵称
     */
    @SuppressWarnings("all")
    public String getMemberNickName() {
        return this.memberNickName;
    }

    /**
     * 星级
     */
    @SuppressWarnings("all")
    public Integer getStar() {
        return this.star;
    }

    /**
     * 会员ip
     */
    @SuppressWarnings("all")
    public String getMemberIp() {
        return this.memberIp;
    }

    /**
     * 创建时间
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 显示状态[0-不显示，1-显示]
     */
    @SuppressWarnings("all")
    public Integer getShowStatus() {
        return this.showStatus;
    }

    /**
     * 购买时属性组合
     */
    @SuppressWarnings("all")
    public String getSpuAttributes() {
        return this.spuAttributes;
    }

    /**
     * 点赞数
     */
    @SuppressWarnings("all")
    public Integer getLikesCount() {
        return this.likesCount;
    }

    /**
     * 回复数
     */
    @SuppressWarnings("all")
    public Integer getReplyCount() {
        return this.replyCount;
    }

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    @SuppressWarnings("all")
    public String getResources() {
        return this.resources;
    }

    /**
     * 内容
     */
    @SuppressWarnings("all")
    public String getContent() {
        return this.content;
    }

    /**
     * 用户头像
     */
    @SuppressWarnings("all")
    public String getMemberIcon() {
        return this.memberIcon;
    }

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    @SuppressWarnings("all")
    public Integer getCommentType() {
        return this.commentType;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * sku_id
     */
    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 商品名字
     */
    @SuppressWarnings("all")
    public void setSpuName(final String spuName) {
        this.spuName = spuName;
    }

    /**
     * 会员昵称
     */
    @SuppressWarnings("all")
    public void setMemberNickName(final String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * 星级
     */
    @SuppressWarnings("all")
    public void setStar(final Integer star) {
        this.star = star;
    }

    /**
     * 会员ip
     */
    @SuppressWarnings("all")
    public void setMemberIp(final String memberIp) {
        this.memberIp = memberIp;
    }

    /**
     * 创建时间
     */

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 显示状态[0-不显示，1-显示]
     */
    @SuppressWarnings("all")
    public void setShowStatus(final Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 购买时属性组合
     */
    @SuppressWarnings("all")
    public void setSpuAttributes(final String spuAttributes) {
        this.spuAttributes = spuAttributes;
    }

    /**
     * 点赞数
     */
    @SuppressWarnings("all")
    public void setLikesCount(final Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * 回复数
     */
    @SuppressWarnings("all")
    public void setReplyCount(final Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    @SuppressWarnings("all")
    public void setResources(final String resources) {
        this.resources = resources;
    }

    /**
     * 内容
     */
    @SuppressWarnings("all")
    public void setContent(final String content) {
        this.content = content;
    }

    /**
     * 用户头像
     */
    @SuppressWarnings("all")
    public void setMemberIcon(final String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    @SuppressWarnings("all")
    public void setCommentType(final Integer commentType) {
        this.commentType = commentType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuCommentEntity)) return false;
        final SpuCommentEntity other = (SpuCommentEntity) o;
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
        return other instanceof SpuCommentEntity;
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
        return "SpuCommentEntity(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", spuId=" + this.getSpuId() + ", spuName=" + this.getSpuName() + ", memberNickName=" + this.getMemberNickName() + ", star=" + this.getStar() + ", memberIp=" + this.getMemberIp() + ", createTime=" + this.getCreateTime() + ", showStatus=" + this.getShowStatus() + ", spuAttributes=" + this.getSpuAttributes() + ", likesCount=" + this.getLikesCount() + ", replyCount=" + this.getReplyCount() + ", resources=" + this.getResources() + ", content=" + this.getContent() + ", memberIcon=" + this.getMemberIcon() + ", commentType=" + this.getCommentType() + ")";
    }
}
