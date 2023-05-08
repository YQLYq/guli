package com.yql.guli.ware.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@ApiModel("")
public class UndoLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @ApiModelProperty("")
    private Long id;
    @ApiModelProperty("")
    private Long branchId;
    @ApiModelProperty("")
    private String xid;
    @ApiModelProperty("")
    private String context;
    @ApiModelProperty("")
    private byte[] rollbackInfo;
    @ApiModelProperty("")
    private Integer logStatus;
    @ApiModelProperty("")
    private Date logCreated;
    @ApiModelProperty("")
    private Date logModified;
    @ApiModelProperty("")
    private String ext;
    //</editor-fold>

    @SuppressWarnings("all")
    public UndoLogDTO() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getBranchId() {
        return this.branchId;
    }

    @SuppressWarnings("all")
    public String getXid() {
        return this.xid;
    }

    @SuppressWarnings("all")
    public String getContext() {
        return this.context;
    }

    @SuppressWarnings("all")
    public byte[] getRollbackInfo() {
        return this.rollbackInfo;
    }

    @SuppressWarnings("all")
    public Integer getLogStatus() {
        return this.logStatus;
    }

    @SuppressWarnings("all")
    public Date getLogCreated() {
        return this.logCreated;
    }

    @SuppressWarnings("all")
    public Date getLogModified() {
        return this.logModified;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public String getExt() {
        return this.ext;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setBranchId(final Long branchId) {
        this.branchId = branchId;
    }

    @SuppressWarnings("all")
    public void setXid(final String xid) {
        this.xid = xid;
    }

    @SuppressWarnings("all")
    public void setContext(final String context) {
        this.context = context;
    }

    @SuppressWarnings("all")
    public void setRollbackInfo(final byte[] rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }

    @SuppressWarnings("all")
    public void setLogStatus(final Integer logStatus) {
        this.logStatus = logStatus;
    }

    @SuppressWarnings("all")
    public void setLogCreated(final Date logCreated) {
        this.logCreated = logCreated;
    }

    @SuppressWarnings("all")
    public void setLogModified(final Date logModified) {
        this.logModified = logModified;
    }

    @SuppressWarnings("all")
    public void setExt(final String ext) {
        this.ext = ext;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UndoLogDTO)) return false;
        final UndoLogDTO other = (UndoLogDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$branchId = this.getBranchId();
        final Object other$branchId = other.getBranchId();
        if (this$branchId == null ? other$branchId != null : !this$branchId.equals(other$branchId)) return false;
        final Object this$logStatus = this.getLogStatus();
        final Object other$logStatus = other.getLogStatus();
        if (this$logStatus == null ? other$logStatus != null : !this$logStatus.equals(other$logStatus)) return false;
        final Object this$xid = this.getXid();
        final Object other$xid = other.getXid();
        if (this$xid == null ? other$xid != null : !this$xid.equals(other$xid)) return false;
        final Object this$context = this.getContext();
        final Object other$context = other.getContext();
        if (this$context == null ? other$context != null : !this$context.equals(other$context)) return false;
        if (!java.util.Arrays.equals(this.getRollbackInfo(), other.getRollbackInfo())) return false;
        final Object this$logCreated = this.getLogCreated();
        final Object other$logCreated = other.getLogCreated();
        if (this$logCreated == null ? other$logCreated != null : !this$logCreated.equals(other$logCreated)) return false;
        final Object this$logModified = this.getLogModified();
        final Object other$logModified = other.getLogModified();
        if (this$logModified == null ? other$logModified != null : !this$logModified.equals(other$logModified)) return false;
        final Object this$ext = this.getExt();
        final Object other$ext = other.getExt();
        if (this$ext == null ? other$ext != null : !this$ext.equals(other$ext)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof UndoLogDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $branchId = this.getBranchId();
        result = result * PRIME + ($branchId == null ? 43 : $branchId.hashCode());
        final Object $logStatus = this.getLogStatus();
        result = result * PRIME + ($logStatus == null ? 43 : $logStatus.hashCode());
        final Object $xid = this.getXid();
        result = result * PRIME + ($xid == null ? 43 : $xid.hashCode());
        final Object $context = this.getContext();
        result = result * PRIME + ($context == null ? 43 : $context.hashCode());
        result = result * PRIME + java.util.Arrays.hashCode(this.getRollbackInfo());
        final Object $logCreated = this.getLogCreated();
        result = result * PRIME + ($logCreated == null ? 43 : $logCreated.hashCode());
        final Object $logModified = this.getLogModified();
        result = result * PRIME + ($logModified == null ? 43 : $logModified.hashCode());
        final Object $ext = this.getExt();
        result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "UndoLogDTO(id=" + this.getId() + ", branchId=" + this.getBranchId() + ", xid=" + this.getXid() + ", context=" + this.getContext() + ", rollbackInfo=" + java.util.Arrays.toString(this.getRollbackInfo()) + ", logStatus=" + this.getLogStatus() + ", logCreated=" + this.getLogCreated() + ", logModified=" + this.getLogModified() + ", ext=" + this.getExt() + ")";
    }
    //</editor-fold>
}
