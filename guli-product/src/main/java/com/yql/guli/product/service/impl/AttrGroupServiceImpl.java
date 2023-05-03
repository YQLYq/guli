package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageData;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.AttrGroupDao;
import com.yql.guli.product.dto.AttrGroupDTO;
import com.yql.guli.product.entity.AttrGroupEntity;
import com.yql.guli.product.service.AttrGroupService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
public class AttrGroupServiceImpl extends CrudServiceImpl<AttrGroupDao, AttrGroupEntity, AttrGroupDTO> implements AttrGroupService {

    @Override
    public QueryWrapper<AttrGroupEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    /**
     * 查询关键
     * @author yql
     * @date 19:54 2023/5/3
     * @param
     * @return com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper<com.yql.guli.product.entity.AttrGroupEntity>
     **/
    public LambdaQueryWrapper<AttrGroupEntity> getWrapper(Map<String, Object> params, Long catelogId) {
        String key = (String) params.get("key");

        LambdaQueryWrapper<AttrGroupEntity> wrapper= new LambdaQueryWrapper<>();
        wrapper.eq(AttrGroupEntity::getCatelogId,catelogId);
        if(!StringUtils.isEmpty(key)){
            wrapper.and((obj)->{
                obj.eq(AttrGroupEntity::getAttrGroupId,key).or().like(AttrGroupEntity::getAttrGroupName,key);
            });
            return  wrapper;
        }

        return wrapper;
    }


    @Override
    public PageData<AttrGroupDTO> page(Map<String, Object> params, Long catelogId) {

        if(catelogId == 0){
            PageData<AttrGroupDTO> page = this.page(params);
            return page;
        }else {
            IPage<AttrGroupEntity> attrGroupEntityIPage = baseDao.selectPage(
                    getPage(params, null, false),
                    this.getWrapper(params,catelogId)
            );
            return getPageData(attrGroupEntityIPage, currentDtoClass());
        }

    }
}