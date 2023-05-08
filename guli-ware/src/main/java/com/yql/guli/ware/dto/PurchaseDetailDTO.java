package com.yql.guli.ware.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("")
public class PurchaseDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("")
    private Long id;
    @ApiModelProperty("采购单id")
    private Long purchaseId;
    @ApiModelProperty("采购商品id")
    private Long skuId;
    @ApiModelProperty("采购数量")
    private Integer skuNum;
    @ApiModelProperty("采购金额")
    private BigDecimal skuPrice;
    @ApiModelProperty("仓库id")
    private Long wareId;
    @ApiModelProperty("状态[0新建，1已分配，2正在采购，3已完成，4采购失败]")
    private Integer status;
    //</editor-fold>

    @SuppressWarnings("all")
    public PurchaseDetailDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getPurchaseId() {
        return this.purchaseId;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public Integer getSkuNum() {
        return this.skuNum;
    }

    @SuppressWarnings("all")
    public BigDecimal getSkuPrice() {
        return this.skuPrice;
    }

    @SuppressWarnings("all")
    public Long getWareId() {
        return this.wareId;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setPurchaseId(final Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setSkuNum(final Integer skuNum) {
        this.skuNum = skuNum;
    }

    @SuppressWarnings("all")
    public void setSkuPrice(final BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    @SuppressWarnings("all")
    public void setWareId(final Long wareId) {
        this.wareId = wareId;
    }

    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PurchaseDetailDTO)) return false;
        final PurchaseDetailDTO other = (PurchaseDetailDTO) o;
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
        return other instanceof PurchaseDetailDTO;
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
        return "PurchaseDetailDTO(id=" + this.getId() + ", purchaseId=" + this.getPurchaseId() + ", skuId=" + this.getSkuId() + ", skuNum=" + this.getSkuNum() + ", skuPrice=" + this.getSkuPrice() + ", wareId=" + this.getWareId() + ", status=" + this.getStatus() + ")";
    }
    //</editor-fold>
}
