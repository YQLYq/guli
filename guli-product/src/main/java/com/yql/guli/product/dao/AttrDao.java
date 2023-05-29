package com.yql.guli.product.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品属性
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Mapper
public interface AttrDao extends BaseDao<AttrEntity> {
    /**
     * 获取未关联的属性
     * @author yql
     * @date 15:52 2023/5/9
     * @param ids 属性id
     * @return List
     **/
    List<AttrEntity> selectNotRelation(@Param("ids") List<Long> ids);

    List<Long> selectByAttrIdAndSearchType(@Param("attrIds") List<Long> attrIds);
}