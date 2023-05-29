package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.product.dao.SkuInfoDao;
import com.yql.guli.product.dto.SkuInfoDTO;
import com.yql.guli.product.entity.SkuInfoEntity;
import com.yql.guli.product.service.SkuInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SkuInfoServiceImpl extends CrudServiceImpl<SkuInfoDao, SkuInfoEntity, SkuInfoDTO> implements SkuInfoService {

    @Override
    public QueryWrapper<SkuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    public LambdaQueryWrapper<SkuInfoEntity> getKeyWrapper(Map<String, Object> params) {
        String key = (String) params.get("key");
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        String catelogId = (String) params.get("catelogId");
        String brandId = (String) params.get("brandId");
        String min = (String) params.get("min");
        String max = (String) params.get("max");
        LambdaQueryWrapper<SkuInfoEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            queryWrapper.orderBy(StringUtils.isNotBlank(sidx), order.equals("asc"), SkuInfoEntity::getSkuId);
        }
        if (StringUtils.isNotBlank(catelogId) && !catelogId.equals("0")) {
            queryWrapper.eq(SkuInfoEntity::getCatalogId, catelogId);
        }
        if (StringUtils.isNotBlank(brandId) && !brandId.equals("0")) {
            queryWrapper.eq(SkuInfoEntity::getBrandId, brandId);
        }
        if (StringUtils.isNotBlank(min)){
            queryWrapper.ge(SkuInfoEntity::getPrice,min);
        }
        if (StringUtils.isNotBlank(max) && !max.equals("0")) {
            queryWrapper.le(SkuInfoEntity::getPrice, max);
        }
        if (StringUtils.isNotBlank(key)) {
            queryWrapper.and(wrapper -> wrapper.like(SkuInfoEntity::getSkuName, key));
        }
        return queryWrapper;
    }


    @Override
    public PageUtils<SkuInfoEntity> getSkuInfo(Map<String, Object> params) {
        LambdaQueryWrapper<SkuInfoEntity> keyWrapper = getKeyWrapper(params);
        IPage<SkuInfoEntity> page = this.page(new PageUtil<SkuInfoEntity>().getPage(params), keyWrapper);
        return new PageUtils<>(page);
    }

    @Override
    public List<SkuInfoEntity> getSkusBySpuId(Long spuId) {
        LambdaQueryWrapper<SkuInfoEntity> skuInfoEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        return this.baseMapper.selectList(skuInfoEntityLambdaQueryWrapper.eq(SkuInfoEntity::getSpuId, spuId));
    }
}