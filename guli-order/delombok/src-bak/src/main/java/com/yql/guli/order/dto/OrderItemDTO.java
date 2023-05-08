package com.yql.guli.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 订单项信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("订单项信息")
public class OrderItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("order_id")
    private Long orderId;
    @ApiModelProperty("order_sn")
    private String orderSn;
    @ApiModelProperty("spu_id")
    private Long spuId;
    @ApiModelProperty("spu_name")
    private String spuName;
    @ApiModelProperty("spu_pic")
    private String spuPic;
    @ApiModelProperty("品牌")
    private String spuBrand;
    @ApiModelProperty("商品分类id")
    private Long categoryId;
    @ApiModelProperty("商品sku编号")
    private Long skuId;
    @ApiModelProperty("商品sku名字")
    private String skuName;
    @ApiModelProperty("商品sku图片")
    private String skuPic;
    @ApiModelProperty("商品sku价格")
    private BigDecimal skuPrice;
    @ApiModelProperty("商品购买的数量")
    private Integer skuQuantity;
    @ApiModelProperty("商品销售属性组合（JSON）")
    private String skuAttrsVals;
    @ApiModelProperty("商品促销分解金额")
    private BigDecimal promotionAmount;
    @ApiModelProperty("优惠券优惠分解金额")
    private BigDecimal couponAmount;
    @ApiModelProperty("积分优惠分解金额")
    private BigDecimal integrationAmount;
    @ApiModelProperty("该商品经过优惠后的分解金额")
    private BigDecimal realAmount;
    @ApiModelProperty("赠送积分")
    private Integer giftIntegration;
    @ApiModelProperty("赠送成长值")
    private Integer giftGrowth;
    //</editor-fold>

    @SuppressWarnings("all")
    public OrderItemDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getOrderId() {
        return this.orderId;
    }

    @SuppressWarnings("all")
    public String getOrderSn() {
        return this.orderSn;
    }

    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    @SuppressWarnings("all")
    public String getSpuName() {
        return this.spuName;
    }

    @SuppressWarnings("all")
    public String getSpuPic() {
        return this.spuPic;
    }

    @SuppressWarnings("all")
    public String getSpuBrand() {
        return this.spuBrand;
    }

    @SuppressWarnings("all")
    public Long getCategoryId() {
        return this.categoryId;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public String getSkuName() {
        return this.skuName;
    }

    @SuppressWarnings("all")
    public String getSkuPic() {
        return this.skuPic;
    }

    @SuppressWarnings("all")
    public BigDecimal getSkuPrice() {
        return this.skuPrice;
    }

    @SuppressWarnings("all")
    public Integer getSkuQuantity() {
        return this.skuQuantity;
    }

    @SuppressWarnings("all")
    public String getSkuAttrsVals() {
        return this.skuAttrsVals;
    }

    @SuppressWarnings("all")
    public BigDecimal getPromotionAmount() {
        return this.promotionAmount;
    }

    @SuppressWarnings("all")
    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    @SuppressWarnings("all")
    public BigDecimal getIntegrationAmount() {
        return this.integrationAmount;
    }

    @SuppressWarnings("all")
    public BigDecimal getRealAmount() {
        return this.realAmount;
    }

    @SuppressWarnings("all")
    public Integer getGiftIntegration() {
        return this.giftIntegration;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getGiftGrowth() {
        return this.giftGrowth;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    @SuppressWarnings("all")
    public void setOrderSn(final String orderSn) {
        this.orderSn = orderSn;
    }

    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    @SuppressWarnings("all")
    public void setSpuName(final String spuName) {
        this.spuName = spuName;
    }

    @SuppressWarnings("all")
    public void setSpuPic(final String spuPic) {
        this.spuPic = spuPic;
    }

    @SuppressWarnings("all")
    public void setSpuBrand(final String spuBrand) {
        this.spuBrand = spuBrand;
    }

    @SuppressWarnings("all")
    public void setCategoryId(final Long categoryId) {
        this.categoryId = categoryId;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setSkuName(final String skuName) {
        this.skuName = skuName;
    }

    @SuppressWarnings("all")
    public void setSkuPic(final String skuPic) {
        this.skuPic = skuPic;
    }

    @SuppressWarnings("all")
    public void setSkuPrice(final BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    @SuppressWarnings("all")
    public void setSkuQuantity(final Integer skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    @SuppressWarnings("all")
    public void setSkuAttrsVals(final String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    @SuppressWarnings("all")
    public void setPromotionAmount(final BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @SuppressWarnings("all")
    public void setCouponAmount(final BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @SuppressWarnings("all")
    public void setIntegrationAmount(final BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    @SuppressWarnings("all")
    public void setRealAmount(final BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    @SuppressWarnings("all")
    public void setGiftIntegration(final Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    @SuppressWarnings("all")
    public void setGiftGrowth(final Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderItemDTO)) return false;
        final OrderItemDTO other = (OrderItemDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (this$categoryId == null ? other$categoryId != null : !this$categoryId.equals(other$categoryId)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuQuantity = this.getSkuQuantity();
        final Object other$skuQuantity = other.getSkuQuantity();
        if (this$skuQuantity == null ? other$skuQuantity != null : !this$skuQuantity.equals(other$skuQuantity)) return false;
        final Object this$giftIntegration = this.getGiftIntegration();
        final Object other$giftIntegration = other.getGiftIntegration();
        if (this$giftIntegration == null ? other$giftIntegration != null : !this$giftIntegration.equals(other$giftIntegration)) return false;
        final Object this$giftGrowth = this.getGiftGrowth();
        final Object other$giftGrowth = other.getGiftGrowth();
        if (this$giftGrowth == null ? other$giftGrowth != null : !this$giftGrowth.equals(other$giftGrowth)) return false;
        final Object this$orderSn = this.getOrderSn();
        final Object other$orderSn = other.getOrderSn();
        if (this$orderSn == null ? other$orderSn != null : !this$orderSn.equals(other$orderSn)) return false;
        final Object this$spuName = this.getSpuName();
        final Object other$spuName = other.getSpuName();
        if (this$spuName == null ? other$spuName != null : !this$spuName.equals(other$spuName)) return false;
        final Object this$spuPic = this.getSpuPic();
        final Object other$spuPic = other.getSpuPic();
        if (this$spuPic == null ? other$spuPic != null : !this$spuPic.equals(other$spuPic)) return false;
        final Object this$spuBrand = this.getSpuBrand();
        final Object other$spuBrand = other.getSpuBrand();
        if (this$spuBrand == null ? other$spuBrand != null : !this$spuBrand.equals(other$spuBrand)) return false;
        final Object this$skuName = this.getSkuName();
        final Object other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) return false;
        final Object this$skuPic = this.getSkuPic();
        final Object other$skuPic = other.getSkuPic();
        if (this$skuPic == null ? other$skuPic != null : !this$skuPic.equals(other$skuPic)) return false;
        final Object this$skuPrice = this.getSkuPrice();
        final Object other$skuPrice = other.getSkuPrice();
        if (this$skuPrice == null ? other$skuPrice != null : !this$skuPrice.equals(other$skuPrice)) return false;
        final Object this$skuAttrsVals = this.getSkuAttrsVals();
        final Object other$skuAttrsVals = other.getSkuAttrsVals();
        if (this$skuAttrsVals == null ? other$skuAttrsVals != null : !this$skuAttrsVals.equals(other$skuAttrsVals)) return false;
        final Object this$promotionAmount = this.getPromotionAmount();
        final Object other$promotionAmount = other.getPromotionAmount();
        if (this$promotionAmount == null ? other$promotionAmount != null : !this$promotionAmount.equals(other$promotionAmount)) return false;
        final Object this$couponAmount = this.getCouponAmount();
        final Object other$couponAmount = other.getCouponAmount();
        if (this$couponAmount == null ? other$couponAmount != null : !this$couponAmount.equals(other$couponAmount)) return false;
        final Object this$integrationAmount = this.getIntegrationAmount();
        final Object other$integrationAmount = other.getIntegrationAmount();
        if (this$integrationAmount == null ? other$integrationAmount != null : !this$integrationAmount.equals(other$integrationAmount)) return false;
        final Object this$realAmount = this.getRealAmount();
        final Object other$realAmount = other.getRealAmount();
        if (this$realAmount == null ? other$realAmount != null : !this$realAmount.equals(other$realAmount)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderItemDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $skuQuantity = this.getSkuQuantity();
        result = result * PRIME + ($skuQuantity == null ? 43 : $skuQuantity.hashCode());
        final Object $giftIntegration = this.getGiftIntegration();
        result = result * PRIME + ($giftIntegration == null ? 43 : $giftIntegration.hashCode());
        final Object $giftGrowth = this.getGiftGrowth();
        result = result * PRIME + ($giftGrowth == null ? 43 : $giftGrowth.hashCode());
        final Object $orderSn = this.getOrderSn();
        result = result * PRIME + ($orderSn == null ? 43 : $orderSn.hashCode());
        final Object $spuName = this.getSpuName();
        result = result * PRIME + ($spuName == null ? 43 : $spuName.hashCode());
        final Object $spuPic = this.getSpuPic();
        result = result * PRIME + ($spuPic == null ? 43 : $spuPic.hashCode());
        final Object $spuBrand = this.getSpuBrand();
        result = result * PRIME + ($spuBrand == null ? 43 : $spuBrand.hashCode());
        final Object $skuName = this.getSkuName();
        result = result * PRIME + ($skuName == null ? 43 : $skuName.hashCode());
        final Object $skuPic = this.getSkuPic();
        result = result * PRIME + ($skuPic == null ? 43 : $skuPic.hashCode());
        final Object $skuPrice = this.getSkuPrice();
        result = result * PRIME + ($skuPrice == null ? 43 : $skuPrice.hashCode());
        final Object $skuAttrsVals = this.getSkuAttrsVals();
        result = result * PRIME + ($skuAttrsVals == null ? 43 : $skuAttrsVals.hashCode());
        final Object $promotionAmount = this.getPromotionAmount();
        result = result * PRIME + ($promotionAmount == null ? 43 : $promotionAmount.hashCode());
        final Object $couponAmount = this.getCouponAmount();
        result = result * PRIME + ($couponAmount == null ? 43 : $couponAmount.hashCode());
        final Object $integrationAmount = this.getIntegrationAmount();
        result = result * PRIME + ($integrationAmount == null ? 43 : $integrationAmount.hashCode());
        final Object $realAmount = this.getRealAmount();
        result = result * PRIME + ($realAmount == null ? 43 : $realAmount.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderItemDTO(id=" + this.getId() + ", orderId=" + this.getOrderId() + ", orderSn=" + this.getOrderSn() + ", spuId=" + this.getSpuId() + ", spuName=" + this.getSpuName() + ", spuPic=" + this.getSpuPic() + ", spuBrand=" + this.getSpuBrand() + ", categoryId=" + this.getCategoryId() + ", skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", skuPic=" + this.getSkuPic() + ", skuPrice=" + this.getSkuPrice() + ", skuQuantity=" + this.getSkuQuantity() + ", skuAttrsVals=" + this.getSkuAttrsVals() + ", promotionAmount=" + this.getPromotionAmount() + ", couponAmount=" + this.getCouponAmount() + ", integrationAmount=" + this.getIntegrationAmount() + ", realAmount=" + this.getRealAmount() + ", giftIntegration=" + this.getGiftIntegration() + ", giftGrowth=" + this.getGiftGrowth() + ")";
    }
    //</editor-fold>
}
