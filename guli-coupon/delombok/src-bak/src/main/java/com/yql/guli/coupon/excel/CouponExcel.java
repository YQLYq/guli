package com.yql.guli.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class CouponExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]")
    private Integer couponType;
    @Excel(name = "优惠券图片")
    private String couponImg;
    @Excel(name = "优惠卷名字")
    private String couponName;
    @Excel(name = "数量")
    private Integer num;
    @Excel(name = "金额")
    private BigDecimal amount;
    @Excel(name = "每人限领张数")
    private Integer perLimit;
    @Excel(name = "使用门槛")
    private BigDecimal minPoint;
    @Excel(name = "开始时间")
    private Date startTime;
    @Excel(name = "结束时间")
    private Date endTime;
    @Excel(name = "使用类型[0->全场通用；1->指定分类；2->指定商品]")
    private Integer useType;
    @Excel(name = "备注")
    private String note;
    @Excel(name = "发行数量")
    private Integer publishCount;
    @Excel(name = "已使用数量")
    private Integer useCount;
    @Excel(name = "领取数量")
    private Integer receiveCount;
    @Excel(name = "可以领取的开始日期")
    private Date enableStartTime;
    @Excel(name = "可以领取的结束日期")
    private Date enableEndTime;
    @Excel(name = "优惠码")
    private String code;
    @Excel(name = "可以领取的会员等级[0->不限等级，其他-对应等级]")
    private Integer memberLevel;
    @Excel(name = "发布状态[0-未发布，1-已发布]")
    private Integer publish;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public CouponExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Integer getCouponType() {
        return this.couponType;
    }

    @SuppressWarnings("all")
    public String getCouponImg() {
        return this.couponImg;
    }

    @SuppressWarnings("all")
    public String getCouponName() {
        return this.couponName;
    }

    @SuppressWarnings("all")
    public Integer getNum() {
        return this.num;
    }

    @SuppressWarnings("all")
    public BigDecimal getAmount() {
        return this.amount;
    }

    @SuppressWarnings("all")
    public Integer getPerLimit() {
        return this.perLimit;
    }

    @SuppressWarnings("all")
    public BigDecimal getMinPoint() {
        return this.minPoint;
    }

    @SuppressWarnings("all")
    public Date getStartTime() {
        return this.startTime;
    }

    @SuppressWarnings("all")
    public Date getEndTime() {
        return this.endTime;
    }

    @SuppressWarnings("all")
    public Integer getUseType() {
        return this.useType;
    }

    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    @SuppressWarnings("all")
    public Integer getPublishCount() {
        return this.publishCount;
    }

    @SuppressWarnings("all")
    public Integer getUseCount() {
        return this.useCount;
    }

    @SuppressWarnings("all")
    public Integer getReceiveCount() {
        return this.receiveCount;
    }

    @SuppressWarnings("all")
    public Date getEnableStartTime() {
        return this.enableStartTime;
    }

    @SuppressWarnings("all")
    public Date getEnableEndTime() {
        return this.enableEndTime;
    }

    @SuppressWarnings("all")
    public String getCode() {
        return this.code;
    }

    @SuppressWarnings("all")
    public Integer getMemberLevel() {
        return this.memberLevel;
    }

    @SuppressWarnings("all")
    public Integer getPublish() {
        return this.publish;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setCouponType(final Integer couponType) {
        this.couponType = couponType;
    }

    @SuppressWarnings("all")
    public void setCouponImg(final String couponImg) {
        this.couponImg = couponImg;
    }

    @SuppressWarnings("all")
    public void setCouponName(final String couponName) {
        this.couponName = couponName;
    }

    @SuppressWarnings("all")
    public void setNum(final Integer num) {
        this.num = num;
    }

    @SuppressWarnings("all")
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    @SuppressWarnings("all")
    public void setPerLimit(final Integer perLimit) {
        this.perLimit = perLimit;
    }

    @SuppressWarnings("all")
    public void setMinPoint(final BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    @SuppressWarnings("all")
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    @SuppressWarnings("all")
    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    @SuppressWarnings("all")
    public void setUseType(final Integer useType) {
        this.useType = useType;
    }

    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    @SuppressWarnings("all")
    public void setPublishCount(final Integer publishCount) {
        this.publishCount = publishCount;
    }

    @SuppressWarnings("all")
    public void setUseCount(final Integer useCount) {
        this.useCount = useCount;
    }

    @SuppressWarnings("all")
    public void setReceiveCount(final Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    @SuppressWarnings("all")
    public void setEnableStartTime(final Date enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    @SuppressWarnings("all")
    public void setEnableEndTime(final Date enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    @SuppressWarnings("all")
    public void setCode(final String code) {
        this.code = code;
    }

    @SuppressWarnings("all")
    public void setMemberLevel(final Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @SuppressWarnings("all")
    public void setPublish(final Integer publish) {
        this.publish = publish;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CouponExcel)) return false;
        final CouponExcel other = (CouponExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$couponType = this.getCouponType();
        final Object other$couponType = other.getCouponType();
        if (this$couponType == null ? other$couponType != null : !this$couponType.equals(other$couponType)) return false;
        final Object this$num = this.getNum();
        final Object other$num = other.getNum();
        if (this$num == null ? other$num != null : !this$num.equals(other$num)) return false;
        final Object this$perLimit = this.getPerLimit();
        final Object other$perLimit = other.getPerLimit();
        if (this$perLimit == null ? other$perLimit != null : !this$perLimit.equals(other$perLimit)) return false;
        final Object this$useType = this.getUseType();
        final Object other$useType = other.getUseType();
        if (this$useType == null ? other$useType != null : !this$useType.equals(other$useType)) return false;
        final Object this$publishCount = this.getPublishCount();
        final Object other$publishCount = other.getPublishCount();
        if (this$publishCount == null ? other$publishCount != null : !this$publishCount.equals(other$publishCount)) return false;
        final Object this$useCount = this.getUseCount();
        final Object other$useCount = other.getUseCount();
        if (this$useCount == null ? other$useCount != null : !this$useCount.equals(other$useCount)) return false;
        final Object this$receiveCount = this.getReceiveCount();
        final Object other$receiveCount = other.getReceiveCount();
        if (this$receiveCount == null ? other$receiveCount != null : !this$receiveCount.equals(other$receiveCount)) return false;
        final Object this$memberLevel = this.getMemberLevel();
        final Object other$memberLevel = other.getMemberLevel();
        if (this$memberLevel == null ? other$memberLevel != null : !this$memberLevel.equals(other$memberLevel)) return false;
        final Object this$publish = this.getPublish();
        final Object other$publish = other.getPublish();
        if (this$publish == null ? other$publish != null : !this$publish.equals(other$publish)) return false;
        final Object this$couponImg = this.getCouponImg();
        final Object other$couponImg = other.getCouponImg();
        if (this$couponImg == null ? other$couponImg != null : !this$couponImg.equals(other$couponImg)) return false;
        final Object this$couponName = this.getCouponName();
        final Object other$couponName = other.getCouponName();
        if (this$couponName == null ? other$couponName != null : !this$couponName.equals(other$couponName)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$minPoint = this.getMinPoint();
        final Object other$minPoint = other.getMinPoint();
        if (this$minPoint == null ? other$minPoint != null : !this$minPoint.equals(other$minPoint)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        final Object this$enableStartTime = this.getEnableStartTime();
        final Object other$enableStartTime = other.getEnableStartTime();
        if (this$enableStartTime == null ? other$enableStartTime != null : !this$enableStartTime.equals(other$enableStartTime)) return false;
        final Object this$enableEndTime = this.getEnableEndTime();
        final Object other$enableEndTime = other.getEnableEndTime();
        if (this$enableEndTime == null ? other$enableEndTime != null : !this$enableEndTime.equals(other$enableEndTime)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof CouponExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $couponType = this.getCouponType();
        result = result * PRIME + ($couponType == null ? 43 : $couponType.hashCode());
        final Object $num = this.getNum();
        result = result * PRIME + ($num == null ? 43 : $num.hashCode());
        final Object $perLimit = this.getPerLimit();
        result = result * PRIME + ($perLimit == null ? 43 : $perLimit.hashCode());
        final Object $useType = this.getUseType();
        result = result * PRIME + ($useType == null ? 43 : $useType.hashCode());
        final Object $publishCount = this.getPublishCount();
        result = result * PRIME + ($publishCount == null ? 43 : $publishCount.hashCode());
        final Object $useCount = this.getUseCount();
        result = result * PRIME + ($useCount == null ? 43 : $useCount.hashCode());
        final Object $receiveCount = this.getReceiveCount();
        result = result * PRIME + ($receiveCount == null ? 43 : $receiveCount.hashCode());
        final Object $memberLevel = this.getMemberLevel();
        result = result * PRIME + ($memberLevel == null ? 43 : $memberLevel.hashCode());
        final Object $publish = this.getPublish();
        result = result * PRIME + ($publish == null ? 43 : $publish.hashCode());
        final Object $couponImg = this.getCouponImg();
        result = result * PRIME + ($couponImg == null ? 43 : $couponImg.hashCode());
        final Object $couponName = this.getCouponName();
        result = result * PRIME + ($couponName == null ? 43 : $couponName.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $minPoint = this.getMinPoint();
        result = result * PRIME + ($minPoint == null ? 43 : $minPoint.hashCode());
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        final Object $enableStartTime = this.getEnableStartTime();
        result = result * PRIME + ($enableStartTime == null ? 43 : $enableStartTime.hashCode());
        final Object $enableEndTime = this.getEnableEndTime();
        result = result * PRIME + ($enableEndTime == null ? 43 : $enableEndTime.hashCode());
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "CouponExcel(id=" + this.getId() + ", couponType=" + this.getCouponType() + ", couponImg=" + this.getCouponImg() + ", couponName=" + this.getCouponName() + ", num=" + this.getNum() + ", amount=" + this.getAmount() + ", perLimit=" + this.getPerLimit() + ", minPoint=" + this.getMinPoint() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", useType=" + this.getUseType() + ", note=" + this.getNote() + ", publishCount=" + this.getPublishCount() + ", useCount=" + this.getUseCount() + ", receiveCount=" + this.getReceiveCount() + ", enableStartTime=" + this.getEnableStartTime() + ", enableEndTime=" + this.getEnableEndTime() + ", code=" + this.getCode() + ", memberLevel=" + this.getMemberLevel() + ", publish=" + this.getPublish() + ")";
    }
    //</editor-fold>
}
