package com.yql.guli.ware.controller;

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
import com.yql.guli.ware.dto.PurchaseDTO;
import com.yql.guli.ware.entity.PurchaseEntity;
import com.yql.guli.ware.excel.PurchaseExcel;
import com.yql.guli.ware.service.PurchaseService;
import com.yql.guli.ware.vo.DoneVo;
import com.yql.guli.ware.vo.MergeVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 采购信息
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-19
 */
@RestController
@RequestMapping("ware/purchase")
@Api(tags="采购信息")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("ware:purchase:page")
    public Result<PageData<PurchaseDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<PurchaseDTO> page = purchaseService.page(params);

        return new Result<PageData<PurchaseDTO>>().ok(page);
    }

    @GetMapping("list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils<PurchaseEntity> page = purchaseService.getSkuInfo(params);

        return R.ok(Constant.SUCCESS_String).put("page", page);
    }

    @GetMapping("/unreceive/list")
    public R unreceiveList(@RequestParam Map<String, Object> params) {
        PageUtils<PurchaseEntity> page = purchaseService.getUnreceiveList(params);
        return R.ok(Constant.SUCCESS_String).put("page", page);
    }


    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("ware:purchase:info")
    public Result<PurchaseDTO> get(@PathVariable("id") Long id){
        PurchaseDTO data = purchaseService.get(id);
        return new Result<PurchaseDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("ware:purchase:save")
    public Result save(@RequestBody PurchaseDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);
        dto.setCreateTime(new Date());
        dto.setUpdateTime(new Date());
        purchaseService.saveDto(dto);

        return new Result();
    }

    @PostMapping("/save")
    public R saveInfo(@RequestBody PurchaseDTO dto) {
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);
        dto.setUpdateTime(new Date());
        purchaseService.saveDto(dto);

        return R.ok(Constant.SUCCESS_String);
    }

    @PostMapping("/merge")
    public R saveInfo(@RequestBody MergeVo mergeVo) {
        purchaseService.saveMerge(mergeVo);

        return R.ok(Constant.SUCCESS_String);
    }
    /**
     * 领取采购单
     * @author yql
     * @date 12:51 2023/5/13
     * @param 
     * @return com.yql.guli.common.utils.R
     **/
    @PostMapping("/received")
    public R getPurchaseOrder(@RequestBody Long[] purchId) {
        purchaseService.getPurchaseOrder(purchId);

        return R.ok(Constant.SUCCESS_String);
    }

    @PostMapping("/done")
    public R donePurChase(@RequestBody DoneVo doneVo) {
        return purchaseService.donePurChase(doneVo);
    }
    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("ware:purchase:update")
    public Result update(@RequestBody PurchaseDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        purchaseService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("ware:purchase:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        purchaseService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("ware:purchase:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PurchaseDTO> list = purchaseService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, PurchaseExcel.class);
    }

}