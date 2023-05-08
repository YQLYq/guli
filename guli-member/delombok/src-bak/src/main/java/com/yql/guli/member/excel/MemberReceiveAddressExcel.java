package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 会员收货地址
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class MemberReceiveAddressExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "收货人姓名")
    private String name;
    @Excel(name = "电话")
    private String phone;
    @Excel(name = "邮政编码")
    private String postCode;
    @Excel(name = "省份/直辖市")
    private String province;
    @Excel(name = "城市")
    private String city;
    @Excel(name = "区")
    private String region;
    @Excel(name = "详细地址(街道)")
    private String detailAddress;
    @Excel(name = "省市区代码")
    private String areacode;
    @Excel(name = "是否默认")
    private Integer defaultStatus;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberReceiveAddressExcel() {
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
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getPhone() {
        return this.phone;
    }

    @SuppressWarnings("all")
    public String getPostCode() {
        return this.postCode;
    }

    @SuppressWarnings("all")
    public String getProvince() {
        return this.province;
    }

    @SuppressWarnings("all")
    public String getCity() {
        return this.city;
    }

    @SuppressWarnings("all")
    public String getRegion() {
        return this.region;
    }

    @SuppressWarnings("all")
    public String getDetailAddress() {
        return this.detailAddress;
    }

    @SuppressWarnings("all")
    public String getAreacode() {
        return this.areacode;
    }

    @SuppressWarnings("all")
    public Integer getDefaultStatus() {
        return this.defaultStatus;
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
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    @SuppressWarnings("all")
    public void setPostCode(final String postCode) {
        this.postCode = postCode;
    }

    @SuppressWarnings("all")
    public void setProvince(final String province) {
        this.province = province;
    }

    @SuppressWarnings("all")
    public void setCity(final String city) {
        this.city = city;
    }

    @SuppressWarnings("all")
    public void setRegion(final String region) {
        this.region = region;
    }

    @SuppressWarnings("all")
    public void setDetailAddress(final String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @SuppressWarnings("all")
    public void setAreacode(final String areacode) {
        this.areacode = areacode;
    }

    @SuppressWarnings("all")
    public void setDefaultStatus(final Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberReceiveAddressExcel)) return false;
        final MemberReceiveAddressExcel other = (MemberReceiveAddressExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$defaultStatus = this.getDefaultStatus();
        final Object other$defaultStatus = other.getDefaultStatus();
        if (this$defaultStatus == null ? other$defaultStatus != null : !this$defaultStatus.equals(other$defaultStatus)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$postCode = this.getPostCode();
        final Object other$postCode = other.getPostCode();
        if (this$postCode == null ? other$postCode != null : !this$postCode.equals(other$postCode)) return false;
        final Object this$province = this.getProvince();
        final Object other$province = other.getProvince();
        if (this$province == null ? other$province != null : !this$province.equals(other$province)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$region = this.getRegion();
        final Object other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false;
        final Object this$detailAddress = this.getDetailAddress();
        final Object other$detailAddress = other.getDetailAddress();
        if (this$detailAddress == null ? other$detailAddress != null : !this$detailAddress.equals(other$detailAddress)) return false;
        final Object this$areacode = this.getAreacode();
        final Object other$areacode = other.getAreacode();
        if (this$areacode == null ? other$areacode != null : !this$areacode.equals(other$areacode)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberReceiveAddressExcel;
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
        final Object $defaultStatus = this.getDefaultStatus();
        result = result * PRIME + ($defaultStatus == null ? 43 : $defaultStatus.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $postCode = this.getPostCode();
        result = result * PRIME + ($postCode == null ? 43 : $postCode.hashCode());
        final Object $province = this.getProvince();
        result = result * PRIME + ($province == null ? 43 : $province.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $region = this.getRegion();
        result = result * PRIME + ($region == null ? 43 : $region.hashCode());
        final Object $detailAddress = this.getDetailAddress();
        result = result * PRIME + ($detailAddress == null ? 43 : $detailAddress.hashCode());
        final Object $areacode = this.getAreacode();
        result = result * PRIME + ($areacode == null ? 43 : $areacode.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberReceiveAddressExcel(id=" + this.getId() + ", memberId=" + this.getMemberId() + ", name=" + this.getName() + ", phone=" + this.getPhone() + ", postCode=" + this.getPostCode() + ", province=" + this.getProvince() + ", city=" + this.getCity() + ", region=" + this.getRegion() + ", detailAddress=" + this.getDetailAddress() + ", areacode=" + this.getAreacode() + ", defaultStatus=" + this.getDefaultStatus() + ")";
    }
    //</editor-fold>
}
