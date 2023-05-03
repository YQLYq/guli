package com.yql.guli.product.service;

import com.yql.guli.common.page.PageData;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.AttrGroupDTO;
import com.yql.guli.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface AttrGroupService extends CrudService<AttrGroupEntity, AttrGroupDTO> {

    PageData<AttrGroupDTO> page(Map<String, Object> params, Long catelogId);
}