package com.yql.guli.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 
     */
	private Long assigneeId;
    /**
     * 
     */
	private String assigneeName;
    /**
     * 
     */
	private String phone;
    /**
     * 
     */
	private Integer priority;
    /**
     * 
     */
	private Integer status;
    /**
     * 
     */
	private Long wareId;
    /**
     * 
     */
	private BigDecimal amount;
    /**
     * 
     */
	private Date createTime;
    /**
     * 
     */
	private Date updateTime;
}