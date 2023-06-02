package com.yql.guli.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * spu的规格参数信息
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpuItemAttrGroupVo {
    private String groupName;

    /** 两个属性attrName、attrValue */
    private List<SpuBaseAttrVo> attrs;

    /**
     * spu的规格参数信息
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SpuBaseAttrVo{
        private String attrName;

        private String attrValue;
    }
}
