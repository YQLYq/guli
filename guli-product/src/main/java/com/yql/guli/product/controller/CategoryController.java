package com.yql.guli.product.controller;

import com.yql.guli.common.annotation.LogOperation;
import com.yql.guli.common.constant.Constant;
import com.yql.guli.common.utils.ExcelUtils;
import com.yql.guli.common.utils.Result;
import com.yql.guli.common.validator.AssertUtils;
import com.yql.guli.common.validator.ValidatorUtils;
import com.yql.guli.common.validator.group.AddGroup;
import com.yql.guli.common.validator.group.DefaultGroup;
import com.yql.guli.common.validator.group.UpdateGroup;
import com.yql.guli.product.dto.CategoryDTO;
import com.yql.guli.product.entity.CategoryEntity;
import com.yql.guli.product.excel.CategoryExcel;
import com.yql.guli.product.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 商品三级分类
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@RestController
@RequestMapping("product/category")
@Api(tags="商品三级分类")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    /**
     * 查出所有分类以及子分类，以树形结构组装
     * @author yql
     * @date 20:42 2023/4/21
     * @param
     * @return
     **/
    @GetMapping("/list/tree")
    @ApiOperation("树状")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    public List<CategoryEntity> list(){
        List<CategoryEntity> entityList = categoryService.listWithTree();
        return entityList.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0).peek((menu)-> menu.setChildren(getChildren(menu,entityList))).sorted(Comparator.comparingInt(CategoryEntity::getSort)).collect(Collectors.toList());

    }

    /**
     * filter过滤子节点是否等于父节点 如果等于 peek 递归存入子节点 然后 排序 输出
     * sorted(Comparator.comparing(CategoryEntity::getSort,Comparator.nullsFirst(Integer::compareTo)))
     * 为null 则认为相同 默认 null小于非null
      * @author yql
     * @date 22:18 2023/4/21
     * @param
     * @return java.util.List<com.yql.guli.product.entity.CategoryEntity>
     **/
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, all)))
                .sorted(Comparator.comparing(CategoryEntity::getSort,Comparator.nullsFirst(Integer::compareTo).reversed()))
                .collect(Collectors.toList());
    }


    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:category:info")
    public Result<CategoryDTO> get(@PathVariable("id") Long id){
        CategoryDTO data = categoryService.get(id);

        return new Result<CategoryDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:category:save")
    public Result save(@RequestBody CategoryDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        categoryService.saveDto(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:category:update")
    public Result update(@RequestBody CategoryDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        categoryService.update(dto);

        return new Result();
    }

    @PutMapping("/list")
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:category:update")
    public Result updateList(@RequestBody List<CategoryEntity> categoryDTOS) {
        categoryService.updateBatchById(categoryDTOS);
        return new Result();
    }
    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:category:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        categoryService.deleteMenuById(Arrays.asList(ids));

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:category:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {

        List<CategoryDTO> list = categoryService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, CategoryExcel.class);
    }

}