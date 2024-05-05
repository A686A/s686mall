package com.s686.mall.s686mallproduct.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.s686.mall.s686mallcommon.utils.PageUtils;
import com.s686.mall.s686mallproduct.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author leifengyang
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

//    List<BrandEntity> getBrandsByCatId(Long catId);

}

