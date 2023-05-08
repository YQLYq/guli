package com.yql.guli.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 订单配置信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("oms_order_setting")
public class OrderSettingEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 秒杀订单超时关闭时间(分)
     */
    private Integer flashOrderOvertime;
    /**
     * 正常订单超时时间(分)
     */
    private Integer normalOrderOvertime;
    /**
     * 发货后自动确认收货时间（天）
     */
    private Integer confirmOvertime;
    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    private Integer finishOvertime;
    /**
     * 订单完成后自动好评时间（天）
     */
    private Integer commentOvertime;
    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    private Integer memberLevel;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public OrderSettingEntity() {
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
     * 秒杀订单超时关闭时间(分)
     */
    @SuppressWarnings("all")
    public Integer getFlashOrderOvertime() {
        return this.flashOrderOvertime;
    }

    /**
     * 正常订单超时时间(分)
     */
    @SuppressWarnings("all")
    public Integer getNormalOrderOvertime() {
        return this.normalOrderOvertime;
    }

    /**
     * 发货后自动确认收货时间（天）
     */
    @SuppressWarnings("all")
    public Integer getConfirmOvertime() {
        return this.confirmOvertime;
    }

    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    @SuppressWarnings("all")
    public Integer getFinishOvertime() {
        return this.finishOvertime;
    }

    /**
     * 订单完成后自动好评时间（天）
     */
    @SuppressWarnings("all")
    public Integer getCommentOvertime() {
        return this.commentOvertime;
    }

    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    @SuppressWarnings("all")
    public Integer getMemberLevel() {
        return this.memberLevel;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 秒杀订单超时关闭时间(分)
     */
    @SuppressWarnings("all")
    public void setFlashOrderOvertime(final Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    /**
     * 正常订单超时时间(分)
     */
    @SuppressWarnings("all")
    public void setNormalOrderOvertime(final Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    /**
     * 发货后自动确认收货时间（天）
     */
    @SuppressWarnings("all")
    public void setConfirmOvertime(final Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    @SuppressWarnings("all")
    public void setFinishOvertime(final Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    /**
     * 订单完成后自动好评时间（天）
     */
    @SuppressWarnings("all")
    public void setCommentOvertime(final Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }

    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    @SuppressWarnings("all")
    public void setMemberLevel(final Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderSettingEntity)) return false;
        final OrderSettingEntity other = (OrderSettingEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$flashOrderOvertime = this.getFlashOrderOvertime();
        final Object other$flashOrderOvertime = other.getFlashOrderOvertime();
        if (this$flashOrderOvertime == null ? other$flashOrderOvertime != null : !this$flashOrderOvertime.equals(other$flashOrderOvertime)) return false;
        final Object this$normalOrderOvertime = this.getNormalOrderOvertime();
        final Object other$normalOrderOvertime = other.getNormalOrderOvertime();
        if (this$normalOrderOvertime == null ? other$normalOrderOvertime != null : !this$normalOrderOvertime.equals(other$normalOrderOvertime)) return false;
        final Object this$confirmOvertime = this.getConfirmOvertime();
        final Object other$confirmOvertime = other.getConfirmOvertime();
        if (this$confirmOvertime == null ? other$confirmOvertime != null : !this$confirmOvertime.equals(other$confirmOvertime)) return false;
        final Object this$finishOvertime = this.getFinishOvertime();
        final Object other$finishOvertime = other.getFinishOvertime();
        if (this$finishOvertime == null ? other$finishOvertime != null : !this$finishOvertime.equals(other$finishOvertime)) return false;
        final Object this$commentOvertime = this.getCommentOvertime();
        final Object other$commentOvertime = other.getCommentOvertime();
        if (this$commentOvertime == null ? other$commentOvertime != null : !this$commentOvertime.equals(other$commentOvertime)) return false;
        final Object this$memberLevel = this.getMemberLevel();
        final Object other$memberLevel = other.getMemberLevel();
        if (this$memberLevel == null ? other$memberLevel != null : !this$memberLevel.equals(other$memberLevel)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderSettingEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $flashOrderOvertime = this.getFlashOrderOvertime();
        result = result * PRIME + ($flashOrderOvertime == null ? 43 : $flashOrderOvertime.hashCode());
        final Object $normalOrderOvertime = this.getNormalOrderOvertime();
        result = result * PRIME + ($normalOrderOvertime == null ? 43 : $normalOrderOvertime.hashCode());
        final Object $confirmOvertime = this.getConfirmOvertime();
        result = result * PRIME + ($confirmOvertime == null ? 43 : $confirmOvertime.hashCode());
        final Object $finishOvertime = this.getFinishOvertime();
        result = result * PRIME + ($finishOvertime == null ? 43 : $finishOvertime.hashCode());
        final Object $commentOvertime = this.getCommentOvertime();
        result = result * PRIME + ($commentOvertime == null ? 43 : $commentOvertime.hashCode());
        final Object $memberLevel = this.getMemberLevel();
        result = result * PRIME + ($memberLevel == null ? 43 : $memberLevel.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderSettingEntity(id=" + this.getId() + ", flashOrderOvertime=" + this.getFlashOrderOvertime() + ", normalOrderOvertime=" + this.getNormalOrderOvertime() + ", confirmOvertime=" + this.getConfirmOvertime() + ", finishOvertime=" + this.getFinishOvertime() + ", commentOvertime=" + this.getCommentOvertime() + ", memberLevel=" + this.getMemberLevel() + ")";
    }
}
