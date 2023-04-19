package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Data
public class MemberCollectSubjectExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "subject_id")
    private Long subjectId;
    @Excel(name = "subject_name")
    private String subjectName;
    @Excel(name = "subject_img")
    private String subjectImg;
    @Excel(name = "活动url")
    private String subjectUrll;

}