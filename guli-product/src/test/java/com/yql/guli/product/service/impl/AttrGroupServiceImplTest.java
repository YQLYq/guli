package com.yql.guli.product.service.impl;

import com.yql.guli.product.service.AttrGroupService;
import com.yql.guli.product.vo.SpuItemAttrGroupVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Slf4j
class AttrGroupServiceImplTest {
    @Autowired
    private AttrGroupService attrGroupService;
    @Test
    void getAttrGroupWithAttrBySpuId() {
        List<SpuItemAttrGroupVo> attrGroupWithAttrBySpuId = attrGroupService.getAttrGroupWithAttrBySpuId(2L);
        log.info(attrGroupWithAttrBySpuId.toString());
    }
}