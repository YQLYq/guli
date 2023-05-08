package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 会员
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class MemberExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "会员等级id")
    private Long levelId;
    @Excel(name = "用户名")
    private String username;
    @Excel(name = "密码")
    private String password;
    @Excel(name = "昵称")
    private String nickname;
    @Excel(name = "手机号码")
    private String mobile;
    @Excel(name = "邮箱")
    private String email;
    @Excel(name = "头像")
    private String header;
    @Excel(name = "性别")
    private Integer gender;
    @Excel(name = "生日")
    private Date birth;
    @Excel(name = "所在城市")
    private String city;
    @Excel(name = "职业")
    private String job;
    @Excel(name = "个性签名")
    private String sign;
    @Excel(name = "用户来源")
    private Integer sourceType;
    @Excel(name = "积分")
    private Integer integration;
    @Excel(name = "成长值")
    private Integer growth;
    @Excel(name = "启用状态")
    private Integer status;
    @Excel(name = "注册时间")
    private Date createTime;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public Long getLevelId() {
        return this.levelId;
    }

    @SuppressWarnings("all")
    public String getUsername() {
        return this.username;
    }

    @SuppressWarnings("all")
    public String getPassword() {
        return this.password;
    }

    @SuppressWarnings("all")
    public String getNickname() {
        return this.nickname;
    }

    @SuppressWarnings("all")
    public String getMobile() {
        return this.mobile;
    }

    @SuppressWarnings("all")
    public String getEmail() {
        return this.email;
    }

    @SuppressWarnings("all")
    public String getHeader() {
        return this.header;
    }

    @SuppressWarnings("all")
    public Integer getGender() {
        return this.gender;
    }

    @SuppressWarnings("all")
    public Date getBirth() {
        return this.birth;
    }

    @SuppressWarnings("all")
    public String getCity() {
        return this.city;
    }

    @SuppressWarnings("all")
    public String getJob() {
        return this.job;
    }

    @SuppressWarnings("all")
    public String getSign() {
        return this.sign;
    }

    @SuppressWarnings("all")
    public Integer getSourceType() {
        return this.sourceType;
    }

    @SuppressWarnings("all")
    public Integer getIntegration() {
        return this.integration;
    }

    @SuppressWarnings("all")
    public Integer getGrowth() {
        return this.growth;
    }

    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setLevelId(final Long levelId) {
        this.levelId = levelId;
    }

    @SuppressWarnings("all")
    public void setUsername(final String username) {
        this.username = username;
    }

    @SuppressWarnings("all")
    public void setPassword(final String password) {
        this.password = password;
    }

    @SuppressWarnings("all")
    public void setNickname(final String nickname) {
        this.nickname = nickname;
    }

    @SuppressWarnings("all")
    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    @SuppressWarnings("all")
    public void setEmail(final String email) {
        this.email = email;
    }

    @SuppressWarnings("all")
    public void setHeader(final String header) {
        this.header = header;
    }

    @SuppressWarnings("all")
    public void setGender(final Integer gender) {
        this.gender = gender;
    }

    @SuppressWarnings("all")
    public void setBirth(final Date birth) {
        this.birth = birth;
    }

    @SuppressWarnings("all")
    public void setCity(final String city) {
        this.city = city;
    }

    @SuppressWarnings("all")
    public void setJob(final String job) {
        this.job = job;
    }

    @SuppressWarnings("all")
    public void setSign(final String sign) {
        this.sign = sign;
    }

    @SuppressWarnings("all")
    public void setSourceType(final Integer sourceType) {
        this.sourceType = sourceType;
    }

    @SuppressWarnings("all")
    public void setIntegration(final Integer integration) {
        this.integration = integration;
    }

    @SuppressWarnings("all")
    public void setGrowth(final Integer growth) {
        this.growth = growth;
    }

    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberExcel)) return false;
        final MemberExcel other = (MemberExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$levelId = this.getLevelId();
        final Object other$levelId = other.getLevelId();
        if (this$levelId == null ? other$levelId != null : !this$levelId.equals(other$levelId)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$sourceType = this.getSourceType();
        final Object other$sourceType = other.getSourceType();
        if (this$sourceType == null ? other$sourceType != null : !this$sourceType.equals(other$sourceType)) return false;
        final Object this$integration = this.getIntegration();
        final Object other$integration = other.getIntegration();
        if (this$integration == null ? other$integration != null : !this$integration.equals(other$integration)) return false;
        final Object this$growth = this.getGrowth();
        final Object other$growth = other.getGrowth();
        if (this$growth == null ? other$growth != null : !this$growth.equals(other$growth)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$nickname = this.getNickname();
        final Object other$nickname = other.getNickname();
        if (this$nickname == null ? other$nickname != null : !this$nickname.equals(other$nickname)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$header = this.getHeader();
        final Object other$header = other.getHeader();
        if (this$header == null ? other$header != null : !this$header.equals(other$header)) return false;
        final Object this$birth = this.getBirth();
        final Object other$birth = other.getBirth();
        if (this$birth == null ? other$birth != null : !this$birth.equals(other$birth)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$job = this.getJob();
        final Object other$job = other.getJob();
        if (this$job == null ? other$job != null : !this$job.equals(other$job)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberExcel;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $levelId = this.getLevelId();
        result = result * PRIME + ($levelId == null ? 43 : $levelId.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $sourceType = this.getSourceType();
        result = result * PRIME + ($sourceType == null ? 43 : $sourceType.hashCode());
        final Object $integration = this.getIntegration();
        result = result * PRIME + ($integration == null ? 43 : $integration.hashCode());
        final Object $growth = this.getGrowth();
        result = result * PRIME + ($growth == null ? 43 : $growth.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $nickname = this.getNickname();
        result = result * PRIME + ($nickname == null ? 43 : $nickname.hashCode());
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $header = this.getHeader();
        result = result * PRIME + ($header == null ? 43 : $header.hashCode());
        final Object $birth = this.getBirth();
        result = result * PRIME + ($birth == null ? 43 : $birth.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $job = this.getJob();
        result = result * PRIME + ($job == null ? 43 : $job.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberExcel(id=" + this.getId() + ", levelId=" + this.getLevelId() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", nickname=" + this.getNickname() + ", mobile=" + this.getMobile() + ", email=" + this.getEmail() + ", header=" + this.getHeader() + ", gender=" + this.getGender() + ", birth=" + this.getBirth() + ", city=" + this.getCity() + ", job=" + this.getJob() + ", sign=" + this.getSign() + ", sourceType=" + this.getSourceType() + ", integration=" + this.getIntegration() + ", growth=" + this.getGrowth() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ")";
    }
    //</editor-fold>
}
