package com.yql.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.coupon.dao.SeckillSkuNoticeDao;
import com.yql.guli.coupon.dto.SeckillSkuNoticeDTO;
import com.yql.guli.coupon.entity.SeckillSkuNoticeEntity;
import com.yql.guli.coupon.service.SeckillSkuNoticeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class SeckillSkuNoticeServiceImpl extends CrudServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity, SeckillSkuNoticeDTO> implements SeckillSkuNoticeService {

    @Override
    public QueryWrapper<SeckillSkuNoticeEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillSkuNoticeEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}