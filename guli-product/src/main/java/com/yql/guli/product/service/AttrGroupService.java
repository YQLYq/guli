package com.yql.guli.product.service;

import com.yql.guli.common.page.PageData;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.AttrGroupDTO;
import com.yql.guli.product.entity.AttrEntity;
import com.yql.guli.product.entity.AttrGroupEntity;
import com.yql.guli.product.vo.AttrGroupBaseVo;
import com.yql.guli.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface AttrGroupService extends CrudService<AttrGroupEntity, AttrGroupDTO> {
    /**
     * 获取分组 page
     * @author yql
     * @date 13:35 2023/5/9
     * @param catelogId 分类id
     * @param params 请求参数
     * @return com.yql.guli.common.page.PageData<com.yql.guli.product.dto.AttrGroupDTO>
     **/
    PageData<AttrGroupDTO> page(Map<String, Object> params, Long catelogId);
    /**
     * 根据AttrGroupId 获取分组关联的所有属性
     * @author yql
     * @param id groupId
     * @return Optional
     * @date 23:10 2023/5/8
     **/
    Optional<List<AttrEntity>> getAttrByAttrGroup(Long id);
    /**
     * 删除 分组关联的属性
     * @author yql
     * @date 12:00 2023/5/9
     * @param relationVos (attrId attrGroupId)
     **/
    void deleteAttrRelation(AttrGroupRelationVo[] relationVos);
    /**
     * 获取未关联的属性
     * @author yql
     * @date 13:34 2023/5/9
     * @param map 请求参数
     * @param id 分组id
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.product.entity.AttrEntity>
     **/
  Optional<PageUtils<AttrEntity>> getNoAttrRelation(Map<String, Object> map, Long id);
  /**
   * 获取分类下所有分组&关联属性
   * @author yql
   * @date 20:24 2023/5/10
   * @param cateId 分类id
   * @return java.util.List<com.yql.guli.product.vo.AttrGroupBaseVo>
   **/
  List<AttrGroupBaseVo> getBaseAttrByCateId(Long cateId);
}