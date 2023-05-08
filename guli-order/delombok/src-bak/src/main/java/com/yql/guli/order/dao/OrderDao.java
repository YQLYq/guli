package com.yql.guli.order.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {
	
}