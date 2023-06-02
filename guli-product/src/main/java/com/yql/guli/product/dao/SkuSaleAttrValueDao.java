package com.yql.guli.product.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.SkuSaleAttrValueEntity;
import com.yql.guli.product.vo.SkuItemSaleAttrVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku销售属性&值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface SkuSaleAttrValueDao extends BaseDao<SkuSaleAttrValueEntity> {

    List<SkuItemSaleAttrVo> selectdAttrWithSkuIdBySpuId(@Param("spuId") Long spuId);
}