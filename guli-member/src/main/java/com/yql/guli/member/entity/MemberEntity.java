package com.yql.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 会员
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("ums_member")
public class MemberEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 会员等级id
     */
    private Long levelId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像
     */
    private String header;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 生日
     */
    private Date birth;
    /**
     * 所在城市
     */
    private String city;
    /**
     * 职业
     */
    private String job;
    /**
     * 个性签名
     */
    private String sign;
    /**
     * 用户来源
     */
    private Integer sourceType;
    /**
     * 积分
     */
    private Integer integration;
    /**
     * 成长值
     */
    private Integer growth;
    /**
     * 启用状态
     */
    private Integer status;
    /**
     * 注册时间
     */
    private Date createTime;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberEntity() {
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
     * 会员等级id
     */
    @SuppressWarnings("all")
    public Long getLevelId() {
        return this.levelId;
    }

    /**
     * 用户名
     */
    @SuppressWarnings("all")
    public String getUsername() {
        return this.username;
    }

    /**
     * 密码
     */
    @SuppressWarnings("all")
    public String getPassword() {
        return this.password;
    }

    /**
     * 昵称
     */
    @SuppressWarnings("all")
    public String getNickname() {
        return this.nickname;
    }

    /**
     * 手机号码
     */
    @SuppressWarnings("all")
    public String getMobile() {
        return this.mobile;
    }

    /**
     * 邮箱
     */
    @SuppressWarnings("all")
    public String getEmail() {
        return this.email;
    }

    /**
     * 头像
     */
    @SuppressWarnings("all")
    public String getHeader() {
        return this.header;
    }

    /**
     * 性别
     */
    @SuppressWarnings("all")
    public Integer getGender() {
        return this.gender;
    }

    /**
     * 生日
     */
    @SuppressWarnings("all")
    public Date getBirth() {
        return this.birth;
    }

    /**
     * 所在城市
     */
    @SuppressWarnings("all")
    public String getCity() {
        return this.city;
    }

    /**
     * 职业
     */
    @SuppressWarnings("all")
    public String getJob() {
        return this.job;
    }

    /**
     * 个性签名
     */
    @SuppressWarnings("all")
    public String getSign() {
        return this.sign;
    }

    /**
     * 用户来源
     */
    @SuppressWarnings("all")
    public Integer getSourceType() {
        return this.sourceType;
    }

    /**
     * 积分
     */
    @SuppressWarnings("all")
    public Integer getIntegration() {
        return this.integration;
    }

    /**
     * 成长值
     */
    @SuppressWarnings("all")
    public Integer getGrowth() {
        return this.growth;
    }

    /**
     * 启用状态
     */
    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 注册时间
     */
    @SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 会员等级id
     */
    @SuppressWarnings("all")
    public void setLevelId(final Long levelId) {
        this.levelId = levelId;
    }

    /**
     * 用户名
     */
    @SuppressWarnings("all")
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * 密码
     */
    @SuppressWarnings("all")
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * 昵称
     */
    @SuppressWarnings("all")
    public void setNickname(final String nickname) {
        this.nickname = nickname;
    }

    /**
     * 手机号码
     */
    @SuppressWarnings("all")
    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    /**
     * 邮箱
     */
    @SuppressWarnings("all")
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * 头像
     */
    @SuppressWarnings("all")
    public void setHeader(final String header) {
        this.header = header;
    }

    /**
     * 性别
     */
    @SuppressWarnings("all")
    public void setGender(final Integer gender) {
        this.gender = gender;
    }

    /**
     * 生日
     */
    @SuppressWarnings("all")
    public void setBirth(final Date birth) {
        this.birth = birth;
    }

    /**
     * 所在城市
     */
    @SuppressWarnings("all")
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * 职业
     */
    @SuppressWarnings("all")
    public void setJob(final String job) {
        this.job = job;
    }

    /**
     * 个性签名
     */
    @SuppressWarnings("all")
    public void setSign(final String sign) {
        this.sign = sign;
    }

    /**
     * 用户来源
     */
    @SuppressWarnings("all")
    public void setSourceType(final Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 积分
     */
    @SuppressWarnings("all")
    public void setIntegration(final Integer integration) {
        this.integration = integration;
    }

    /**
     * 成长值
     */
    @SuppressWarnings("all")
    public void setGrowth(final Integer growth) {
        this.growth = growth;
    }

    /**
     * 启用状态
     */
    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * 注册时间
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberEntity)) return false;
        final MemberEntity other = (MemberEntity) o;
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
        return other instanceof MemberEntity;
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
        return "MemberEntity(id=" + this.getId() + ", levelId=" + this.getLevelId() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", nickname=" + this.getNickname() + ", mobile=" + this.getMobile() + ", email=" + this.getEmail() + ", header=" + this.getHeader() + ", gender=" + this.getGender() + ", birth=" + this.getBirth() + ", city=" + this.getCity() + ", job=" + this.getJob() + ", sign=" + this.getSign() + ", sourceType=" + this.getSourceType() + ", integration=" + this.getIntegration() + ", growth=" + this.getGrowth() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ")";
    }
}
