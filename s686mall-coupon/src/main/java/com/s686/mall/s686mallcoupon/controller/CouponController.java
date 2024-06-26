package com.s686.mall.s686mallcoupon.controller;


import com.s686.mall.s686mallcommon.utils.R;
import com.s686.mall.s686mallcoupon.entity.CouponEntity;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

//配置刷新注解@RefreshScope，结合Nacos配置中心使用
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {

    @GetMapping("/member/list")
    public R membercoupons() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }
}
