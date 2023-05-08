package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 品牌
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class BrandExcel {
    @Excel(name = "品牌id")
    private Long brandId;
    @Excel(name = "品牌名")
    private String name;
    @Excel(name = "品牌logo地址")
    private String logo;
    @Excel(name = "介绍")
    private String descript;
    @Excel(name = "显示状态[0-不显示；1-显示]")
    private Integer showStatus;
    @Excel(name = "检索首字母")
    private String firstLetter;
    @Excel(name = "排序")
    private Integer sort;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public BrandExcel() {
    }

    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getLogo() {
        return this.logo;
    }

    @SuppressWarnings("all")
    public String getDescript() {
        return this.descript;
    }

    @SuppressWarnings("all")
    public Integer getShowStatus() {
        return this.showStatus;
    }

    @SuppressWarnings("all")
    public String getFirstLetter() {
        return this.firstLetter;
    }

    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setLogo(final String logo) {
        this.logo = logo;
    }

    @SuppressWarnings("all")
    public void setDescript(final String descript) {
        this.descript = descript;
    }

    @SuppressWarnings("all")
    public void setShowStatus(final Integer showStatus) {
        this.showStatus = showStatus;
    }

    @SuppressWarnings("all")
    public void setFirstLetter(final String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BrandExcel)) return false;
        final BrandExcel other = (BrandExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$showStatus = this.getShowStatus();
        final Object other$showStatus = other.getShowStatus();
        if (this$showStatus == null ? other$showStatus != null : !this$showStatus.equals(other$showStatus)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$logo = this.getLogo();
        final Object other$logo = other.getLogo();
        if (this$logo == null ? other$logo != null : !this$logo.equals(other$logo)) return false;
        final Object this$descript = this.getDescript();
        final Object other$descript = other.getDescript();
        if (this$descript == null ? other$descript != null : !this$descript.equals(other$descript)) return false;
        final Object this$firstLetter = this.getFirstLetter();
        final Object other$firstLetter = other.getFirstLetter();
        if (this$firstLetter == null ? other$firstLetter != null : !this$firstLetter.equals(other$firstLetter)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof BrandExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $showStatus = this.getShowStatus();
        result = result * PRIME + ($showStatus == null ? 43 : $showStatus.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $logo = this.getLogo();
        result = result * PRIME + ($logo == null ? 43 : $logo.hashCode());
        final Object $descript = this.getDescript();
        result = result * PRIME + ($descript == null ? 43 : $descript.hashCode());
        final Object $firstLetter = this.getFirstLetter();
        result = result * PRIME + ($firstLetter == null ? 43 : $firstLetter.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "BrandExcel(brandId=" + this.getBrandId() + ", name=" + this.getName() + ", logo=" + this.getLogo() + ", descript=" + this.getDescript() + ", showStatus=" + this.getShowStatus() + ", firstLetter=" + this.getFirstLetter() + ", sort=" + this.getSort() + ")";
    }
    //</editor-fold>
}
