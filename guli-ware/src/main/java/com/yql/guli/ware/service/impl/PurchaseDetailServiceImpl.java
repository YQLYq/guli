package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.constant.WareConstant;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.ware.dao.PurchaseDetailDao;
import com.yql.guli.ware.dto.PurchaseDetailDTO;
import com.yql.guli.ware.entity.PurchaseDetailEntity;
import com.yql.guli.ware.service.PurchaseDetailService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class PurchaseDetailServiceImpl extends CrudServiceImpl<PurchaseDetailDao, PurchaseDetailEntity, PurchaseDetailDTO> implements PurchaseDetailService {
    @Autowired
    private PurchaseDetailDao purchaseDetailDao;
    @Override
    public QueryWrapper<PurchaseDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PurchaseDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    public LambdaQueryWrapper<PurchaseDetailEntity> getKeyWrapper(Map<String, Object> params) {
        String key = (String) params.get("key");
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        String status = (String) params.get("status");
        String wareId = (String) params.get("wareId");
        LambdaQueryWrapper<PurchaseDetailEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            queryWrapper.orderBy(StringUtils.isNotBlank(sidx), order.equals("asc"), PurchaseDetailEntity::getId);
        }
        if (StringUtils.isNotBlank(key)) {
            queryWrapper.and(wrapper -> wrapper.like(PurchaseDetailEntity::getId, key).or().eq(PurchaseDetailEntity::getSkuId, key).or().eq(PurchaseDetailEntity::getSkuNum, key).or()
                    .eq(PurchaseDetailEntity::getPurchaseId, key).or().eq(PurchaseDetailEntity::getSkuPrice,key));
        }
        if (StringUtils.isNotBlank(status) && !status.equals("0")){
            queryWrapper.eq(PurchaseDetailEntity::getStatus,status);
        }
        if (StringUtils.isNotBlank(wareId) && !wareId.equals("0")) {
            queryWrapper.eq(PurchaseDetailEntity::getWareId, wareId);
        }
        return queryWrapper;
    }

    @Override
    public void updateStatusToReceiveEByPurchId(Long id) {
        purchaseDetailDao.updateStatusByPurchaseId(WareConstant.PurchaseDetailEnum.RECEIVE.getCode(), id);
    }

    @Override
    public PageUtils<PurchaseDetailEntity> getSkuInfo(Map<String, Object> params) {
        LambdaQueryWrapper<PurchaseDetailEntity> keyWrapper = getKeyWrapper(params);
        IPage<PurchaseDetailEntity> page = this.page(new PageUtil<PurchaseDetailEntity>().getPage(params), keyWrapper);
        return new PageUtils<>(page);
    }
}