package com.yql.guli.ware.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.common.utils.R;
import com.yql.guli.ware.dto.PurchaseDTO;
import com.yql.guli.ware.entity.PurchaseEntity;
import com.yql.guli.ware.vo.DoneVo;
import com.yql.guli.ware.vo.MergeVo;

import java.util.Map;

/**
 * 采购信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public interface PurchaseService extends CrudService<PurchaseEntity, PurchaseDTO> {
    /**
     * 获取全部采购单
     * @author yql
     * @date 14:51 2023/5/13
     * @param 
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.ware.entity.PurchaseEntity>
     **/
    PageUtils<PurchaseEntity> getSkuInfo(Map<String, Object> params);
    /**
     * 获取没有领取的采购单
     * @author yql
     * @date 14:51 2023/5/13
     * @param 
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.ware.entity.PurchaseEntity>
     **/
    PageUtils<PurchaseEntity> getUnreceiveList(Map<String, Object> params);
    /**
     * 合并采购单
     * @author yql
     * @date 14:51 2023/5/13
     * @param 
     * @return void
     **/
    void saveMerge(MergeVo mergeVo);

    /**
     * 领取采购单
     *
     * @param
     * @return void
     * @author yql
     * @date 14:50 2023/5/13
     **/
    void getPurchaseOrder(Long[] purchId);
    /**
     * 完成采购单
     * @author yql
     * @date 14:51 2023/5/13
     * @param 
     * @return void
     **/
    R donePurChase(DoneVo doneVo);
}