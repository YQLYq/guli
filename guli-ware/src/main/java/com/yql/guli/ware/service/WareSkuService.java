package com.yql.guli.ware.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.common.to.SkuHasStockVo;
import com.yql.guli.common.utils.R;
import com.yql.guli.ware.dto.WareSkuDTO;
import com.yql.guli.ware.entity.PurchaseDetailEntity;
import com.yql.guli.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public interface WareSkuService extends CrudService<WareSkuEntity, WareSkuDTO> {

    PageUtils<WareSkuDTO> getSkuInfo(Map<String, Object> params);

    public R saveAndOpinion(WareSkuDTO dto);
    /**
     * 添加库存
     * @author yql
     * @date 16:11 2023/5/13
     * @param 
     * @return void
     **/
    void addStock(List<PurchaseDetailEntity> purchaseDetailEntityList);
    /**
     * 判断是否有库存
     * @author yql
     * @date 22:06 2023/5/16
     * @param 
     * @return java.util.List<com.yql.guli.common.to.SkuHasStockVo>
     **/
    List<SkuHasStockVo> getSkuHashStock(List<Long> skuIds);
}