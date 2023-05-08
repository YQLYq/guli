package com.yql.guli.coupon.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.coupon.entity.SeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface SeckillSessionDao extends BaseDao<SeckillSessionEntity> {
	
}