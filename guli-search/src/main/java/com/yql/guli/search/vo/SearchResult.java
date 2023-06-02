package com.yql.guli.search.vo;

import com.yql.guli.common.to.es.SkuEsModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
public class SearchResult {
    /**
     * 查询所有的商品信息
     * @author yql
     * @date 13:12 2023/5/24
     * @param 
     * @return 
     **/
    private List<SkuEsModel> product;
    /**
     * 当前页
     * @author yql
     * @date 13:56 2023/5/24
     * @param
     * @return
     **/
    private Integer pageNum;
    /**
     * 总记录数
     * @author yql
     * @date 13:56 2023/5/24
     * @param
     * @return
     **/
    private Long total;
    /**
     * 总页码
     * @author yql
     * @date 13:56 2023/5/24
     * @param
     * @return
     **/
    private Integer totalPages;
    /**
     * 所有的品牌的信息
     * @author yql
     * @date 16:44 2023/5/24
     * @param
     * @return
     **/
    private List<BrandVo> brands;
    /**
     * 所有属性
     * @author yql
     * @date 16:49 2023/5/24
     * @param 
     * @return 
     **/
    private List<AttrVo> attrs;
    /**
     * 所有分类
     * @author yql
     * @date 16:55 2023/5/24
     * @param
     * @return
     **/
    private List<CategoryVo> category;
    /**
     * 面包屑导航数据
     * @author yql
     * @date 21:30 2023/5/29
     * @param 
     * @return 
     **/
    private List<NavVo> navs = new ArrayList<>();
    /**
     * 存放查询的attrId
     */
    private List<Long> attrIds = new ArrayList<>();
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NavVo{
        private String navName;
        private String navValue;
        private String link;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public  static class BrandVo{
        private Long brandId;
        private String brandName;
        private String brandImg;
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AttrVo{
        private Long attrId;
        private String attrName;
        private List<String> attrValue;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CategoryVo {
        private Long categoryId;
        private String categoryName;
    }
}
