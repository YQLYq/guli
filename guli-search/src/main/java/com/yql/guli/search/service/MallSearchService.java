package com.yql.guli.search.service;

import com.yql.guli.search.vo.SearchParam;
import com.yql.guli.search.vo.SearchResult;

public interface MallSearchService {
    /**
     * 索引key 或者 分类
     * @author yql
     * @date 11:52 2023/5/24
     * @param 
     * @return java.lang.Object
     **/
    SearchResult search(SearchParam searchParam);
}
