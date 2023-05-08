package com.yql.guli.coupon.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.coupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface HomeSubjectDao extends BaseDao<HomeSubjectEntity> {
	
}