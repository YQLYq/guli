package com.yql.guli.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("oms_order")
public class OrderEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * member_id
     */
    private Long memberId;
    /**
     * 订单号
     */
    private String orderSn;
    /**
     * 使用的优惠券
     */
    private Long couponId;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * 用户名
     */
    private String memberUsername;
    /**
     * 订单总额
     */
    private BigDecimal totalAmount;
    /**
     * 应付总额
     */
    private BigDecimal payAmount;
    /**
     * 运费金额
     */
    private BigDecimal freightAmount;
    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    private BigDecimal promotionAmount;
    /**
     * 积分抵扣金额
     */
    private BigDecimal integrationAmount;
    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;
    /**
     * 后台调整订单使用的折扣金额
     */
    private BigDecimal discountAmount;
    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    private Integer payType;
    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    private Integer sourceType;
    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    private Integer status;
    /**
     * 物流公司(配送方式)
     */
    private String deliveryCompany;
    /**
     * 物流单号
     */
    private String deliverySn;
    /**
     * 自动确认时间（天）
     */
    private Integer autoConfirmDay;
    /**
     * 可以获得的积分
     */
    private Integer integration;
    /**
     * 可以获得的成长值
     */
    private Integer growth;
    /**
     * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
     */
    private Integer billType;
    /**
     * 发票抬头
     */
    private String billHeader;
    /**
     * 发票内容
     */
    private String billContent;
    /**
     * 收票人电话
     */
    private String billReceiverPhone;
    /**
     * 收票人邮箱
     */
    private String billReceiverEmail;
    /**
     * 收货人姓名
     */
    private String receiverName;
    /**
     * 收货人电话
     */
    private String receiverPhone;
    /**
     * 收货人邮编
     */
    private String receiverPostCode;
    /**
     * 省份/直辖市
     */
    private String receiverProvince;
    /**
     * 城市
     */
    private String receiverCity;
    /**
     * 区
     */
    private String receiverRegion;
    /**
     * 详细地址
     */
    private String receiverDetailAddress;
    /**
     * 订单备注
     */
    private String note;
    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    private Integer confirmStatus;
    /**
     * 删除状态【0->未删除；1->已删除】
     */
    private Integer deleteStatus;
    /**
     * 下单时使用的积分
     */
    private Integer useIntegration;
    /**
     * 支付时间
     */
    private Date paymentTime;
    /**
     * 发货时间
     */
    private Date deliveryTime;
    /**
     * 确认收货时间
     */
    private Date receiveTime;
    /**
     * 评价时间
     */
    private Date commentTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public OrderEntity() {
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
     * member_id
     */
    @SuppressWarnings("all")
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * 订单号
     */
    @SuppressWarnings("all")
    public String getOrderSn() {
        return this.orderSn;
    }

    /**
     * 使用的优惠券
     */
    @SuppressWarnings("all")
    public Long getCouponId() {
        return this.couponId;
    }

    /**
     * create_time
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 用户名
     */
    @SuppressWarnings("all")
    public String getMemberUsername() {
        return this.memberUsername;
    }

    /**
     * 订单总额
     */
    @SuppressWarnings("all")
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * 应付总额
     */
    @SuppressWarnings("all")
    public BigDecimal getPayAmount() {
        return this.payAmount;
    }

    /**
     * 运费金额
     */
    @SuppressWarnings("all")
    public BigDecimal getFreightAmount() {
        return this.freightAmount;
    }

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @SuppressWarnings("all")
    public BigDecimal getPromotionAmount() {
        return this.promotionAmount;
    }

    /**
     * 积分抵扣金额
     */
    @SuppressWarnings("all")
    public BigDecimal getIntegrationAmount() {
        return this.integrationAmount;
    }

    /**
     * 优惠券抵扣金额
     */
    @SuppressWarnings("all")
    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    /**
     * 后台调整订单使用的折扣金额
     */
    @SuppressWarnings("all")
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    @SuppressWarnings("all")
    public Integer getPayType() {
        return this.payType;
    }

    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    @SuppressWarnings("all")
    public Integer getSourceType() {
        return this.sourceType;
    }

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 物流公司(配送方式)
     */
    @SuppressWarnings("all")
    public String getDeliveryCompany() {
        return this.deliveryCompany;
    }

    /**
     * 物流单号
     */
    @SuppressWarnings("all")
    public String getDeliverySn() {
        return this.deliverySn;
    }

    /**
     * 自动确认时间（天）
     */
    @SuppressWarnings("all")
    public Integer getAutoConfirmDay() {
        return this.autoConfirmDay;
    }

    /**
     * 可以获得的积分
     */
    @SuppressWarnings("all")
    public Integer getIntegration() {
        return this.integration;
    }

    /**
     * 可以获得的成长值
     */
    @SuppressWarnings("all")
    public Integer getGrowth() {
        return this.growth;
    }

    /**
     * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
     */
    @SuppressWarnings("all")
    public Integer getBillType() {
        return this.billType;
    }

    /**
     * 发票抬头
     */
    @SuppressWarnings("all")
    public String getBillHeader() {
        return this.billHeader;
    }

    /**
     * 发票内容
     */
    @SuppressWarnings("all")
    public String getBillContent() {
        return this.billContent;
    }

    /**
     * 收票人电话
     */
    @SuppressWarnings("all")
    public String getBillReceiverPhone() {
        return this.billReceiverPhone;
    }

    /**
     * 收票人邮箱
     */
    @SuppressWarnings("all")
    public String getBillReceiverEmail() {
        return this.billReceiverEmail;
    }

    /**
     * 收货人姓名
     */
    @SuppressWarnings("all")
    public String getReceiverName() {
        return this.receiverName;
    }

    /**
     * 收货人电话
     */
    @SuppressWarnings("all")
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    /**
     * 收货人邮编
     */
    @SuppressWarnings("all")
    public String getReceiverPostCode() {
        return this.receiverPostCode;
    }

    /**
     * 省份/直辖市
     */
    @SuppressWarnings("all")
    public String getReceiverProvince() {
        return this.receiverProvince;
    }

    /**
     * 城市
     */
    @SuppressWarnings("all")
    public String getReceiverCity() {
        return this.receiverCity;
    }

    /**
     * 区
     */
    @SuppressWarnings("all")
    public String getReceiverRegion() {
        return this.receiverRegion;
    }

    /**
     * 详细地址
     */
    @SuppressWarnings("all")
    public String getReceiverDetailAddress() {
        return this.receiverDetailAddress;
    }

    /**
     * 订单备注
     */
    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    @SuppressWarnings("all")
    public Integer getConfirmStatus() {
        return this.confirmStatus;
    }

    /**
     * 删除状态【0->未删除；1->已删除】
     */
    @SuppressWarnings("all")
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * 下单时使用的积分
     */
    @SuppressWarnings("all")
    public Integer getUseIntegration() {
        return this.useIntegration;
    }

    /**
     * 支付时间
     */
    @SuppressWarnings("all")
    public Date getPaymentTime() {
        return this.paymentTime;
    }

    /**
     * 发货时间
     */
    @SuppressWarnings("all")
    public Date getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * 确认收货时间
     */
    @SuppressWarnings("all")
    public Date getReceiveTime() {
        return this.receiveTime;
    }

    /**
     * 评价时间
     */
    @SuppressWarnings("all")
    public Date getCommentTime() {
        return this.commentTime;
    }

    /**
     * 修改时间
     */
    @SuppressWarnings("all")
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * member_id
     */
    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 订单号
     */
    @SuppressWarnings("all")
    public void setOrderSn(final String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 使用的优惠券
     */
    @SuppressWarnings("all")
    public void setCouponId(final Long couponId) {
        this.couponId = couponId;
    }

    /**
     * create_time
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 用户名
     */
    @SuppressWarnings("all")
    public void setMemberUsername(final String memberUsername) {
        this.memberUsername = memberUsername;
    }

    /**
     * 订单总额
     */
    @SuppressWarnings("all")
    public void setTotalAmount(final BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 应付总额
     */
    @SuppressWarnings("all")
    public void setPayAmount(final BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 运费金额
     */
    @SuppressWarnings("all")
    public void setFreightAmount(final BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @SuppressWarnings("all")
    public void setPromotionAmount(final BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 积分抵扣金额
     */
    @SuppressWarnings("all")
    public void setIntegrationAmount(final BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * 优惠券抵扣金额
     */
    @SuppressWarnings("all")
    public void setCouponAmount(final BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 后台调整订单使用的折扣金额
     */
    @SuppressWarnings("all")
    public void setDiscountAmount(final BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    @SuppressWarnings("all")
    public void setPayType(final Integer payType) {
        this.payType = payType;
    }

    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    @SuppressWarnings("all")
    public void setSourceType(final Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * 物流公司(配送方式)
     */
    @SuppressWarnings("all")
    public void setDeliveryCompany(final String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    /**
     * 物流单号
     */
    @SuppressWarnings("all")
    public void setDeliverySn(final String deliverySn) {
        this.deliverySn = deliverySn;
    }

    /**
     * 自动确认时间（天）
     */
    @SuppressWarnings("all")
    public void setAutoConfirmDay(final Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    /**
     * 可以获得的积分
     */
    @SuppressWarnings("all")
    public void setIntegration(final Integer integration) {
        this.integration = integration;
    }

    /**
     * 可以获得的成长值
     */
    @SuppressWarnings("all")
    public void setGrowth(final Integer growth) {
        this.growth = growth;
    }

    /**
     * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
     */
    @SuppressWarnings("all")
    public void setBillType(final Integer billType) {
        this.billType = billType;
    }

    /**
     * 发票抬头
     */
    @SuppressWarnings("all")
    public void setBillHeader(final String billHeader) {
        this.billHeader = billHeader;
    }

    /**
     * 发票内容
     */
    @SuppressWarnings("all")
    public void setBillContent(final String billContent) {
        this.billContent = billContent;
    }

    /**
     * 收票人电话
     */
    @SuppressWarnings("all")
    public void setBillReceiverPhone(final String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    /**
     * 收票人邮箱
     */
    @SuppressWarnings("all")
    public void setBillReceiverEmail(final String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    /**
     * 收货人姓名
     */
    @SuppressWarnings("all")
    public void setReceiverName(final String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 收货人电话
     */
    @SuppressWarnings("all")
    public void setReceiverPhone(final String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * 收货人邮编
     */
    @SuppressWarnings("all")
    public void setReceiverPostCode(final String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    /**
     * 省份/直辖市
     */
    @SuppressWarnings("all")
    public void setReceiverProvince(final String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    /**
     * 城市
     */
    @SuppressWarnings("all")
    public void setReceiverCity(final String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * 区
     */
    @SuppressWarnings("all")
    public void setReceiverRegion(final String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    /**
     * 详细地址
     */
    @SuppressWarnings("all")
    public void setReceiverDetailAddress(final String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    /**
     * 订单备注
     */
    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    @SuppressWarnings("all")
    public void setConfirmStatus(final Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * 删除状态【0->未删除；1->已删除】
     */
    @SuppressWarnings("all")
    public void setDeleteStatus(final Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 下单时使用的积分
     */
    @SuppressWarnings("all")
    public void setUseIntegration(final Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    /**
     * 支付时间
     */
    @SuppressWarnings("all")
    public void setPaymentTime(final Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 发货时间
     */
    @SuppressWarnings("all")
    public void setDeliveryTime(final Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 确认收货时间
     */
    @SuppressWarnings("all")
    public void setReceiveTime(final Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 评价时间
     */
    @SuppressWarnings("all")
    public void setCommentTime(final Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 修改时间
     */
    @SuppressWarnings("all")
    public void setModifyTime(final Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderEntity)) return false;
        final OrderEntity other = (OrderEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$couponId = this.getCouponId();
        final Object other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) return false;
        final Object this$payType = this.getPayType();
        final Object other$payType = other.getPayType();
        if (this$payType == null ? other$payType != null : !this$payType.equals(other$payType)) return false;
        final Object this$sourceType = this.getSourceType();
        final Object other$sourceType = other.getSourceType();
        if (this$sourceType == null ? other$sourceType != null : !this$sourceType.equals(other$sourceType)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$autoConfirmDay = this.getAutoConfirmDay();
        final Object other$autoConfirmDay = other.getAutoConfirmDay();
        if (this$autoConfirmDay == null ? other$autoConfirmDay != null : !this$autoConfirmDay.equals(other$autoConfirmDay)) return false;
        final Object this$integration = this.getIntegration();
        final Object other$integration = other.getIntegration();
        if (this$integration == null ? other$integration != null : !this$integration.equals(other$integration)) return false;
        final Object this$growth = this.getGrowth();
        final Object other$growth = other.getGrowth();
        if (this$growth == null ? other$growth != null : !this$growth.equals(other$growth)) return false;
        final Object this$billType = this.getBillType();
        final Object other$billType = other.getBillType();
        if (this$billType == null ? other$billType != null : !this$billType.equals(other$billType)) return false;
        final Object this$confirmStatus = this.getConfirmStatus();
        final Object other$confirmStatus = other.getConfirmStatus();
        if (this$confirmStatus == null ? other$confirmStatus != null : !this$confirmStatus.equals(other$confirmStatus)) return false;
        final Object this$deleteStatus = this.getDeleteStatus();
        final Object other$deleteStatus = other.getDeleteStatus();
        if (this$deleteStatus == null ? other$deleteStatus != null : !this$deleteStatus.equals(other$deleteStatus)) return false;
        final Object this$useIntegration = this.getUseIntegration();
        final Object other$useIntegration = other.getUseIntegration();
        if (this$useIntegration == null ? other$useIntegration != null : !this$useIntegration.equals(other$useIntegration)) return false;
        final Object this$orderSn = this.getOrderSn();
        final Object other$orderSn = other.getOrderSn();
        if (this$orderSn == null ? other$orderSn != null : !this$orderSn.equals(other$orderSn)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$memberUsername = this.getMemberUsername();
        final Object other$memberUsername = other.getMemberUsername();
        if (this$memberUsername == null ? other$memberUsername != null : !this$memberUsername.equals(other$memberUsername)) return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount)) return false;
        final Object this$payAmount = this.getPayAmount();
        final Object other$payAmount = other.getPayAmount();
        if (this$payAmount == null ? other$payAmount != null : !this$payAmount.equals(other$payAmount)) return false;
        final Object this$freightAmount = this.getFreightAmount();
        final Object other$freightAmount = other.getFreightAmount();
        if (this$freightAmount == null ? other$freightAmount != null : !this$freightAmount.equals(other$freightAmount)) return false;
        final Object this$promotionAmount = this.getPromotionAmount();
        final Object other$promotionAmount = other.getPromotionAmount();
        if (this$promotionAmount == null ? other$promotionAmount != null : !this$promotionAmount.equals(other$promotionAmount)) return false;
        final Object this$integrationAmount = this.getIntegrationAmount();
        final Object other$integrationAmount = other.getIntegrationAmount();
        if (this$integrationAmount == null ? other$integrationAmount != null : !this$integrationAmount.equals(other$integrationAmount)) return false;
        final Object this$couponAmount = this.getCouponAmount();
        final Object other$couponAmount = other.getCouponAmount();
        if (this$couponAmount == null ? other$couponAmount != null : !this$couponAmount.equals(other$couponAmount)) return false;
        final Object this$discountAmount = this.getDiscountAmount();
        final Object other$discountAmount = other.getDiscountAmount();
        if (this$discountAmount == null ? other$discountAmount != null : !this$discountAmount.equals(other$discountAmount)) return false;
        final Object this$deliveryCompany = this.getDeliveryCompany();
        final Object other$deliveryCompany = other.getDeliveryCompany();
        if (this$deliveryCompany == null ? other$deliveryCompany != null : !this$deliveryCompany.equals(other$deliveryCompany)) return false;
        final Object this$deliverySn = this.getDeliverySn();
        final Object other$deliverySn = other.getDeliverySn();
        if (this$deliverySn == null ? other$deliverySn != null : !this$deliverySn.equals(other$deliverySn)) return false;
        final Object this$billHeader = this.getBillHeader();
        final Object other$billHeader = other.getBillHeader();
        if (this$billHeader == null ? other$billHeader != null : !this$billHeader.equals(other$billHeader)) return false;
        final Object this$billContent = this.getBillContent();
        final Object other$billContent = other.getBillContent();
        if (this$billContent == null ? other$billContent != null : !this$billContent.equals(other$billContent)) return false;
        final Object this$billReceiverPhone = this.getBillReceiverPhone();
        final Object other$billReceiverPhone = other.getBillReceiverPhone();
        if (this$billReceiverPhone == null ? other$billReceiverPhone != null : !this$billReceiverPhone.equals(other$billReceiverPhone)) return false;
        final Object this$billReceiverEmail = this.getBillReceiverEmail();
        final Object other$billReceiverEmail = other.getBillReceiverEmail();
        if (this$billReceiverEmail == null ? other$billReceiverEmail != null : !this$billReceiverEmail.equals(other$billReceiverEmail)) return false;
        final Object this$receiverName = this.getReceiverName();
        final Object other$receiverName = other.getReceiverName();
        if (this$receiverName == null ? other$receiverName != null : !this$receiverName.equals(other$receiverName)) return false;
        final Object this$receiverPhone = this.getReceiverPhone();
        final Object other$receiverPhone = other.getReceiverPhone();
        if (this$receiverPhone == null ? other$receiverPhone != null : !this$receiverPhone.equals(other$receiverPhone)) return false;
        final Object this$receiverPostCode = this.getReceiverPostCode();
        final Object other$receiverPostCode = other.getReceiverPostCode();
        if (this$receiverPostCode == null ? other$receiverPostCode != null : !this$receiverPostCode.equals(other$receiverPostCode)) return false;
        final Object this$receiverProvince = this.getReceiverProvince();
        final Object other$receiverProvince = other.getReceiverProvince();
        if (this$receiverProvince == null ? other$receiverProvince != null : !this$receiverProvince.equals(other$receiverProvince)) return false;
        final Object this$receiverCity = this.getReceiverCity();
        final Object other$receiverCity = other.getReceiverCity();
        if (this$receiverCity == null ? other$receiverCity != null : !this$receiverCity.equals(other$receiverCity)) return false;
        final Object this$receiverRegion = this.getReceiverRegion();
        final Object other$receiverRegion = other.getReceiverRegion();
        if (this$receiverRegion == null ? other$receiverRegion != null : !this$receiverRegion.equals(other$receiverRegion)) return false;
        final Object this$receiverDetailAddress = this.getReceiverDetailAddress();
        final Object other$receiverDetailAddress = other.getReceiverDetailAddress();
        if (this$receiverDetailAddress == null ? other$receiverDetailAddress != null : !this$receiverDetailAddress.equals(other$receiverDetailAddress)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        final Object this$paymentTime = this.getPaymentTime();
        final Object other$paymentTime = other.getPaymentTime();
        if (this$paymentTime == null ? other$paymentTime != null : !this$paymentTime.equals(other$paymentTime)) return false;
        final Object this$deliveryTime = this.getDeliveryTime();
        final Object other$deliveryTime = other.getDeliveryTime();
        if (this$deliveryTime == null ? other$deliveryTime != null : !this$deliveryTime.equals(other$deliveryTime)) return false;
        final Object this$receiveTime = this.getReceiveTime();
        final Object other$receiveTime = other.getReceiveTime();
        if (this$receiveTime == null ? other$receiveTime != null : !this$receiveTime.equals(other$receiveTime)) return false;
        final Object this$commentTime = this.getCommentTime();
        final Object other$commentTime = other.getCommentTime();
        if (this$commentTime == null ? other$commentTime != null : !this$commentTime.equals(other$commentTime)) return false;
        final Object this$modifyTime = this.getModifyTime();
        final Object other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !this$modifyTime.equals(other$modifyTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $memberId = this.getMemberId();
        result = result * PRIME + ($memberId == null ? 43 : $memberId.hashCode());
        final Object $couponId = this.getCouponId();
        result = result * PRIME + ($couponId == null ? 43 : $couponId.hashCode());
        final Object $payType = this.getPayType();
        result = result * PRIME + ($payType == null ? 43 : $payType.hashCode());
        final Object $sourceType = this.getSourceType();
        result = result * PRIME + ($sourceType == null ? 43 : $sourceType.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $autoConfirmDay = this.getAutoConfirmDay();
        result = result * PRIME + ($autoConfirmDay == null ? 43 : $autoConfirmDay.hashCode());
        final Object $integration = this.getIntegration();
        result = result * PRIME + ($integration == null ? 43 : $integration.hashCode());
        final Object $growth = this.getGrowth();
        result = result * PRIME + ($growth == null ? 43 : $growth.hashCode());
        final Object $billType = this.getBillType();
        result = result * PRIME + ($billType == null ? 43 : $billType.hashCode());
        final Object $confirmStatus = this.getConfirmStatus();
        result = result * PRIME + ($confirmStatus == null ? 43 : $confirmStatus.hashCode());
        final Object $deleteStatus = this.getDeleteStatus();
        result = result * PRIME + ($deleteStatus == null ? 43 : $deleteStatus.hashCode());
        final Object $useIntegration = this.getUseIntegration();
        result = result * PRIME + ($useIntegration == null ? 43 : $useIntegration.hashCode());
        final Object $orderSn = this.getOrderSn();
        result = result * PRIME + ($orderSn == null ? 43 : $orderSn.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $memberUsername = this.getMemberUsername();
        result = result * PRIME + ($memberUsername == null ? 43 : $memberUsername.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $payAmount = this.getPayAmount();
        result = result * PRIME + ($payAmount == null ? 43 : $payAmount.hashCode());
        final Object $freightAmount = this.getFreightAmount();
        result = result * PRIME + ($freightAmount == null ? 43 : $freightAmount.hashCode());
        final Object $promotionAmount = this.getPromotionAmount();
        result = result * PRIME + ($promotionAmount == null ? 43 : $promotionAmount.hashCode());
        final Object $integrationAmount = this.getIntegrationAmount();
        result = result * PRIME + ($integrationAmount == null ? 43 : $integrationAmount.hashCode());
        final Object $couponAmount = this.getCouponAmount();
        result = result * PRIME + ($couponAmount == null ? 43 : $couponAmount.hashCode());
        final Object $discountAmount = this.getDiscountAmount();
        result = result * PRIME + ($discountAmount == null ? 43 : $discountAmount.hashCode());
        final Object $deliveryCompany = this.getDeliveryCompany();
        result = result * PRIME + ($deliveryCompany == null ? 43 : $deliveryCompany.hashCode());
        final Object $deliverySn = this.getDeliverySn();
        result = result * PRIME + ($deliverySn == null ? 43 : $deliverySn.hashCode());
        final Object $billHeader = this.getBillHeader();
        result = result * PRIME + ($billHeader == null ? 43 : $billHeader.hashCode());
        final Object $billContent = this.getBillContent();
        result = result * PRIME + ($billContent == null ? 43 : $billContent.hashCode());
        final Object $billReceiverPhone = this.getBillReceiverPhone();
        result = result * PRIME + ($billReceiverPhone == null ? 43 : $billReceiverPhone.hashCode());
        final Object $billReceiverEmail = this.getBillReceiverEmail();
        result = result * PRIME + ($billReceiverEmail == null ? 43 : $billReceiverEmail.hashCode());
        final Object $receiverName = this.getReceiverName();
        result = result * PRIME + ($receiverName == null ? 43 : $receiverName.hashCode());
        final Object $receiverPhone = this.getReceiverPhone();
        result = result * PRIME + ($receiverPhone == null ? 43 : $receiverPhone.hashCode());
        final Object $receiverPostCode = this.getReceiverPostCode();
        result = result * PRIME + ($receiverPostCode == null ? 43 : $receiverPostCode.hashCode());
        final Object $receiverProvince = this.getReceiverProvince();
        result = result * PRIME + ($receiverProvince == null ? 43 : $receiverProvince.hashCode());
        final Object $receiverCity = this.getReceiverCity();
        result = result * PRIME + ($receiverCity == null ? 43 : $receiverCity.hashCode());
        final Object $receiverRegion = this.getReceiverRegion();
        result = result * PRIME + ($receiverRegion == null ? 43 : $receiverRegion.hashCode());
        final Object $receiverDetailAddress = this.getReceiverDetailAddress();
        result = result * PRIME + ($receiverDetailAddress == null ? 43 : $receiverDetailAddress.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        final Object $paymentTime = this.getPaymentTime();
        result = result * PRIME + ($paymentTime == null ? 43 : $paymentTime.hashCode());
        final Object $deliveryTime = this.getDeliveryTime();
        result = result * PRIME + ($deliveryTime == null ? 43 : $deliveryTime.hashCode());
        final Object $receiveTime = this.getReceiveTime();
        result = result * PRIME + ($receiveTime == null ? 43 : $receiveTime.hashCode());
        final Object $commentTime = this.getCommentTime();
        result = result * PRIME + ($commentTime == null ? 43 : $commentTime.hashCode());
        final Object $modifyTime = this.getModifyTime();
        result = result * PRIME + ($modifyTime == null ? 43 : $modifyTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderEntity(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", orderSn=" + this.getOrderSn() + ", couponId=" + this.getCouponId() + ", createTime=" + this.getCreateTime() + ", memberUsername=" + this.getMemberUsername() + ", totalAmount=" + this.getTotalAmount() + ", payAmount=" + this.getPayAmount() + ", freightAmount=" + this.getFreightAmount() + ", promotionAmount=" + this.getPromotionAmount() + ", integrationAmount=" + this.getIntegrationAmount() + ", couponAmount=" + this.getCouponAmount() + ", discountAmount=" + this.getDiscountAmount() + ", payType=" + this.getPayType() + ", sourceType=" + this.getSourceType() + ", status=" + this.getStatus() + ", deliveryCompany=" + this.getDeliveryCompany() + ", deliverySn=" + this.getDeliverySn() + ", autoConfirmDay=" + this.getAutoConfirmDay() + ", integration=" + this.getIntegration() + ", growth=" + this.getGrowth() + ", billType=" + this.getBillType() + ", billHeader=" + this.getBillHeader() + ", billContent=" + this.getBillContent() + ", billReceiverPhone=" + this.getBillReceiverPhone() + ", billReceiverEmail=" + this.getBillReceiverEmail() + ", receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", receiverPostCode=" + this.getReceiverPostCode() + ", receiverProvince=" + this.getReceiverProvince() + ", receiverCity=" + this.getReceiverCity() + ", receiverRegion=" + this.getReceiverRegion() + ", receiverDetailAddress=" + this.getReceiverDetailAddress() + ", note=" + this.getNote() + ", confirmStatus=" + this.getConfirmStatus() + ", deleteStatus=" + this.getDeleteStatus() + ", useIntegration=" + this.getUseIntegration() + ", paymentTime=" + this.getPaymentTime() + ", deliveryTime=" + this.getDeliveryTime() + ", receiveTime=" + this.getReceiveTime() + ", commentTime=" + this.getCommentTime() + ", modifyTime=" + this.getModifyTime() + ")";
    }
}
