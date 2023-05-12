package com.yql.guli.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import com.yql.guli.product.vo.AttrGroupRelationVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    /**
     * 删除 分组关联的属性
     * @author yql
     * @date 13:03 2023/5/9
     * @param attrgroupRelationEntities 关联集合
     **/
    void deleteBatchRelation(@Param("attrgroupRelationEntities") List<AttrAttrgroupRelationEntity> attrgroupRelationEntities);

    void insertAttrGroupRelationVos(AttrGroupRelationVo[] attrGroupRelationVos);

}