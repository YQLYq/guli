package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * spu信息介绍
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Data
public class SpuInfoDescExcel {
    @Excel(name = "商品id")
    private Long spuId;
    @Excel(name = "商品介绍")
    private String decript;

}