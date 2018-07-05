package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.YdWxOrder;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IYdWxOrderDao{
	  String getPrefix();
	  int saveYdWxOrder(YdWxOrder _ydWxOrder);
	  YdWxOrder getYdWxOrderByID(Integer	_id);
	  int updateYdWxOrder(YdWxOrder _ydWxOrder);
}
