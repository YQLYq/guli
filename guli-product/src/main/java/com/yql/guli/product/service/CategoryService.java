package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.CategoryDTO;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.vo.Level2Vo;

import java.util.List;
import java.util.Map;


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
    /**
     * 查询一级分类
     * @author yql
     * @date 20:01 2023/5/17
     * @param 
     * @return java.util.List<com.yql.guli.product.entity.CategoryEntity>
     **/
    List<CategoryEntity> getLevel1Categorys();
    /**
     * 获取二级分类
     * @author yql
     * @date 22:01 2023/5/17
     * @param 
     * @return java.util.Map<java.lang.String,java.util.List<com.yql.guli.product.vo.Level2Vo>>
     **/
    Map<String, List<Level2Vo>> getLevel2Categorys();
}