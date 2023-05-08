package com.yql.guli.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.member.dao.MemberCollectSubjectDao;
import com.yql.guli.member.dto.MemberCollectSubjectDTO;
import com.yql.guli.member.entity.MemberCollectSubjectEntity;
import com.yql.guli.member.service.MemberCollectSubjectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class MemberCollectSubjectServiceImpl extends CrudServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity, MemberCollectSubjectDTO> implements MemberCollectSubjectService {

    @Override
    public QueryWrapper<MemberCollectSubjectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberCollectSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}