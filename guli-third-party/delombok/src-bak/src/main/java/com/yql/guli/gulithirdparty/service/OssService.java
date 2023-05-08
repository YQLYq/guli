package com.yql.guli.gulithirdparty.service;

import java.util.Map;

/**
 * COS的基本功能
 * @author yql
 * @date 20:38 2023/4/26
 * @param 
 * @return 
 **/

public interface OssService {
    /**
     * 获取签名
     * @author yql
     * @date 16:07 2023/4/29
     * @param 
     * @return java.util.Map<java.lang.String,java.lang.String>
     **/
    public Map<String, String> getPolicy();

}
