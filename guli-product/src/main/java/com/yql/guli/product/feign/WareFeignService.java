package com.yql.guli.product.feign;

import com.yql.guli.common.to.SkuHasStockVo;
import com.yql.guli.common.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient("guli-ware")
public interface WareFeignService {
    @PostMapping("ware/waresku/hasStock")
    Result<List<SkuHasStockVo>> getSkuHasStock(@RequestBody List<Long> skuIds);
}
