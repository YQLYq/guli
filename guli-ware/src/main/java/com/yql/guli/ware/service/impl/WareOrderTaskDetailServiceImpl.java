package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.ware.dao.WareOrderTaskDetailDao;
import com.yql.guli.ware.dto.WareOrderTaskDetailDTO;
import com.yql.guli.ware.entity.WareOrderTaskDetailEntity;
import com.yql.guli.ware.service.WareOrderTaskDetailService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class WareOrderTaskDetailServiceImpl extends CrudServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity, WareOrderTaskDetailDTO> implements WareOrderTaskDetailService {

    @Override
    public QueryWrapper<WareOrderTaskDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WareOrderTaskDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}