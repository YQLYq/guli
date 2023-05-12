package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.AttrAttrgroupRelationDao;
import com.yql.guli.product.dto.AttrAttrgroupRelationDTO;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import com.yql.guli.product.service.AttrAttrgroupRelationService;
import com.yql.guli.product.vo.AttrGroupRelationVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 属性&属性分组关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AttrAttrgroupRelationServiceImpl extends CrudServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity, AttrAttrgroupRelationDTO> implements AttrAttrgroupRelationService {
    @Autowired
    AttrAttrgroupRelationDao attrAttrgroupRelationDao;
    @Override
    public QueryWrapper<AttrAttrgroupRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<AttrAttrgroupRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public void saveAttrGroupRelationVo(AttrGroupRelationVo[] attrGroupRelationVos) {
        List<AttrAttrgroupRelationEntity> collect = Arrays.stream(attrGroupRelationVos).map(attrGroupRelationVo -> {
            AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = new AttrAttrgroupRelationEntity();
            BeanUtils.copyProperties(attrGroupRelationVo, attrAttrgroupRelationEntity);
            return attrAttrgroupRelationEntity;
        }).collect(Collectors.toList());
        this.saveBatch(collect);
    }
}