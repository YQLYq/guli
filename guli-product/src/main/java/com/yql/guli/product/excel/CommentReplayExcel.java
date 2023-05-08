package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 商品评价回复关系
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class CommentReplayExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "评论id")
    private Long commentId;
    @Excel(name = "回复id")
    private Long replyId;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public CommentReplayExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getCommentId() {
        return this.commentId;
    }

    @SuppressWarnings("all")
    public Long getReplyId() {
        return this.replyId;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setCommentId(final Long commentId) {
        this.commentId = commentId;
    }

    @SuppressWarnings("all")
    public void setReplyId(final Long replyId) {
        this.replyId = replyId;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CommentReplayExcel)) return false;
        final CommentReplayExcel other = (CommentReplayExcel) o;
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
        return other instanceof CommentReplayExcel;
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
        return "CommentReplayExcel(id=" + this.getId() + ", commentId=" + this.getCommentId() + ", replyId=" + this.getReplyId() + ")";
    }
    //</editor-fold>
}
