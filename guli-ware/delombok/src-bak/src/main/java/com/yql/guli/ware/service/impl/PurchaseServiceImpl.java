package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.ware.dao.PurchaseDao;
import com.yql.guli.ware.dto.PurchaseDTO;
import com.yql.guli.ware.entity.PurchaseEntity;
import com.yql.guli.ware.service.PurchaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 采购信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class PurchaseServiceImpl extends CrudServiceImpl<PurchaseDao, PurchaseEntity, PurchaseDTO> implements PurchaseService {

    @Override
    public QueryWrapper<PurchaseEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PurchaseEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}