package com.yql.guli.product.controller;

import com.yql.guli.common.annotation.LogOperation;
import com.yql.guli.common.constant.Constant;
import com.yql.guli.common.page.PageData;
import com.yql.guli.common.utils.ExcelUtils;
import com.yql.guli.common.utils.Result;
import com.yql.guli.common.validator.AssertUtils;
import com.yql.guli.common.validator.ValidatorUtils;
import com.yql.guli.common.validator.group.AddGroup;
import com.yql.guli.common.validator.group.DefaultGroup;
import com.yql.guli.common.validator.group.UpdateGroup;
import com.yql.guli.product.dto.AttrAttrgroupRelationDTO;
import com.yql.guli.product.excel.AttrAttrgroupRelationExcel;
import com.yql.guli.product.service.AttrAttrgroupRelationService;
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
 * 属性&属性分组关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@RestController
@RequestMapping("product/attrattrgrouprelation")
@Api(tags="属性&属性分组关联")
public class AttrAttrgroupRelationController {
    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("product:attrattrgrouprelation:page")
    public Result<PageData<AttrAttrgroupRelationDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<AttrAttrgroupRelationDTO> page = attrAttrgroupRelationService.page(params);

        return new Result<PageData<AttrAttrgroupRelationDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:attrattrgrouprelation:info")
    public Result<AttrAttrgroupRelationDTO> get(@PathVariable("id") Long id){
        AttrAttrgroupRelationDTO data = attrAttrgroupRelationService.get(id);

        return new Result<AttrAttrgroupRelationDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:attrattrgrouprelation:save")
    public Result save(@RequestBody AttrAttrgroupRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        attrAttrgroupRelationService.saveDto(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:attrattrgrouprelation:update")
    public Result update(@RequestBody AttrAttrgroupRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        attrAttrgroupRelationService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:attrattrgrouprelation:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        attrAttrgroupRelationService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:attrattrgrouprelation:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<AttrAttrgroupRelationDTO> list = attrAttrgroupRelationService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, AttrAttrgroupRelationExcel.class);
    }

}