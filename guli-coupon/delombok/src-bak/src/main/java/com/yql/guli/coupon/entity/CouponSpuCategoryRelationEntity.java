package com.yql.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 优惠券分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 产品分类id
     */
    private Long categoryId;
    /**
     * 产品分类名称
     */
    private String categoryName;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public CouponSpuCategoryRelationEntity() {
    }
    //</editor-fold>

    /**
     * id
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * 优惠券id
     */
    @SuppressWarnings("all")
    public Long getCouponId() {
        return this.couponId;
    }

    /**
     * 产品分类id
     */
    @SuppressWarnings("all")
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * 产品分类名称
     */
    @SuppressWarnings("all")
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 优惠券id
     */
    @SuppressWarnings("all")
    public void setCouponId(final Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 产品分类id
     */
    @SuppressWarnings("all")
    public void setCategoryId(final Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 产品分类名称
     */
    @SuppressWarnings("all")
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CouponSpuCategoryRelationEntity)) return false;
        final CouponSpuCategoryRelationEntity other = (CouponSpuCategoryRelationEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$couponId = this.getCouponId();
        final Object other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (this$categoryId == null ? other$categoryId != null : !this$categoryId.equals(other$categoryId)) return false;
        final Object this$categoryName = this.getCategoryName();
        final Object other$categoryName = other.getCategoryName();
        if (this$categoryName == null ? other$categoryName != null : !this$categoryName.equals(other$categoryName)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof CouponSpuCategoryRelationEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $couponId = this.getCouponId();
        result = result * PRIME + ($couponId == null ? 43 : $couponId.hashCode());
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $categoryName = this.getCategoryName();
        result = result * PRIME + ($categoryName == null ? 43 : $categoryName.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "CouponSpuCategoryRelationEntity(id=" + this.getId() + ", couponId=" + this.getCouponId() + ", categoryId=" + this.getCategoryId() + ", categoryName=" + this.getCategoryName() + ")";
    }
}
