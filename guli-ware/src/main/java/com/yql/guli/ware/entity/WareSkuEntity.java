package com.yql.guli.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 商品库存
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("wms_ware_sku")
public class WareSkuEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 库存数
     */
    private Integer stock;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 锁定库存
     */
    private Integer stockLocked;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public WareSkuEntity() {
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
     * sku_id
     */
    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * 仓库id
     */
    @SuppressWarnings("all")
    public Long getWareId() {
        return this.wareId;
    }

    /**
     * 库存数
     */
    @SuppressWarnings("all")
    public Integer getStock() {
        return this.stock;
    }

    /**
     * sku_name
     */
    @SuppressWarnings("all")
    public String getSkuName() {
        return this.skuName;
    }

    /**
     * 锁定库存
     */
    @SuppressWarnings("all")
    public Integer getStockLocked() {
        return this.stockLocked;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * sku_id
     */
    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 仓库id
     */
    @SuppressWarnings("all")
    public void setWareId(final Long wareId) {
        this.wareId = wareId;
    }

    /**
     * 库存数
     */
    @SuppressWarnings("all")
    public void setStock(final Integer stock) {
        this.stock = stock;
    }

    /**
     * sku_name
     */
    @SuppressWarnings("all")
    public void setSkuName(final String skuName) {
        this.skuName = skuName;
    }

    /**
     * 锁定库存
     */
    @SuppressWarnings("all")
    public void setStockLocked(final Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WareSkuEntity)) return false;
        final WareSkuEntity other = (WareSkuEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$stock = this.getStock();
        final Object other$stock = other.getStock();
        if (this$stock == null ? other$stock != null : !this$stock.equals(other$stock)) return false;
        final Object this$stockLocked = this.getStockLocked();
        final Object other$stockLocked = other.getStockLocked();
        if (this$stockLocked == null ? other$stockLocked != null : !this$stockLocked.equals(other$stockLocked)) return false;
        final Object this$skuName = this.getSkuName();
        final Object other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof WareSkuEntity;
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
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $stock = this.getStock();
        result = result * PRIME + ($stock == null ? 43 : $stock.hashCode());
        final Object $stockLocked = this.getStockLocked();
        result = result * PRIME + ($stockLocked == null ? 43 : $stockLocked.hashCode());
        final Object $skuName = this.getSkuName();
        result = result * PRIME + ($skuName == null ? 43 : $skuName.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "WareSkuEntity(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", wareId=" + this.getWareId() + ", stock=" + this.getStock() + ", skuName=" + this.getSkuName() + ", stockLocked=" + this.getStockLocked() + ")";
    }
}
