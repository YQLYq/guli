package com.yql.guli.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.constant.Constant;
import com.yql.guli.common.constant.WareConstant;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.common.utils.R;
import com.yql.guli.ware.dao.PurchaseDao;
import com.yql.guli.ware.dto.PurchaseDTO;
import com.yql.guli.ware.entity.PurchaseDetailEntity;
import com.yql.guli.ware.entity.PurchaseEntity;
import com.yql.guli.ware.service.PurchaseDetailService;
import com.yql.guli.ware.service.PurchaseService;
import com.yql.guli.ware.service.WareSkuService;
import com.yql.guli.ware.vo.DoneVo;
import com.yql.guli.ware.vo.MergeVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * 采购信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PurchaseServiceImpl extends CrudServiceImpl<PurchaseDao, PurchaseEntity, PurchaseDTO> implements PurchaseService {
    @Autowired
    private PurchaseDetailService purchaseDetailService;
    @Autowired
    private WareSkuService wareSkuService;

    @Override
    public QueryWrapper<PurchaseEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<PurchaseEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    public LambdaQueryWrapper<PurchaseEntity> getKeyWrapper(Map<String, Object> params) {
        String key = (String) params.get("key");
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        String status = (String) params.get("status");
        LambdaQueryWrapper<PurchaseEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            queryWrapper.orderBy(StringUtils.isNotBlank(sidx), "asc".equals(order), PurchaseEntity::getId);
        }
        if (StringUtils.isNotBlank(key)) {
            queryWrapper.and(wrapper -> wrapper.like(PurchaseEntity::getAssigneeName, key).or().eq(PurchaseEntity::getId, key).or().like(PurchaseEntity::getAssigneeId, key).or().like(PurchaseEntity::getPhone, key));
        }
        if (StringUtils.isNotBlank(status)) {
            queryWrapper.eq(PurchaseEntity::getStatus, status);
        }
        return queryWrapper;
    }

    @Override
    public PageUtils<PurchaseEntity> getSkuInfo(Map<String, Object> params) {
        LambdaQueryWrapper<PurchaseEntity> keyWrapper = getKeyWrapper(params);
        IPage<PurchaseEntity> page = this.page(new PageUtil<PurchaseEntity>().getPage(params), keyWrapper);
        return new PageUtils<>(page);
    }

    @Override
    public PageUtils<PurchaseEntity> getUnreceiveList(Map<String, Object> params) {
        LambdaQueryWrapper<PurchaseEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(PurchaseEntity::getStatus, 0).or().eq(PurchaseEntity::getStatus, 1);
        IPage<PurchaseEntity> page = this.page(new PageUtil<PurchaseEntity>().getPage(params), wrapper);
        return new PageUtils<>(page);
    }

    /**
     * 合并采购单
     *
     * @param mergeVo 采购需求id 和 采购单id
     * @author yql
     * @date 14:49 2023/5/13
     **/
    @Override
    public void saveMerge(MergeVo mergeVo) {
        AtomicReference<Long> purchaseId = new AtomicReference<>(mergeVo.getPurchaseId());
        //更新采购需求状态
        List<Long> items = mergeVo.getItems();
        List<PurchaseDetailEntity> purchaseDetailEntityList = items.stream()
                .map(i -> purchaseDetailService.getById(i))
                .filter(this::opinionPurchaseDetailEntityStatus)
                .peek(purchaseDetailEntity -> {
                    //如果为空 创建新的采购单
                    if (purchaseId.get() == null) {
                        PurchaseEntity purchaseEntity = new PurchaseEntity();
                        purchaseEntity.setStatus(WareConstant.PurchaseEnum.CREATED.getCode());
                        purchaseEntity.setCreateTime(new Date());
                        purchaseEntity.setUpdateTime(new Date());
                        this.save(purchaseEntity);
                        purchaseId.set(purchaseEntity.getId());
                    }
                }).peek(purchaseDetailEntity -> {
                    purchaseDetailEntity.setPurchaseId(purchaseId.get());
                    purchaseDetailEntity.setStatus(WareConstant.PurchaseDetailEnum.ASSIGNED.getCode());
                }).collect(Collectors.toList());
        purchaseDetailService.updateBatchById(purchaseDetailEntityList);
        //更新采购单状态
        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setId(purchaseId.get());
        purchaseEntity.setUpdateTime(new Date());
        this.updateById(purchaseEntity);
    }

    /**
     * 领取采购单
     *
     * @param
     * @return void
     * @author yql
     * @date 14:50 2023/5/13
     **/
    @Override
    public void getPurchaseOrder(Long[] purchId) {
        List<PurchaseEntity> purchaseEntityList = Arrays.stream(purchId).map(this::getById)
                .filter(this::opinionStatus)
                .peek(purchaseEntity -> {
                    purchaseEntity.setStatus(WareConstant.PurchaseEnum.RECEIVE.getCode());
                    purchaseEntity.setUpdateTime(new Date());
                })
                .collect(Collectors.toList());
        this.updateBatchById(purchaseEntityList);
        //更新采购需求状态
        purchaseEntityList.forEach(purchaseEntity -> purchaseDetailService.updateStatusToReceiveEByPurchId(purchaseEntity.getId()));
    }

    boolean opinionStatus(PurchaseEntity purchaseEntity) {
        return purchaseEntity.getStatus() == WareConstant.PurchaseEnum.CREATED.getCode()
                || purchaseEntity.getStatus() == WareConstant.PurchaseEnum.ASSIGNED.getCode();
    }

    boolean opinionPurchaseDetailEntityStatus(PurchaseDetailEntity purchaseDetailEntity) {
        return purchaseDetailEntity.getStatus() == WareConstant.PurchaseDetailEnum.CREATED.getCode()
                || purchaseDetailEntity.getStatus() == WareConstant.PurchaseDetailEnum.ASSIGNED.getCode();
    }

    @Override
    public R donePurChase(DoneVo doneVo) {
        Long id = doneVo.getId();
        PurchaseEntity byId = this.getById(id);
        if (byId.getStatus() != WareConstant.PurchaseEnum.RECEIVE.getCode()){
            return R.error("采购单还未领取");
        }
        //更新采购需求的状态
        List<DoneVo.ItemsVo> items = doneVo.getItems();
        AtomicReference<Boolean> flag = new AtomicReference<>(true);
        List<PurchaseDetailEntity> purchaseDetailEntityList = items.stream().map(itemsVo -> {
            if (itemsVo.getStatus() == WareConstant.PurchaseDetailEnum.HASERROR.getCode()) {
                flag.set(false);
            }
            PurchaseDetailEntity purchaseDetailEntity = purchaseDetailService.getById(itemsVo.getItemId());
            if (purchaseDetailEntity != null) {
                purchaseDetailEntity.setStatus(itemsVo.getStatus());
            }
            return purchaseDetailEntity;
        }).filter(Objects::nonNull).collect(Collectors.toList());
        //更新采购单的状态
        byId.setStatus(Boolean.TRUE.equals(flag.get()) ? WareConstant.PurchaseEnum.FINISH.getCode() : WareConstant.PurchaseEnum.HASERROR.getCode());
        byId.setUpdateTime(new Date());
        this.updateById(byId);
        purchaseDetailService.updateBatchById(purchaseDetailEntityList);
        //入库
        wareSkuService.addStock(purchaseDetailEntityList);
        return  R.ok(Constant.SUCCESS_String);
    }
}