package com.yql.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.coupon.dao.SeckillSessionDao;
import com.yql.guli.coupon.dto.SeckillSessionDTO;
import com.yql.guli.coupon.entity.SeckillSessionEntity;
import com.yql.guli.coupon.service.SeckillSessionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class SeckillSessionServiceImpl extends CrudServiceImpl<SeckillSessionDao, SeckillSessionEntity, SeckillSessionDTO> implements SeckillSessionService {

    @Override
    public QueryWrapper<SeckillSessionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillSessionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}