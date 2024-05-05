package com.s686.mall.s686mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.s686.mall.s686mallcommon.utils.PageUtils;
import com.s686.mall.s686mallproduct.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);


    /**
     * 找到catelogId的完整路径；
     * [父/子/孙]
     *
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);
}
