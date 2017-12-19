package com.bluemobi.service;

import com.appcore.service.MybatisBaseService;

/**
 * 【账户信息】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
 * 
 */
public interface IAccountService {
	
    public int saveAccount(AccountVO _account);
    public AccountVO getAccountByID(Long	_account_id)

}
