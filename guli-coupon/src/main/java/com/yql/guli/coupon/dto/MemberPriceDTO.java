package com.yql.guli.coupon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 商品会员价格
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("商品会员价格")
public class MemberPriceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("sku_id")
    private Long skuId;
    @ApiModelProperty("会员等级id")
    private Long memberLevelId;
    @ApiModelProperty("会员等级名")
    private String memberLevelName;
    @ApiModelProperty("会员对应价格")
    private BigDecimal memberPrice;
    @ApiModelProperty("可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
    private Integer addOther;
    //</editor-fold>

    @SuppressWarnings("all")
    public MemberPriceDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSkuId() {
        return this.skuId;
    }

    @SuppressWarnings("all")
    public Long getMemberLevelId() {
        return this.memberLevelId;
    }

    @SuppressWarnings("all")
    public String getMemberLevelName() {
        return this.memberLevelName;
    }

    @SuppressWarnings("all")
    public BigDecimal getMemberPrice() {
        return this.memberPrice;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getAddOther() {
        return this.addOther;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSkuId(final Long skuId) {
        this.skuId = skuId;
    }

    @SuppressWarnings("all")
    public void setMemberLevelId(final Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    @SuppressWarnings("all")
    public void setMemberLevelName(final String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    @SuppressWarnings("all")
    public void setMemberPrice(final BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    @SuppressWarnings("all")
    public void setAddOther(final Integer addOther) {
        this.addOther = addOther;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberPriceDTO)) return false;
        final MemberPriceDTO other = (MemberPriceDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$memberLevelId = this.getMemberLevelId();
        final Object other$memberLevelId = other.getMemberLevelId();
        if (this$memberLevelId == null ? other$memberLevelId != null : !this$memberLevelId.equals(other$memberLevelId)) return false;
        final Object this$addOther = this.getAddOther();
        final Object other$addOther = other.getAddOther();
        if (this$addOther == null ? other$addOther != null : !this$addOther.equals(other$addOther)) return false;
        final Object this$memberLevelName = this.getMemberLevelName();
        final Object other$memberLevelName = other.getMemberLevelName();
        if (this$memberLevelName == null ? other$memberLevelName != null : !this$memberLevelName.equals(other$memberLevelName)) return false;
        final Object this$memberPrice = this.getMemberPrice();
        final Object other$memberPrice = other.getMemberPrice();
        if (this$memberPrice == null ? other$memberPrice != null : !this$memberPrice.equals(other$memberPrice)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberPriceDTO;
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
        final Object $memberLevelId = this.getMemberLevelId();
        result = result * PRIME + ($memberLevelId == null ? 43 : $memberLevelId.hashCode());
        final Object $addOther = this.getAddOther();
        result = result * PRIME + ($addOther == null ? 43 : $addOther.hashCode());
        final Object $memberLevelName = this.getMemberLevelName();
        result = result * PRIME + ($memberLevelName == null ? 43 : $memberLevelName.hashCode());
        final Object $memberPrice = this.getMemberPrice();
        result = result * PRIME + ($memberPrice == null ? 43 : $memberPrice.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberPriceDTO(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", memberLevelId=" + this.getMemberLevelId() + ", memberLevelName=" + this.getMemberLevelName() + ", memberPrice=" + this.getMemberPrice() + ", addOther=" + this.getAddOther() + ")";
    }
    //</editor-fold>
}
