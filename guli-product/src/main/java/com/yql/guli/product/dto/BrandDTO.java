package com.yql.guli.product.dto;

import com.yql.guli.common.validator.group.AddGroup;
import com.yql.guli.common.validator.group.ListValue;
import com.yql.guli.common.validator.group.UpdateGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;


/**
 * 品牌
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Data
@ApiModel(value = "品牌")
public class BrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@NotNull(message = "修改必须指定id",groups = {UpdateGroup.class})
    @Null(message = "新增不能指定id",groups = {AddGroup.class})
	@ApiModelProperty(value = "品牌id")
	private Long brandId;

	@ApiModelProperty(value = "品牌名")
	@NotBlank(message = "品牌名必须提交",groups = {AddGroup.class,UpdateGroup.class})
	private String name;

	@ApiModelProperty(value = "品牌logo地址")

	@NotEmpty(groups = {AddGroup.class})
	@URL(message = "logo必须是一个合法的url的地址", groups = {AddGroup.class, UpdateGroup.class})
	private String logo;

	@ApiModelProperty(value = "介绍")
	private String descript;

	@ApiModelProperty(value = "显示状态[0-不显示；1-显示]")
	@ListValue(vals={0,1},groups = {AddGroup.class})
	private Integer showStatus;

	@ApiModelProperty(value = "检索首字母")
	//自定义 regexp 正则表达式
	@NotEmpty(groups = {AddGroup.class})
	@Pattern(regexp = "^[a-zA-Z]$",message = "必须是a-z或者A-Z", groups = {AddGroup.class, UpdateGroup.class})
	private String firstLetter;

	@ApiModelProperty(value = "排序")
	@NotNull(groups = {AddGroup.class})
	@Min(value = 0,message = "必须大于等于0", groups = {AddGroup.class, UpdateGroup.class})
	private Integer sort;


}