package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IAccountDao;
import com.yundong.payment.service.IAccountService;
import com.yundong.payment.entity.Account;

/**
 * 【账户信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
@Service
public class AccountServiceImpl  implements IAccountService {

    @Autowired
    private IAccountDao accountDaoImpl;


    @Override
    public int saveAccount(Account _account) {
    	return this.accountDaoImpl.saveAccount(_account);
    }

    @Override
    public Account getAccountByID(long	_account_id) {
    	return this.accountDaoImpl.getAccountByID(_account_id);
    }
    @Override
    public int updateAccount(Account _account) {
    	return this.accountDaoImpl.updateAccount(_account);
    }
}
