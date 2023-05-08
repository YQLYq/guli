/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */
package com.yql.guli.common.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 * @author Mark sunlightcs@gmail.com
 */
@ApiModel("分页数据")
public class PageData<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("总记录数")
    private int total;
    @ApiModelProperty("列表数据")
    private List<T> list;

    /**
     * 分页
     * @param list   列表数据
     * @param total  总记录数
     */
    public PageData(List<T> list, long total) {
        this.list = list;
        this.total = (int) total;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public int getTotal() {
        return this.total;
    }

    @SuppressWarnings("all")
    public List<T> getList() {
        return this.list;
    }

    @SuppressWarnings("all")
    public void setTotal(final int total) {
        this.total = total;
    }

    @SuppressWarnings("all")
    public void setList(final List<T> list) {
        this.list = list;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PageData)) return false;
        final PageData<?> other = (PageData<?>) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTotal() != other.getTotal()) return false;
        final Object this$list = this.getList();
        final Object other$list = other.getList();
        if (this$list == null ? other$list != null : !this$list.equals(other$list)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof PageData;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getTotal();
        final Object $list = this.getList();
        result = result * PRIME + ($list == null ? 43 : $list.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "PageData(total=" + this.getTotal() + ", list=" + this.getList() + ")";
    }
    //</editor-fold>
}
