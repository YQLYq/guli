package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 属性&属性分组关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class AttrAttrgroupRelationExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "属性id")
    private Long attrId;
    @Excel(name = "属性分组id")
    private Long attrGroupId;
    @Excel(name = "属性组内排序")
    private Integer attrSort;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public AttrAttrgroupRelationExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getAttrId() {
        return this.attrId;
    }

    @SuppressWarnings("all")
    public Long getAttrGroupId() {
        return this.attrGroupId;
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
    public void setAttrId(final Long attrId) {
        this.attrId = attrId;
    }

    @SuppressWarnings("all")
    public void setAttrGroupId(final Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    @SuppressWarnings("all")
    public void setAttrSort(final Integer attrSort) {
        this.attrSort = attrSort;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AttrAttrgroupRelationExcel)) return false;
        final AttrAttrgroupRelationExcel other = (AttrAttrgroupRelationExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$attrId = this.getAttrId();
        final Object other$attrId = other.getAttrId();
        if (this$attrId == null ? other$attrId != null : !this$attrId.equals(other$attrId)) return false;
        final Object this$attrGroupId = this.getAttrGroupId();
        final Object other$attrGroupId = other.getAttrGroupId();
        if (this$attrGroupId == null ? other$attrGroupId != null : !this$attrGroupId.equals(other$attrGroupId)) return false;
        final Object this$attrSort = this.getAttrSort();
        final Object other$attrSort = other.getAttrSort();
        if (this$attrSort == null ? other$attrSort != null : !this$attrSort.equals(other$attrSort)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof AttrAttrgroupRelationExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $attrId = this.getAttrId();
        result = result * PRIME + ($attrId == null ? 43 : $attrId.hashCode());
        final Object $attrGroupId = this.getAttrGroupId();
        result = result * PRIME + ($attrGroupId == null ? 43 : $attrGroupId.hashCode());
        final Object $attrSort = this.getAttrSort();
        result = result * PRIME + ($attrSort == null ? 43 : $attrSort.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "AttrAttrgroupRelationExcel(id=" + this.getId() + ", attrId=" + this.getAttrId() + ", attrGroupId=" + this.getAttrGroupId() + ", attrSort=" + this.getAttrSort() + ")";
    }
    //</editor-fold>
}
