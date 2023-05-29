package com.yql.guli.search.controller;

import com.yql.guli.search.service.MallSearchService;
import com.yql.guli.search.vo.SearchParam;
import com.yql.guli.search.vo.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SearchController {
    @Autowired
    private MallSearchService mallSearchService;
    @GetMapping("/list.html")
    public String listPage(SearchParam searchParam, Model model){
        SearchResult searchResponse = mallSearchService.search(searchParam);
        model.addAttribute("searchResponse",searchResponse);
        return "list";
    }

}
