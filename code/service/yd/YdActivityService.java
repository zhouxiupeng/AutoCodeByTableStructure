package com.yundong.api.service;

import java.util.List;
import com.yundong.api.entity.YdActivity;

/**
 * 【活动页面】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdActivityService {
	
    int saveYdActivity(YdActivity ydActivity);
    YdActivity getYdActivityByID(Long	id);
    int updateYdActivity(YdActivity ydActivity);
}
