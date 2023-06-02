package com.yql.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yql.guli.common.service.impl.CrudServiceImpl;
import com.yql.guli.product.dao.ProductAttrValueDao;
import com.yql.guli.product.dto.ProductAttrValueDTO;
import com.yql.guli.product.entity.ProductAttrValueEntity;
import com.yql.guli.product.service.ProductAttrValueService;
import com.yql.guli.product.vo.SpuItemAttrGroupVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * spu属性值
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Service
public class ProductAttrValueServiceImpl extends CrudServiceImpl<ProductAttrValueDao, ProductAttrValueEntity, ProductAttrValueDTO> implements ProductAttrValueService {
    @Autowired
    private ProductAttrValueDao productAttrValueDao;

    @Override
    public QueryWrapper<ProductAttrValueEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<ProductAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public List<ProductAttrValueEntity> getBaseGetListForSpu(Long spuId) {
        return productAttrValueDao.selectAllBySpuId(spuId);
    }

    @Override
    public void updateBySpuId(List<ProductAttrValueEntity> dto, Long spuId) {
        this.baseMapper.delete(new LambdaQueryWrapper<ProductAttrValueEntity>().eq(ProductAttrValueEntity::getSpuId, spuId));
        List<ProductAttrValueEntity> collect = dto.stream().map(item -> {
            item.setSpuId(spuId);
            return item;
        }).collect(Collectors.toList());
        this.saveBatch(collect);
    }


    /**
     * 根据spuId查询attr的信息
     *
     * @param spuId 商品基本Id
     * @return 返回attr的名字和值
     */
    @Override
    public Map<Long, ProductAttrValueEntity> getAttrItemBySpuId(Long spuId) {
        LambdaQueryWrapper<ProductAttrValueEntity> eq = new LambdaQueryWrapper<ProductAttrValueEntity>()
                .select(ProductAttrValueEntity::getAttrId, ProductAttrValueEntity::getAttrName, ProductAttrValueEntity::getAttrValue)
                .eq(ProductAttrValueEntity::getSpuId, spuId);
        return baseMapper.selectList(eq).stream().collect(Collectors.toMap(ProductAttrValueEntity::getAttrId, Function.identity()));
    }
}