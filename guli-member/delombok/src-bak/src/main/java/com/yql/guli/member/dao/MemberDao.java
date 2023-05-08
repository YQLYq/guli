package com.yql.guli.member.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface MemberDao extends BaseDao<MemberEntity> {
	
}