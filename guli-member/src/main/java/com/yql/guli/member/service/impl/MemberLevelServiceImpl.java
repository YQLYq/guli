package com.yql.guli.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.member.dao.MemberLevelDao;
import com.yql.guli.member.dto.MemberLevelDTO;
import com.yql.guli.member.entity.MemberLevelEntity;
import com.yql.guli.member.service.MemberLevelService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Service
public class MemberLevelServiceImpl extends CrudServiceImpl<MemberLevelDao, MemberLevelEntity, MemberLevelDTO> implements MemberLevelService {

    private final MemberLevelDao memberLevelDao;

    @Autowired
    public MemberLevelServiceImpl(MemberLevelDao memberLevelDao) {
        this.memberLevelDao = memberLevelDao;
    }

    @Override
    public QueryWrapper<MemberLevelEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberLevelEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    public LambdaQueryWrapper<MemberLevelEntity> getKeyWrapper(Map<String, Object> params) {
        String key = (String) params.get("key");

        LambdaQueryWrapper<MemberLevelEntity> wrapper = new LambdaQueryWrapper<>();
        if(key!=null){
            wrapper.eq(MemberLevelEntity::getId,key).or().like(MemberLevelEntity::getName,key);
        }

        return wrapper;
    }

    /**
     * 获取 分页数据
     *
     * @param params 请求参数
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.member.dto.MemberLevelDTO>
     * @author yql
     * @date 18:01 2023/5/10
     **/
    @Override
    public PageUtils<MemberLevelEntity> selectList(Map<String, Object> params) {
        LambdaQueryWrapper<MemberLevelEntity> keyWrapper = this.getKeyWrapper(params);
        IPage<MemberLevelEntity> memberLevelEntityIPage = memberLevelDao.selectPage(new PageUtil<MemberLevelEntity>().getPage(params), keyWrapper);
        return new PageUtils<>(memberLevelEntityIPage);
    }
}