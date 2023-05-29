package com.yql.guli.ware.dao;
import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品库存
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface WareSkuDao extends BaseDao<WareSkuEntity> {
    WareSkuEntity selectOneBySkuIdAndWareId(@Param("skuId") Long skuId, @Param("wareId") Long wareId);

    Long  selectSumStockBySkuId(@Param("skuId") Long skuId);
}