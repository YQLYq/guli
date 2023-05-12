package com.yql.guli.member.controller;

import com.yql.guli.common.annotation.LogOperation;
import com.yql.guli.common.constant.Constant;
import com.yql.guli.common.page.PageData;
import com.yql.guli.common.page.PageUtils;
import com.yql.guli.common.utils.ExcelUtils;
import com.yql.guli.common.utils.R;
import com.yql.guli.common.utils.Result;
import com.yql.guli.common.validator.AssertUtils;
import com.yql.guli.common.validator.ValidatorUtils;
import com.yql.guli.common.validator.group.AddGroup;
import com.yql.guli.common.validator.group.DefaultGroup;
import com.yql.guli.common.validator.group.UpdateGroup;
import com.yql.guli.member.dto.MemberLevelDTO;
import com.yql.guli.member.entity.MemberLevelEntity;
import com.yql.guli.member.excel.MemberLevelExcel;
import com.yql.guli.member.service.MemberLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 会员等级
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@RestController
@RequestMapping("member/memberlevel")
@Api(tags="会员等级")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("member:memberlevel:page")
    public Result<PageData<MemberLevelDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<MemberLevelDTO> page = memberLevelService.page(params);

        return new Result<PageData<MemberLevelDTO>>().ok(page);
    }

    @GetMapping("/list")
    @RequiresPermissions("member:memberlevel:page")
    public R list (@ApiIgnore @RequestParam Map<String, Object> params) {
        PageUtils<MemberLevelEntity> page = memberLevelService.selectList(params);

        return R.ok().put("page",page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("member:memberlevel:info")
    public R get(@PathVariable("id") Long id){
        MemberLevelDTO data = memberLevelService.get(id);

        return R.ok().put("memberLevel",data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("member:memberlevel:save")
    public Result save(@RequestBody MemberLevelDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        memberLevelService.saveDto(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("member:memberlevel:update")
    public Result update(@RequestBody MemberLevelDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        memberLevelService.update(dto);

        return new Result();
    }


    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("member:memberlevel:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        memberLevelService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("member:memberlevel:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<MemberLevelDTO> list = memberLevelService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, MemberLevelExcel.class);
    }

}