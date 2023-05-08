package com.yql.guli.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单退货申请
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * order_id
     */
    private Long orderId;
    /**
     * 退货商品id
     */
    private Long skuId;
    /**
     * 订单编号
     */
    private String orderSn;
    /**
     * 申请时间
     */
    private Date createTime;
    /**
     * 会员用户名
     */
    private String memberUsername;
    /**
     * 退款金额
     */
    private BigDecimal returnAmount;
    /**
     * 退货人姓名
     */
    private String returnName;
    /**
     * 退货人电话
     */
    private String returnPhone;
    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    private Integer status;
    /**
     * 处理时间
     */
    private Date handleTime;
    /**
     * 商品图片
     */
    private String skuImg;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品品牌
     */
    private String skuBrand;
    /**
     * 商品销售属性(JSON)
     */
    private String skuAttrsVals;
    /**
     * 退货数量
     */
    private Integer skuCount;
    /**
     * 商品单价
     */
    private BigDecimal skuPrice;
    /**
     * 商品实际支付单价
     */
    private BigDecimal skuRealPrice;
    /**
     * 原因
     */
    private String reason;
    /**
     * 描述
     */
    private String description述;
    /**
     * 凭证图片，以逗号隔开
     */
    private String descPics;
    /**
     * 处理备注
     */
    private String handleNote;
    /**
     * 处理人员
     */
    private String handleMan;
    /**
     * 收货人
     */
    private String receiveMan;
    /**
     * 收货时间
     */
    private Date receiveTime;
    /**
     * 收货备注
     */
    private String receiveNote;
    /**
     * 收货电话
     */
    private String receivePhone;
    /**
     * 公司收货地址
     */
    private String companyAddress;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public OrderReturnApplyEntity() {
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
     * order_id
     */
    @SuppressWarnings("all")
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * 退货商品id
     */
    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * 订单编号
     */
    @SuppressWarnings("all")
    public String getOrderSn() {
        return this.orderSn;
    }

    /**
     * 申请时间
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 会员用户名
     */
    @SuppressWarnings("all")
    public String getMemberUsername() {
        return this.memberUsername;
    }

    /**
     * 退款金额
     */
    @SuppressWarnings("all")
    public BigDecimal getReturnAmount() {
        return this.returnAmount;
    }

    /**
     * 退货人姓名
     */
    @SuppressWarnings("all")
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * 退货人电话
     */
    @SuppressWarnings("all")
    public String getReturnPhone() {
        return this.returnPhone;
    }

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 处理时间
     */
    @SuppressWarnings("all")
    public Date getHandleTime() {
        return this.handleTime;
    }

    /**
     * 商品图片
     */
    @SuppressWarnings("all")
    public String getSkuImg() {
        return this.skuImg;
    }

    /**
     * 商品名称
     */
    @SuppressWarnings("all")
    public String getSkuName() {
        return this.skuName;
    }

    /**
     * 商品品牌
     */
    @SuppressWarnings("all")
    public String getSkuBrand() {
        return this.skuBrand;
    }

    /**
     * 商品销售属性(JSON)
     */
    @SuppressWarnings("all")
    public String getSkuAttrsVals() {
        return this.skuAttrsVals;
    }

    /**
     * 退货数量
     */
    @SuppressWarnings("all")
    public Integer getSkuCount() {
        return this.skuCount;
    }

    /**
     * 商品单价
     */
    @SuppressWarnings("all")
    public BigDecimal getSkuPrice() {
        return this.skuPrice;
    }

    /**
     * 商品实际支付单价
     */
    @SuppressWarnings("all")
    public BigDecimal getSkuRealPrice() {
        return this.skuRealPrice;
    }

    /**
     * 原因
     */
    @SuppressWarnings("all")
    public String getReason() {
        return this.reason;
    }

    /**
     * 描述
     */
    @SuppressWarnings("all")
    public String getDescription述() {
        return this.description述;
    }

    /**
     * 凭证图片，以逗号隔开
     */
    @SuppressWarnings("all")
    public String getDescPics() {
        return this.descPics;
    }

    /**
     * 处理备注
     */
    @SuppressWarnings("all")
    public String getHandleNote() {
        return this.handleNote;
    }

    /**
     * 处理人员
     */
    @SuppressWarnings("all")
    public String getHandleMan() {
        return this.handleMan;
    }

    /**
     * 收货人
     */
    @SuppressWarnings("all")
    public String getReceiveMan() {
        return this.receiveMan;
    }

    /**
     * 收货时间
     */
    @SuppressWarnings("all")
    public Date getReceiveTime() {
        return this.receiveTime;
    }

    /**
     * 收货备注
     */
    @SuppressWarnings("all")
    public String getReceiveNote() {
        return this.receiveNote;
    }

    /**
     * 收货电话
     */
    @SuppressWarnings("all")
    public String getReceivePhone() {
        return this.receivePhone;
    }

    /**
     * 公司收货地址
     */
    @SuppressWarnings("all")
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * order_id
     */
    @SuppressWarnings("all")
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 退货商品id
     */
    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 订单编号
     */
    @SuppressWarnings("all")
    public void setOrderSn(final String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 申请时间
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 会员用户名
     */
    @SuppressWarnings("all")
    public void setMemberUsername(final String memberUsername) {
        this.memberUsername = memberUsername;
    }

    /**
     * 退款金额
     */
    @SuppressWarnings("all")
    public void setReturnAmount(final BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    /**
     * 退货人姓名
     */
    @SuppressWarnings("all")
    public void setReturnName(final String returnName) {
        this.returnName = returnName;
    }

    /**
     * 退货人电话
     */
    @SuppressWarnings("all")
    public void setReturnPhone(final String returnPhone) {
        this.returnPhone = returnPhone;
    }

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * 处理时间
     */
    @SuppressWarnings("all")
    public void setHandleTime(final Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * 商品图片
     */
    @SuppressWarnings("all")
    public void setSkuImg(final String skuImg) {
        this.skuImg = skuImg;
    }

    /**
     * 商品名称
     */
    @SuppressWarnings("all")
    public void setSkuName(final String skuName) {
        this.skuName = skuName;
    }

    /**
     * 商品品牌
     */
    @SuppressWarnings("all")
    public void setSkuBrand(final String skuBrand) {
        this.skuBrand = skuBrand;
    }

    /**
     * 商品销售属性(JSON)
     */
    @SuppressWarnings("all")
    public void setSkuAttrsVals(final String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    /**
     * 退货数量
     */
    @SuppressWarnings("all")
    public void setSkuCount(final Integer skuCount) {
        this.skuCount = skuCount;
    }

    /**
     * 商品单价
     */
    @SuppressWarnings("all")
    public void setSkuPrice(final BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    /**
     * 商品实际支付单价
     */
    @SuppressWarnings("all")
    public void setSkuRealPrice(final BigDecimal skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }

    /**
     * 原因
     */
    @SuppressWarnings("all")
    public void setReason(final String reason) {
        this.reason = reason;
    }

    /**
     * 描述
     */
    @SuppressWarnings("all")
    public void setDescription述(final String description述) {
        this.description述 = description述;
    }

    /**
     * 凭证图片，以逗号隔开
     */
    @SuppressWarnings("all")
    public void setDescPics(final String descPics) {
        this.descPics = descPics;
    }

    /**
     * 处理备注
     */
    @SuppressWarnings("all")
    public void setHandleNote(final String handleNote) {
        this.handleNote = handleNote;
    }

    /**
     * 处理人员
     */
    @SuppressWarnings("all")
    public void setHandleMan(final String handleMan) {
        this.handleMan = handleMan;
    }

    /**
     * 收货人
     */
    @SuppressWarnings("all")
    public void setReceiveMan(final String receiveMan) {
        this.receiveMan = receiveMan;
    }

    /**
     * 收货时间
     */
    @SuppressWarnings("all")
    public void setReceiveTime(final Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 收货备注
     */
    @SuppressWarnings("all")
    public void setReceiveNote(final String receiveNote) {
        this.receiveNote = receiveNote;
    }

    /**
     * 收货电话
     */
    @SuppressWarnings("all")
    public void setReceivePhone(final String receivePhone) {
        this.receivePhone = receivePhone;
    }

    /**
     * 公司收货地址
     */
    @SuppressWarnings("all")
    public void setCompanyAddress(final String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderReturnApplyEntity)) return false;
        final OrderReturnApplyEntity other = (OrderReturnApplyEntity) o;
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
        return other instanceof OrderReturnApplyEntity;
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
        return "OrderReturnApplyEntity(id=" + this.getId() + ", orderId=" + this.getOrderId() + ", skuId=" + this.getSkuId() + ", orderSn=" + this.getOrderSn() + ", createTime=" + this.getCreateTime() + ", memberUsername=" + this.getMemberUsername() + ", returnAmount=" + this.getReturnAmount() + ", returnName=" + this.getReturnName() + ", returnPhone=" + this.getReturnPhone() + ", status=" + this.getStatus() + ", handleTime=" + this.getHandleTime() + ", skuImg=" + this.getSkuImg() + ", skuName=" + this.getSkuName() + ", skuBrand=" + this.getSkuBrand() + ", skuAttrsVals=" + this.getSkuAttrsVals() + ", skuCount=" + this.getSkuCount() + ", skuPrice=" + this.getSkuPrice() + ", skuRealPrice=" + this.getSkuRealPrice() + ", reason=" + this.getReason() + ", description述=" + this.getDescription述() + ", descPics=" + this.getDescPics() + ", handleNote=" + this.getHandleNote() + ", handleMan=" + this.getHandleMan() + ", receiveMan=" + this.getReceiveMan() + ", receiveTime=" + this.getReceiveTime() + ", receiveNote=" + this.getReceiveNote() + ", receivePhone=" + this.getReceivePhone() + ", companyAddress=" + this.getCompanyAddress() + ")";
    }
}
