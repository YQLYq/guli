package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.ProductAttrValueDTO;
import com.yql.guli.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;


/**
 * spu属性值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface ProductAttrValueService extends CrudService<ProductAttrValueEntity, ProductAttrValueDTO> {
    /**
     * 查询商品的规格参数
     * @param spuId
     * @return
     */
    List<ProductAttrValueEntity> getBaseGetListForSpu(Long spuId);

    void updateBySpuId(List<ProductAttrValueEntity> dto,Long spuId);

    /**
     * 根据spuId查询attr的信息
     * @param spuId 商品基本Id
     * @return 返回attr的名字和值
     */
    Map<Long,ProductAttrValueEntity> getAttrItemBySpuId(Long spuId);
}