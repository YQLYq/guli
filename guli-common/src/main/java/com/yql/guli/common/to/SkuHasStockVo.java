package com.yql.guli.common.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkuHasStockVo {
    private Long skuId;
    private Boolean hasStock;
}
