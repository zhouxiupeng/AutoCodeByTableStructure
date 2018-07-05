package com.yundong.payment.dao;

import com.yundong.payment.entity.AccountD2d;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IAccountD2dDao{
	  String getPrefix();
	  int saveAccountD2d(AccountD2d _accountD2d);
	  AccountD2d getAccountD2dByID(Integer	_id);
	  int updateAccountD2d(AccountD2d _accountD2d);
}
