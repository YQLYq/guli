package com.yql.guli.product.feign;

import com.yql.guli.common.to.es.AttrTo;
import com.yql.guli.common.to.es.SkuEsModel;
import com.yql.guli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("guli-search")
@Component
public interface SearchFeignService {
    @PostMapping("/search/save/product")
    R productStatusUp(@RequestBody List<SkuEsModel> list) ;
    @DeleteMapping("/search/save/product")
    public R productDelete(@RequestBody Long spuId);
    @PutMapping("/search/save/product")
    public R productUpdate(@RequestBody List<AttrTo> dto);
}
