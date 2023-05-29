package com.yql.guli.ware.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.ware.dto.WareInfoDTO;
import com.yql.guli.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
public interface WareInfoService extends CrudService<WareInfoEntity, WareInfoDTO> {

    PageUtils<WareInfoDTO> getWareInfolist(Map<String, Object> params);
}