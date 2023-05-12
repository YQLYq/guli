package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.AttrAttrgroupRelationDTO;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import com.yql.guli.product.vo.AttrGroupRelationVo;

/**
 * 属性&属性分组关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface AttrAttrgroupRelationService extends CrudService<AttrAttrgroupRelationEntity, AttrAttrgroupRelationDTO> {

    void saveAttrGroupRelationVo(AttrGroupRelationVo[] attrGroupRelationVos);
}