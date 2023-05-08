package com.yql.guli.gulithirdparty.controller;

import com.yql.guli.gulithirdparty.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/oss")
@RestController
public class OssController {
    @Autowired
    OssService ossService;
    @GetMapping("/policy")
    public Map<String,String> getPolicy(){
        return ossService.getPolicy();
    }
}
