package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.BrandDao;
import com.yql.guli.product.dao.CategoryBrandRelationDao;
import com.yql.guli.product.dao.CategoryDao;
import com.yql.guli.product.dto.CategoryBrandRelationDTO;
import com.yql.guli.product.entity.BrandEntity;
import com.yql.guli.product.entity.CategoryBrandRelationEntity;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.CategoryBrandRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
public class CategoryBrandRelationServiceImpl extends CrudServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity, CategoryBrandRelationDTO> implements CategoryBrandRelationService {
    @Autowired
    private BrandDao brandDao;
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public QueryWrapper<CategoryBrandRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CategoryBrandRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public void saveDetail(CategoryBrandRelationDTO dto) {
        Long brandId = dto.getBrandId();
        Long catelogId = dto.getCatelogId();
        //查询详细名字
        BrandEntity brandEntity = brandDao.selectById(brandId);
        CategoryEntity categoryEntity = categoryDao.selectById(catelogId);
        dto.setBrandName(brandEntity.getName());
        dto.setCatelogName(categoryEntity.getName());
        this.saveDto(dto);
    }
}