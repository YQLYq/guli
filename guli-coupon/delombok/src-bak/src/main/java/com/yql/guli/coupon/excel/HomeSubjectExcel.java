package com.yql.guli.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class HomeSubjectExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "专题名字")
    private String name;
    @Excel(name = "专题标题")
    private String title;
    @Excel(name = "专题副标题")
    private String subTitle;
    @Excel(name = "显示状态")
    private Integer status;
    @Excel(name = "详情连接")
    private String url;
    @Excel(name = "排序")
    private Integer sort;
    @Excel(name = "专题图片地址")
    private String img;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public HomeSubjectExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getTitle() {
        return this.title;
    }

    @SuppressWarnings("all")
    public String getSubTitle() {
        return this.subTitle;
    }

    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    @SuppressWarnings("all")
    public String getUrl() {
        return this.url;
    }

    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    @SuppressWarnings("all")
    public String getImg() {
        return this.img;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setTitle(final String title) {
        this.title = title;
    }

    @SuppressWarnings("all")
    public void setSubTitle(final String subTitle) {
        this.subTitle = subTitle;
    }

    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @SuppressWarnings("all")
    public void setUrl(final String url) {
        this.url = url;
    }

    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    @SuppressWarnings("all")
    public void setImg(final String img) {
        this.img = img;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HomeSubjectExcel)) return false;
        final HomeSubjectExcel other = (HomeSubjectExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$subTitle = this.getSubTitle();
        final Object other$subTitle = other.getSubTitle();
        if (this$subTitle == null ? other$subTitle != null : !this$subTitle.equals(other$subTitle)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$img = this.getImg();
        final Object other$img = other.getImg();
        if (this$img == null ? other$img != null : !this$img.equals(other$img)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof HomeSubjectExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $subTitle = this.getSubTitle();
        result = result * PRIME + ($subTitle == null ? 43 : $subTitle.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $img = this.getImg();
        result = result * PRIME + ($img == null ? 43 : $img.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "HomeSubjectExcel(id=" + this.getId() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", subTitle=" + this.getSubTitle() + ", status=" + this.getStatus() + ", url=" + this.getUrl() + ", sort=" + this.getSort() + ", img=" + this.getImg() + ")";
    }
    //</editor-fold>
}
