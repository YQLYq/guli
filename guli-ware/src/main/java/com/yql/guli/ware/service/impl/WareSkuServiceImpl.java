package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yql.guli.common.constant.Constant;
import com.yql.guli.common.constant.WareConstant;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.to.SkuHasStockVo;
import com.yql.guli.common.to.SkuInfoTo;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.common.utils.R;
import com.yql.guli.ware.dao.WareSkuDao;
import com.yql.guli.ware.dto.WareSkuDTO;
import com.yql.guli.ware.entity.PurchaseDetailEntity;
import com.yql.guli.ware.entity.WareSkuEntity;
import com.yql.guli.ware.feign.ProdcutFeignService;
import com.yql.guli.ware.service.WareSkuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 商品库存
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class WareSkuServiceImpl extends CrudServiceImpl<WareSkuDao, WareSkuEntity, WareSkuDTO> implements WareSkuService {
    @Autowired
    WareSkuDao wareSkuDao;
    @Autowired
    private ProdcutFeignService prodcutFeignService;

    @Override
    public QueryWrapper<WareSkuEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<WareSkuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    public LambdaQueryWrapper<WareSkuEntity> getKeyWrapper(Map<String, Object> params) {
        String wareId = (String) params.get("wareId");
        String skuId = (String) params.get("skuId");
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        LambdaQueryWrapper<WareSkuEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            queryWrapper.orderBy(StringUtils.isNotBlank(sidx), order.equals("asc"), WareSkuEntity::getId);
        }
        if (StringUtils.isNotBlank(wareId) && !wareId.equals("0")) {
            queryWrapper.eq(WareSkuEntity::getWareId, wareId);
        }
        if (StringUtils.isNotBlank(skuId) && !skuId.equals("0")) {
            queryWrapper.eq(WareSkuEntity::getSkuId, skuId);
        }
        return queryWrapper;
    }

    @Override
    public PageUtils<WareSkuDTO> getSkuInfo(Map<String, Object> params) {
        LambdaQueryWrapper<WareSkuEntity> keyWrapper = getKeyWrapper(params);
        IPage<WareSkuEntity> page = this.page(new PageUtil<WareSkuEntity>().getPage(params), keyWrapper);
        return new PageUtils<>(page);
    }

    /**
     * 判断是否有库存
     *
     * @param skuIds
     * @return java.util.List<com.yql.guli.common.to.SkuHasStockVo>
     * @author yql
     * @date 22:04 2023/5/16
     **/
    @Override
    public List<SkuHasStockVo> getSkuHashStock(List<Long> skuIds) {
        return skuIds.stream().map(skuId -> {
            SkuHasStockVo skuHasStockVo = new SkuHasStockVo();
            Long stockSum = wareSkuDao.selectSumStockBySkuId(skuId);
            skuHasStockVo.setSkuId(skuId);
            skuHasStockVo.setHasStock(false);
            if (stockSum == null){
                return skuHasStockVo;
            }
            if (stockSum > 0) {
                skuHasStockVo.setHasStock(true);
            }
            return skuHasStockVo;
        }).collect(Collectors.toList());
    }

    @Override
    public R saveAndOpinion(WareSkuDTO dto) {
        Long skuId = dto.getSkuId();
        Long wareId = dto.getWareId();
        WareSkuEntity wareSkuEntity = wareSkuDao.selectOneBySkuIdAndWareId(skuId, wareId);
        if (wareSkuEntity != null) {
            return R.error("商品库存存在一模一样的商品和仓库");
        }
        super.saveDto(dto);
        return R.ok(Constant.SUCCESS_String);
    }

    /**
     * 添加库存
     *
     * @param purchaseDetailEntityList
     * @return void
     * @author yql
     * @date 16:07 2023/5/13
     **/
    @Override
    public void addStock(List<PurchaseDetailEntity> purchaseDetailEntityList) {
        purchaseDetailEntityList.forEach(purchaseDetailEntity -> {
            R r = prodcutFeignService.get(purchaseDetailEntity.getSkuId());
            ObjectMapper objectMapper = new ObjectMapper();
            Object data = r.get("data");
            String skuName = "";
            if (data != null) {
                skuName = objectMapper.convertValue(data, SkuInfoTo.class).getSkuName();
            }
            WareSkuEntity wareSkuEntity = wareSkuDao.selectOneBySkuIdAndWareId(purchaseDetailEntity.getSkuId(), purchaseDetailEntity.getWareId());
            if (purchaseDetailEntity.getStatus() == WareConstant.PurchaseDetailEnum.FINISH.getCode()) {
                //如果为空 则创建商品库存
                if (wareSkuEntity == null) {
                    WareSkuEntity wareSkuEntity1 = new WareSkuEntity();
                    wareSkuEntity1.setWareId(purchaseDetailEntity.getWareId());
                    wareSkuEntity1.setSkuId(purchaseDetailEntity.getSkuId());
                    wareSkuEntity1.setStockLocked(0);
                    if (skuName != null) {
                        wareSkuEntity1.setSkuName(skuName);
                    }
                    this.save(wareSkuEntity1);
                    wareSkuEntity = wareSkuEntity1;
                }
                if (wareSkuEntity.getSkuName() == null && skuName != null) {
                    wareSkuEntity.setSkuName(skuName);
                }
                Integer stock = wareSkuEntity.getStock();

                if (stock == null || stock == 0) {
                    wareSkuEntity.setStock(purchaseDetailEntity.getSkuNum());
                } else {
                    wareSkuEntity.setStock(stock + purchaseDetailEntity.getSkuNum());
                }

                this.updateById(wareSkuEntity);
            }
        });
    }
}