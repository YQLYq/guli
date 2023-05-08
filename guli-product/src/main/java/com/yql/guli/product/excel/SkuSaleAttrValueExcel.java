package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * sku销售属性&值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class SkuSaleAttrValueExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "attr_id")
    private Long attrId;
    @Excel(name = "销售属性名")
    private String attrName;
    @Excel(name = "销售属性值")
    private String attrValue;
    @Excel(name = "顺序")
    private Integer attrSort;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SkuSaleAttrValueExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
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
    public String getAttrValue() {
        return this.attrValue;
    }

    @SuppressWarnings("all")
    public Integer getAttrSort() {
        return this.attrSort;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
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
    public void setAttrValue(final String attrValue) {
        this.attrValue = attrValue;
    }

    @SuppressWarnings("all")
    public void setAttrSort(final Integer attrSort) {
        this.attrSort = attrSort;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuSaleAttrValueExcel)) return false;
        final SkuSaleAttrValueExcel other = (SkuSaleAttrValueExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$attrId = this.getAttrId();
        final Object other$attrId = other.getAttrId();
        if (this$attrId == null ? other$attrId != null : !this$attrId.equals(other$attrId)) return false;
        final Object this$attrSort = this.getAttrSort();
        final Object other$attrSort = other.getAttrSort();
        if (this$attrSort == null ? other$attrSort != null : !this$attrSort.equals(other$attrSort)) return false;
        final Object this$attrName = this.getAttrName();
        final Object other$attrName = other.getAttrName();
        if (this$attrName == null ? other$attrName != null : !this$attrName.equals(other$attrName)) return false;
        final Object this$attrValue = this.getAttrValue();
        final Object other$attrValue = other.getAttrValue();
        if (this$attrValue == null ? other$attrValue != null : !this$attrValue.equals(other$attrValue)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SkuSaleAttrValueExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $attrId = this.getAttrId();
        result = result * PRIME + ($attrId == null ? 43 : $attrId.hashCode());
        final Object $attrSort = this.getAttrSort();
        result = result * PRIME + ($attrSort == null ? 43 : $attrSort.hashCode());
        final Object $attrName = this.getAttrName();
        result = result * PRIME + ($attrName == null ? 43 : $attrName.hashCode());
        final Object $attrValue = this.getAttrValue();
        result = result * PRIME + ($attrValue == null ? 43 : $attrValue.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SkuSaleAttrValueExcel(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", attrId=" + this.getAttrId() + ", attrName=" + this.getAttrName() + ", attrValue=" + this.getAttrValue() + ", attrSort=" + this.getAttrSort() + ")";
    }
    //</editor-fold>
}
