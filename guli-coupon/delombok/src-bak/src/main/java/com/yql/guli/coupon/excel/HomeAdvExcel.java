package com.yql.guli.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.util.Date;

/**
 * 首页轮播广告
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public class HomeAdvExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "名字")
    private String name;
    @Excel(name = "图片地址")
    private String pic;
    @Excel(name = "开始时间")
    private Date startTime;
    @Excel(name = "结束时间")
    private Date endTime;
    @Excel(name = "状态")
    private Integer status;
    @Excel(name = "点击数")
    private Integer clickCount;
    @Excel(name = "广告详情连接地址")
    private String url;
    @Excel(name = "备注")
    private String note;
    @Excel(name = "排序")
    private Integer sort;
    @Excel(name = "发布者")
    private Long publisherId;
    @Excel(name = "审核者")
    private Long authId;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public HomeAdvExcel() {
    }

    @SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getPic() {
        return this.pic;
    }

    @SuppressWarnings("all")
    public Date getStartTime() {
        return this.startTime;
    }

    @SuppressWarnings("all")
    public Date getEndTime() {
        return this.endTime;
    }

    @SuppressWarnings("all")
    public Integer getStatus() {
        return this.status;
    }

    @SuppressWarnings("all")
    public Integer getClickCount() {
        return this.clickCount;
    }

    @SuppressWarnings("all")
    public String getUrl() {
        return this.url;
    }

    @SuppressWarnings("all")
    public String getNote() {
        return this.note;
    }

    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    @SuppressWarnings("all")
    public Long getPublisherId() {
        return this.publisherId;
    }

    @SuppressWarnings("all")
    public Long getAuthId() {
        return this.authId;
    }

    @SuppressWarnings("all")
    public void setId(final Long id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setPic(final String pic) {
        this.pic = pic;
    }

    @SuppressWarnings("all")
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    @SuppressWarnings("all")
    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    @SuppressWarnings("all")
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @SuppressWarnings("all")
    public void setClickCount(final Integer clickCount) {
        this.clickCount = clickCount;
    }

    @SuppressWarnings("all")
    public void setUrl(final String url) {
        this.url = url;
    }

    @SuppressWarnings("all")
    public void setNote(final String note) {
        this.note = note;
    }

    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    @SuppressWarnings("all")
    public void setPublisherId(final Long publisherId) {
        this.publisherId = publisherId;
    }

    @SuppressWarnings("all")
    public void setAuthId(final Long authId) {
        this.authId = authId;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HomeAdvExcel)) return false;
        final HomeAdvExcel other = (HomeAdvExcel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$clickCount = this.getClickCount();
        final Object other$clickCount = other.getClickCount();
        if (this$clickCount == null ? other$clickCount != null : !this$clickCount.equals(other$clickCount)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$publisherId = this.getPublisherId();
        final Object other$publisherId = other.getPublisherId();
        if (this$publisherId == null ? other$publisherId != null : !this$publisherId.equals(other$publisherId)) return false;
        final Object this$authId = this.getAuthId();
        final Object other$authId = other.getAuthId();
        if (this$authId == null ? other$authId != null : !this$authId.equals(other$authId)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$pic = this.getPic();
        final Object other$pic = other.getPic();
        if (this$pic == null ? other$pic != null : !this$pic.equals(other$pic)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof HomeAdvExcel;
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
        final Object $clickCount = this.getClickCount();
        result = result * PRIME + ($clickCount == null ? 43 : $clickCount.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $publisherId = this.getPublisherId();
        result = result * PRIME + ($publisherId == null ? 43 : $publisherId.hashCode());
        final Object $authId = this.getAuthId();
        result = result * PRIME + ($authId == null ? 43 : $authId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $pic = this.getPic();
        result = result * PRIME + ($pic == null ? 43 : $pic.hashCode());
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "HomeAdvExcel(id=" + this.getId() + ", name=" + this.getName() + ", pic=" + this.getPic() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", status=" + this.getStatus() + ", clickCount=" + this.getClickCount() + ", url=" + this.getUrl() + ", note=" + this.getNote() + ", sort=" + this.getSort() + ", publisherId=" + this.getPublisherId() + ", authId=" + this.getAuthId() + ")";
    }
    //</editor-fold>
}
