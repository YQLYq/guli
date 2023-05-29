package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.constant.ProductConstant;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.to.SkuHasStockVo;
import com.yql.guli.common.to.SkuReductionTo;
import com.yql.guli.common.to.SpuBoundTo;
import com.yql.guli.common.to.es.SkuEsModel;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.common.utils.R;
import com.yql.guli.common.utils.Result;
import com.yql.guli.product.dao.BrandDao;
import com.yql.guli.product.dao.CategoryDao;
import com.yql.guli.product.dao.SpuInfoDao;
import com.yql.guli.product.dto.SpuInfoDTO;
import com.yql.guli.product.entity.*;
import com.yql.guli.product.feign.CouponFeignService;
import com.yql.guli.product.feign.SearchFeignService;
import com.yql.guli.product.feign.WareFeignService;
import com.yql.guli.product.service.*;
import com.yql.guli.product.vo.SpuInfoSaveVo;
import com.yql.guli.product.vo.SpuInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * spu信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class SpuInfoServiceImpl extends CrudServiceImpl<SpuInfoDao, SpuInfoEntity, SpuInfoDTO> implements SpuInfoService {

    private final SpuInfoDescService spuInfoDescService;

    private final SpuImagesService spuImagesService;

    private final AttrService attrService;

    private final ProductAttrValueService productAttrValueService;

    private final SkuInfoService skuInfoService;

    private final SkuImagesService skuImagesService;

    private final SkuSaleAttrValueService skuSaleAttrValueService;

    private final CouponFeignService couponFeignService;

    private final CategoryDao categoryDao;

    private final BrandDao brandDao;

    private final BrandService brandService;

    private final WareFeignService wareFeignService;

    private final SearchFeignService searchFeignService;

    @Autowired
    public SpuInfoServiceImpl(SpuInfoDescService spuInfoDescService, SpuImagesService spuImagesService, AttrService attrService, ProductAttrValueService productAttrValueService, SkuInfoService skuInfoService, SkuImagesService skuImagesService, SkuSaleAttrValueService skuSaleAttrValueService, CouponFeignService couponFeignService, CategoryDao categoryDao, BrandDao brandDao, BrandService brandService, WareFeignService wareFeignService, SearchFeignService searchFeignService) {
        this.spuInfoDescService = spuInfoDescService;
        this.spuImagesService = spuImagesService;
        this.attrService = attrService;
        this.productAttrValueService = productAttrValueService;
        this.skuInfoService = skuInfoService;
        this.skuImagesService = skuImagesService;
        this.skuSaleAttrValueService = skuSaleAttrValueService;
        this.couponFeignService = couponFeignService;
        this.categoryDao = categoryDao;
        this.brandDao = brandDao;
        this.brandService = brandService;
        this.wareFeignService = wareFeignService;
        this.searchFeignService = searchFeignService;
    }

    @Override
    public QueryWrapper<SpuInfoEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<SpuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }
    public LambdaQueryWrapper<SpuInfoEntity> getKeyWrapper(Map<String, Object> params) {
        String key = (String) params.get("key");
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        String catelogId = (String) params.get("catelogId");
        String brandId = (String) params.get("brandId");
        String status = (String) params.get("status");
        LambdaQueryWrapper<SpuInfoEntity> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            queryWrapper.orderBy(StringUtils.isNotBlank(sidx), order.equals("asc"), SpuInfoEntity::getId);
        }
        if (StringUtils.isNotBlank(catelogId) && !catelogId.equals("0")) {
            queryWrapper.eq(SpuInfoEntity::getCatalogId, catelogId);
        }
        if (StringUtils.isNotBlank(brandId) && !brandId.equals("0")) {
            queryWrapper.eq(SpuInfoEntity::getBrandId, brandId);
        }
        if (StringUtils.isNotBlank(status)) {
            queryWrapper.eq(SpuInfoEntity::getPublishStatus, status);
        }
        if (StringUtils.isNotBlank(key)) {
            queryWrapper.and(wrapper -> wrapper.like(SpuInfoEntity::getSpuDescription, key).or().like(SpuInfoEntity::getSpuName, key));
        }
        return queryWrapper;
    }
    /**
     * 新增商品
     *
     * @author yql
     * @date 12:23 2023/5/11
     **/
    @Override
    public void saveInfoVo(SpuInfoSaveVo saveVo) {
        //1.保存spu基本信息 pms_spu_info
        SpuInfoEntity spuInfoEntity = new SpuInfoEntity();
        BeanUtils.copyProperties(saveVo, spuInfoEntity);
        Optional.of(spuInfoEntity).ifPresent(this::saveBaseSpuInfo);
        //2.保存spu的描述图片 pms_spu_info_desc
        List<String> decript = saveVo.getDecript();
        SpuInfoDescEntity spuInfoDescEntity = new SpuInfoDescEntity();
        spuInfoDescEntity.setSpuId(spuInfoEntity.getId());
        spuInfoDescEntity.setDecript(String.join(",", decript));
        spuInfoDescService.saveSpuInfoDesc(spuInfoDescEntity);
        //3.保存spu的图片集 pms_spu_images
        List<String> images = saveVo.getImages();
        spuImagesService.saveImages(spuInfoEntity.getId(), images);
        //4.保存spu的规格参数 pms_product_attr_value
        List<SpuInfoSaveVo.BaseAttrsVo> baseAttrs = saveVo.getBaseAttrs();
        List<ProductAttrValueEntity> productAttrValueEntityList = baseAttrs.stream().map(baseAttrsVo -> {
            ProductAttrValueEntity productAttrValueEntity = new ProductAttrValueEntity();
            productAttrValueEntity.setAttrId(baseAttrsVo.getAttrId());
            productAttrValueEntity.setAttrName(attrService.getById(baseAttrsVo.getAttrId()).getAttrName());
            productAttrValueEntity.setAttrValue(baseAttrsVo.getAttrValues());
            productAttrValueEntity.setQuickShow(baseAttrsVo.getShowDesc());
            productAttrValueEntity.setSpuId(spuInfoEntity.getId());
            return productAttrValueEntity;
        }).collect(Collectors.toList());
        productAttrValueService.saveBatch(productAttrValueEntityList);
        //5.保存spu的积分信息 sms_spu_bounds
        SpuInfoSaveVo.BoundsVo bounds = saveVo.getBounds();
        SpuBoundTo spuBoundTo = new SpuBoundTo();
        BeanUtils.copyProperties(bounds, spuBoundTo);
        spuBoundTo.setSpuId(spuInfoEntity.getId());
        R r = couponFeignService.saveSpuBounds(spuBoundTo);
        if (r.getCode() != 0) {
            log.error("远程调用Sku积分错误");
        }

        //6.保存当前spu对应的所有sku信息
        //6.1 sku的基本信息 pms_sku_info
        List<SpuInfoSaveVo.SkusVo> skus = saveVo.getSkus();
        if (skus != null && !skus.isEmpty()) {
            skus.forEach(skusVo -> {
                String defaultImage = "";
                for (SpuInfoSaveVo.SkusVo.ImagesVo image : skusVo.getImages()) {
                    if (image.getDefaultImg() == 1) {
                        defaultImage = image.getImgUrl();
                        break;
                    }
                }
                SkuInfoEntity skuInfoEntity = new SkuInfoEntity();
                BeanUtils.copyProperties(skusVo, skuInfoEntity);
                skuInfoEntity.setBrandId(spuInfoEntity.getBrandId());
                skuInfoEntity.setSpuId(spuInfoEntity.getId());
                skuInfoEntity.setCatalogId(spuInfoEntity.getCatalogId());
                skuInfoEntity.setSaleCount(0L);
                skuInfoEntity.setSkuDefaultImg(defaultImage);
                Optional.of(skuInfoEntity).ifPresent(skuInfoService::save);
                //6.2 sku的图片信息 pms_sku_images
                List<SkuImagesEntity> imagesEntityList = skusVo.getImages().stream().filter(imagesVo -> StringUtils.isNotBlank(imagesVo.getImgUrl()))
                        .map(imagesVo -> {
                            SkuImagesEntity skuImagesEntity = new SkuImagesEntity();
                            BeanUtils.copyProperties(imagesVo, skuImagesEntity);
                            skuImagesEntity.setSkuId(skuInfoEntity.getSkuId());
                            return skuImagesEntity;
                        }).collect(Collectors.toList());
                Optional.of(imagesEntityList).ifPresent(skuImagesService::saveBatch);
                //6.3 sku的销售属性 pms_sku_sale_attr_value
                List<SpuInfoSaveVo.SkusVo.AttrVo> attr = skusVo.getAttr();
                List<SkuSaleAttrValueEntity> skuSaleAttrValueEntityList = attr.stream().map(attrVo -> {
                    SkuSaleAttrValueEntity skuSaleAttrValueEntity = new SkuSaleAttrValueEntity();
                    BeanUtils.copyProperties(attrVo, skuSaleAttrValueEntity);
                    skuSaleAttrValueEntity.setSkuId(skuInfoEntity.getSkuId());
                    return skuSaleAttrValueEntity;
                }).collect(Collectors.toList());
                Optional.of(skuSaleAttrValueEntityList).ifPresent(skuSaleAttrValueService::saveBatch);
                //6.4 sku的优惠信息 guli_sms->sms_sku_ladder/sms_sku_full_reduction/sms_member_price
                SkuReductionTo skuReductionTo = new SkuReductionTo();
                BeanUtils.copyProperties(skusVo, skuReductionTo);
                skuReductionTo.setMemberPrice(skusVo.getMemberPrice());
                skuReductionTo.setSkuId(skuInfoEntity.getSkuId());
                if (skuReductionTo.getFullCount() > 0 || skuReductionTo.getFullPrice().compareTo(BigDecimal.ZERO) > 0) {
                    R r1 = couponFeignService.saveSkuRedction(skuReductionTo);
                    if (r1.getCode() != 0) {
                        log.error("远程调用Sku优惠错误");
                    }
                }
            });
        }
    }

    @Override
    public void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity) {
        spuInfoEntity.setCreateTime(new Date());
        spuInfoEntity.setUpdateTime(new Date());
        this.baseMapper.insert(spuInfoEntity);
    }

    @Override
    public PageUtils<SpuInfoVo> getSpuInfoList(Map<String, Object> params) {
        LambdaQueryWrapper<SpuInfoEntity> keyWrapper = getKeyWrapper(params);
        IPage<SpuInfoEntity> page = this.page(new PageUtil<SpuInfoEntity>().getPage(params), keyWrapper);
        List<SpuInfoEntity> records = page.getRecords();
        List<SpuInfoVo> spuInfoVoList = records.stream().map(spuInfoEntity -> {
            SpuInfoVo spuInfoVo = new SpuInfoVo();
            BeanUtils.copyProperties(spuInfoEntity, spuInfoVo);
            String cateName = categoryDao.selectById(spuInfoVo.getCatalogId()).getName();
            spuInfoVo.setCatalogName(cateName);
            String brandName = brandDao.selectById(spuInfoVo.getBrandId()).getName();
            spuInfoVo.setBrandName(brandName);
            return spuInfoVo;
        }).collect(Collectors.toList());
        return new PageUtils<>(page, spuInfoVoList);
    }


    /**
     * 商品上架 并存入es
     *
     * @param spuId
     * @return void
     * @author yql
     * @date 19:36 2023/5/16
     **/
    @Override
    public void upSpu(Long spuId) {
        //查询spuid的对应所有的sku信息，品牌的名字
        List<SkuInfoEntity> skuInfoEntityList = skuInfoService.getSkusBySpuId(spuId);
        List<Long> skuIds = skuInfoEntityList.stream().map(SkuInfoEntity::getSkuId).collect(Collectors.toList());
        //TODO 4.查询当前sku的可以被索引的规格属性
        List<ProductAttrValueEntity> baseGetListForSpu = productAttrValueService.getBaseGetListForSpu(spuId);
        List<Long> attrIds = baseGetListForSpu.stream().map(ProductAttrValueEntity::getAttrId).collect(Collectors.toList());
        List<Long> searchIds = attrService.selectSearchAttrs(attrIds);
        Set<Long> idSet = new HashSet<>(searchIds);
        List<SkuEsModel.Attr> attrs = baseGetListForSpu.stream().filter(item -> idSet.contains(item.getAttrId()))
                .map(item -> {
                    SkuEsModel.Attr attr = new SkuEsModel.Attr();
                    BeanUtils.copyProperties(item, attr);
                    return attr;
                }).collect(Collectors.toList());
        //TODO 1.发送远程调用 库存系统查询是否有库存
        Map<Long, Boolean> booleanMap = null;
        try {
            Result<List<SkuHasStockVo>> skuHasStock = wareFeignService.getSkuHasStock(skuIds);
            booleanMap = skuHasStock.getData().stream().collect(Collectors.toMap(SkuHasStockVo::getSkuId, SkuHasStockVo::getHasStock));
        }catch (Exception e){
            log.error("远程调用失败",e);
        }
        //封装每个sku的信息
        Map<Long, Boolean> finalBooleanMap = booleanMap;
        List<SkuEsModel> skuEsModelList = skuInfoEntityList.stream().map(skuInfoEntity -> {
            SkuEsModel skuEsModel = new SkuEsModel();
            BeanUtils.copyProperties(skuInfoEntity, skuEsModel);
            skuEsModel.setCategoryId(skuInfoEntity.getCatalogId());
            skuEsModel.setSkuPrice(skuInfoEntity.getPrice());
            skuEsModel.setSkuImg(skuInfoEntity.getSkuDefaultImg());
            //设置库存信息
            if(finalBooleanMap == null){
                skuEsModel.setHasStock(true);
            }else{
                skuEsModel.setHasStock(finalBooleanMap.get(skuEsModel.getSkuId()));
            }
            //TODO 2.热度评分 0
            skuEsModel.setHotScore(0L);
            //TODO 3.查询品牌和分类的信息
            BrandEntity byId = brandService.getById(skuEsModel.getBrandId());
            skuEsModel.setBrandName(byId.getName());
            skuEsModel.setBrandImg(byId.getLogo());
            CategoryEntity categoryEntity = categoryDao.selectById(skuEsModel.getCategoryId());
            skuEsModel.setCategoryName(categoryEntity.getName());
            skuEsModel.setAttrs(attrs);
            return skuEsModel;
        }).collect(Collectors.toList());
        //TODO 5. 将服务发给guli-search 进行es
        R r = searchFeignService.productStatusUp(skuEsModelList);
        if (r.getCode() == 0){
            //TODO 6. 修改商品的状态
            baseMapper.updateSpuStatus(spuId, ProductConstant.StatusEnum.SPU_UP.getCode());
        }else {
            //远程调用失败
            //TODO 7.重复调用远程服务
        }
    }
}