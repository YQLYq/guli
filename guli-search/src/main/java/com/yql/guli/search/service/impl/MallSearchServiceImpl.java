package com.yql.guli.search.service.impl;

import com.alibaba.fastjson2.JSON;
import com.yql.guli.common.to.es.SkuEsModel;
import com.yql.guli.search.conf.GuliElasticSearchConfig;
import com.yql.guli.search.constant.EsConstant;
import com.yql.guli.search.service.MallSearchService;
import com.yql.guli.search.vo.SearchParam;
import com.yql.guli.search.vo.SearchResult;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.MultiBucketsAggregation;
import org.elasticsearch.search.aggregations.bucket.nested.NestedAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.nested.ParsedNested;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedLongTerms;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedStringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MallSearchServiceImpl implements MallSearchService {
    @Autowired
    private RestHighLevelClient client;

    /**
     * 索引key 或者 分类
     *
     * @param searchParam
     * @return java.lang.Object
     * @author yql
     * @date 11:39 2023/5/24
     **/
    @Override
    public SearchResult search(SearchParam searchParam) {
        SearchResult result = null;
        SearchRequest searchRequest = buildSearchRequset(searchParam);
        try {
            SearchResponse search = client.search(searchRequest, GuliElasticSearchConfig.COMMON_OPTIONS);
            result = buildSearchResult(search, searchParam);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 处理返回数据
     *
     * @param
     * @return com.yql.guli.search.vo.SearchResult
     * @author yql
     * @date 21:56 2023/5/25
     **/
    private SearchResult buildSearchResult(SearchResponse search, SearchParam searchParam) {
        SearchResult searchResult = new SearchResult();
        SearchHits hits = search.getHits();
        long value = hits.getTotalHits().value;
        List<SkuEsModel> skuEsModelList = new ArrayList<>();
        //总记录数
        searchResult.setTotal(value);
        //页码
        if (searchParam.getPageNum() == null){
            searchResult.setPageNum(1);
        }else {
            searchResult.setPageNum(searchParam.getPageNum());
        }
        //总页码
        int totalPages = Math.toIntExact(value % EsConstant.PRODUCT_PAGESIZE == 0 ? value / EsConstant.PRODUCT_PAGESIZE : (value / EsConstant.PRODUCT_PAGESIZE) + 1);
        searchResult.setTotalPages(totalPages);

        //商品
        SearchHit[] searchHits = hits.getHits();
        if (searchHits != null && searchHits.length > 0) {
            for (SearchHit searchHit : searchHits) {
                String sourceAsString = searchHit.getSourceAsString();
                SkuEsModel skuEsModel = JSON.parseObject(sourceAsString, SkuEsModel.class);
                Map<String, HighlightField> highlightFields = searchHit.getHighlightFields();
                if (highlightFields != null && highlightFields.size() > 0) {
                    skuEsModel.setSkuTitle(highlightFields.get("skuTitle").getFragments()[0].string());
                }
                skuEsModelList.add(skuEsModel);
            }
        }
        searchResult.setProduct(skuEsModelList);
        //商品的规格属性 从聚合获取
        List<SearchResult.AttrVo> attrVos = new ArrayList<>();
        ParsedNested attr_agg = search.getAggregations().get("attr_agg");
        ParsedLongTerms attr_id_agg = attr_agg.getAggregations().get("attr_id_agg");
        List<? extends Terms.Bucket> attrIdAggBuckets = attr_id_agg.getBuckets();
        for (Terms.Bucket attrIdAggBucket : attrIdAggBuckets) {
            SearchResult.AttrVo attrVo = new SearchResult.AttrVo();
            attrVo.setAttrId(attrIdAggBucket.getKeyAsNumber().longValue());
            ParsedStringTerms attrValue_aggs = attrIdAggBucket.getAggregations().get("attrValue_aggs");
            ParsedStringTerms attrName_aggs = attrIdAggBucket.getAggregations().get("attrName_aggs");
            attrVo.setAttrName(attrName_aggs.getBuckets().get(0).getKeyAsString());
            List<? extends Terms.Bucket> buckets = attrValue_aggs.getBuckets();
            List<String> attrValueList = buckets.stream().map(MultiBucketsAggregation.Bucket::getKeyAsString).collect(Collectors.toList());
            attrVo.setAttrValue(attrValueList);
            attrVos.add(attrVo);
        }
        searchResult.setAttrs(attrVos);
        //品牌属性
        List<SearchResult.BrandVo> brandVos = new ArrayList<>();
        ParsedLongTerms brand_agg = search.getAggregations().get("brand_agg");
        List<? extends Terms.Bucket> brandBuckets = brand_agg.getBuckets();
        for (Terms.Bucket brandBucket : brandBuckets) {
            SearchResult.BrandVo brandVo = new SearchResult.BrandVo();
            brandVo.setBrandId(brandBucket.getKeyAsNumber().longValue());
            ParsedStringTerms brand_name_agg = brandBucket.getAggregations().get("brand_name_agg");
            brandVo.setBrandName(brand_name_agg.getBuckets().get(0).getKeyAsString());
            ParsedStringTerms brand_img_agg = brandBucket.getAggregations().get("brand_img_agg");
            brandVo.setBrandImg(brand_img_agg.getBuckets().get(0).getKeyAsString());
            brandVos.add(brandVo);
        }
        searchResult.setBrands(brandVos);
        //分类属性
        List<SearchResult.CategoryVo> catelogVos = new ArrayList<>();
        ParsedLongTerms category_agg = search.getAggregations().get("category_agg");
        List<? extends Terms.Bucket> buckets = category_agg.getBuckets();
        for (Terms.Bucket bucket : buckets) {
            SearchResult.CategoryVo categoryVo = new SearchResult.CategoryVo();
            categoryVo.setCategoryId(bucket.getKeyAsNumber().longValue());
            ParsedStringTerms categoryName_agg = bucket.getAggregations().get("categoryName_agg");
            String keyAsString = categoryName_agg.getBuckets().get(0).getKeyAsString();
            categoryVo.setCategoryName(keyAsString);
            catelogVos.add(categoryVo);
        }
        searchResult.setCategory(catelogVos);
        return searchResult;

    }

    /**
     * 拼接查询
     *
     * @param
     * @return org.elasticsearch.action.search.SearchRequest
     * @author yql
     * @date 21:55 2023/5/25
     **/
    private SearchRequest buildSearchRequset(SearchParam searchParam) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        //1.模糊查询 过滤（属性，分类，品牌，价格区间，库存）
        if (StringUtils.hasLength(searchParam.getKeyword())) {
            boolQueryBuilder.must(QueryBuilders.matchQuery("skuTitle", searchParam.getKeyword()));
        }
        //1.1过滤 分类id
        if (searchParam.getCategory3Id() != null) {
            boolQueryBuilder.filter(QueryBuilders.termQuery("categoryId", searchParam.getCategory3Id()));
        }
        //1.2过滤品牌
        if (searchParam.getBrandId() != null && !searchParam.getBrandId().isEmpty()) {
            boolQueryBuilder.filter(QueryBuilders.termsQuery("brandId", searchParam.getBrandId()));
        }
        //1.3过滤商品属性
        if (searchParam.getAttrs() != null) {
            //attrs=1_5寸:8寸&attrs=2_16G:8G
            for (String attr : searchParam.getAttrs()) {
                BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
                String[] s = attr.split("_");
                String attrId = s[0];
                String[] attrValues = s[1].split(":");
                queryBuilder.must(QueryBuilders.termQuery("attrs.attrId", attrId));
                queryBuilder.must(QueryBuilders.termsQuery("attrs.attrValue", attrValues));
                boolQueryBuilder.filter(QueryBuilders.nestedQuery("attrs", queryBuilder, ScoreMode.None));
            }
        }
        //1.4过滤是否有货
        if (searchParam.getHasStock() != null) {
            boolQueryBuilder.filter(QueryBuilders.termQuery("hasStock", searchParam.getHasStock() == 1));
        }
        if (searchParam.getSkuPrice() != null) {
            //价格 1_500/_500/500_
            RangeQueryBuilder skuPrice = QueryBuilders.rangeQuery("skuPrice");
            String[] s = searchParam.getSkuPrice().split("_");
            if (s.length == 2) {
                skuPrice.gte(s[0]).lte(s[1]);
            } else if (s.length == 1) {
                if (searchParam.getSkuPrice().startsWith("_")) {
                    skuPrice.lte(s[0]);
                }
                if (searchParam.getSkuPrice().endsWith("_")) {
                    skuPrice.gte(s[0]);
                }
            }

            boolQueryBuilder.filter(skuPrice);
        }
        searchSourceBuilder.query(boolQueryBuilder);
        //2排序，分页，高亮
        //2.1 排序 saleCount_desc/asc priceCount_desc
        if (searchParam.getSort() != null) {
            String[] s = searchParam.getSort().split("_");
            searchSourceBuilder.sort(s[0], s[1].equalsIgnoreCase("desc") ? SortOrder.DESC : SortOrder.ASC);
        }
        //2.2 分页

        if (searchParam.getPageNum() != null) {
            searchSourceBuilder.from((searchParam.getPageNum() - 1) * EsConstant.PRODUCT_PAGESIZE);
        } else {
            searchSourceBuilder.from(0);
        }
        searchSourceBuilder.size(EsConstant.PRODUCT_PAGESIZE);
        //2.3高亮
        if (searchParam.getKeyword() != null) {
            HighlightBuilder highlightBuilder = new HighlightBuilder();
            highlightBuilder.field("skuTitle");
            highlightBuilder.preTags("<b style='color:red'>");
            highlightBuilder.postTags("</b>");
            searchSourceBuilder.highlighter(highlightBuilder);
        }
        //聚合分析
        TermsAggregationBuilder brand_agg = AggregationBuilders.terms("brand_agg").field("brandId")
                .subAggregation(AggregationBuilders.terms("brand_name_agg").field("brandName")).subAggregation(AggregationBuilders.terms("brand_img_agg").field("brandImg"));
        searchSourceBuilder.aggregation(brand_agg);
        TermsAggregationBuilder catelog_agg = AggregationBuilders.terms("category_agg").field("categoryId").subAggregation(AggregationBuilders.terms("categoryName_agg").field("categoryName.keyword"));
        searchSourceBuilder.aggregation(catelog_agg);
        NestedAggregationBuilder attr_aggs = AggregationBuilders.nested("attr_agg", "attrs").subAggregation(AggregationBuilders.terms("attr_id_agg").field("attrs.attrId").subAggregation(AggregationBuilders.terms("attrName_aggs").field("attrs.attrName")).subAggregation(AggregationBuilders.terms("attrValue_aggs").field("attrs.attrValue")));
        searchSourceBuilder.aggregation(attr_aggs);
        return new SearchRequest(new String[]{EsConstant.PRODUCT_INDEX}, searchSourceBuilder);

    }
}
