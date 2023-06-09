package com.yql.guli.product.app;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yql.guli.common.annotation.LogOperation;
import com.yql.guli.common.constant.Constant;
import com.yql.guli.common.page.PageData;
import com.yql.guli.common.utils.ExcelUtils;
import com.yql.guli.common.utils.R;
import com.yql.guli.common.utils.Result;
import com.yql.guli.common.validator.AssertUtils;
import com.yql.guli.common.validator.ValidatorUtils;
import com.yql.guli.common.validator.group.AddGroup;
import com.yql.guli.common.validator.group.DefaultGroup;
import com.yql.guli.common.validator.group.UpdateGroup;
import com.yql.guli.product.dto.CategoryBrandRelationDTO;
import com.yql.guli.product.entity.CategoryBrandRelationEntity;
import com.yql.guli.product.excel.CategoryBrandRelationExcel;
import com.yql.guli.product.service.CategoryBrandRelationService;
import com.yql.guli.product.vo.BrandRelationVo;
import com.yql.guli.product.vo.CatelogVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 品牌分类关联
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@RestController
@Transactional
@RequestMapping("product/categorybrandrelation")
@Api(tags="品牌分类关联")
public class CategoryBrandRelationController {
    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;

    @GetMapping("/list")
    @ApiOperation("获取品牌关联的分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType = "String")
    })
    @RequiresPermissions("product:categorybrandrelation:page")
    public R catelogList(@ApiIgnore @RequestParam("brandId") Long brandId) {
        List<CategoryBrandRelationEntity> data = categoryBrandRelationService.list(new LambdaQueryWrapper<CategoryBrandRelationEntity>().eq(CategoryBrandRelationEntity::getBrandId, brandId));
        return R.ok().put("data",data);
    }

    @GetMapping("/brands/list")
    @ApiOperation("获取品牌关联的分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType = "String")
    })
    @RequiresPermissions("product:categorybrandrelation:page")
    public R catelogListByCateId(@ApiIgnore @RequestParam("catId") Long catId) {
        List<BrandRelationVo> data = categoryBrandRelationService.getBrandByCateId(catId);
        return R.ok().put("data", data);
    }

    @GetMapping("/catelog/list")
    @ApiOperation("获取品牌关联的分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType = "String")
    })
    @RequiresPermissions("product:categorybrandrelation:page")
    public R getCateByBrandId(@ApiIgnore @RequestParam("brandId") Long brandId) {
        CatelogVo data = categoryBrandRelationService.getCateByBrandId(brandId);
        return R.ok().put("data", data);
    }

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("product:categorybrandrelation:page")
    public Result<PageData<CategoryBrandRelationDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<CategoryBrandRelationDTO> page = categoryBrandRelationService.page(params);

        return new Result<PageData<CategoryBrandRelationDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:categorybrandrelation:info")
    public Result<CategoryBrandRelationDTO> get(@PathVariable("id") Long id){
        CategoryBrandRelationDTO data = categoryBrandRelationService.get(id);

        return new Result<CategoryBrandRelationDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:categorybrandrelation:save")
    public Result save(@RequestBody CategoryBrandRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        categoryBrandRelationService.saveDto(dto);

        return new Result();
    }

    @PostMapping("/save")
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:categorybrandrelation:save")
    public Result saveId(@RequestBody CategoryBrandRelationDTO dto) {
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        categoryBrandRelationService.saveDetail(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:categorybrandrelation:update")
    public Result update(@RequestBody CategoryBrandRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        categoryBrandRelationService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:categorybrandrelation:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        categoryBrandRelationService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:categorybrandrelation:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<CategoryBrandRelationDTO> list = categoryBrandRelationService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, CategoryBrandRelationExcel.class);
    }

}