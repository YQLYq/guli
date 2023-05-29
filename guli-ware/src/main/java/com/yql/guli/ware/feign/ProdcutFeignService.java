package com.yql.guli.ware.feign;

import com.yql.guli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("guli-product")
public interface ProdcutFeignService {
    @GetMapping("product/skuinfo/{id}")
    R get(@PathVariable("id") Long id);
}
