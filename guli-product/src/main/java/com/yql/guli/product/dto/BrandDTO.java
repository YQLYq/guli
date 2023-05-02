package com.yql.guli.product.dto;

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

	@NotNull(message = "修改必须指定id")
    @Null(message = "新增不能指定id",payload = {})
	@ApiModelProperty(value = "品牌id")
	private Long brandId;

	@ApiModelProperty(value = "品牌名")
	@NotBlank(message = "品牌名必须提交")
	private String name;

	@ApiModelProperty(value = "品牌logo地址")
	@NotEmpty
	@URL(message = "logo必须是一个合法的url的地址")
	private String logo;

	@ApiModelProperty(value = "介绍")
	private String descript;

	@ApiModelProperty(value = "显示状态[0-不显示；1-显示]")
	private Integer showStatus;

	@ApiModelProperty(value = "检索首字母")
	//自定义 regexp 正则表达式
	@NotEmpty
	@Pattern(regexp = "/^[a-zA-Z]$/",message = "必须是a-z或者A-Z")
	private String firstLetter;

	@ApiModelProperty(value = "排序")
	@NotNull
	@Min(value = 0,message = "必须大于等于0")
	private Integer sort;


}