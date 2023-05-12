package com.yql.guli.product.feign;

import com.yql.guli.common.to.SkuReductionTo;
import com.yql.guli.common.to.SpuBoundTo;
import com.yql.guli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient("guli-coupon")
public interface CouponFeignService {
    @PostMapping("coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);
    @PostMapping("coupon/skufullreduction/saveinfo")
    R saveSkuRedction(@RequestBody SkuReductionTo skuReductionTo);
}
