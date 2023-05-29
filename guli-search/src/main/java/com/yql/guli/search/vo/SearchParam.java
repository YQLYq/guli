package com.yql.guli.search.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchParam {
    /**
     * 分类id
     **/
    private Long category3Id;
    /**
     * 关键字
     * @author yql
     * @date 12:01 2023/5/24
     * @param 
     * @return 
     **/
    private String keyword;
    /**
     * 排序条件 SaleCount_asc/desc 销量
     * SkuPrice_asc/desc 价格
     * hotScore_asc/desc 热度
     * @author yql
     * @date 12:11 2023/5/24
     * @param
     * @return
     **/
    private String sort;
    /**
     * 是否有货
     * @author yql
     * @date 12:12 2023/5/24
     * @param
     * @return
     **/
    private Integer hasStock;
    /**
     * 价格区间查询
     * @author yql
     * @date 12:13 2023/5/24
     * @param
     * @return
     **/
    private String skuPrice;
    /**
     * 查询品牌id
     * @author yql
     * @date 12:13 2023/5/24
     * @param
     * @return
     **/
    private List<Long> brandId;
    /**
     * 属性刷选
     * @author yql
     * @date 12:19 2023/5/24
     * @param 
     * @return 
     **/
    private List<String> attrs;
    /**
     * 页码
     * @author yql
     * @date 12:36 2023/5/24
     * @param 
     * @return 
     **/
    private Integer pageNum;
}
