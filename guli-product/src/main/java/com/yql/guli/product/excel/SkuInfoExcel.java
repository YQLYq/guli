package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;

/**
 * sku信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public class SkuInfoExcel {
    @Excel(name = "skuId")
    private Long skuId;
    @Excel(name = "spuId")
    private Long spuId;
    @Excel(name = "sku名称")
    private String skuName;
    @Excel(name = "sku介绍描述")
    private String skuDesc;
    @Excel(name = "所属分类id")
    private Long catalogId;
    @Excel(name = "品牌id")
    private Long brandId;
    @Excel(name = "默认图片")
    private String skuDefaultImg;
    @Excel(name = "标题")
    private String skuTitle;
    @Excel(name = "副标题")
    private String skuSubtitle;
    @Excel(name = "价格")
    private BigDecimal price;
    @Excel(name = "销量")
    private Long saleCount;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SkuInfoExcel() {
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    @SuppressWarnings("all")
    public String getSkuName() {
        return this.skuName;
    }

    @SuppressWarnings("all")
    public String getSkuDesc() {
        return this.skuDesc;
    }

    @SuppressWarnings("all")
    public Long getCatalogId() {
        return this.catalogId;
    }

    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    @SuppressWarnings("all")
    public String getSkuDefaultImg() {
        return this.skuDefaultImg;
    }

    @SuppressWarnings("all")
    public String getSkuTitle() {
        return this.skuTitle;
    }

    @SuppressWarnings("all")
    public String getSkuSubtitle() {
        return this.skuSubtitle;
    }

    @SuppressWarnings("all")
    public BigDecimal getPrice() {
        return this.price;
    }

    @SuppressWarnings("all")
    public Long getSaleCount() {
        return this.saleCount;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    @SuppressWarnings("all")
    public void setSkuName(final String skuName) {
        this.skuName = skuName;
    }

    @SuppressWarnings("all")
    public void setSkuDesc(final String skuDesc) {
        this.skuDesc = skuDesc;
    }

    @SuppressWarnings("all")
    public void setCatalogId(final Long catalogId) {
        this.catalogId = catalogId;
    }

    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    @SuppressWarnings("all")
    public void setSkuDefaultImg(final String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @SuppressWarnings("all")
    public void setSkuTitle(final String skuTitle) {
        this.skuTitle = skuTitle;
    }

    @SuppressWarnings("all")
    public void setSkuSubtitle(final String skuSubtitle) {
        this.skuSubtitle = skuSubtitle;
    }

    @SuppressWarnings("all")
    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    @SuppressWarnings("all")
    public void setSaleCount(final Long saleCount) {
        this.saleCount = saleCount;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuInfoExcel)) return false;
        final SkuInfoExcel other = (SkuInfoExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$catalogId = this.getCatalogId();
        final Object other$catalogId = other.getCatalogId();
        if (this$catalogId == null ? other$catalogId != null : !this$catalogId.equals(other$catalogId)) return false;
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$saleCount = this.getSaleCount();
        final Object other$saleCount = other.getSaleCount();
        if (this$saleCount == null ? other$saleCount != null : !this$saleCount.equals(other$saleCount)) return false;
        final Object this$skuName = this.getSkuName();
        final Object other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) return false;
        final Object this$skuDesc = this.getSkuDesc();
        final Object other$skuDesc = other.getSkuDesc();
        if (this$skuDesc == null ? other$skuDesc != null : !this$skuDesc.equals(other$skuDesc)) return false;
        final Object this$skuDefaultImg = this.getSkuDefaultImg();
        final Object other$skuDefaultImg = other.getSkuDefaultImg();
        if (this$skuDefaultImg == null ? other$skuDefaultImg != null : !this$skuDefaultImg.equals(other$skuDefaultImg)) return false;
        final Object this$skuTitle = this.getSkuTitle();
        final Object other$skuTitle = other.getSkuTitle();
        if (this$skuTitle == null ? other$skuTitle != null : !this$skuTitle.equals(other$skuTitle)) return false;
        final Object this$skuSubtitle = this.getSkuSubtitle();
        final Object other$skuSubtitle = other.getSkuSubtitle();
        if (this$skuSubtitle == null ? other$skuSubtitle != null : !this$skuSubtitle.equals(other$skuSubtitle)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SkuInfoExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $catalogId = this.getCatalogId();
        result = result * PRIME + ($catalogId == null ? 43 : $catalogId.hashCode());
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $saleCount = this.getSaleCount();
        result = result * PRIME + ($saleCount == null ? 43 : $saleCount.hashCode());
        final Object $skuName = this.getSkuName();
        result = result * PRIME + ($skuName == null ? 43 : $skuName.hashCode());
        final Object $skuDesc = this.getSkuDesc();
        result = result * PRIME + ($skuDesc == null ? 43 : $skuDesc.hashCode());
        final Object $skuDefaultImg = this.getSkuDefaultImg();
        result = result * PRIME + ($skuDefaultImg == null ? 43 : $skuDefaultImg.hashCode());
        final Object $skuTitle = this.getSkuTitle();
        result = result * PRIME + ($skuTitle == null ? 43 : $skuTitle.hashCode());
        final Object $skuSubtitle = this.getSkuSubtitle();
        result = result * PRIME + ($skuSubtitle == null ? 43 : $skuSubtitle.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SkuInfoExcel(skuId=" + this.getSkuId() + ", spuId=" + this.getSpuId() + ", skuName=" + this.getSkuName() + ", skuDesc=" + this.getSkuDesc() + ", catalogId=" + this.getCatalogId() + ", brandId=" + this.getBrandId() + ", skuDefaultImg=" + this.getSkuDefaultImg() + ", skuTitle=" + this.getSkuTitle() + ", skuSubtitle=" + this.getSkuSubtitle() + ", price=" + this.getPrice() + ", saleCount=" + this.getSaleCount() + ")";
    }
    //</editor-fold>
}
