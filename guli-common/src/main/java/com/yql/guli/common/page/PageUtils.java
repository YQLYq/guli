package com.yql.guli.common.page;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类 ("totalCount",
 * "pageSize",
 * "totalPage",
 * "currPage",)
 * @author ASUS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分页数据")
public class PageUtils<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**总计数*/
    private Long totalCount;
    /**页码大小*/
    private Long pageSize;
    /**总页码*/
    private Long totalPage;
    /**当前页码*/
    private Long currPage;
    /**数据*/
    private List<T> list;

    public PageUtils(IPage iPage,List<T> list) {
        this.totalPage = iPage.getPages();
        this.pageSize = iPage.getSize();
        this.totalCount = iPage.getTotal();
        this.currPage = iPage.getCurrent();
        this.list = list;
    }

    public PageUtils(IPage iPage) {
        this.totalPage = iPage.getPages();
        this.pageSize = iPage.getSize();
        this.totalCount = iPage.getTotal();
        this.currPage = iPage.getCurrent();
        this.list = iPage.getRecords();
    }
}
