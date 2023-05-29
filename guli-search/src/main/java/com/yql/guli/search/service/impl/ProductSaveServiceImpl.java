package com.yql.guli.search.service.impl;

import com.alibaba.fastjson2.JSON;
import com.yql.guli.common.to.es.AttrTo;
import com.yql.guli.common.to.es.SkuEsModel;
import com.yql.guli.common.utils.R;
import com.yql.guli.search.conf.GuliElasticSearchConfig;
import com.yql.guli.search.constant.EsConstant;
import com.yql.guli.search.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductSaveServiceImpl implements ProductService {
    @Autowired
    RestHighLevelClient restHighLevelClient;




    /**
     * 上架
     *
     * @param list
     * @return void
     * @author yql
     * @date 11:47 2023/5/17
     **/
    @Override
    public Boolean productStatusUp(List<SkuEsModel> list){
        BulkRequest bulkRequest = new BulkRequest();
        for (SkuEsModel skuEsModel : list) {
            IndexRequest indexRequest = new IndexRequest(EsConstant.PRODUCT_INDEX);
            indexRequest.id(skuEsModel.getSkuId().toString());
            String s = JSON.toJSONString(skuEsModel);
            indexRequest.source(s, XContentType.JSON);
            bulkRequest.add(indexRequest);
        }
        BulkResponse bulk = null;
        boolean b = false;
        List<String> collect = null;
        try {
             bulk = restHighLevelClient.bulk(bulkRequest, GuliElasticSearchConfig.COMMON_OPTIONS);
             b = bulk.hasFailures();
             collect = Arrays.stream(bulk.getItems()).map(BulkItemResponse::getId).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("商品上架错误:{}",collect);
        return b;
    }

    /**
     * 删除spuId的相关的属性
     *
     * @param spuId
     * @return com.yql.guli.common.utils.R
     * @author yql
     * @date 21:14 2023/5/24
     **/
    @Override
    public R productDeleteBySpuId(Long spuId) {
        DeleteRequest request = new DeleteRequest(
                EsConstant.PRODUCT_INDEX,
                spuId.toString());
        try {
            restHighLevelClient.delete(request, GuliElasticSearchConfig.COMMON_OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
            return R.error();
        }
        return R.ok();
    }


    /**
     * 更新es的属性
     *
     * @param dto
     * @param
     * @return com.yql.guli.common.utils.R
     * @author yql
     * @date 22:36 2023/5/24
     **/
    @Override
    public R productUpdateBySpuId(List<AttrTo> dto) {
        return R.ok();
    }
}
