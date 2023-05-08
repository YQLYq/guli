package com.yql.guli.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * spu信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@ApiModel("spu信息")
public class SpuInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("商品id")
    private Long id;
    @ApiModelProperty("商品名称")
    private String spuName;
    @ApiModelProperty("商品描述")
    private String spuDescription;
    @ApiModelProperty("所属分类id")
    private Long catalogId;
    @ApiModelProperty("品牌id")
    private Long brandId;
    @ApiModelProperty("")
    private BigDecimal weight;
    @ApiModelProperty("上架状态[0 - 下架，1 - 上架]")
    private Integer publishStatus;
    @ApiModelProperty("")
    private Date createTime;
    @ApiModelProperty("")
    private Date updateTime;
    //</editor-fold>

    @SuppressWarnings("all")
    public SpuInfoDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public String getSpuName() {
        return this.spuName;
    }

    @SuppressWarnings("all")
    public String getSpuDescription() {
        return this.spuDescription;
    }

    @SuppressWarnings("all")
    public Long getCatalogId() {
        return this.catalogId;
    }

    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    @SuppressWarnings("all")
    public BigDecimal getWeight() {
        return this.weight;
    }

    @SuppressWarnings("all")
    public Integer getPublishStatus() {
        return this.publishStatus;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Date getUpdateTime() {
        return this.updateTime;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setSpuName(final String spuName) {
        this.spuName = spuName;
    }

    @SuppressWarnings("all")
    public void setSpuDescription(final String spuDescription) {
        this.spuDescription = spuDescription;
    }

    @SuppressWarnings("all")
    public void setCatalogId(final Long catalogId) {
        this.catalogId = catalogId;
    }

    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    @SuppressWarnings("all")
    public void setWeight(final BigDecimal weight) {
        this.weight = weight;
    }

    @SuppressWarnings("all")
    public void setPublishStatus(final Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuInfoDTO)) return false;
        final SpuInfoDTO other = (SpuInfoDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$catalogId = this.getCatalogId();
        final Object other$catalogId = other.getCatalogId();
        if (this$catalogId == null ? other$catalogId != null : !this$catalogId.equals(other$catalogId)) return false;
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$publishStatus = this.getPublishStatus();
        final Object other$publishStatus = other.getPublishStatus();
        if (this$publishStatus == null ? other$publishStatus != null : !this$publishStatus.equals(other$publishStatus)) return false;
        final Object this$spuName = this.getSpuName();
        final Object other$spuName = other.getSpuName();
        if (this$spuName == null ? other$spuName != null : !this$spuName.equals(other$spuName)) return false;
        final Object this$spuDescription = this.getSpuDescription();
        final Object other$spuDescription = other.getSpuDescription();
        if (this$spuDescription == null ? other$spuDescription != null : !this$spuDescription.equals(other$spuDescription)) return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SpuInfoDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $catalogId = this.getCatalogId();
        result = result * PRIME + ($catalogId == null ? 43 : $catalogId.hashCode());
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $publishStatus = this.getPublishStatus();
        result = result * PRIME + ($publishStatus == null ? 43 : $publishStatus.hashCode());
        final Object $spuName = this.getSpuName();
        result = result * PRIME + ($spuName == null ? 43 : $spuName.hashCode());
        final Object $spuDescription = this.getSpuDescription();
        result = result * PRIME + ($spuDescription == null ? 43 : $spuDescription.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SpuInfoDTO(id=" + this.getId() + ", spuName=" + this.getSpuName() + ", spuDescription=" + this.getSpuDescription() + ", catalogId=" + this.getCatalogId() + ", brandId=" + this.getBrandId() + ", weight=" + this.getWeight() + ", publishStatus=" + this.getPublishStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }
    //</editor-fold>
}
