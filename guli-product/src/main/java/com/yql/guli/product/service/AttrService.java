package com.yql.guli.product.service;

import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.AttrDTO;
import com.yql.guli.product.entity.AttrEntity;
import com.yql.guli.product.vo.AttrInfoVO;
import com.yql.guli.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface AttrService extends CrudService<AttrEntity, AttrDTO> {
    void saveAttr(AttrDTO dto);


    PageUtils<AttrVo> queryBaseAttrPage(Map<String, Object> map, Long catelogid);

    AttrInfoVO getInfo(Long id);

    void updateAttr(AttrDTO dto);

    PageUtils<AttrVo> querySaleAttrPage(Map<String, Object> map, Long catelogid);
    /**
     * 查询可以被索引的属性
     * @author yql
     * @date 20:59 2023/5/16
     * @param 
     * @return java.util.List<java.lang.Long>
     **/
    List<Long> selectSearchAttrs(List<Long> attrIds);
}