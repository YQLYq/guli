package com.yql.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.to.SpuBoundTo;
import com.yql.guli.coupon.dao.SpuBoundsDao;
import com.yql.guli.coupon.dto.SpuBoundsDTO;
import com.yql.guli.coupon.entity.SpuBoundsEntity;
import com.yql.guli.coupon.service.SpuBoundsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SpuBoundsServiceImpl extends CrudServiceImpl<SpuBoundsDao, SpuBoundsEntity, SpuBoundsDTO> implements SpuBoundsService {

    @Override
    public QueryWrapper<SpuBoundsEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuBoundsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public void saveSpuBound(SpuBoundTo spuBoundTo) {
        SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
        BeanUtils.copyProperties(spuBoundTo,spuBoundsEntity);
        this.save(spuBoundsEntity);
    }
}