package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品评价回复关系
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_comment_replay")
public class CommentReplayEntity {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 评论id
     */
    private Long commentId;
    /**
     * 回复id
     */
    private Long replyId;

    @SuppressWarnings("all")
    public CommentReplayEntity() {
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * 评论id
     */
    @SuppressWarnings("all")
    public Long getCommentId() {
        return this.commentId;
    }

    /**
     * 回复id
     */
    @SuppressWarnings("all")
    public Long getReplyId() {
        return this.replyId;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 评论id
     */
    @SuppressWarnings("all")
    public void setCommentId(final Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 回复id
     */
    @SuppressWarnings("all")
    public void setReplyId(final Long replyId) {
        this.replyId = replyId;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CommentReplayEntity)) return false;
        final CommentReplayEntity other = (CommentReplayEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$commentId = this.getCommentId();
        final Object other$commentId = other.getCommentId();
        if (this$commentId == null ? other$commentId != null : !this$commentId.equals(other$commentId)) return false;
        final Object this$replyId = this.getReplyId();
        final Object other$replyId = other.getReplyId();
        if (this$replyId == null ? other$replyId != null : !this$replyId.equals(other$replyId)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof CommentReplayEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $commentId = this.getCommentId();
        result = result * PRIME + ($commentId == null ? 43 : $commentId.hashCode());
        final Object $replyId = this.getReplyId();
        result = result * PRIME + ($replyId == null ? 43 : $replyId.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "CommentReplayEntity(id=" + this.getId() + ", commentId=" + this.getCommentId() + ", replyId=" + this.getReplyId() + ")";
    }
}
