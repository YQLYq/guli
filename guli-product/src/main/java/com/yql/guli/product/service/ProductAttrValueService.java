package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.ProductAttrValueDTO;
import com.yql.guli.product.entity.ProductAttrValueEntity;

import java.util.List;


/**
 * spu属性值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface ProductAttrValueService extends CrudService<ProductAttrValueEntity, ProductAttrValueDTO> {

    List<ProductAttrValueEntity> getBaseGetListForSpu(Long spuId);

    void updateBySpuId(List<ProductAttrValueEntity> dto,Long spuId);
}