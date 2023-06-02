package com.yql.guli.product.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.common.utils.Result;
import com.yql.guli.product.dto.SkuInfoDTO;
import com.yql.guli.product.entity.SkuInfoEntity;
import com.yql.guli.product.vo.SkuItemVo;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface SkuInfoService extends CrudService<SkuInfoEntity, SkuInfoDTO> {

    PageUtils<SkuInfoEntity> getSkuInfo(Map<String, Object> params);

    List<SkuInfoEntity> getSkusBySpuId(Long spuId);

    /**
     *
     * @param skuId 商品skuId
     * @return 返回商品的全部信息
     */
    Result<SkuItemVo> getProductDetailsInformation(Long skuId);
}