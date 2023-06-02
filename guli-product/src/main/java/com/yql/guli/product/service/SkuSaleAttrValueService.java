package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.SkuSaleAttrValueDTO;
import com.yql.guli.product.entity.SkuSaleAttrValueEntity;
import com.yql.guli.product.vo.SkuItemSaleAttrVo;

import java.util.List;


/**
 * sku销售属性&值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface SkuSaleAttrValueService extends CrudService<SkuSaleAttrValueEntity, SkuSaleAttrValueDTO> {
    /**
     * 查询spuId对应的所有销售属性
     * @param spuId 商品Id
     * @return 返回全部的销售属性
     */
    List<SkuItemSaleAttrVo> getSpuSaleWithAttrBySpuId(Long spuId);
}