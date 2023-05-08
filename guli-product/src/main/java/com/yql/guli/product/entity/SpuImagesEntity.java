package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * spu图片
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_spu_images")
public class SpuImagesEntity {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * 图片名
     */
    private String imgName;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 顺序
     */
    private Integer imgSort;
    /**
     * 是否默认图
     */
    private Integer defaultImg;

    @SuppressWarnings("all")
    public SpuImagesEntity() {
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    /**
     * 图片名
     */
    @SuppressWarnings("all")
    public String getImgName() {
        return this.imgName;
    }

    /**
     * 图片地址
     */
    @SuppressWarnings("all")
    public String getImgUrl() {
        return this.imgUrl;
    }

    /**
     * 顺序
     */
    @SuppressWarnings("all")
    public Integer getImgSort() {
        return this.imgSort;
    }

    /**
     * 是否默认图
     */
    @SuppressWarnings("all")
    public Integer getDefaultImg() {
        return this.defaultImg;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * spu_id
     */
    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 图片名
     */
    @SuppressWarnings("all")
    public void setImgName(final String imgName) {
        this.imgName = imgName;
    }

    /**
     * 图片地址
     */
    @SuppressWarnings("all")
    public void setImgUrl(final String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 顺序
     */
    @SuppressWarnings("all")
    public void setImgSort(final Integer imgSort) {
        this.imgSort = imgSort;
    }

    /**
     * 是否默认图
     */
    @SuppressWarnings("all")
    public void setDefaultImg(final Integer defaultImg) {
        this.defaultImg = defaultImg;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuImagesEntity)) return false;
        final SpuImagesEntity other = (SpuImagesEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$imgSort = this.getImgSort();
        final Object other$imgSort = other.getImgSort();
        if (this$imgSort == null ? other$imgSort != null : !this$imgSort.equals(other$imgSort)) return false;
        final Object this$defaultImg = this.getDefaultImg();
        final Object other$defaultImg = other.getDefaultImg();
        if (this$defaultImg == null ? other$defaultImg != null : !this$defaultImg.equals(other$defaultImg)) return false;
        final Object this$imgName = this.getImgName();
        final Object other$imgName = other.getImgName();
        if (this$imgName == null ? other$imgName != null : !this$imgName.equals(other$imgName)) return false;
        final Object this$imgUrl = this.getImgUrl();
        final Object other$imgUrl = other.getImgUrl();
        if (this$imgUrl == null ? other$imgUrl != null : !this$imgUrl.equals(other$imgUrl)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SpuImagesEntity;
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
        final Object $imgSort = this.getImgSort();
        result = result * PRIME + ($imgSort == null ? 43 : $imgSort.hashCode());
        final Object $defaultImg = this.getDefaultImg();
        result = result * PRIME + ($defaultImg == null ? 43 : $defaultImg.hashCode());
        final Object $imgName = this.getImgName();
        result = result * PRIME + ($imgName == null ? 43 : $imgName.hashCode());
        final Object $imgUrl = this.getImgUrl();
        result = result * PRIME + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SpuImagesEntity(id=" + this.getId() + ", spuId=" + this.getSpuId() + ", imgName=" + this.getImgName() + ", imgUrl=" + this.getImgUrl() + ", imgSort=" + this.getImgSort() + ", defaultImg=" + this.getDefaultImg() + ")";
    }
}
