package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * spu图片
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class SpuImagesExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "spu_id")
    private Long spuId;
    @Excel(name = "图片名")
    private String imgName;
    @Excel(name = "图片地址")
    private String imgUrl;
    @Excel(name = "顺序")
    private Integer imgSort;
    @Excel(name = "是否默认图")
    private Integer defaultImg;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SpuImagesExcel() {
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
    public String getImgName() {
        return this.imgName;
    }

    @SuppressWarnings("all")
    public String getImgUrl() {
        return this.imgUrl;
    }

    @SuppressWarnings("all")
    public Integer getImgSort() {
        return this.imgSort;
    }

    @SuppressWarnings("all")
    public Integer getDefaultImg() {
        return this.defaultImg;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    @SuppressWarnings("all")
    public void setImgName(final String imgName) {
        this.imgName = imgName;
    }

    @SuppressWarnings("all")
    public void setImgUrl(final String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @SuppressWarnings("all")
    public void setImgSort(final Integer imgSort) {
        this.imgSort = imgSort;
    }

    @SuppressWarnings("all")
    public void setDefaultImg(final Integer defaultImg) {
        this.defaultImg = defaultImg;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuImagesExcel)) return false;
        final SpuImagesExcel other = (SpuImagesExcel) o;
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
        return other instanceof SpuImagesExcel;
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
        return "SpuImagesExcel(id=" + this.getId() + ", spuId=" + this.getSpuId() + ", imgName=" + this.getImgName() + ", imgUrl=" + this.getImgUrl() + ", imgSort=" + this.getImgSort() + ", defaultImg=" + this.getDefaultImg() + ")";
    }
    //</editor-fold>
}
