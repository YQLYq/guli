package com.yql.guli.product.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.dto.ProductAttrValueDTO;
import com.yql.guli.product.entity.ProductAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * spu属性值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface ProductAttrValueDao extends BaseDao<ProductAttrValueEntity> {
    List<ProductAttrValueEntity> selectAllBySpuId(@Param("spuId") Long spuId);

}