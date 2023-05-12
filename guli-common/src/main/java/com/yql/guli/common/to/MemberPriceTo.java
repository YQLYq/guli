package com.yql.guli.common.to;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class MemberPriceTo {

    /**
     * id
     */
    private Long id;
    /**
     * name
     */
    private String name;
    /**
     * price
     */
    private BigDecimal price;
}
