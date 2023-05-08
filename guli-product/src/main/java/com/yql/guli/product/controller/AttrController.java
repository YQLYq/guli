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
import com.yql.guli.product.dto.AttrDTO;
import com.yql.guli.product.excel.AttrExcel;
import com.yql.guli.product.service.AttrService;
import com.yql.guli.product.vo.AttrInfoVO;
import com.yql.guli.product.vo.AttrVo;
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
 * 商品属性
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@RestController
@RequestMapping("product/attr")
@Api(tags="商品属性")
public class AttrController {

    private AttrService attrService;

    @Autowired
    public void setAttrService(AttrService attrService) {
        this.attrService = attrService;
    }

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("product:attr:page")
    public Result<PageData<AttrDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<AttrDTO> page = attrService.page(params);

        return new Result<PageData<AttrDTO>>().ok(page);
    }
    /**
     * 查询属性详情
     * @author yql
     * @date 19:27 2023/5/6
     * @param id-属性分组id
     * @return com.yql.guli.common.utils.R
     **/
    @GetMapping("/info/{attrId}")
    @RequiresPermissions("product:attr:info")
    public R getAttrInfo(@PathVariable("attrId") Long id){
        AttrInfoVO attrInfoVO = attrService.getInfo(id);

        return R.ok().put("attr",attrInfoVO);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:attr:info")
    public Result<AttrDTO> get(@PathVariable("id") Long id) {
        AttrDTO data = attrService.get(id);

        return new Result<AttrDTO>().ok(data);
    }


    @GetMapping("/base/list/{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:attr:info")
    public R  baseGetAttrList(@RequestParam Map<String,Object> map, @PathVariable("id") Long catelogid) {
        PageUtils<AttrVo> page = attrService.queryBaseAttrPage(map,catelogid);

        return R.ok().put("page",page);
    }

    @GetMapping("/sale/list/{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:attr:info")
    public R saleGetAttrList(@RequestParam Map<String, Object> map, @PathVariable("id") Long catelogid) {
        PageUtils<AttrVo> page = attrService.querySaleAttrPage(map, catelogid);

        return R.ok().put("page", page);
    }
    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:attr:save")
    public R save(@RequestBody AttrDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);
        attrService.saveDto(dto);
        return  R.ok();
    }

    @PostMapping("/save")
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:attr:save")
    public R saveAttr(@RequestBody AttrDTO dto) {
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        attrService.saveAttr(dto);
        return R.ok();
    }
    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:attr:update")
    public R update(@RequestBody AttrDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        attrService.update(dto);

        return R.ok();
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:attr:update")
    public R updateAttr(@RequestBody AttrDTO dto) {
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        attrService.updateAttr(dto);

        return R.ok();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:attr:delete")
    public R delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        attrService.delete(ids);

        return R.ok();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:attr:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<AttrDTO> list = attrService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, AttrExcel.class);
    }

}