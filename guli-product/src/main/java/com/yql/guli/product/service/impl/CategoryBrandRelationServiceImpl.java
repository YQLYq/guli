package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
import com.yql.guli.product.vo.BrandRelationVo;
import com.yql.guli.product.vo.CatelogVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 品牌分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CategoryBrandRelationServiceImpl extends CrudServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity, CategoryBrandRelationDTO> implements CategoryBrandRelationService {

    private final BrandDao brandDao;
    private final CategoryDao categoryDao;
    private final CategoryBrandRelationDao categoryBrandRelationDao;

    @Autowired
    public CategoryBrandRelationServiceImpl(BrandDao brandDao, CategoryDao categoryDao, CategoryBrandRelationDao categoryBrandRelationDao) {
        this.brandDao = brandDao;
        this.categoryDao = categoryDao;
        this.categoryBrandRelationDao = categoryBrandRelationDao;
    }

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

    /**
     * 获取品牌关联的分类id和名字
     *
     * @param brandId 品牌id
     * @return com.yql.guli.product.vo.CatelogVo
     * @author yql
     * @date 21:32 2023/5/10
     **/
    @Override
    public CatelogVo getCateByBrandId(Long brandId) {
        if (brandId == 0){
            return null;
        }

        Long catelogId = categoryBrandRelationDao.selectOne(new LambdaQueryWrapper<CategoryBrandRelationEntity>()
                .eq(CategoryBrandRelationEntity::getBrandId, brandId)).getCatelogId();

        CategoryEntity categoryEntity = categoryDao.selectById(catelogId);
        CatelogVo catelogVo = new CatelogVo();
        BeanUtils.copyProperties(categoryEntity,catelogVo);
        return catelogVo;
    }

    /**
     * 获取分类关联的品牌id和名字
     *
     * @param catId 分类id
     * @return com.yql.guli.product.vo.CatelogVo
     * @author yql
     * @date 21:32 2023/5/10
     **/
    @Override
    public List<BrandRelationVo> getBrandByCateId(Long catId) {
        if(catId == 0){
            return null;
        }

        List<CategoryBrandRelationEntity> categoryBrandRelationEntities = categoryBrandRelationDao.selectList(new LambdaQueryWrapper<CategoryBrandRelationEntity>().eq(CategoryBrandRelationEntity::getCatelogId, catId));
        if (categoryBrandRelationEntities.isEmpty()){
            return null;
        }
        List<Long> brandIds = categoryBrandRelationEntities.stream().map(CategoryBrandRelationEntity::getBrandId).collect(Collectors.toList());
        List<BrandEntity> brandEntities = brandDao.selectBatchIds(brandIds);
        return brandEntities.stream().map(brandEntity -> {
            BrandRelationVo brandRelationVo = new BrandRelationVo();
            brandRelationVo.setBrandId(brandEntity.getBrandId());
            brandRelationVo.setBrandName(brandEntity.getName());
            return brandRelationVo;
        }).collect(Collectors.toList());
    }
}