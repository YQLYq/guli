package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.ware.dao.PurchaseDetailDao;
import com.yql.guli.ware.dto.PurchaseDetailDTO;
import com.yql.guli.ware.entity.PurchaseDetailEntity;
import com.yql.guli.ware.service.PurchaseDetailService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class PurchaseDetailServiceImpl extends CrudServiceImpl<PurchaseDetailDao, PurchaseDetailEntity, PurchaseDetailDTO> implements PurchaseDetailService {

    @Override
    public QueryWrapper<PurchaseDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PurchaseDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}