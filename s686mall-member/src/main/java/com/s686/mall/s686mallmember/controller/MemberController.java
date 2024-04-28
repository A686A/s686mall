package com.s686.mall.s686mallmember.controller;

import com.s686.mall.s686mallcommon.utils.R;
import com.s686.mall.s686mallmember.entity.MemberEntity;
import com.s686.mall.s686mallmember.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member/member")
public class MemberController {

    @Autowired
    CouponFeignService couponFeignService;

    //http://localhost:8089/member/member/coupons
    @GetMapping("/coupons")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("aaa");

        R membercoupons = couponFeignService.membercoupons();
        return R.ok().put("member", memberEntity).put("coupons", membercoupons.get("coupons"));
    }
}
