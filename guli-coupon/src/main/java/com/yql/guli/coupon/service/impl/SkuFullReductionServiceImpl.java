package com.yql.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.to.MemberPriceTo;
import com.yql.guli.common.to.SkuReductionTo;
import com.yql.guli.coupon.dao.SkuFullReductionDao;
import com.yql.guli.coupon.dto.SkuFullReductionDTO;
import com.yql.guli.coupon.entity.MemberPriceEntity;
import com.yql.guli.coupon.entity.SkuFullReductionEntity;
import com.yql.guli.coupon.entity.SkuLadderEntity;
import com.yql.guli.coupon.service.SkuFullReductionService;
import com.yql.guli.coupon.service.SkuLadderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 商品满减信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SkuFullReductionServiceImpl extends CrudServiceImpl<SkuFullReductionDao, SkuFullReductionEntity, SkuFullReductionDTO> implements SkuFullReductionService {
    @Autowired
    private SkuLadderService skuLadderService;
    @Autowired
    private MemberPriceServiceImpl memberPriceService;
    @Override
    public QueryWrapper<SkuFullReductionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuFullReductionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public void saveSkuReduction(SkuReductionTo to) {
        //sku的优惠信息 guli_sms->sms_sku_ladder/sms_sku_full_reduction/sms_member_price
        //1. sms_sku_ladder
        SkuLadderEntity skuLadderEntity = new SkuLadderEntity();
        BeanUtils.copyProperties(to,skuLadderEntity);
        skuLadderEntity.setSkuId(to.getSkuId());
        skuLadderEntity.setAddOther(to.getCountStatus());
        if (skuLadderEntity.getFullCount() > 0 ){
            skuLadderService.save(skuLadderEntity);
        }
        //2.sms_sku_full_reduction
        SkuFullReductionEntity skuFullReductionEntity = new SkuFullReductionEntity();
        BeanUtils.copyProperties(to, skuFullReductionEntity);
        skuFullReductionEntity.setSkuId(to.getSkuId());
        if(skuFullReductionEntity.getFullPrice().compareTo(BigDecimal.ZERO) > 0){
            this.save(skuFullReductionEntity);
        }
        //3.sms_member_price
        List<MemberPriceTo> memberPrice = to.getMemberPrice();
        List<MemberPriceEntity> memberPriceEntities = memberPrice.stream().map(memberPriceTo -> {
            MemberPriceEntity memberPriceEntity = new MemberPriceEntity();
            memberPriceEntity.setSkuId(to.getSkuId());
            memberPriceEntity.setMemberPrice(memberPriceTo.getPrice());
            memberPriceEntity.setMemberLevelName(memberPriceTo.getName());
            memberPriceEntity.setMemberLevelId(memberPriceTo.getId());
            memberPriceEntity.setAddOther(1);
            return memberPriceEntity;
        }).filter(memberPriceEntity -> memberPriceEntity.getMemberPrice().compareTo(BigDecimal.ZERO) > 0 ).collect(Collectors.toList());
        memberPriceService.saveBatch(memberPriceEntities);
    }
}