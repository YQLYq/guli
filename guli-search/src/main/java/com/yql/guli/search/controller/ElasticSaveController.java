package com.yql.guli.search.controller;

import com.yql.guli.common.exception.BizCodeEnume;
import com.yql.guli.common.to.es.SkuEsModel;
import com.yql.guli.common.utils.R;
import com.yql.guli.search.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RequestMapping("/search/save")
@RestController
public class ElasticSaveController {
    @Autowired
    private ProductService productService;

    /**
     * 上架
     * @author yql
     * @date 11:32 2023/5/17
     * @param
     * @return R
     **/
    @PostMapping("/product")
    public R productStatusUp(@RequestBody List<SkuEsModel> list){
        Boolean b = false;
        try {
            b = productService.productStatusUp(list);
        } catch (Exception e) {
            log.error("商品上架错误异常:{}",e);
            return  R.error(BizCodeEnume.PRODUCT_UP_EXCEPTION.getCode(), BizCodeEnume.PRODUCT_UP_EXCEPTION.getMsg());
        }
        if(b){
            return R.error(BizCodeEnume.PRODUCT_UP_EXCEPTION.getCode(), BizCodeEnume.PRODUCT_UP_EXCEPTION.getMsg());
        }else {
            return R.ok();
        }
    }


}
