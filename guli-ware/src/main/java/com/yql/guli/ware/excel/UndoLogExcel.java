package com.yql.guli.ware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Data
public class UndoLogExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "")
    private Long branchId;
    @Excel(name = "")
    private String xid;
    @Excel(name = "")
    private String context;
    @Excel(name = "")
    private byte[] rollbackInfo;
    @Excel(name = "")
    private Integer logStatus;
    @Excel(name = "")
    private Date logCreated;
    @Excel(name = "")
    private Date logModified;
    @Excel(name = "")
    private String ext;

}