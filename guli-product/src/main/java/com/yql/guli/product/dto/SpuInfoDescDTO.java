package com.yql.guli.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * spu信息介绍
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@ApiModel("spu信息介绍")
public class SpuInfoDescDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("商品id")
    private Long spuId;
    @ApiModelProperty("商品介绍")
    private String decript;
    //</editor-fold>

    @SuppressWarnings("all")
    public SpuInfoDescDTO() {
    }

    @SuppressWarnings("all")
    public Long getSpuId() {
        return this.spuId;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public String getDecript() {
        return this.decript;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setSpuId(final Long spuId) {
        this.spuId = spuId;
    }

    @SuppressWarnings("all")
    public void setDecript(final String decript) {
        this.decript = decript;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuInfoDescDTO)) return false;
        final SpuInfoDescDTO other = (SpuInfoDescDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$spuId = this.getSpuId();
        final Object other$spuId = other.getSpuId();
        if (this$spuId == null ? other$spuId != null : !this$spuId.equals(other$spuId)) return false;
        final Object this$decript = this.getDecript();
        final Object other$decript = other.getDecript();
        if (this$decript == null ? other$decript != null : !this$decript.equals(other$decript)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SpuInfoDescDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $spuId = this.getSpuId();
        result = result * PRIME + ($spuId == null ? 43 : $spuId.hashCode());
        final Object $decript = this.getDecript();
        result = result * PRIME + ($decript == null ? 43 : $decript.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SpuInfoDescDTO(spuId=" + this.getSpuId() + ", decript=" + this.getDecript() + ")";
    }
    //</editor-fold>
}
