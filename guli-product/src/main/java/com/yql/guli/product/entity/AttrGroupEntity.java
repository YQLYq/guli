package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_attr_group")
public class AttrGroupEntity {
    /**
     * 分组id
     */
    @TableId
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    @SuppressWarnings("all")
    public AttrGroupEntity() {
    }

    /**
     * 分组id
     */
    @SuppressWarnings("all")
    public Long getAttrGroupId() {
        return this.attrGroupId;
    }

    /**
     * 组名
     */
    @SuppressWarnings("all")
    public String getAttrGroupName() {
        return this.attrGroupName;
    }

    /**
     * 排序
     */
    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    /**
     * 描述
     */
    @SuppressWarnings("all")
    public String getDescript() {
        return this.descript;
    }

    /**
     * 组图标
     */
    @SuppressWarnings("all")
    public String getIcon() {
        return this.icon;
    }

    /**
     * 所属分类id
     */
    @SuppressWarnings("all")
    public Long getCatelogId() {
        return this.catelogId;
    }

    /**
     * 分组id
     */
    @SuppressWarnings("all")
    public void setAttrGroupId(final Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    /**
     * 组名
     */
    @SuppressWarnings("all")
    public void setAttrGroupName(final String attrGroupName) {
        this.attrGroupName = attrGroupName;
    }

    /**
     * 排序
     */
    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    /**
     * 描述
     */
    @SuppressWarnings("all")
    public void setDescript(final String descript) {
        this.descript = descript;
    }

    /**
     * 组图标
     */
    @SuppressWarnings("all")
    public void setIcon(final String icon) {
        this.icon = icon;
    }

    /**
     * 所属分类id
     */
    @SuppressWarnings("all")
    public void setCatelogId(final Long catelogId) {
        this.catelogId = catelogId;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AttrGroupEntity)) return false;
        final AttrGroupEntity other = (AttrGroupEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$attrGroupId = this.getAttrGroupId();
        final Object other$attrGroupId = other.getAttrGroupId();
        if (this$attrGroupId == null ? other$attrGroupId != null : !this$attrGroupId.equals(other$attrGroupId)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$catelogId = this.getCatelogId();
        final Object other$catelogId = other.getCatelogId();
        if (this$catelogId == null ? other$catelogId != null : !this$catelogId.equals(other$catelogId)) return false;
        final Object this$attrGroupName = this.getAttrGroupName();
        final Object other$attrGroupName = other.getAttrGroupName();
        if (this$attrGroupName == null ? other$attrGroupName != null : !this$attrGroupName.equals(other$attrGroupName)) return false;
        final Object this$descript = this.getDescript();
        final Object other$descript = other.getDescript();
        if (this$descript == null ? other$descript != null : !this$descript.equals(other$descript)) return false;
        final Object this$icon = this.getIcon();
        final Object other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof AttrGroupEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $attrGroupId = this.getAttrGroupId();
        result = result * PRIME + ($attrGroupId == null ? 43 : $attrGroupId.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $catelogId = this.getCatelogId();
        result = result * PRIME + ($catelogId == null ? 43 : $catelogId.hashCode());
        final Object $attrGroupName = this.getAttrGroupName();
        result = result * PRIME + ($attrGroupName == null ? 43 : $attrGroupName.hashCode());
        final Object $descript = this.getDescript();
        result = result * PRIME + ($descript == null ? 43 : $descript.hashCode());
        final Object $icon = this.getIcon();
        result = result * PRIME + ($icon == null ? 43 : $icon.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "AttrGroupEntity(attrGroupId=" + this.getAttrGroupId() + ", attrGroupName=" + this.getAttrGroupName() + ", sort=" + this.getSort() + ", descript=" + this.getDescript() + ", icon=" + this.getIcon() + ", catelogId=" + this.getCatelogId() + ")";
    }
}
