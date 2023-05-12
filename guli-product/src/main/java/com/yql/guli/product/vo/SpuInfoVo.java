package com.yql.guli.product.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Data
public class SpuInfoVo {
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * brandName
     */
    private String brandName;
    /**
     * 分类id
     */
    private Long catalogId;
    /**
     * catalogName
     */
    private String catalogName;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM - dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 商品id
     */
    private Long id;
    /**
     * 发布状态
     */
    private Integer publishStatus;
    /**
     * 商品描述
     */
    private String spuDescription;
    /**
     * 商品名字
     */
    private String spuName;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy - MM - dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    /**
     * 重量
     */
    private BigDecimal weight;
}
