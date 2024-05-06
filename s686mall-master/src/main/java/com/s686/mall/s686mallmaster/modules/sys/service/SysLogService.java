/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.s686.mall.s686mallmaster.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.s686.mall.s686mallmaster.common.utils.PageUtils;
import com.s686.mall.s686mallmaster.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
