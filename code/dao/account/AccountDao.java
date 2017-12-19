package com.bluemobi.dao;

import com.appcore.dao.MyBatisBaseDao;

/**
 * 【账户信息】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
 * 
 */
public interface IAccountDao{
	 public String getPrefix();
	 public int saveAccount(AccountVO _account);
	 public AccountVO getAccountByID(Long	_account_id);
}
