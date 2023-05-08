/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */
package com.yql.guli.common.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 树节点，所有需要实现树节点的，都需要继承该类
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
public class TreeNode<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 上级ID
     */
    private Long pid;
    /**
     * 子节点列表
     */
    private List<T> children = new ArrayList<>();

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public TreeNode() {
    }

    /**
     * 主键
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * 上级ID
     */
    @SuppressWarnings("all")
    public Long getPid() {
        return this.pid;
    }

    /**
     * 子节点列表
     */
    @SuppressWarnings("all")
    public List<T> getChildren() {
        return this.children;
    }

    /**
     * 主键
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 上级ID
     */
    @SuppressWarnings("all")
    public void setPid(final Long pid) {
        this.pid = pid;
    }

    /**
     * 子节点列表
     */
    @SuppressWarnings("all")
    public void setChildren(final List<T> children) {
        this.children = children;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TreeNode)) return false;
        final TreeNode<?> other = (TreeNode<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$pid = this.getPid();
        final Object other$pid = other.getPid();
        if (this$pid == null ? other$pid != null : !this$pid.equals(other$pid)) return false;
        final Object this$children = this.getChildren();
        final Object other$children = other.getChildren();
        if (this$children == null ? other$children != null : !this$children.equals(other$children)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof TreeNode;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $pid = this.getPid();
        result = result * PRIME + ($pid == null ? 43 : $pid.hashCode());
        final Object $children = this.getChildren();
        result = result * PRIME + ($children == null ? 43 : $children.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "TreeNode(id=" + this.getId() + ", pid=" + this.getPid() + ", children=" + this.getChildren() + ")";
    }
    //</editor-fold>
}
