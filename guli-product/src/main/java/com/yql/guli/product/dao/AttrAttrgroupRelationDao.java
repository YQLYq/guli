package com.yql.guli.product.dao;
import org.apache.ibatis.annotations.Param;

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
    /**
     * 根据attrId更改attrGroupId
     * @author yql
     * @date 20:52 2023/5/7
     * @param attrGroupId 分组id
     * @param attrId 属性id
     * @return int
     **/
    int updateAttrGroupIdByAttrId(@Param("attrGroupId") Long attrGroupId, @Param("attrId") Long attrId);
}