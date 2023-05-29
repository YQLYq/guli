package com.yql.guli.product.web;

import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.service.CategoryService;
import com.yql.guli.product.vo.Level2Vo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping({"/","/index.html"})
    public String home(Model model) {
        List<CategoryEntity> categoryList = categoryService.getLevel1Categorys();
        model.addAttribute("categorys",categoryList);
        return "index";
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
