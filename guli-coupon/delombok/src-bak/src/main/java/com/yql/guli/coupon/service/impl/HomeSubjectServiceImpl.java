package com.yql.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.coupon.dao.HomeSubjectDao;
import com.yql.guli.coupon.dto.HomeSubjectDTO;
import com.yql.guli.coupon.entity.HomeSubjectEntity;
import com.yql.guli.coupon.service.HomeSubjectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class HomeSubjectServiceImpl extends CrudServiceImpl<HomeSubjectDao, HomeSubjectEntity, HomeSubjectDTO> implements HomeSubjectService {

    @Override
    public QueryWrapper<HomeSubjectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<HomeSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}