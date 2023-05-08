package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageData;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.BrandDao;
import com.yql.guli.product.dao.CategoryBrandRelationDao;
import com.yql.guli.product.dto.BrandDTO;
import com.yql.guli.product.entity.BrandEntity;
import com.yql.guli.product.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 品牌
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@Transactional
public class BrandServiceImpl extends CrudServiceImpl<BrandDao, BrandEntity, BrandDTO> implements BrandService {
    @Autowired
    CategoryBrandRelationDao categoryBrandRelationDao;
    @Override
    public QueryWrapper<BrandEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    public LambdaQueryWrapper<BrandEntity> getWrapper(Object key) {
        LambdaQueryWrapper<BrandEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(BrandEntity::getBrandId,key).or().like(BrandEntity::getName,key);

        return wrapper;
    }

    @Override
    public PageData<BrandDTO> page(Map<String, Object> params) {
        Object key = params.get("key");
        if (key == null) {
            PageData<BrandDTO> page = super.page(params);
            return page;
        } else {
            IPage<BrandEntity> attrGroupEntityIPage = baseDao.selectPage(
                    getPage(params, null, false),
                    getWrapper(key)

            );
            return getPageData(attrGroupEntityIPage, currentDtoClass());
        }

    }




    @Override
    public void updateDetail(BrandDTO dto) {
        //TODO 存在其他表需要一起更新
        this.update(dto);
        if (!StringUtils.isEmpty(dto.getName())){
            categoryBrandRelationDao.updateBrandNameByBrandId(dto.getName(), dto.getBrandId());
        }
    }
}