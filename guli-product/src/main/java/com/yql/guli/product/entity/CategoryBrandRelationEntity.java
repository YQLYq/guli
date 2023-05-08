package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 品牌分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity {
    /**
     */
    @TableId
    private Long id;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 分类id
     */
    private Long catelogId;
    /**
     */
    private String brandName;
    /**
     */
    private String catelogName;

    @SuppressWarnings("all")
    public CategoryBrandRelationEntity() {
    }

    /**
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * 品牌id
     */
    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    /**
     * 分类id
     */
    @SuppressWarnings("all")
    public Long getCatelogId() {
        return this.catelogId;
    }

    /**
     */
    @SuppressWarnings("all")
    public String getBrandName() {
        return this.brandName;
    }

    /**
     */
    @SuppressWarnings("all")
    public String getCatelogName() {
        return this.catelogName;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 品牌id
     */
    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 分类id
     */
    @SuppressWarnings("all")
    public void setCatelogId(final Long catelogId) {
        this.catelogId = catelogId;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setBrandName(final String brandName) {
        this.brandName = brandName;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setCatelogName(final String catelogName) {
        this.catelogName = catelogName;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryBrandRelationEntity)) return false;
        final CategoryBrandRelationEntity other = (CategoryBrandRelationEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$catelogId = this.getCatelogId();
        final Object other$catelogId = other.getCatelogId();
        if (this$catelogId == null ? other$catelogId != null : !this$catelogId.equals(other$catelogId)) return false;
        final Object this$brandName = this.getBrandName();
        final Object other$brandName = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) return false;
        final Object this$catelogName = this.getCatelogName();
        final Object other$catelogName = other.getCatelogName();
        if (this$catelogName == null ? other$catelogName != null : !this$catelogName.equals(other$catelogName)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof CategoryBrandRelationEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $catelogId = this.getCatelogId();
        result = result * PRIME + ($catelogId == null ? 43 : $catelogId.hashCode());
        final Object $brandName = this.getBrandName();
        result = result * PRIME + ($brandName == null ? 43 : $brandName.hashCode());
        final Object $catelogName = this.getCatelogName();
        result = result * PRIME + ($catelogName == null ? 43 : $catelogName.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "CategoryBrandRelationEntity(id=" + this.getId() + ", brandId=" + this.getBrandId() + ", catelogId=" + this.getCatelogId() + ", brandName=" + this.getBrandName() + ", catelogName=" + this.getCatelogName() + ")";
    }
}
