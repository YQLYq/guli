package com.yql.guli.search;

import com.alibaba.fastjson2.JSON;
import com.yql.guli.search.conf.GuliElasticSearchConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@NoArgsConstructor
@Data
@SpringBootTest

class GuliSearchApplicationTests {
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    @Test
     void indexDexe() throws Exception{
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1"); //索引
        // indexRequest.source("userName","张三","age",18,"gender","男");
        User user = new User("张三","男",123);
        String s = JSON.toJSONString(user);
        indexRequest.source(s, XContentType.JSON);
        IndexResponse index = restHighLevelClient.index(indexRequest, GuliElasticSearchConfig.COMMON_OPTIONS);
        System.out.println("结果"+index);
    }
    @Test
    void searchTest() throws Exception{
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("bank"); //索引
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("address","mill")); //查询

        TermsAggregationBuilder size = AggregationBuilders.terms("ageAVG").field("age").size(10); //聚合
        searchSourceBuilder.aggregation(size);

        AvgAggregationBuilder field = AggregationBuilders.avg("balanceAVg").field("balance");
        searchSourceBuilder.aggregation(field);
        System.out.println("查询字段"+searchSourceBuilder.toString());
        searchRequest.source(searchSourceBuilder);

        SearchResponse search = restHighLevelClient.search(searchRequest, GuliElasticSearchConfig.COMMON_OPTIONS);
        SearchHits hits = search.getHits();
        SearchHit[] hits1 = hits.getHits();
        for (SearchHit documentFields : hits1) {
            String sourceAsString = documentFields.getSourceAsString();
            AccountHits accountHits = JSON.parseObject(sourceAsString, AccountHits.class);
            System.out.println(accountHits);
        }
        Aggregations aggregations = search.getAggregations();
        Terms ageAVG = aggregations.get("ageAVG");
        for (Terms.Bucket bucket : ageAVG.getBuckets()) {
            Number keyAsNumber = bucket.getKeyAsNumber();
            System.out.println(keyAsNumber);
        }
    }
    @Data
    @AllArgsConstructor
    class User{
        private String userName;
        private String gender;
        private Integer age;
    }
    @Test
    void contextLoads() {

    }
    @NoArgsConstructor
    @Data
    class AccountHits{

        /**
         * accountNumber
         */
        private Integer accountNumber;
        /**
         * balance
         */
        private Integer balance;
        /**
         * firstname
         */
        private String firstname;
        /**
         * lastname
         */
        private String lastname;
        /**
         * age
         */
        private Integer age;
        /**
         * gender
         */
        private String gender;
        /**
         * address
         */
        private String address;
        /**
         * employer
         */
        private String employer;
        /**
         * email
         */
        private String email;
        /**
         * city
         */
        private String city;
        /**
         * state
         */
        private String state;
    }
}
