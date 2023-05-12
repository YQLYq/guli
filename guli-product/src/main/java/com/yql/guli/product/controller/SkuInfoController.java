package com.yql.guli.product.controller;

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
import com.yql.guli.product.dto.SkuInfoDTO;
import com.yql.guli.product.entity.SkuInfoEntity;
import com.yql.guli.product.excel.SkuInfoExcel;
import com.yql.guli.product.service.SkuInfoService;
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
 * sku信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@RestController
@RequestMapping("product/skuinfo")
@Api(tags="sku信息")
public class SkuInfoController {
    @Autowired
    private SkuInfoService skuInfoService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("product:skuinfo:page")
    public Result<PageData<SkuInfoDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<SkuInfoDTO> page = skuInfoService.page(params);

        return new Result<PageData<SkuInfoDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:skuinfo:info")
    public Result<SkuInfoDTO> get(@PathVariable("id") Long id){
        SkuInfoDTO data = skuInfoService.get(id);

        return new Result<SkuInfoDTO>().ok(data);
    }

    @GetMapping("list")
    @ApiOperation("信息")
    @RequiresPermissions("product:skuinfo:info")
    public R list(@RequestParam Map<String, Object> params ) {
        PageUtils<SkuInfoEntity> page = skuInfoService.getSkuInfo(params);

        return R.ok().put("page",page);
    }
    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:skuinfo:save")
    public Result save(@RequestBody SkuInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        skuInfoService.saveDto(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:skuinfo:update")
    public Result update(@RequestBody SkuInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        skuInfoService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:skuinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        skuInfoService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:skuinfo:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SkuInfoDTO> list = skuInfoService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SkuInfoExcel.class);
    }

}