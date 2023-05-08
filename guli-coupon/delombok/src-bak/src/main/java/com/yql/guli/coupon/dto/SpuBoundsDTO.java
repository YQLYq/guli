package com.yql.guli.coupon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 商品spu积分设置
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("商品spu积分设置")
public class SpuBoundsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("")
    private Long spuId;
    @ApiModelProperty("成长积分")
    private BigDecimal growBounds;
    @ApiModelProperty("购物积分")
    private BigDecimal buyBounds;
    @ApiModelProperty("优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]")
    private Integer work;
    //</editor-fold>

    @SuppressWarnings("all")
    public SpuBoundsDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    @SuppressWarnings("all")
    public BigDecimal getGrowBounds() {
        return this.growBounds;
    }

    @SuppressWarnings("all")
    public BigDecimal getBuyBounds() {
        return this.buyBounds;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getWork() {
        return this.work;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    @SuppressWarnings("all")
    public void setGrowBounds(final BigDecimal growBounds) {
        this.growBounds = growBounds;
    }

    @SuppressWarnings("all")
    public void setBuyBounds(final BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    @SuppressWarnings("all")
    public void setWork(final Integer work) {
        this.work = work;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuBoundsDTO)) return false;
        final SpuBoundsDTO other = (SpuBoundsDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$work = this.getWork();
        final Object other$work = other.getWork();
        if (this$work == null ? other$work != null : !this$work.equals(other$work)) return false;
        final Object this$growBounds = this.getGrowBounds();
        final Object other$growBounds = other.getGrowBounds();
        if (this$growBounds == null ? other$growBounds != null : !this$growBounds.equals(other$growBounds)) return false;
        final Object this$buyBounds = this.getBuyBounds();
        final Object other$buyBounds = other.getBuyBounds();
        if (this$buyBounds == null ? other$buyBounds != null : !this$buyBounds.equals(other$buyBounds)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SpuBoundsDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $work = this.getWork();
        result = result * PRIME + ($work == null ? 43 : $work.hashCode());
        final Object $growBounds = this.getGrowBounds();
        result = result * PRIME + ($growBounds == null ? 43 : $growBounds.hashCode());
        final Object $buyBounds = this.getBuyBounds();
        result = result * PRIME + ($buyBounds == null ? 43 : $buyBounds.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SpuBoundsDTO(id=" + this.getId() + ", spuId=" + this.getSpuId() + ", growBounds=" + this.getGrowBounds() + ", buyBounds=" + this.getBuyBounds() + ", work=" + this.getWork() + ")";
    }
    //</editor-fold>
}
