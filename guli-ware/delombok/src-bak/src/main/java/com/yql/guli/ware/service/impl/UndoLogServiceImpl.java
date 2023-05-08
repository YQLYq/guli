package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.ware.dao.UndoLogDao;
import com.yql.guli.ware.dto.UndoLogDTO;
import com.yql.guli.ware.entity.UndoLogEntity;
import com.yql.guli.ware.service.UndoLogService;
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
public class UndoLogServiceImpl extends CrudServiceImpl<UndoLogDao, UndoLogEntity, UndoLogDTO> implements UndoLogService {

    @Override
    public QueryWrapper<UndoLogEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UndoLogEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}