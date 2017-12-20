package com.yundong.payment.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.api.dao.IAccountDao;
import com.yundong.payment.api.service.IAccountService;
import com.yundong.payment.api.entity.Account;

/**
 * 【账户信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
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
    public Account getAccountByID(Long	_account_id) {
    	return this.accountDaoImpl.getAccountByID(_account_id);
    }
}
