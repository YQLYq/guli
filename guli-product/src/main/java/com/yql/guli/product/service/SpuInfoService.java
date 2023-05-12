package com.yql.guli.product.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.SpuInfoDTO;
import com.yql.guli.product.entity.SpuInfoEntity;
import com.yql.guli.product.vo.SpuInfoSaveVo;
import com.yql.guli.product.vo.SpuInfoVo;

import java.util.Map;


/**
 * spu信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface SpuInfoService extends CrudService<SpuInfoEntity, SpuInfoDTO> {
    /**
     * 新增商品
     * @author yql
     * @date 12:25 2023/5/11
     * @param 
     * @return void
     **/
    void saveInfoVo(SpuInfoSaveVo saveVo);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);

    PageUtils<SpuInfoVo> getSpuInfoList(Map<String, Object> params);
}