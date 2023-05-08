package com.yql.guli.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 订单退货申请
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("订单退货申请")
public class OrderReturnApplyDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("order_id")
    private Long orderId;
    @ApiModelProperty("退货商品id")
    private Long skuId;
    @ApiModelProperty("订单编号")
    private String orderSn;
    @ApiModelProperty("申请时间")
    private Date createTime;
    @ApiModelProperty("会员用户名")
    private String memberUsername;
    @ApiModelProperty("退款金额")
    private BigDecimal returnAmount;
    @ApiModelProperty("退货人姓名")
    private String returnName;
    @ApiModelProperty("退货人电话")
    private String returnPhone;
    @ApiModelProperty("申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]")
    private Integer status;
    @ApiModelProperty("处理时间")
    private Date handleTime;
    @ApiModelProperty("商品图片")
    private String skuImg;
    @ApiModelProperty("商品名称")
    private String skuName;
    @ApiModelProperty("商品品牌")
    private String skuBrand;
    @ApiModelProperty("商品销售属性(JSON)")
    private String skuAttrsVals;
    @ApiModelProperty("退货数量")
    private Integer skuCount;
    @ApiModelProperty("商品单价")
    private BigDecimal skuPrice;
    @ApiModelProperty("商品实际支付单价")
    private BigDecimal skuRealPrice;
    @ApiModelProperty("原因")
    private String reason;
    @ApiModelProperty("描述")
    private String description述;
    @ApiModelProperty("凭证图片，以逗号隔开")
    private String descPics;
    @ApiModelProperty("处理备注")
    private String handleNote;
    @ApiModelProperty("处理人员")
    private String handleMan;
    @ApiModelProperty("收货人")
    private String receiveMan;
    @ApiModelProperty("收货时间")
    private Date receiveTime;
    @ApiModelProperty("收货备注")
    private String receiveNote;
    @ApiModelProperty("收货电话")
    private String receivePhone;
    @ApiModelProperty("公司收货地址")
    private String companyAddress;
    //</editor-fold>

    @SuppressWarnings("all")
    public OrderReturnApplyDTO() {
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
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public String getOrderSn() {
        return this.orderSn;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public String getMemberUsername() {
        return this.memberUsername;
    }

    @SuppressWarnings("all")
    public BigDecimal getReturnAmount() {
        return this.returnAmount;
    }

    @SuppressWarnings("all")
    public String getReturnName() {
        return this.returnName;
    }

    @SuppressWarnings("all")
    public String getReturnPhone() {
        return this.returnPhone;
    }

    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    @SuppressWarnings("all")
    public Date getHandleTime() {
        return this.handleTime;
    }

    @SuppressWarnings("all")
    public String getSkuImg() {
        return this.skuImg;
    }

    @SuppressWarnings("all")
    public String getSkuName() {
        return this.skuName;
    }

    @SuppressWarnings("all")
    public String getSkuBrand() {
        return this.skuBrand;
    }

    @SuppressWarnings("all")
    public String getSkuAttrsVals() {
        return this.skuAttrsVals;
    }

    @SuppressWarnings("all")
    public Integer getSkuCount() {
        return this.skuCount;
    }

    @SuppressWarnings("all")
    public BigDecimal getSkuPrice() {
        return this.skuPrice;
    }

    @SuppressWarnings("all")
    public BigDecimal getSkuRealPrice() {
        return this.skuRealPrice;
    }

    @SuppressWarnings("all")
    public String getReason() {
        return this.reason;
    }

    @SuppressWarnings("all")
    public String getDescription述() {
        return this.description述;
    }

    @SuppressWarnings("all")
    public String getDescPics() {
        return this.descPics;
    }

    @SuppressWarnings("all")
    public String getHandleNote() {
        return this.handleNote;
    }

    @SuppressWarnings("all")
    public String getHandleMan() {
        return this.handleMan;
    }

    @SuppressWarnings("all")
    public String getReceiveMan() {
        return this.receiveMan;
    }

    @SuppressWarnings("all")
    public Date getReceiveTime() {
        return this.receiveTime;
    }

    @SuppressWarnings("all")
    public String getReceiveNote() {
        return this.receiveNote;
    }

    @SuppressWarnings("all")
    public String getReceivePhone() {
        return this.receivePhone;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public String getCompanyAddress() {
        return this.companyAddress;
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
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setOrderSn(final String orderSn) {
        this.orderSn = orderSn;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setMemberUsername(final String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @SuppressWarnings("all")
    public void setReturnAmount(final BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    @SuppressWarnings("all")
    public void setReturnName(final String returnName) {
        this.returnName = returnName;
    }

    @SuppressWarnings("all")
    public void setReturnPhone(final String returnPhone) {
        this.returnPhone = returnPhone;
    }

    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @SuppressWarnings("all")
    public void setHandleTime(final Date handleTime) {
        this.handleTime = handleTime;
    }

    @SuppressWarnings("all")
    public void setSkuImg(final String skuImg) {
        this.skuImg = skuImg;
    }

    @SuppressWarnings("all")
    public void setSkuName(final String skuName) {
        this.skuName = skuName;
    }

    @SuppressWarnings("all")
    public void setSkuBrand(final String skuBrand) {
        this.skuBrand = skuBrand;
    }

    @SuppressWarnings("all")
    public void setSkuAttrsVals(final String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    @SuppressWarnings("all")
    public void setSkuCount(final Integer skuCount) {
        this.skuCount = skuCount;
    }

    @SuppressWarnings("all")
    public void setSkuPrice(final BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    @SuppressWarnings("all")
    public void setSkuRealPrice(final BigDecimal skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }

    @SuppressWarnings("all")
    public void setReason(final String reason) {
        this.reason = reason;
    }

    @SuppressWarnings("all")
    public void setDescription述(final String description述) {
        this.description述 = description述;
    }

    @SuppressWarnings("all")
    public void setDescPics(final String descPics) {
        this.descPics = descPics;
    }

    @SuppressWarnings("all")
    public void setHandleNote(final String handleNote) {
        this.handleNote = handleNote;
    }

    @SuppressWarnings("all")
    public void setHandleMan(final String handleMan) {
        this.handleMan = handleMan;
    }

    @SuppressWarnings("all")
    public void setReceiveMan(final String receiveMan) {
        this.receiveMan = receiveMan;
    }

    @SuppressWarnings("all")
    public void setReceiveTime(final Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    @SuppressWarnings("all")
    public void setReceiveNote(final String receiveNote) {
        this.receiveNote = receiveNote;
    }

    @SuppressWarnings("all")
    public void setReceivePhone(final String receivePhone) {
        this.receivePhone = receivePhone;
    }

    @SuppressWarnings("all")
    public void setCompanyAddress(final String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderReturnApplyDTO)) return false;
        final OrderReturnApplyDTO other = (OrderReturnApplyDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$skuCount = this.getSkuCount();
        final Object other$skuCount = other.getSkuCount();
        if (this$skuCount == null ? other$skuCount != null : !this$skuCount.equals(other$skuCount)) return false;
        final Object this$orderSn = this.getOrderSn();
        final Object other$orderSn = other.getOrderSn();
        if (this$orderSn == null ? other$orderSn != null : !this$orderSn.equals(other$orderSn)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$memberUsername = this.getMemberUsername();
        final Object other$memberUsername = other.getMemberUsername();
        if (this$memberUsername == null ? other$memberUsername != null : !this$memberUsername.equals(other$memberUsername)) return false;
        final Object this$returnAmount = this.getReturnAmount();
        final Object other$returnAmount = other.getReturnAmount();
        if (this$returnAmount == null ? other$returnAmount != null : !this$returnAmount.equals(other$returnAmount)) return false;
        final Object this$returnName = this.getReturnName();
        final Object other$returnName = other.getReturnName();
        if (this$returnName == null ? other$returnName != null : !this$returnName.equals(other$returnName)) return false;
        final Object this$returnPhone = this.getReturnPhone();
        final Object other$returnPhone = other.getReturnPhone();
        if (this$returnPhone == null ? other$returnPhone != null : !this$returnPhone.equals(other$returnPhone)) return false;
        final Object this$handleTime = this.getHandleTime();
        final Object other$handleTime = other.getHandleTime();
        if (this$handleTime == null ? other$handleTime != null : !this$handleTime.equals(other$handleTime)) return false;
        final Object this$skuImg = this.getSkuImg();
        final Object other$skuImg = other.getSkuImg();
        if (this$skuImg == null ? other$skuImg != null : !this$skuImg.equals(other$skuImg)) return false;
        final Object this$skuName = this.getSkuName();
        final Object other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) return false;
        final Object this$skuBrand = this.getSkuBrand();
        final Object other$skuBrand = other.getSkuBrand();
        if (this$skuBrand == null ? other$skuBrand != null : !this$skuBrand.equals(other$skuBrand)) return false;
        final Object this$skuAttrsVals = this.getSkuAttrsVals();
        final Object other$skuAttrsVals = other.getSkuAttrsVals();
        if (this$skuAttrsVals == null ? other$skuAttrsVals != null : !this$skuAttrsVals.equals(other$skuAttrsVals)) return false;
        final Object this$skuPrice = this.getSkuPrice();
        final Object other$skuPrice = other.getSkuPrice();
        if (this$skuPrice == null ? other$skuPrice != null : !this$skuPrice.equals(other$skuPrice)) return false;
        final Object this$skuRealPrice = this.getSkuRealPrice();
        final Object other$skuRealPrice = other.getSkuRealPrice();
        if (this$skuRealPrice == null ? other$skuRealPrice != null : !this$skuRealPrice.equals(other$skuRealPrice)) return false;
        final Object this$reason = this.getReason();
        final Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        final Object this$description述 = this.getDescription述();
        final Object other$description述 = other.getDescription述();
        if (this$description述 == null ? other$description述 != null : !this$description述.equals(other$description述)) return false;
        final Object this$descPics = this.getDescPics();
        final Object other$descPics = other.getDescPics();
        if (this$descPics == null ? other$descPics != null : !this$descPics.equals(other$descPics)) return false;
        final Object this$handleNote = this.getHandleNote();
        final Object other$handleNote = other.getHandleNote();
        if (this$handleNote == null ? other$handleNote != null : !this$handleNote.equals(other$handleNote)) return false;
        final Object this$handleMan = this.getHandleMan();
        final Object other$handleMan = other.getHandleMan();
        if (this$handleMan == null ? other$handleMan != null : !this$handleMan.equals(other$handleMan)) return false;
        final Object this$receiveMan = this.getReceiveMan();
        final Object other$receiveMan = other.getReceiveMan();
        if (this$receiveMan == null ? other$receiveMan != null : !this$receiveMan.equals(other$receiveMan)) return false;
        final Object this$receiveTime = this.getReceiveTime();
        final Object other$receiveTime = other.getReceiveTime();
        if (this$receiveTime == null ? other$receiveTime != null : !this$receiveTime.equals(other$receiveTime)) return false;
        final Object this$receiveNote = this.getReceiveNote();
        final Object other$receiveNote = other.getReceiveNote();
        if (this$receiveNote == null ? other$receiveNote != null : !this$receiveNote.equals(other$receiveNote)) return false;
        final Object this$receivePhone = this.getReceivePhone();
        final Object other$receivePhone = other.getReceivePhone();
        if (this$receivePhone == null ? other$receivePhone != null : !this$receivePhone.equals(other$receivePhone)) return false;
        final Object this$companyAddress = this.getCompanyAddress();
        final Object other$companyAddress = other.getCompanyAddress();
        if (this$companyAddress == null ? other$companyAddress != null : !this$companyAddress.equals(other$companyAddress)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderReturnApplyDTO;
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
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $skuCount = this.getSkuCount();
        result = result * PRIME + ($skuCount == null ? 43 : $skuCount.hashCode());
        final Object $orderSn = this.getOrderSn();
        result = result * PRIME + ($orderSn == null ? 43 : $orderSn.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $memberUsername = this.getMemberUsername();
        result = result * PRIME + ($memberUsername == null ? 43 : $memberUsername.hashCode());
        final Object $returnAmount = this.getReturnAmount();
        result = result * PRIME + ($returnAmount == null ? 43 : $returnAmount.hashCode());
        final Object $returnName = this.getReturnName();
        result = result * PRIME + ($returnName == null ? 43 : $returnName.hashCode());
        final Object $returnPhone = this.getReturnPhone();
        result = result * PRIME + ($returnPhone == null ? 43 : $returnPhone.hashCode());
        final Object $handleTime = this.getHandleTime();
        result = result * PRIME + ($handleTime == null ? 43 : $handleTime.hashCode());
        final Object $skuImg = this.getSkuImg();
        result = result * PRIME + ($skuImg == null ? 43 : $skuImg.hashCode());
        final Object $skuName = this.getSkuName();
        result = result * PRIME + ($skuName == null ? 43 : $skuName.hashCode());
        final Object $skuBrand = this.getSkuBrand();
        result = result * PRIME + ($skuBrand == null ? 43 : $skuBrand.hashCode());
        final Object $skuAttrsVals = this.getSkuAttrsVals();
        result = result * PRIME + ($skuAttrsVals == null ? 43 : $skuAttrsVals.hashCode());
        final Object $skuPrice = this.getSkuPrice();
        result = result * PRIME + ($skuPrice == null ? 43 : $skuPrice.hashCode());
        final Object $skuRealPrice = this.getSkuRealPrice();
        result = result * PRIME + ($skuRealPrice == null ? 43 : $skuRealPrice.hashCode());
        final Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        final Object $description述 = this.getDescription述();
        result = result * PRIME + ($description述 == null ? 43 : $description述.hashCode());
        final Object $descPics = this.getDescPics();
        result = result * PRIME + ($descPics == null ? 43 : $descPics.hashCode());
        final Object $handleNote = this.getHandleNote();
        result = result * PRIME + ($handleNote == null ? 43 : $handleNote.hashCode());
        final Object $handleMan = this.getHandleMan();
        result = result * PRIME + ($handleMan == null ? 43 : $handleMan.hashCode());
        final Object $receiveMan = this.getReceiveMan();
        result = result * PRIME + ($receiveMan == null ? 43 : $receiveMan.hashCode());
        final Object $receiveTime = this.getReceiveTime();
        result = result * PRIME + ($receiveTime == null ? 43 : $receiveTime.hashCode());
        final Object $receiveNote = this.getReceiveNote();
        result = result * PRIME + ($receiveNote == null ? 43 : $receiveNote.hashCode());
        final Object $receivePhone = this.getReceivePhone();
        result = result * PRIME + ($receivePhone == null ? 43 : $receivePhone.hashCode());
        final Object $companyAddress = this.getCompanyAddress();
        result = result * PRIME + ($companyAddress == null ? 43 : $companyAddress.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderReturnApplyDTO(id=" + this.getId() + ", orderId=" + this.getOrderId() + ", skuId=" + this.getSkuId() + ", orderSn=" + this.getOrderSn() + ", createTime=" + this.getCreateTime() + ", memberUsername=" + this.getMemberUsername() + ", returnAmount=" + this.getReturnAmount() + ", returnName=" + this.getReturnName() + ", returnPhone=" + this.getReturnPhone() + ", status=" + this.getStatus() + ", handleTime=" + this.getHandleTime() + ", skuImg=" + this.getSkuImg() + ", skuName=" + this.getSkuName() + ", skuBrand=" + this.getSkuBrand() + ", skuAttrsVals=" + this.getSkuAttrsVals() + ", skuCount=" + this.getSkuCount() + ", skuPrice=" + this.getSkuPrice() + ", skuRealPrice=" + this.getSkuRealPrice() + ", reason=" + this.getReason() + ", description述=" + this.getDescription述() + ", descPics=" + this.getDescPics() + ", handleNote=" + this.getHandleNote() + ", handleMan=" + this.getHandleMan() + ", receiveMan=" + this.getReceiveMan() + ", receiveTime=" + this.getReceiveTime() + ", receiveNote=" + this.getReceiveNote() + ", receivePhone=" + this.getReceivePhone() + ", companyAddress=" + this.getCompanyAddress() + ")";
    }
    //</editor-fold>
}
