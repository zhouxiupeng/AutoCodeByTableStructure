package com.yundong.payment.dao;

import com.yundong.payment.entity.Activity;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IActivityDao{
	  String getPrefix();
	  int saveActivity(Activity _activity);
	  Activity getActivityByID();
	  int updateActivity(Activity _activity);
}
