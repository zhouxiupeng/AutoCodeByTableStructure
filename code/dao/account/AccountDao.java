package com.yundong.payment.dao;

import com.yundong.payment.entity.Account;

/**
 * 【账户信息】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
public interface IAccountDao{
	  String getPrefix();
	  int saveAccount(Account _account);
	  Account getAccountByID(long	_account_id);
	  int updateAccount(Account _account);
}
