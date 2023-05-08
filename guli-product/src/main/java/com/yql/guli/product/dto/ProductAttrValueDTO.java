package com.yql.guli.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * spu属性值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@ApiModel("spu属性值")
public class ProductAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("商品id")
    private Long spuId;
    @ApiModelProperty("属性id")
    private Long attrId;
    @ApiModelProperty("属性名")
    private String attrName;
    @ApiModelProperty("属性值")
    private String attrValue;
    @ApiModelProperty("顺序")
    private Integer attrSort;
    @ApiModelProperty("快速展示【是否展示在介绍上；0-否 1-是】")
    private Integer quickShow;
    //</editor-fold>

    @SuppressWarnings("all")
    public ProductAttrValueDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
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

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getQuickShow() {
        return this.quickShow;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
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

    @SuppressWarnings("all")
    public void setQuickShow(final Integer quickShow) {
        this.quickShow = quickShow;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttrValueDTO)) return false;
        final ProductAttrValueDTO other = (ProductAttrValueDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$attrId = this.getAttrId();
        final Object other$attrId = other.getAttrId();
        if (this$attrId == null ? other$attrId != null : !this$attrId.equals(other$attrId)) return false;
        final Object this$attrSort = this.getAttrSort();
        final Object other$attrSort = other.getAttrSort();
        if (this$attrSort == null ? other$attrSort != null : !this$attrSort.equals(other$attrSort)) return false;
        final Object this$quickShow = this.getQuickShow();
        final Object other$quickShow = other.getQuickShow();
        if (this$quickShow == null ? other$quickShow != null : !this$quickShow.equals(other$quickShow)) return false;
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
        return other instanceof ProductAttrValueDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $attrId = this.getAttrId();
        result = result * PRIME + ($attrId == null ? 43 : $attrId.hashCode());
        final Object $attrSort = this.getAttrSort();
        result = result * PRIME + ($attrSort == null ? 43 : $attrSort.hashCode());
        final Object $quickShow = this.getQuickShow();
        result = result * PRIME + ($quickShow == null ? 43 : $quickShow.hashCode());
        final Object $attrName = this.getAttrName();
        result = result * PRIME + ($attrName == null ? 43 : $attrName.hashCode());
        final Object $attrValue = this.getAttrValue();
        result = result * PRIME + ($attrValue == null ? 43 : $attrValue.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "ProductAttrValueDTO(id=" + this.getId() + ", spuId=" + this.getSpuId() + ", attrId=" + this.getAttrId() + ", attrName=" + this.getAttrName() + ", attrValue=" + this.getAttrValue() + ", attrSort=" + this.getAttrSort() + ", quickShow=" + this.getQuickShow() + ")";
    }
    //</editor-fold>
}
