package com.yql.guli.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性&属性分组关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseDao<AttrAttrgroupRelationEntity>, BaseMapper<AttrAttrgroupRelationEntity> {
	
}