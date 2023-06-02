package com.yql.guli.product.service.impl;

import com.yql.guli.product.service.SkuSaleAttrValueService;
import com.yql.guli.product.vo.SkuItemSaleAttrVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Slf4j
class SkuSaleAttrValueServiceImplTest {
    @Autowired
    private SkuSaleAttrValueService skuSaleAttrValueService;
    @Test
    void getSpuSaleWithAttrBySpuId() {
        List<SkuItemSaleAttrVo> spuSaleWithAttrBySpuId = skuSaleAttrValueService.getSpuSaleWithAttrBySpuId(6L);
        log.info(spuSaleWithAttrBySpuId.toString());
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


}