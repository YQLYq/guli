package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.CategoryDTO;
import com.yql.guli.product.entity.CategoryEntity;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface CategoryService extends CrudService<CategoryEntity, CategoryDTO> {

    List<CategoryEntity> listWithTree();

    void deleteMenuById(List<Long> ids);

    Long[] findCateLogIds(Long catelogId);

    void updateCascade(CategoryDTO dto);
}