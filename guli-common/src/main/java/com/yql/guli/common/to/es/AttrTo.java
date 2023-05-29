package com.yql.guli.common.to.es;

import lombok.Data;

@Data
public class AttrTo {

    /**
     * 属性id
     */
    private Long attrId;
    /**
     * 属性名
     */
    private String attrName;
    /**
     * 属性值
     */
    private String attrValue;
    private Long spuId;
}
