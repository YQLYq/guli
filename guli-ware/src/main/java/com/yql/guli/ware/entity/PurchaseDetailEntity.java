package com.yql.guli.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;

/**
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity {
    /**
     */
    @TableId
    private Long id;
    /**
     * 采购单id
     */
    private Long purchaseId;
    /**
     * 采购商品id
     */
    private Long skuId;
    /**
     * 采购数量
     */
    private Integer skuNum;
    /**
     * 采购金额
     */
    private BigDecimal skuPrice;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    private Integer status;

    @SuppressWarnings("all")
    public PurchaseDetailEntity() {
    }

    /**
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * 采购单id
     */
    @SuppressWarnings("all")
    public Long getPurchaseId() {
        return this.purchaseId;
    }

    /**
     * 采购商品id
     */
    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * 采购数量
     */
    @SuppressWarnings("all")
    public Integer getSkuNum() {
        return this.skuNum;
    }

    /**
     * 采购金额
     */
    @SuppressWarnings("all")
    public BigDecimal getSkuPrice() {
        return this.skuPrice;
    }

    /**
     * 仓库id
     */
    @SuppressWarnings("all")
    public Long getWareId() {
        return this.wareId;
    }

    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 采购单id
     */
    @SuppressWarnings("all")
    public void setPurchaseId(final Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     * 采购商品id
     */
    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 采购数量
     */
    @SuppressWarnings("all")
    public void setSkuNum(final Integer skuNum) {
        this.skuNum = skuNum;
    }

    /**
     * 采购金额
     */
    @SuppressWarnings("all")
    public void setSkuPrice(final BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    /**
     * 仓库id
     */
    @SuppressWarnings("all")
    public void setWareId(final Long wareId) {
        this.wareId = wareId;
    }

    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PurchaseDetailEntity)) return false;
        final PurchaseDetailEntity other = (PurchaseDetailEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$purchaseId = this.getPurchaseId();
        final Object other$purchaseId = other.getPurchaseId();
        if (this$purchaseId == null ? other$purchaseId != null : !this$purchaseId.equals(other$purchaseId)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuNum = this.getSkuNum();
        final Object other$skuNum = other.getSkuNum();
        if (this$skuNum == null ? other$skuNum != null : !this$skuNum.equals(other$skuNum)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$skuPrice = this.getSkuPrice();
        final Object other$skuPrice = other.getSkuPrice();
        if (this$skuPrice == null ? other$skuPrice != null : !this$skuPrice.equals(other$skuPrice)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof PurchaseDetailEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $purchaseId = this.getPurchaseId();
        result = result * PRIME + ($purchaseId == null ? 43 : $purchaseId.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $skuNum = this.getSkuNum();
        result = result * PRIME + ($skuNum == null ? 43 : $skuNum.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $skuPrice = this.getSkuPrice();
        result = result * PRIME + ($skuPrice == null ? 43 : $skuPrice.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "PurchaseDetailEntity(id=" + this.getId() + ", purchaseId=" + this.getPurchaseId() + ", skuId=" + this.getSkuId() + ", skuNum=" + this.getSkuNum() + ", skuPrice=" + this.getSkuPrice() + ", wareId=" + this.getWareId() + ", status=" + this.getStatus() + ")";
    }
}
