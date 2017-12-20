package com.yundong.payment.api.service;

import java.util.List;
import com.yundong.payment.api.entity.Account;

/**
 * 【账户信息】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
 * 
 */
public interface IAccountService {
	
    int saveAccount(Account _account);
    Account getAccountByID(Long	_account_id);

}
