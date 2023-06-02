package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.common.utils.Result;
import com.yql.guli.product.dao.SkuImagesDao;
import com.yql.guli.product.dao.SkuInfoDao;
import com.yql.guli.product.dto.SkuInfoDTO;
import com.yql.guli.product.entity.SkuImagesEntity;
import com.yql.guli.product.entity.SkuInfoEntity;
import com.yql.guli.product.entity.SpuInfoDescEntity;
import com.yql.guli.product.service.AttrGroupService;
import com.yql.guli.product.service.SkuInfoService;
import com.yql.guli.product.service.SkuSaleAttrValueService;
import com.yql.guli.product.service.SpuInfoDescService;
import com.yql.guli.product.vo.SkuItemSaleAttrVo;
import com.yql.guli.product.vo.SkuItemVo;
import com.yql.guli.product.vo.SpuItemAttrGroupVo;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * sku信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@Transactional(rollbackFor = Exception.class)
@AllArgsConstructor
public class SkuInfoServiceImpl extends CrudServiceImpl<SkuInfoDao, SkuInfoEntity, SkuInfoDTO> implements SkuInfoService {

    private SpuInfoDescService spuInfoDescService;
    private SkuImagesDao skuImagesDao;
    private SkuSaleAttrValueService skuSaleAttrValueService;
    private AttrGroupService attrGroupService;
    private ThreadPoolExecutor executor;
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

    /**
     * @param skuId 商品skuId
     * @return 返回商品的全部信息
     */
    @Override
    public Result<SkuItemVo> getProductDetailsInformation(Long skuId) {
        SkuItemVo skuItemVo = new SkuItemVo();
        //获取sku的基本信息
        CompletableFuture<SkuInfoEntity> skuInfoEntityCompletableFuture = CompletableFuture.supplyAsync(() -> {
            SkuInfoEntity skuInfo = this.getById(skuId);
            skuItemVo.setSkuInfoEntityList(skuInfo);
            return skuInfo;
        }, executor);
        //获取spu的规格参数
        CompletableFuture<Void> attrGroupVosThenAcceptAsync = skuInfoEntityCompletableFuture.thenAcceptAsync((skuInfo -> {
            List<SpuItemAttrGroupVo> baseGetListForSpu = attrGroupService.getAttrGroupWithAttrBySpuId(skuInfo.getSpuId());
            skuItemVo.setAttrGroupVos(baseGetListForSpu);
        }), executor);
        //获取Sku的图片
        CompletableFuture<Void> skuImagesEntitiesThenAcceptAsync = skuInfoEntityCompletableFuture.thenAcceptAsync((skuInfo -> {
            List<SkuImagesEntity> skuImagesEntities = skuImagesDao.selectList(new LambdaQueryWrapper<SkuImagesEntity>()
                    .eq(SkuImagesEntity::getSkuId, skuInfo.getSkuId()));
            skuItemVo.setSkuImagesEntities(skuImagesEntities);
        }), executor);
        //获取spu的介绍
        CompletableFuture<Void> spuInfoDescEntityThenAcceptAsync = skuInfoEntityCompletableFuture.thenAcceptAsync((skuInfo) -> {
            SpuInfoDescEntity spuInfoDescEntity = spuInfoDescService.getById(skuInfo.getSpuId());
            skuItemVo.setSpuInfoDescEntity(spuInfoDescEntity);
        }, executor);
        //获取Spu的销售属性
        CompletableFuture<Void> skuSaleAttrValueEntitiesThenAcceptAsync = skuInfoEntityCompletableFuture.thenAcceptAsync(skuInfo -> {
            List<SkuItemSaleAttrVo> skuSaleAttrValueEntities = skuSaleAttrValueService.getSpuSaleWithAttrBySpuId(skuInfo.getSpuId());
            skuItemVo.setSkuSaleAttrValueEntity(skuSaleAttrValueEntities);
        });
        try {
            CompletableFuture
                    .allOf(skuInfoEntityCompletableFuture,attrGroupVosThenAcceptAsync
                            ,skuSaleAttrValueEntitiesThenAcceptAsync,spuInfoDescEntityThenAcceptAsync
                            ,skuImagesEntitiesThenAcceptAsync).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        return new Result<SkuItemVo>().put(skuItemVo);
    }
}