package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import javax.validation.constraints.NotBlank;

/**
 * 品牌
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_brand")
public class BrandEntity {
    /**
     * 品牌id
     */
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank
    private String name;
    /**
     * 品牌logo地址
     */
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;
    /**
     * 检索首字母
     */
    private String firstLetter;
    /**
     * 排序
     */
    private Integer sort;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public BrandEntity() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * 品牌id
     */
    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    /**
     * 品牌名
     */
    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    /**
     * 品牌logo地址
     */
    @SuppressWarnings("all")
    public String getLogo() {
        return this.logo;
    }

    /**
     * 介绍
     */
    @SuppressWarnings("all")
    public String getDescript() {
        return this.descript;
    }

    /**
     * 显示状态[0-不显示；1-显示]
     */
    @SuppressWarnings("all")
    public Integer getShowStatus() {
        return this.showStatus;
    }

    /**
     * 检索首字母
     */
    @SuppressWarnings("all")
    public String getFirstLetter() {
        return this.firstLetter;
    }

    /**
     * 排序
     */
    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    /**
     * 品牌id
     */
    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 品牌名
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 品牌logo地址
     */
    @SuppressWarnings("all")
    public void setLogo(final String logo) {
        this.logo = logo;
    }

    /**
     * 介绍
     */
    @SuppressWarnings("all")
    public void setDescript(final String descript) {
        this.descript = descript;
    }

    /**
     * 显示状态[0-不显示；1-显示]
     */
    @SuppressWarnings("all")
    public void setShowStatus(final Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 检索首字母
     */
    @SuppressWarnings("all")
    public void setFirstLetter(final String firstLetter) {
        this.firstLetter = firstLetter;
    }

    /**
     * 排序
     */
    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BrandEntity)) return false;
        final BrandEntity other = (BrandEntity) o;
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
        return other instanceof BrandEntity;
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
        return "BrandEntity(brandId=" + this.getBrandId() + ", name=" + this.getName() + ", logo=" + this.getLogo() + ", descript=" + this.getDescript() + ", showStatus=" + this.getShowStatus() + ", firstLetter=" + this.getFirstLetter() + ", sort=" + this.getSort() + ")";
    }
    //</editor-fold>
}
