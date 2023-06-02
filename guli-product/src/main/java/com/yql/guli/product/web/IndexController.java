package com.yql.guli.product.web;

import com.yql.guli.common.utils.Result;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.CategoryService;
import com.yql.guli.product.service.SkuInfoService;
import com.yql.guli.product.vo.Level2Vo;
import com.yql.guli.product.vo.SkuItemVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@AllArgsConstructor
public class IndexController {
    private CategoryService categoryService;
    private SkuInfoService skuInfoService;
    @GetMapping({"/","/index.html"})
    public String home(Model model) {
        List<CategoryEntity> categoryList = categoryService.getLevel1Categorys();
        model.addAttribute("categorys",categoryList);
        return "index";
    }
    @GetMapping({"/{skuId}.html"})
    public String jumpToProductDetailsPage(@PathVariable("skuId") Long skuId, Model model) {
        Result<SkuItemVo> result = skuInfoService.getProductDetailsInformation(skuId);
        SkuItemVo data = result.getData();
        model.addAttribute("result",data);
        return "item";
    }
    /**
     * 渲染三级分类
     * @author yql
     * @date 20:42 2023/5/17
     * @param 
     * @return 
     **/
    @ResponseBody
    @GetMapping("/index/catalog.json")
    public Map<String,List<Level2Vo>> level3Categorys(){
        return categoryService.getLevel2Categorys();
    }

}
