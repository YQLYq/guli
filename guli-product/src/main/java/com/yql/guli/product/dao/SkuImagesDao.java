package com.yql.guli.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.SkuImagesEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku图片
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface SkuImagesDao extends BaseDao<SkuImagesEntity>, BaseMapper<SkuImagesEntity> {
	
}