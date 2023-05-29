package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.ware.dao.WareInfoDao;
import com.yql.guli.ware.dto.WareInfoDTO;
import com.yql.guli.ware.entity.WareInfoEntity;
import com.yql.guli.ware.service.WareInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class WareInfoServiceImpl extends CrudServiceImpl<WareInfoDao, WareInfoEntity, WareInfoDTO> implements WareInfoService {

    @Override
    public QueryWrapper<WareInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WareInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    public LambdaQueryWrapper<WareInfoEntity> getKeyWrapper(Map<String, Object> params) {
        String key = (String) params.get("key");
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        LambdaQueryWrapper<WareInfoEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            queryWrapper.orderBy(StringUtils.isNotBlank(sidx), order.equals("asc"), WareInfoEntity::getId);
        }
        if (StringUtils.isNotBlank(key)) {
            queryWrapper.and(wrapper -> wrapper.like(WareInfoEntity::getName, key).or().eq(WareInfoEntity::getId,key).or().like(WareInfoEntity::getAddress,key).or().like(WareInfoEntity::getAreacode,key));
        }
        return queryWrapper;
    }

    @Override
    public PageUtils<WareInfoDTO> getWareInfolist(Map<String, Object> params) {
        LambdaQueryWrapper<WareInfoEntity> keyWrapper = getKeyWrapper(params);
        IPage<WareInfoEntity> page = this.page(new PageUtil<WareInfoEntity>().getPage(params), keyWrapper);

        return new PageUtils<>(page);
    }
}