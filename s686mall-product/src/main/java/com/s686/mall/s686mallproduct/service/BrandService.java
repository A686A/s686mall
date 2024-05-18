package com.s686.mall.s686mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.s686.mall.s686mallcommon.utils.PageUtils;
import com.s686.mall.s686mallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author SR
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);

}

