package com.yql.guli.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 商品评价回复关系
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Data
public class CommentReplayExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "评论id")
    private Long commentId;
    @Excel(name = "回复id")
    private Long replyId;

}