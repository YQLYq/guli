package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 商品属性
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class AttrExcel {
    @Excel(name = "属性id")
    private Long attrId;
    @Excel(name = "属性名")
    private String attrName;
    @Excel(name = "是否需要检索[0-不需要，1-需要]")
    private Integer searchType;
    @Excel(name = "属性图标")
    private String icon;
    @Excel(name = "可选值列表[用逗号分隔]")
    private String valueSelect;
    @Excel(name = "属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]")
    private Integer attrType;
    @Excel(name = "启用状态[0 - 禁用，1 - 启用]")
    private Long enable;
    @Excel(name = "所属分类")
    private Long catelogId;
    @Excel(name = "快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整")
    private Integer showDesc;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public AttrExcel() {
    }

    @SuppressWarnings("all")
    public Long getAttrId() {
        return this.attrId;
    }

    @SuppressWarnings("all")
    public String getAttrName() {
        return this.attrName;
    }

    @SuppressWarnings("all")
    public Integer getSearchType() {
        return this.searchType;
    }

    @SuppressWarnings("all")
    public String getIcon() {
        return this.icon;
    }

    @SuppressWarnings("all")
    public String getValueSelect() {
        return this.valueSelect;
    }

    @SuppressWarnings("all")
    public Integer getAttrType() {
        return this.attrType;
    }

    @SuppressWarnings("all")
    public Long getEnable() {
        return this.enable;
    }

    @SuppressWarnings("all")
    public Long getCatelogId() {
        return this.catelogId;
    }

    @SuppressWarnings("all")
    public Integer getShowDesc() {
        return this.showDesc;
    }

    @SuppressWarnings("all")
    public void setAttrId(final Long attrId) {
        this.attrId = attrId;
    }

    @SuppressWarnings("all")
    public void setAttrName(final String attrName) {
        this.attrName = attrName;
    }

    @SuppressWarnings("all")
    public void setSearchType(final Integer searchType) {
        this.searchType = searchType;
    }

    @SuppressWarnings("all")
    public void setIcon(final String icon) {
        this.icon = icon;
    }

    @SuppressWarnings("all")
    public void setValueSelect(final String valueSelect) {
        this.valueSelect = valueSelect;
    }

    @SuppressWarnings("all")
    public void setAttrType(final Integer attrType) {
        this.attrType = attrType;
    }

    @SuppressWarnings("all")
    public void setEnable(final Long enable) {
        this.enable = enable;
    }

    @SuppressWarnings("all")
    public void setCatelogId(final Long catelogId) {
        this.catelogId = catelogId;
    }

    @SuppressWarnings("all")
    public void setShowDesc(final Integer showDesc) {
        this.showDesc = showDesc;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AttrExcel)) return false;
        final AttrExcel other = (AttrExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$attrId = this.getAttrId();
        final Object other$attrId = other.getAttrId();
        if (this$attrId == null ? other$attrId != null : !this$attrId.equals(other$attrId)) return false;
        final Object this$searchType = this.getSearchType();
        final Object other$searchType = other.getSearchType();
        if (this$searchType == null ? other$searchType != null : !this$searchType.equals(other$searchType)) return false;
        final Object this$attrType = this.getAttrType();
        final Object other$attrType = other.getAttrType();
        if (this$attrType == null ? other$attrType != null : !this$attrType.equals(other$attrType)) return false;
        final Object this$enable = this.getEnable();
        final Object other$enable = other.getEnable();
        if (this$enable == null ? other$enable != null : !this$enable.equals(other$enable)) return false;
        final Object this$catelogId = this.getCatelogId();
        final Object other$catelogId = other.getCatelogId();
        if (this$catelogId == null ? other$catelogId != null : !this$catelogId.equals(other$catelogId)) return false;
        final Object this$showDesc = this.getShowDesc();
        final Object other$showDesc = other.getShowDesc();
        if (this$showDesc == null ? other$showDesc != null : !this$showDesc.equals(other$showDesc)) return false;
        final Object this$attrName = this.getAttrName();
        final Object other$attrName = other.getAttrName();
        if (this$attrName == null ? other$attrName != null : !this$attrName.equals(other$attrName)) return false;
        final Object this$icon = this.getIcon();
        final Object other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) return false;
        final Object this$valueSelect = this.getValueSelect();
        final Object other$valueSelect = other.getValueSelect();
        if (this$valueSelect == null ? other$valueSelect != null : !this$valueSelect.equals(other$valueSelect)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof AttrExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $attrId = this.getAttrId();
        result = result * PRIME + ($attrId == null ? 43 : $attrId.hashCode());
        final Object $searchType = this.getSearchType();
        result = result * PRIME + ($searchType == null ? 43 : $searchType.hashCode());
        final Object $attrType = this.getAttrType();
        result = result * PRIME + ($attrType == null ? 43 : $attrType.hashCode());
        final Object $enable = this.getEnable();
        result = result * PRIME + ($enable == null ? 43 : $enable.hashCode());
        final Object $catelogId = this.getCatelogId();
        result = result * PRIME + ($catelogId == null ? 43 : $catelogId.hashCode());
        final Object $showDesc = this.getShowDesc();
        result = result * PRIME + ($showDesc == null ? 43 : $showDesc.hashCode());
        final Object $attrName = this.getAttrName();
        result = result * PRIME + ($attrName == null ? 43 : $attrName.hashCode());
        final Object $icon = this.getIcon();
        result = result * PRIME + ($icon == null ? 43 : $icon.hashCode());
        final Object $valueSelect = this.getValueSelect();
        result = result * PRIME + ($valueSelect == null ? 43 : $valueSelect.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "AttrExcel(attrId=" + this.getAttrId() + ", attrName=" + this.getAttrName() + ", searchType=" + this.getSearchType() + ", icon=" + this.getIcon() + ", valueSelect=" + this.getValueSelect() + ", attrType=" + this.getAttrType() + ", enable=" + this.getEnable() + ", catelogId=" + this.getCatelogId() + ", showDesc=" + this.getShowDesc() + ")";
    }
    //</editor-fold>
}
