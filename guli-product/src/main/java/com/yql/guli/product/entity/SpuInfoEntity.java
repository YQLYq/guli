package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * spu信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@TableName("pms_spu_info")
public class SpuInfoEntity {
    /**
     * 商品id
     */
    @TableId
    private Long id;
    /**
     * 商品名称
     */
    private String spuName;
    /**
     * 商品描述
     */
    private String spuDescription;
    /**
     * 所属分类id
     */
    private Long catalogId;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     */
    private BigDecimal weight;
    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    private Integer publishStatus;
    /**
     */
    private Date createTime;
    /**
     */
    private Date updateTime;

    @SuppressWarnings("all")
    public SpuInfoEntity() {
    }

    /**
     * 商品id
     */
    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    /**
     * 商品名称
     */
    @SuppressWarnings("all")
    public String getSpuName() {
        return this.spuName;
    }

    /**
     * 商品描述
     */
    @SuppressWarnings("all")
    public String getSpuDescription() {
        return this.spuDescription;
    }

    /**
     * 所属分类id
     */
    @SuppressWarnings("all")
    public Long getCatalogId() {
        return this.catalogId;
    }

    /**
     * 品牌id
     */
    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    /**
     */
    @SuppressWarnings("all")
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @SuppressWarnings("all")
    public Integer getPublishStatus() {
        return this.publishStatus;
    }

    /**
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     */
    @SuppressWarnings("all")
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * 商品id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 商品名称
     */
    @SuppressWarnings("all")
    public void setSpuName(final String spuName) {
        this.spuName = spuName;
    }

    /**
     * 商品描述
     */
    @SuppressWarnings("all")
    public void setSpuDescription(final String spuDescription) {
        this.spuDescription = spuDescription;
    }

    /**
     * 所属分类id
     */
    @SuppressWarnings("all")
    public void setCatalogId(final Long catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * 品牌id
     */
    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setWeight(final BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @SuppressWarnings("all")
    public void setPublishStatus(final Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     */
    @SuppressWarnings("all")
    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SpuInfoEntity)) return false;
        final SpuInfoEntity other = (SpuInfoEntity) o;
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
        return other instanceof SpuInfoEntity;
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
        return "SpuInfoEntity(id=" + this.getId() + ", spuName=" + this.getSpuName() + ", spuDescription=" + this.getSpuDescription() + ", catalogId=" + this.getCatalogId() + ", brandId=" + this.getBrandId() + ", weight=" + this.getWeight() + ", publishStatus=" + this.getPublishStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}
