package com.yql.guli.order.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface OrderSettingDao extends BaseDao<OrderSettingEntity> {
	
}