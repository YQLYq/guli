package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.CategoryBrandRelationDTO;
import com.yql.guli.product.entity.CategoryBrandRelationEntity;
import com.yql.guli.product.vo.BrandRelationVo;
import com.yql.guli.product.vo.CatelogVo;

import java.util.List;


/**
 * 品牌分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface CategoryBrandRelationService extends CrudService<CategoryBrandRelationEntity, CategoryBrandRelationDTO> {

    void saveDetail(CategoryBrandRelationDTO dto);
    /**
     * 获取品牌关联的分类id和名字
     * @author yql
     * @date 21:32 2023/5/10
     * @param brandId 品牌id
     * @return com.yql.guli.product.vo.CatelogVo
     **/
    CatelogVo getCateByBrandId(Long brandId);

    /**
     * 获取分类关联的品牌id和名字
     *
     * @param catId 分类id
     * @return com.yql.guli.product.vo.CatelogVo
     * @author yql
     * @date 21:32 2023/5/10
     **/
    List<BrandRelationVo> getBrandByCateId(Long catId);
}