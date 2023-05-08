package com.yql.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 秒杀活动场次
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("sms_seckill_session")
public class SeckillSessionEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 场次名称
     */
    private String name;
    /**
     * 每日开始时间
     */
    private Date startTime;
    /**
     * 每日结束时间
     */
    private Date endTime;
    /**
     * 启用状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public SeckillSessionEntity() {
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
     * 场次名称
     */
    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    /**
     * 每日开始时间
     */
    @SuppressWarnings("all")
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * 每日结束时间
     */
    @SuppressWarnings("all")
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * 启用状态
     */
    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 创建时间
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
     * 场次名称
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 每日开始时间
     */
    @SuppressWarnings("all")
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 每日结束时间
     */
    @SuppressWarnings("all")
    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 启用状态
     */
    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     */
    @SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillSessionEntity)) return false;
        final SeckillSessionEntity other = (SeckillSessionEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof SeckillSessionEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "SeckillSessionEntity(id=" + this.getId() + ", name=" + this.getName() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ")";
    }
}
