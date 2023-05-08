package com.yql.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 专题商品
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 专题名字
     */
    private String name;
    /**
     * 专题id
     */
    private Long subjectId;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * 排序
     */
    private Integer sort;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public HomeSubjectSpuEntity() {
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
     * 专题名字
     */
    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    /**
     * 专题id
     */
    @SuppressWarnings("all")
    public Long getSubjectId() {
        return this.subjectId;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    /**
     * 排序
     */
    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 专题名字
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 专题id
     */
    @SuppressWarnings("all")
    public void setSubjectId(final Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
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
        if (!(o instanceof HomeSubjectSpuEntity)) return false;
        final HomeSubjectSpuEntity other = (HomeSubjectSpuEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$subjectId = this.getSubjectId();
        final Object other$subjectId = other.getSubjectId();
        if (this$subjectId == null ? other$subjectId != null : !this$subjectId.equals(other$subjectId)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof HomeSubjectSpuEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $subjectId = this.getSubjectId();
        result = result * PRIME + ($subjectId == null ? 43 : $subjectId.hashCode());
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "HomeSubjectSpuEntity(id=" + this.getId() + ", name=" + this.getName() + ", subjectId=" + this.getSubjectId() + ", spuId=" + this.getSpuId() + ", sort=" + this.getSort() + ")";
    }
}
