package com.yql.guli.product.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface CommentReplayDao extends BaseDao<CommentReplayEntity> {
	
}