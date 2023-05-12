package com.yql.guli.member.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.member.dto.MemberLevelDTO;
import com.yql.guli.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public interface MemberLevelService extends CrudService<MemberLevelEntity, MemberLevelDTO> {
    /**
     *  获取 分页数据
     * @author yql
     * @date 18:01 2023/5/10
     * @param params 请求参数
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.member.dto.MemberLevelDTO>
     **/
    PageUtils<MemberLevelEntity> selectList(Map<String, Object> params);
}