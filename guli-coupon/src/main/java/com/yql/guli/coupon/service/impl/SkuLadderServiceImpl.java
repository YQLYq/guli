package com.yql.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.coupon.dao.SkuLadderDao;
import com.yql.guli.coupon.dto.SkuLadderDTO;
import com.yql.guli.coupon.entity.SkuLadderEntity;
import com.yql.guli.coupon.service.SkuLadderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class SkuLadderServiceImpl extends CrudServiceImpl<SkuLadderDao, SkuLadderEntity, SkuLadderDTO> implements SkuLadderService {

    @Override
    public QueryWrapper<SkuLadderEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuLadderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}