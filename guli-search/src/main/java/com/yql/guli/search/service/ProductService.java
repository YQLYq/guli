package com.yql.guli.search.service;

import com.yql.guli.common.to.es.AttrTo;
import com.yql.guli.common.to.es.SkuEsModel;
import com.yql.guli.common.utils.R;

import java.util.List;

public interface ProductService {
    /**
     * 上架
     * @author yql
     * @date 11:52 2023/5/17
     * @param 
     * @return void
     **/
    Boolean productStatusUp(List<SkuEsModel> list);
    /**
     * 删除spuId的相关的属性
     * @author yql
     * @date 22:08 2023/5/24
     * @param 
     * @return com.yql.guli.common.utils.R
     **/
    R productDeleteBySpuId(Long spuId);
    /**
     * 更新es的属性
     * @author yql
     * @date 22:51 2023/5/24
     * @param 
     * @return com.yql.guli.common.utils.R
     **/
    R productUpdateBySpuId(List<AttrTo> dto);
}
