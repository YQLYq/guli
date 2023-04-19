package com.yql.guli.product.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface CategoryDao extends BaseDao<CategoryEntity> {
	
}