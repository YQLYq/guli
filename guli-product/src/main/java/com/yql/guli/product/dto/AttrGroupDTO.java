package com.yql.guli.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Data
@ApiModel(value = "属性分组")
public class AttrGroupDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "分组id")
	private Long attrGroupId;

	@ApiModelProperty(value = "组名")
	private String attrGroupName;

	@ApiModelProperty(value = "排序")
	private Integer sort;

	@ApiModelProperty(value = "描述")
	private String descript;

	@ApiModelProperty(value = "组图标")
	private String icon;

	@ApiModelProperty(value = "所属分类id")
	private Long catelogId;


}