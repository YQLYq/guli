package com.yql.guli.member.dao;

import com.yql.guli.common.dao.BaseDao;
import com.yql.guli.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseDao<GrowthChangeHistoryEntity> {
	
}