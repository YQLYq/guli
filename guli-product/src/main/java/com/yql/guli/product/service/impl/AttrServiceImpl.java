package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yql.guli.common.constant.ProductConstant;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.common.utils.PageUtil;
import com.yql.guli.product.dao.AttrAttrgroupRelationDao;
import com.yql.guli.product.dao.AttrDao;
import com.yql.guli.product.dao.AttrGroupDao;
import com.yql.guli.product.dao.CategoryDao;
import com.yql.guli.product.dto.AttrDTO;
import com.yql.guli.product.entity.AttrAttrgroupRelationEntity;
import com.yql.guli.product.entity.AttrEntity;
import com.yql.guli.product.entity.AttrGroupEntity;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.AttrService;
import com.yql.guli.product.service.CategoryService;
import com.yql.guli.product.vo.AttrInfoVO;
import com.yql.guli.product.vo.AttrVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 商品属性
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class AttrServiceImpl extends CrudServiceImpl<AttrDao, AttrEntity, AttrDTO> implements AttrService {

    private final AttrAttrgroupRelationDao relationDao;

    private final AttrGroupDao attrGroupDao;

    private final CategoryDao categoryDao;

    private final AttrDao attrDao;

    private final CategoryService categoryService;
    @Autowired
    public AttrServiceImpl(AttrAttrgroupRelationDao relationDao, AttrGroupDao attrGroupDao, CategoryDao categoryDao, AttrDao attrDao, CategoryService categoryService) {
        this.relationDao = relationDao;
        this.attrGroupDao = attrGroupDao;
        this.categoryDao = categoryDao;
        this.attrDao = attrDao;
        this.categoryService = categoryService;
    }

    @Override
    public QueryWrapper<AttrEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");
        QueryWrapper<AttrEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);
        return wrapper;
    }


    @Override
    public void saveAttr(AttrDTO dto) {
        Optional.ofNullable(dto).ifPresent(attr -> {
            this.saveDto(attr);
            if (attr.getAttrType() == ProductConstant.AttrEnum.ATTR_TYPE_BASE.getCode() && attr.getAttrGroupId() != null) {
                AttrAttrgroupRelationEntity relationEntity = new AttrAttrgroupRelationEntity();
                relationEntity.setAttrId(attr.getAttrId());
                relationEntity.setAttrGroupId(attr.getAttrGroupId());
                relationDao.insert(relationEntity);
            }
        });
    }


    @Override
    public AttrInfoVO getInfo(Long id) {
        AttrInfoVO attrInfoVO = new AttrInfoVO();
        AttrEntity attrEntity = attrDao.selectById(id);
        BeanUtils.copyProperties(attrEntity,attrInfoVO);
        AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = relationDao.selectOne(new LambdaQueryWrapper<AttrAttrgroupRelationEntity>()
                .eq(AttrAttrgroupRelationEntity::getAttrId, attrInfoVO.getAttrId()));
        if (attrAttrgroupRelationEntity != null){
            attrInfoVO.setAttrGroupId(attrAttrgroupRelationEntity.getAttrGroupId());
            AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(attrAttrgroupRelationEntity.getAttrGroupId());
            if (attrGroupEntity !=null){
                attrInfoVO.setGroupName(attrGroupEntity.getAttrGroupName());
            }
        }
        Long[] cateLogIds = categoryService.findCateLogIds(attrInfoVO.getCatelogId());
        attrInfoVO.setCatelogPath(cateLogIds);
        CategoryEntity categoryEntity = categoryDao.selectById(attrInfoVO.getCatelogId());

        attrInfoVO.setCatelogName(categoryEntity.getName());
        return attrInfoVO;
    }

    @Override
    public void updateAttr(AttrDTO dto) {
        AttrInfoVO info = this.getInfo(dto.getAttrId());
        this.update(dto);
        if (!Objects.equals(dto.getAttrGroupId(),info.getAttrGroupId())){
            relationDao.updateAttrGroupIdByAttrId(dto.getAttrGroupId(),dto.getAttrId());
        }
    }
    /**
     * 查询分类销售属性
     * @author yql
     * @date 15:08 2023/5/8
     * @param map 前端传入的数据
     * @param catelogid 分类id
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.product.vo.AttrVo>
     **/
    @Override
    public PageUtils<AttrVo> querySaleAttrPage(Map<String, Object> map, Long catelogid) {
        PageUtils<AttrVo> pageUtils = new PageUtils<>();

        LambdaQueryWrapper<AttrEntity> attrEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        attrEntityLambdaQueryWrapper.eq(AttrEntity::getAttrType, ProductConstant.AttrEnum.ATTR_TYPE_SALE.getCode());
        return queryAttrPage(pageUtils,attrEntityLambdaQueryWrapper,map,catelogid,ProductConstant.AttrEnum.ATTR_TYPE_SALE.getCode());
    }
    
    /**
     * 查询 属性详情
     * @author yql
     * @date 15:47 2023/5/8
     * @param code  属性类型
     * @return PageUtils
     **/
    public PageUtils<AttrVo> queryAttrPage(PageUtils<AttrVo> pageUtils,LambdaQueryWrapper<AttrEntity> attrEntityLambdaQueryWrapper ,Map<String, Object> map, Long catelogid,int code){

        //如果catelogid不为空 查询
        if (catelogid != 0) {
            attrEntityLambdaQueryWrapper.and(wrapper -> wrapper.eq(AttrEntity::getCatelogId, catelogid));
        }
        //获取key
        String key = (String) map.get("key");
        //判断key是否为空 否则查询
        if (!StringUtils.isEmpty(key)) {
            attrEntityLambdaQueryWrapper.and(wrapper -> wrapper.eq(AttrEntity::getAttrId, key).or().like(AttrEntity::getAttrName, key));
        }
        //查询page
        IPage<AttrEntity> page = this.page(
                new PageUtil<AttrEntity>().getPage(map),
                attrEntityLambdaQueryWrapper
        );
        //获取数据
        List<AttrEntity> records = page.getRecords();
        //获取新的list 加入cateName 和 groupName
        List<AttrVo> collect = records.stream().map((attrEntity -> {
            AttrVo attrVo = new AttrVo();
            //复制过去
            BeanUtils.copyProperties(attrEntity, attrVo);
            if(code != ProductConstant.AttrEnum.ATTR_TYPE_SALE.getCode()){
                AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = relationDao.selectOne(new LambdaQueryWrapper<AttrAttrgroupRelationEntity>()
                        .eq(AttrAttrgroupRelationEntity::getAttrId, attrEntity.getAttrId()));
                if (attrAttrgroupRelationEntity != null) {
                    AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(attrAttrgroupRelationEntity.getAttrGroupId());
                    Optional.ofNullable(attrGroupEntity)
                            .ifPresent(group -> {
                                attrVo.setGroupName(group.getAttrGroupName());
                                attrVo.setAttrGroupId(group.getAttrGroupId());
                            });
                }
            }
            CategoryEntity categoryEntity = categoryDao.selectById(attrEntity.getCatelogId());
            Optional.ofNullable(categoryEntity).ifPresent(i -> attrVo.setCatelogName(categoryEntity.getName()));
            return attrVo;
        })).collect(Collectors.toList());
        pageUtils.setList(collect);
        return pageUtils;
    }
    
    /**
     * 查询 基本属性详情
     * @author yql
     * @date 15:08 2023/5/8
     * @param map 前端传入的数据
     * @param catelogid 分类id
     * @return com.yql.guli.common.page.PageUtils<com.yql.guli.product.vo.AttrVo>
     **/
    @Override
    public PageUtils<AttrVo> queryBaseAttrPage(Map<String, Object> map, Long catelogid) {
        PageUtils<AttrVo> pageUtils = new PageUtils<>();
        LambdaQueryWrapper<AttrEntity> attrEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        attrEntityLambdaQueryWrapper.eq(AttrEntity::getAttrType, ProductConstant.AttrEnum.ATTR_TYPE_BASE.getCode());
        return queryAttrPage(pageUtils, attrEntityLambdaQueryWrapper, map, catelogid, ProductConstant.AttrEnum.ATTR_TYPE_BASE.getCode());

    }
}