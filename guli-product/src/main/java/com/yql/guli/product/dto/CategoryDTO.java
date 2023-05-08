package com.yql.guli.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 商品三级分类
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@ApiModel("商品三级分类")
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("分类id")
    private Long catId;
    @ApiModelProperty("分类名称")
    private String name;
    @ApiModelProperty("父分类id")
    private Long parentCid;
    @ApiModelProperty("层级")
    private Integer catLevel;
    @ApiModelProperty("是否显示[0-不显示，1显示]")
    private Integer showStatus;
    @ApiModelProperty("排序")
    private Integer sort;
    @ApiModelProperty("图标地址")
    private String icon;
    @ApiModelProperty("计量单位")
    private String productUnit;
    @ApiModelProperty("商品数量")
    private Integer productCount;
    //</editor-fold>

    @SuppressWarnings("all")
    public CategoryDTO() {
    }

    @SuppressWarnings("all")
    public Long getCatId() {
        return this.catId;
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public Long getParentCid() {
        return this.parentCid;
    }

    @SuppressWarnings("all")
    public Integer getCatLevel() {
        return this.catLevel;
    }

    @SuppressWarnings("all")
    public Integer getShowStatus() {
        return this.showStatus;
    }

    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    @SuppressWarnings("all")
    public String getIcon() {
        return this.icon;
    }

    @SuppressWarnings("all")
    public String getProductUnit() {
        return this.productUnit;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getProductCount() {
        return this.productCount;
    }

    @SuppressWarnings("all")
    public void setCatId(final Long catId) {
        this.catId = catId;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setParentCid(final Long parentCid) {
        this.parentCid = parentCid;
    }

    @SuppressWarnings("all")
    public void setCatLevel(final Integer catLevel) {
        this.catLevel = catLevel;
    }

    @SuppressWarnings("all")
    public void setShowStatus(final Integer showStatus) {
        this.showStatus = showStatus;
    }

    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    @SuppressWarnings("all")
    public void setIcon(final String icon) {
        this.icon = icon;
    }

    @SuppressWarnings("all")
    public void setProductUnit(final String productUnit) {
        this.productUnit = productUnit;
    }

    @SuppressWarnings("all")
    public void setProductCount(final Integer productCount) {
        this.productCount = productCount;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryDTO)) return false;
        final CategoryDTO other = (CategoryDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$catId = this.getCatId();
        final Object other$catId = other.getCatId();
        if (this$catId == null ? other$catId != null : !this$catId.equals(other$catId)) return false;
        final Object this$parentCid = this.getParentCid();
        final Object other$parentCid = other.getParentCid();
        if (this$parentCid == null ? other$parentCid != null : !this$parentCid.equals(other$parentCid)) return false;
        final Object this$catLevel = this.getCatLevel();
        final Object other$catLevel = other.getCatLevel();
        if (this$catLevel == null ? other$catLevel != null : !this$catLevel.equals(other$catLevel)) return false;
        final Object this$showStatus = this.getShowStatus();
        final Object other$showStatus = other.getShowStatus();
        if (this$showStatus == null ? other$showStatus != null : !this$showStatus.equals(other$showStatus)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$productCount = this.getProductCount();
        final Object other$productCount = other.getProductCount();
        if (this$productCount == null ? other$productCount != null : !this$productCount.equals(other$productCount)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$icon = this.getIcon();
        final Object other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) return false;
        final Object this$productUnit = this.getProductUnit();
        final Object other$productUnit = other.getProductUnit();
        if (this$productUnit == null ? other$productUnit != null : !this$productUnit.equals(other$productUnit)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof CategoryDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $catId = this.getCatId();
        result = result * PRIME + ($catId == null ? 43 : $catId.hashCode());
        final Object $parentCid = this.getParentCid();
        result = result * PRIME + ($parentCid == null ? 43 : $parentCid.hashCode());
        final Object $catLevel = this.getCatLevel();
        result = result * PRIME + ($catLevel == null ? 43 : $catLevel.hashCode());
        final Object $showStatus = this.getShowStatus();
        result = result * PRIME + ($showStatus == null ? 43 : $showStatus.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $productCount = this.getProductCount();
        result = result * PRIME + ($productCount == null ? 43 : $productCount.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $icon = this.getIcon();
        result = result * PRIME + ($icon == null ? 43 : $icon.hashCode());
        final Object $productUnit = this.getProductUnit();
        result = result * PRIME + ($productUnit == null ? 43 : $productUnit.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "CategoryDTO(catId=" + this.getCatId() + ", name=" + this.getName() + ", parentCid=" + this.getParentCid() + ", catLevel=" + this.getCatLevel() + ", showStatus=" + this.getShowStatus() + ", sort=" + this.getSort() + ", icon=" + this.getIcon() + ", productUnit=" + this.getProductUnit() + ", productCount=" + this.getProductCount() + ")";
    }
    //</editor-fold>
}
