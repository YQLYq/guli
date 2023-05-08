package com.yql.guli.coupon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀商品通知订阅
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("秒杀商品通知订阅")
public class SeckillSkuNoticeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("member_id")
    private Long memberId;
    @ApiModelProperty("sku_id")
    private Long skuId;
    @ApiModelProperty("活动场次id")
    private Long sessionId;
    @ApiModelProperty("订阅时间")
    private Date subcribeTime;
    @ApiModelProperty("发送时间")
    private Date sendTime;
    @ApiModelProperty("通知方式[0-短信，1-邮件]")
    private Integer noticeType;
    //</editor-fold>

    @SuppressWarnings("all")
    public SeckillSkuNoticeDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getMemberId() {
        return this.memberId;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public Long getSessionId() {
        return this.sessionId;
    }

    @SuppressWarnings("all")
    public Date getSubcribeTime() {
        return this.subcribeTime;
    }

    @SuppressWarnings("all")
    public Date getSendTime() {
        return this.sendTime;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getNoticeType() {
        return this.noticeType;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setSessionId(final Long sessionId) {
        this.sessionId = sessionId;
    }

    @SuppressWarnings("all")
    public void setSubcribeTime(final Date subcribeTime) {
        this.subcribeTime = subcribeTime;
    }

    @SuppressWarnings("all")
    public void setSendTime(final Date sendTime) {
        this.sendTime = sendTime;
    }

    @SuppressWarnings("all")
    public void setNoticeType(final Integer noticeType) {
        this.noticeType = noticeType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillSkuNoticeDTO)) return false;
        final SeckillSkuNoticeDTO other = (SeckillSkuNoticeDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$sessionId = this.getSessionId();
        final Object other$sessionId = other.getSessionId();
        if (this$sessionId == null ? other$sessionId != null : !this$sessionId.equals(other$sessionId)) return false;
        final Object this$noticeType = this.getNoticeType();
        final Object other$noticeType = other.getNoticeType();
        if (this$noticeType == null ? other$noticeType != null : !this$noticeType.equals(other$noticeType)) return false;
        final Object this$subcribeTime = this.getSubcribeTime();
        final Object other$subcribeTime = other.getSubcribeTime();
        if (this$subcribeTime == null ? other$subcribeTime != null : !this$subcribeTime.equals(other$subcribeTime)) return false;
        final Object this$sendTime = this.getSendTime();
        final Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SeckillSkuNoticeDTO;
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
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $sessionId = this.getSessionId();
        result = result * PRIME + ($sessionId == null ? 43 : $sessionId.hashCode());
        final Object $noticeType = this.getNoticeType();
        result = result * PRIME + ($noticeType == null ? 43 : $noticeType.hashCode());
        final Object $subcribeTime = this.getSubcribeTime();
        result = result * PRIME + ($subcribeTime == null ? 43 : $subcribeTime.hashCode());
        final Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SeckillSkuNoticeDTO(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", skuId=" + this.getSkuId() + ", sessionId=" + this.getSessionId() + ", subcribeTime=" + this.getSubcribeTime() + ", sendTime=" + this.getSendTime() + ", noticeType=" + this.getNoticeType() + ")";
    }
    //</editor-fold>
}
