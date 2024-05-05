package com.s686.mall.s686mallproduct.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.s686.mall.s686mallproduct.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author leifengyang
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
