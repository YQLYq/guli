package com.yql.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员等级
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@TableName("ums_member_level")
public class MemberLevelEntity {
    //<editor-fold defaultstate="collapsed" desc="delombok">
    /**
     * id
     */
    private Long id;
    /**
     * 等级名称
     */
    private String name;
    /**
     * 等级需要的成长值
     */
    private Integer growthPoint;
    /**
     * 是否为默认等级[0->不是；1->是]
     */
    private Integer defaultStatus;
    /**
     * 免运费标准
     */
    private BigDecimal freeFreightPoint;
    /**
     * 每次评价获取的成长值
     */
    private Integer commentGrowthPoint;
    /**
     * 是否有免邮特权
     */
    private Integer priviledgeFreeFreight;
    /**
     * 是否有会员价格特权
     */
    private Integer priviledgeMemberPrice;
    /**
     * 是否有生日特权
     */
    private Integer priviledgeBirthday;
    /**
     * 备注
     */
    private String note;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public MemberLevelEntity() {
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
     * 等级名称
     */
    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    /**
     * 等级需要的成长值
     */
    @SuppressWarnings("all")
    public Integer getGrowthPoint() {
        return this.growthPoint;
    }

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    @SuppressWarnings("all")
    public Integer getDefaultStatus() {
        return this.defaultStatus;
    }

    /**
     * 免运费标准
     */
    @SuppressWarnings("all")
    public BigDecimal getFreeFreightPoint() {
        return this.freeFreightPoint;
    }

    /**
     * 每次评价获取的成长值
     */
    @SuppressWarnings("all")
    public Integer getCommentGrowthPoint() {
        return this.commentGrowthPoint;
    }

    /**
     * 是否有免邮特权
     */
    @SuppressWarnings("all")
    public Integer getPriviledgeFreeFreight() {
        return this.priviledgeFreeFreight;
    }

    /**
     * 是否有会员价格特权
     */
    @SuppressWarnings("all")
    public Integer getPriviledgeMemberPrice() {
        return this.priviledgeMemberPrice;
    }

    /**
     * 是否有生日特权
     */
    @SuppressWarnings("all")
    public Integer getPriviledgeBirthday() {
        return this.priviledgeBirthday;
    }

    /**
     * 备注
     */
    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    /**
     * id
     */
    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 等级名称
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 等级需要的成长值
     */
    @SuppressWarnings("all")
    public void setGrowthPoint(final Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    @SuppressWarnings("all")
    public void setDefaultStatus(final Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * 免运费标准
     */
    @SuppressWarnings("all")
    public void setFreeFreightPoint(final BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    /**
     * 每次评价获取的成长值
     */
    @SuppressWarnings("all")
    public void setCommentGrowthPoint(final Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    /**
     * 是否有免邮特权
     */
    @SuppressWarnings("all")
    public void setPriviledgeFreeFreight(final Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    /**
     * 是否有会员价格特权
     */
    @SuppressWarnings("all")
    public void setPriviledgeMemberPrice(final Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    /**
     * 是否有生日特权
     */
    @SuppressWarnings("all")
    public void setPriviledgeBirthday(final Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    /**
     * 备注
     */
    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberLevelEntity)) return false;
        final MemberLevelEntity other = (MemberLevelEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$growthPoint = this.getGrowthPoint();
        final Object other$growthPoint = other.getGrowthPoint();
        if (this$growthPoint == null ? other$growthPoint != null : !this$growthPoint.equals(other$growthPoint)) return false;
        final Object this$defaultStatus = this.getDefaultStatus();
        final Object other$defaultStatus = other.getDefaultStatus();
        if (this$defaultStatus == null ? other$defaultStatus != null : !this$defaultStatus.equals(other$defaultStatus)) return false;
        final Object this$commentGrowthPoint = this.getCommentGrowthPoint();
        final Object other$commentGrowthPoint = other.getCommentGrowthPoint();
        if (this$commentGrowthPoint == null ? other$commentGrowthPoint != null : !this$commentGrowthPoint.equals(other$commentGrowthPoint)) return false;
        final Object this$priviledgeFreeFreight = this.getPriviledgeFreeFreight();
        final Object other$priviledgeFreeFreight = other.getPriviledgeFreeFreight();
        if (this$priviledgeFreeFreight == null ? other$priviledgeFreeFreight != null : !this$priviledgeFreeFreight.equals(other$priviledgeFreeFreight)) return false;
        final Object this$priviledgeMemberPrice = this.getPriviledgeMemberPrice();
        final Object other$priviledgeMemberPrice = other.getPriviledgeMemberPrice();
        if (this$priviledgeMemberPrice == null ? other$priviledgeMemberPrice != null : !this$priviledgeMemberPrice.equals(other$priviledgeMemberPrice)) return false;
        final Object this$priviledgeBirthday = this.getPriviledgeBirthday();
        final Object other$priviledgeBirthday = other.getPriviledgeBirthday();
        if (this$priviledgeBirthday == null ? other$priviledgeBirthday != null : !this$priviledgeBirthday.equals(other$priviledgeBirthday)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$freeFreightPoint = this.getFreeFreightPoint();
        final Object other$freeFreightPoint = other.getFreeFreightPoint();
        if (this$freeFreightPoint == null ? other$freeFreightPoint != null : !this$freeFreightPoint.equals(other$freeFreightPoint)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof MemberLevelEntity;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $growthPoint = this.getGrowthPoint();
        result = result * PRIME + ($growthPoint == null ? 43 : $growthPoint.hashCode());
        final Object $defaultStatus = this.getDefaultStatus();
        result = result * PRIME + ($defaultStatus == null ? 43 : $defaultStatus.hashCode());
        final Object $commentGrowthPoint = this.getCommentGrowthPoint();
        result = result * PRIME + ($commentGrowthPoint == null ? 43 : $commentGrowthPoint.hashCode());
        final Object $priviledgeFreeFreight = this.getPriviledgeFreeFreight();
        result = result * PRIME + ($priviledgeFreeFreight == null ? 43 : $priviledgeFreeFreight.hashCode());
        final Object $priviledgeMemberPrice = this.getPriviledgeMemberPrice();
        result = result * PRIME + ($priviledgeMemberPrice == null ? 43 : $priviledgeMemberPrice.hashCode());
        final Object $priviledgeBirthday = this.getPriviledgeBirthday();
        result = result * PRIME + ($priviledgeBirthday == null ? 43 : $priviledgeBirthday.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $freeFreightPoint = this.getFreeFreightPoint();
        result = result * PRIME + ($freeFreightPoint == null ? 43 : $freeFreightPoint.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "MemberLevelEntity(id=" + this.getId() + ", name=" + this.getName() + ", growthPoint=" + this.getGrowthPoint() + ", defaultStatus=" + this.getDefaultStatus() + ", freeFreightPoint=" + this.getFreeFreightPoint() + ", commentGrowthPoint=" + this.getCommentGrowthPoint() + ", priviledgeFreeFreight=" + this.getPriviledgeFreeFreight() + ", priviledgeMemberPrice=" + this.getPriviledgeMemberPrice() + ", priviledgeBirthday=" + this.getPriviledgeBirthday() + ", note=" + this.getNote() + ")";
    }
}
