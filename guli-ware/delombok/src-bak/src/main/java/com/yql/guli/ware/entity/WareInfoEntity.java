package com.yql.guli.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 仓库信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("wms_ware_info")
public class WareInfoEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 仓库名
     */
    private String name;
    /**
     * 仓库地址
     */
    private String address;
    /**
     * 区域编码
     */
    private String areacode;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public WareInfoEntity() {
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
     * 仓库名
     */
    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    /**
     * 仓库地址
     */
    @SuppressWarnings("all")
    public String getAddress() {
        return this.address;
    }

    /**
     * 区域编码
     */
    @SuppressWarnings("all")
    public String getAreacode() {
        return this.areacode;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 仓库名
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 仓库地址
     */
    @SuppressWarnings("all")
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * 区域编码
     */
    @SuppressWarnings("all")
    public void setAreacode(final String areacode) {
        this.areacode = areacode;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WareInfoEntity)) return false;
        final WareInfoEntity other = (WareInfoEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$areacode = this.getAreacode();
        final Object other$areacode = other.getAreacode();
        if (this$areacode == null ? other$areacode != null : !this$areacode.equals(other$areacode)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof WareInfoEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $areacode = this.getAreacode();
        result = result * PRIME + ($areacode == null ? 43 : $areacode.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "WareInfoEntity(id=" + this.getId() + ", name=" + this.getName() + ", address=" + this.getAddress() + ", areacode=" + this.getAreacode() + ")";
    }
}
