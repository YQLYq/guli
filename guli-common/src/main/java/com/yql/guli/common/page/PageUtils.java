package com.yql.guli.common.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.poi.ss.formula.functions.T;
import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类 ("totalCount",
 * 		"pageSize",
 * 		"totalPage",
 * 		"currPage",)
 */
@ApiModel("分页数据")
public class PageUtils<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //总计数
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("总记录数")
    //</editor-fold>
    private int totalCount;
    //页码大小
    private int pageSize;
    //总页码
    private int totalPage;
    //当前页码
    private int currPage;
    //数据
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("列表数据")
    //</editor-fold>
    private List<T> list;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public PageUtils() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public int getTotalCount() {
        return this.totalCount;
    }

    @SuppressWarnings("all")
    public int getPageSize() {
        return this.pageSize;
    }

    @SuppressWarnings("all")
    public int getTotalPage() {
        return this.totalPage;
    }

    @SuppressWarnings("all")
    public int getCurrPage() {
        return this.currPage;
    }

    @SuppressWarnings("all")
    public List<T> getList() {
        return this.list;
    }

    @SuppressWarnings("all")
    public void setTotalCount(final int totalCount) {
        this.totalCount = totalCount;
    }

    @SuppressWarnings("all")
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    @SuppressWarnings("all")
    public void setTotalPage(final int totalPage) {
        this.totalPage = totalPage;
    }

    @SuppressWarnings("all")
    public void setCurrPage(final int currPage) {
        this.currPage = currPage;
    }

    @SuppressWarnings("all")
    public void setList(final List<T> list) {
        this.list = list;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PageUtils)) return false;
        final PageUtils<?> other = (PageUtils<?>) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTotalCount() != other.getTotalCount()) return false;
        if (this.getPageSize() != other.getPageSize()) return false;
        if (this.getTotalPage() != other.getTotalPage()) return false;
        if (this.getCurrPage() != other.getCurrPage()) return false;
        final Object this$list = this.getList();
        final Object other$list = other.getList();
        if (this$list == null ? other$list != null : !this$list.equals(other$list)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof PageUtils;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getTotalCount();
        result = result * PRIME + this.getPageSize();
        result = result * PRIME + this.getTotalPage();
        result = result * PRIME + this.getCurrPage();
        final Object $list = this.getList();
        result = result * PRIME + ($list == null ? 43 : $list.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "PageUtils(totalCount=" + this.getTotalCount() + ", pageSize=" + this.getPageSize() + ", totalPage=" + this.getTotalPage() + ", currPage=" + this.getCurrPage() + ", list=" + this.getList() + ")";
    }
    //</editor-fold>
}
