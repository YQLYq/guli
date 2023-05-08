package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 会员登录记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class MemberLoginLogExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "创建时间")
    private Date createTime;
    @Excel(name = "ip")
    private String ip;
    @Excel(name = "city")
    private String city;
    @Excel(name = "登录类型[1-web，2-app]")
    private Integer loginType;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberLoginLogExcel() {
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
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public String getIp() {
        return this.ip;
    }

    @SuppressWarnings("all")
    public String getCity() {
        return this.city;
    }

    @SuppressWarnings("all")
    public Integer getLoginType() {
        return this.loginType;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @SuppressWarnings("all")
    public void setIp(final String ip) {
        this.ip = ip;
    }

    @SuppressWarnings("all")
    public void setCity(final String city) {
        this.city = city;
    }

    @SuppressWarnings("all")
    public void setLoginType(final Integer loginType) {
        this.loginType = loginType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberLoginLogExcel)) return false;
        final MemberLoginLogExcel other = (MemberLoginLogExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$loginType = this.getLoginType();
        final Object other$loginType = other.getLoginType();
        if (this$loginType == null ? other$loginType != null : !this$loginType.equals(other$loginType)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberLoginLogExcel;
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
        final Object $loginType = this.getLoginType();
        result = result * PRIME + ($loginType == null ? 43 : $loginType.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberLoginLogExcel(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", createTime=" + this.getCreateTime() + ", ip=" + this.getIp() + ", city=" + this.getCity() + ", loginType=" + this.getLoginType() + ")";
    }
    //</editor-fold>
}
