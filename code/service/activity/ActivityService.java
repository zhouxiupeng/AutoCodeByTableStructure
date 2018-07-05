package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.Activity;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IActivityService {
	
    int saveActivity(Activity _activity);
    Activity getActivityByID();
    int updateActivity(Activity _activity);
}
