package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.ware.dao.WareOrderTaskDao;
import com.yql.guli.ware.dto.WareOrderTaskDTO;
import com.yql.guli.ware.entity.WareOrderTaskEntity;
import com.yql.guli.ware.service.WareOrderTaskService;
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
public class WareOrderTaskServiceImpl extends CrudServiceImpl<WareOrderTaskDao, WareOrderTaskEntity, WareOrderTaskDTO> implements WareOrderTaskService {

    @Override
    public QueryWrapper<WareOrderTaskEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WareOrderTaskEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}