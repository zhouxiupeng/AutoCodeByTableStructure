package com.yundong.api.dao;

import com.yundong.api.entity.YdActivity;

/**
 * 【活动页面】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdActivityDao{
	  String getPrefix();
	  int saveYdActivity(YdActivity ydActivity);
	  YdActivity getYdActivityByID(Long	id);
	  int updateYdActivity(YdActivity ydActivity);
}
