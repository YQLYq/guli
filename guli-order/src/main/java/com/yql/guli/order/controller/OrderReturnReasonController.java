package com.yql.guli.order.controller;

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
import com.yql.guli.order.dto.OrderReturnReasonDTO;
import com.yql.guli.order.excel.OrderReturnReasonExcel;
import com.yql.guli.order.service.OrderReturnReasonService;
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
 * 退货原因
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@RestController
@RequestMapping("order/orderreturnreason")
@Api(tags="退货原因")
public class OrderReturnReasonController {
    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("order:orderreturnreason:page")
    public Result<PageData<OrderReturnReasonDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<OrderReturnReasonDTO> page = orderReturnReasonService.page(params);

        return new Result<PageData<OrderReturnReasonDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("order:orderreturnreason:info")
    public Result<OrderReturnReasonDTO> get(@PathVariable("id") Long id){
        OrderReturnReasonDTO data = orderReturnReasonService.get(id);

        return new Result<OrderReturnReasonDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("order:orderreturnreason:save")
    public Result save(@RequestBody OrderReturnReasonDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        orderReturnReasonService.saveDto(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("order:orderreturnreason:update")
    public Result update(@RequestBody OrderReturnReasonDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        orderReturnReasonService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("order:orderreturnreason:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        orderReturnReasonService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("order:orderreturnreason:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<OrderReturnReasonDTO> list = orderReturnReasonService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, OrderReturnReasonExcel.class);
    }

}