package com.yql.guli.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 会员登录记录
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@Data
public class MemberLoginLogExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "创建时间")
    private Date createTime;
    @Excel(name = "ip")
    private String ip;
    @Excel(name = "city")
    private String city;
    @Excel(name = "登录类型[1-web，2-app]")
    private Integer loginType;

}