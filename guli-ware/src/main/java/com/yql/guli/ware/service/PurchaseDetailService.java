package com.yql.guli.ware.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.ware.dto.PurchaseDetailDTO;
import com.yql.guli.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public interface PurchaseDetailService extends CrudService<PurchaseDetailEntity, PurchaseDetailDTO> {

    PageUtils<PurchaseDetailEntity> getSkuInfo(Map<String, Object> params);

    void updateStatusToReceiveEByPurchId(Long id);
}