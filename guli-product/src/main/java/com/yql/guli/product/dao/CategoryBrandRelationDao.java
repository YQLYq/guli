package com.yql.guli.product.dao;
import org.apache.ibatis.annotations.Param;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseDao<CategoryBrandRelationEntity> {
    int updateBrandNameByBrandId(@Param("brandName") String brandName, @Param("brandId") Long brandId);

    int updateCatelogNameAndCatelogId(@Param("catelogName") String catelogName, @Param("catelogId") Long catelogId);
}