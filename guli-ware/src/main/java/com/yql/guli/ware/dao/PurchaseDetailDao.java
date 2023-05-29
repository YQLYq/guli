package com.yql.guli.ware.dao;
import org.apache.ibatis.annotations.Param;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.ware.entity.PurchaseDetailEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface PurchaseDetailDao extends BaseDao<PurchaseDetailEntity> {
    int updateStatusByPurchaseId(@Param("status") Integer status, @Param("purchaseId") Long purchaseId);
}