package com.yql.guli.ware.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Data
@ApiModel(value = "")
public class UndoLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "")
	private Long branchId;

	@ApiModelProperty(value = "")
	private String xid;

	@ApiModelProperty(value = "")
	private String context;

	@ApiModelProperty(value = "")
	private byte[] rollbackInfo;

	@ApiModelProperty(value = "")
	private Integer logStatus;

	@ApiModelProperty(value = "")
	private Date logCreated;

	@ApiModelProperty(value = "")
	private Date logModified;

	@ApiModelProperty(value = "")
	private String ext;


}