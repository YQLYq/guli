package com.yql.guli.ware.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 库存工作单
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("库存工作单")
public class WareOrderTaskDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("sku_id")
    private Long skuId;
    @ApiModelProperty("sku_name")
    private String skuName;
    @ApiModelProperty("购买个数")
    private Integer skuNum;
    @ApiModelProperty("工作单id")
    private Long taskId;
    @ApiModelProperty("仓库id")
    private Long wareId;
    @ApiModelProperty("1-已锁定  2-已解锁  3-扣减")
    private Integer lockStatus;
    //</editor-fold>

    @SuppressWarnings("all")
    public WareOrderTaskDetailDTO() {
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
    public String getSkuName() {
        return this.skuName;
    }

    @SuppressWarnings("all")
    public Integer getSkuNum() {
        return this.skuNum;
    }

    @SuppressWarnings("all")
    public Long getTaskId() {
        return this.taskId;
    }

    @SuppressWarnings("all")
    public Long getWareId() {
        return this.wareId;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Integer getLockStatus() {
        return this.lockStatus;
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
    public void setSkuName(final String skuName) {
        this.skuName = skuName;
    }

    @SuppressWarnings("all")
    public void setSkuNum(final Integer skuNum) {
        this.skuNum = skuNum;
    }

    @SuppressWarnings("all")
    public void setTaskId(final Long taskId) {
        this.taskId = taskId;
    }

    @SuppressWarnings("all")
    public void setWareId(final Long wareId) {
        this.wareId = wareId;
    }

    @SuppressWarnings("all")
    public void setLockStatus(final Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WareOrderTaskDetailDTO)) return false;
        final WareOrderTaskDetailDTO other = (WareOrderTaskDetailDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuNum = this.getSkuNum();
        final Object other$skuNum = other.getSkuNum();
        if (this$skuNum == null ? other$skuNum != null : !this$skuNum.equals(other$skuNum)) return false;
        final Object this$taskId = this.getTaskId();
        final Object other$taskId = other.getTaskId();
        if (this$taskId == null ? other$taskId != null : !this$taskId.equals(other$taskId)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$lockStatus = this.getLockStatus();
        final Object other$lockStatus = other.getLockStatus();
        if (this$lockStatus == null ? other$lockStatus != null : !this$lockStatus.equals(other$lockStatus)) return false;
        final Object this$skuName = this.getSkuName();
        final Object other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof WareOrderTaskDetailDTO;
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
        final Object $skuNum = this.getSkuNum();
        result = result * PRIME + ($skuNum == null ? 43 : $skuNum.hashCode());
        final Object $taskId = this.getTaskId();
        result = result * PRIME + ($taskId == null ? 43 : $taskId.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $lockStatus = this.getLockStatus();
        result = result * PRIME + ($lockStatus == null ? 43 : $lockStatus.hashCode());
        final Object $skuName = this.getSkuName();
        result = result * PRIME + ($skuName == null ? 43 : $skuName.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "WareOrderTaskDetailDTO(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", skuNum=" + this.getSkuNum() + ", taskId=" + this.getTaskId() + ", wareId=" + this.getWareId() + ", lockStatus=" + this.getLockStatus() + ")";
    }
    //</editor-fold>
}
