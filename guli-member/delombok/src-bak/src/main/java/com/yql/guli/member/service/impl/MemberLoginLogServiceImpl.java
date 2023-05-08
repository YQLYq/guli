package com.yql.guli.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.member.dao.MemberLoginLogDao;
import com.yql.guli.member.dto.MemberLoginLogDTO;
import com.yql.guli.member.entity.MemberLoginLogEntity;
import com.yql.guli.member.service.MemberLoginLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class MemberLoginLogServiceImpl extends CrudServiceImpl<MemberLoginLogDao, MemberLoginLogEntity, MemberLoginLogDTO> implements MemberLoginLogService {

    @Override
    public QueryWrapper<MemberLoginLogEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberLoginLogEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}