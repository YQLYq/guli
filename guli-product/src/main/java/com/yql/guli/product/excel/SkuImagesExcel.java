package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * sku图片
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class SkuImagesExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "图片地址")
    private String imgUrl;
    @Excel(name = "排序")
    private Integer imgSort;
    @Excel(name = "默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SkuImagesExcel() {
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
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
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
        if (!(o instanceof SkuImagesExcel)) return false;
        final SkuImagesExcel other = (SkuImagesExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$imgSort = this.getImgSort();
        final Object other$imgSort = other.getImgSort();
        if (this$imgSort == null ? other$imgSort != null : !this$imgSort.equals(other$imgSort)) return false;
        final Object this$defaultImg = this.getDefaultImg();
        final Object other$defaultImg = other.getDefaultImg();
        if (this$defaultImg == null ? other$defaultImg != null : !this$defaultImg.equals(other$defaultImg)) return false;
        final Object this$imgUrl = this.getImgUrl();
        final Object other$imgUrl = other.getImgUrl();
        if (this$imgUrl == null ? other$imgUrl != null : !this$imgUrl.equals(other$imgUrl)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SkuImagesExcel;
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
        final Object $imgSort = this.getImgSort();
        result = result * PRIME + ($imgSort == null ? 43 : $imgSort.hashCode());
        final Object $defaultImg = this.getDefaultImg();
        result = result * PRIME + ($defaultImg == null ? 43 : $defaultImg.hashCode());
        final Object $imgUrl = this.getImgUrl();
        result = result * PRIME + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SkuImagesExcel(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", imgUrl=" + this.getImgUrl() + ", imgSort=" + this.getImgSort() + ", defaultImg=" + this.getDefaultImg() + ")";
    }
    //</editor-fold>
}
