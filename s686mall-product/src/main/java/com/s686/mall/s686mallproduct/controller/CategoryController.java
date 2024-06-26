package com.s686.mall.s686mallproduct.controller;


import com.s686.mall.s686mallcommon.utils.R;
import com.s686.mall.s686mallproduct.entity.CategoryEntity;
import com.s686.mall.s686mallproduct.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;


/**
 * 商品三级分类
 *
 * @author SR
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类以及子分类，以树形结构组装起来
     */
    //http:localhost:9001/product/category/list/tree
    //http://localhost:88/api/product/category/list/tree
    @RequestMapping("/list/tree")
    public R list() {

        List<CategoryEntity> entities = categoryService.listWithTree();

        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    //http://localhost:88/api/product/category/info/{catId}
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    //http://localhost:88/api/product/category/save
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@Valid @RequestBody CategoryEntity category) {
        System.out.println("ssssssssssssssssssssssssssssssssssss================save");
        categoryService.save(category);

        return R.ok();
    }

    @RequestMapping("/update/sort")
    //@RequiresPermissions("product:category:update")
    public R updateSort(@RequestBody CategoryEntity[] category) {
        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }

    /**
     * 修改
     */
    //http://localhost:88/api/product/category/update
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa================u0pate");
        categoryService.updateCascade(category);
        return R.ok();
    }

    /**
     * 修改
     */
    //http://localhost:88/api/product/category/update
    @RequestMapping("/updateById")
    //@RequiresPermissions("product:category:update")
    public R updateById(@RequestBody CategoryEntity category) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa================updateById");
        categoryService.updateById(category);
        return R.ok();
    }

    /**
     * 删除
     *
     * @RequestBody:获取请求体，必须发送POST请求 SpringMVC自动将请求体的数据（json），转为对应的对象
     */
    //http://localhost:88/api/product/category/delete
    //body  [1432]
    @RequestMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds) {


        //categoryService.removeByIds(Arrays.asList(catIds));

        categoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
