package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.CategoryBrandRelationDao;
import com.yql.guli.product.dao.CategoryDao;
import com.yql.guli.product.dto.CategoryDTO;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
public class CategoryServiceImpl extends CrudServiceImpl<CategoryDao, CategoryEntity, CategoryDTO> implements CategoryService {

    private CategoryBrandRelationDao categoryBrandRelationDao;

    @Autowired
    public CategoryServiceImpl(CategoryBrandRelationDao categoryBrandRelationDao) {
        this.categoryBrandRelationDao = categoryBrandRelationDao;
    }

    @Override
    public QueryWrapper<CategoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public List<CategoryEntity> listWithTree() {
        return baseDao.selectList(null);
    }

    @Override
    public void deleteMenuById(List<Long> ids) {
        //TODO 1.检查 有没有被引用
        baseDao.deleteBatchIds(ids);
    }
    /**查询id路径*/
    @Override
    public Long[] findCateLogIds(Long catelogId) {
        ArrayList<Long>  list = new ArrayList<>();
        getCatPathId(list,catelogId);
        // 翻转 ArrayList 中所有元素的顺序
        Collections.reverse(list);
        // 将 ArrayList 转换成数组
        return list.toArray(new Long[0]);
    }
    /**
     * 级联更新所有关联的数据
     * @author yql
     * @date 14:43 2023/5/5
     * @param dto
     * @return void
     **/
    @Override
    public void updateCascade(CategoryDTO dto) {
        this.update(dto);
        categoryBrandRelationDao.updateCatelogNameAndCatelogId(dto.getName(),dto.getCatId());
    }

    /**查询父节点添加到list*/
    private void getCatPathId(@NotNull ArrayList<Long> list, Long catelogId) {
        //查询entity
        CategoryEntity categoryEntity = baseDao.selectById(catelogId);
        list.add(catelogId);
        while (categoryEntity.getParentCid() != 0) {
            Long parentId = categoryEntity.getParentCid();
            list.add(parentId);
            categoryEntity = baseDao.selectById(parentId);
        }
    }
}