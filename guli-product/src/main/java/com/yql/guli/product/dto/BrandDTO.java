package com.yql.guli.product.dto;

import com.yql.guli.common.validator.group.AddGroup;
import com.yql.guli.common.validator.group.ListValue;
import com.yql.guli.common.validator.group.UpdateGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.URL;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@ApiModel("品牌")
public class BrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //<editor-fold defaultstate="collapsed" desc="delombok">
    @NotNull(message = "修改必须指定id", groups = {UpdateGroup.class})
    @Null(message = "新增不能指定id", groups = {AddGroup.class})
    @ApiModelProperty("品牌id")
    private Long brandId;
    @ApiModelProperty("品牌名")
    @NotBlank(message = "品牌名必须提交", groups = {AddGroup.class, UpdateGroup.class})
    private String name;
    @ApiModelProperty("品牌logo地址")
    @NotEmpty(groups = {AddGroup.class})
    @URL(message = "logo必须是一个合法的url的地址", groups = {AddGroup.class, UpdateGroup.class})
    private String logo;
    @ApiModelProperty("介绍")
    private String descript;
    @ApiModelProperty("显示状态[0-不显示；1-显示]")
    @ListValue(vals = {0, 1}, groups = {AddGroup.class})
    private Integer showStatus;
    //自定义 regexp 正则表达式
    @ApiModelProperty("检索首字母")
    @NotEmpty(groups = {AddGroup.class})
    @Pattern(regexp = "^[a-zA-Z]$", message = "必须是a-z或者A-Z", groups = {AddGroup.class, UpdateGroup.class})
    private String firstLetter;
    @ApiModelProperty("排序")
    @NotNull(groups = {AddGroup.class})
    @Min(value = 0, message = "必须大于等于0", groups = {AddGroup.class, UpdateGroup.class})
    private Integer sort;
    //</editor-fold>

    @SuppressWarnings("all")
    public BrandDTO() {
    }

    @SuppressWarnings("all")
    public Long getBrandId() {
        return this.brandId;
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getLogo() {
        return this.logo;
    }

    @SuppressWarnings("all")
    public String getDescript() {
        return this.descript;
    }

    @SuppressWarnings("all")
    public Integer getShowStatus() {
        return this.showStatus;
    }

    @SuppressWarnings("all")
    public String getFirstLetter() {
        return this.firstLetter;
    }

    @SuppressWarnings("all")
    public Integer getSort() {
        return this.sort;
    }

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setLogo(final String logo) {
        this.logo = logo;
    }

    @SuppressWarnings("all")
    public void setDescript(final String descript) {
        this.descript = descript;
    }

    @SuppressWarnings("all")
    public void setShowStatus(final Integer showStatus) {
        this.showStatus = showStatus;
    }

    @SuppressWarnings("all")
    public void setFirstLetter(final String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @SuppressWarnings("all")
    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BrandDTO)) return false;
        final BrandDTO other = (BrandDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$showStatus = this.getShowStatus();
        final Object other$showStatus = other.getShowStatus();
        if (this$showStatus == null ? other$showStatus != null : !this$showStatus.equals(other$showStatus)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$logo = this.getLogo();
        final Object other$logo = other.getLogo();
        if (this$logo == null ? other$logo != null : !this$logo.equals(other$logo)) return false;
        final Object this$descript = this.getDescript();
        final Object other$descript = other.getDescript();
        if (this$descript == null ? other$descript != null : !this$descript.equals(other$descript)) return false;
        final Object this$firstLetter = this.getFirstLetter();
        final Object other$firstLetter = other.getFirstLetter();
        if (this$firstLetter == null ? other$firstLetter != null : !this$firstLetter.equals(other$firstLetter)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof BrandDTO;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $showStatus = this.getShowStatus();
        result = result * PRIME + ($showStatus == null ? 43 : $showStatus.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $logo = this.getLogo();
        result = result * PRIME + ($logo == null ? 43 : $logo.hashCode());
        final Object $descript = this.getDescript();
        result = result * PRIME + ($descript == null ? 43 : $descript.hashCode());
        final Object $firstLetter = this.getFirstLetter();
        result = result * PRIME + ($firstLetter == null ? 43 : $firstLetter.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "BrandDTO(brandId=" + this.getBrandId() + ", name=" + this.getName() + ", logo=" + this.getLogo() + ", descript=" + this.getDescript() + ", showStatus=" + this.getShowStatus() + ", firstLetter=" + this.getFirstLetter() + ", sort=" + this.getSort() + ")";
    }
    //</editor-fold>
}
