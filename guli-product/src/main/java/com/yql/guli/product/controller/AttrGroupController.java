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
import com.yql.guli.product.dto.AttrGroupDTO;
import com.yql.guli.product.entity.AttrEntity;
import com.yql.guli.product.excel.AttrGroupExcel;
import com.yql.guli.product.service.AttrAttrgroupRelationService;
import com.yql.guli.product.service.AttrGroupService;
import com.yql.guli.product.service.CategoryService;
import com.yql.guli.product.vo.AttrGroupBaseVo;
import com.yql.guli.product.vo.AttrGroupRelationVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;


/**
 * 属性分组
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@RestController
@RequestMapping("product/attrgroup")
@Api(tags="属性分组")
public class AttrGroupController {

    private final AttrGroupService attrGroupService;
    private final CategoryService categoryService;
    private final AttrAttrgroupRelationService attrAttrgroupRelationService;
    @Autowired
    public AttrGroupController(AttrGroupService attrGroupService, CategoryService categoryService, AttrAttrgroupRelationService attrAttrgroupRelationService) {
        this.attrGroupService = attrGroupService;
        this.categoryService = categoryService;
        this.attrAttrgroupRelationService = attrAttrgroupRelationService;
    }


    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
            @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType = "String")
    })
    @RequiresPermissions("product:attrgroup:page")
    public Result<PageData<AttrGroupDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params) {
        PageData<AttrGroupDTO> page = attrGroupService.page(params);
        return new Result<PageData<AttrGroupDTO>>().ok(page);
    }

    @GetMapping("page/{catelogId}")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("product:attrgroup:page")
    public Result<PageData<AttrGroupDTO>> pageKey(@ApiIgnore @RequestParam Map<String, Object> params,@PathVariable("catelogId") Long catelogId){
        PageData<AttrGroupDTO> page = attrGroupService.page(params, catelogId);


        return new Result<PageData<AttrGroupDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:attrgroup:info")
    public Result<AttrGroupDTO> get(@PathVariable("id") Long id){
        AttrGroupDTO data = attrGroupService.get(id);
        Long catelogId = data.getCatelogId();
        Long[] cateLogIds = categoryService.findCateLogIds(catelogId);
        data.setCatelogIds(cateLogIds);
        return new Result<AttrGroupDTO>().ok(data);
    }

    @GetMapping("{cateId}/withattr")
    @ApiOperation("信息")
    @RequiresPermissions("product:attrgroup:info")
    public R getBaseAttrByCateId(@PathVariable("cateId") Long cateId) {
       List<AttrGroupBaseVo> baseVoList = attrGroupService.getBaseAttrByCateId(cateId);
        return R.ok().put("data",baseVoList);
    }


    @GetMapping("/{attrgroupId}/attr/relation")
    @ApiOperation("信息")
    @RequiresPermissions("product:attrgroup:info")
    public R getAttrGroupRelation(@PathVariable("attrgroupId") Long id) {
        Optional<List<AttrEntity>> attrByAttrGroup = attrGroupService.getAttrByAttrGroup(id);
        List<AttrEntity> data = attrByAttrGroup.orElse(Collections.emptyList());
        return R.ok().put("data",data);
    }

    @GetMapping("/{attrgroupId}/noattr/relation")
    @ApiOperation("信息")
    @RequiresPermissions("product:attrgroup:info")
    public R getNoAttrRelation(@RequestParam Map<String,Object> map,@PathVariable("attrgroupId") Long id) {
        Optional<PageUtils<AttrEntity>> noAttrRelation = attrGroupService.getNoAttrRelation(map, id);
        PageUtils<AttrEntity> page = noAttrRelation.orElseGet(PageUtils::new);
        return R.ok("success").put("page", page);
    }


    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:attrgroup:save")
    public R save(@RequestBody AttrGroupDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        attrGroupService.saveDto(dto);

        return R.ok();
    }

    @PostMapping("/attr/relation")
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:attrgroup:save")
    public R saveRelation(@RequestBody AttrGroupRelationVo[] attrGroupRelationVos) {
        //效验数据
        ValidatorUtils.validateEntity(attrGroupRelationVos, AddGroup.class, DefaultGroup.class);
        attrAttrgroupRelationService.saveAttrGroupRelationVo(attrGroupRelationVos);

        return R.ok();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:attrgroup:update")
    public R update(@RequestBody AttrGroupDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        attrGroupService.update(dto);

        return R.ok();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:attrgroup:delete")
    public R delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        attrGroupService.delete(ids);

        return R.ok();
    }

    @DeleteMapping("/attr/relation")
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:attrgroup:delete")
    public R delete(@RequestBody AttrGroupRelationVo[] relationVos) {
        attrGroupService.deleteAttrRelation(relationVos);
        return R.ok();
    }
    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:attrgroup:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<AttrGroupDTO> list = attrGroupService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, AttrGroupExcel.class);
    }

}