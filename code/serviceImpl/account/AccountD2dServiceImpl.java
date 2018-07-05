package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IAccountD2dDao;
import com.yundong.payment.service.IAccountD2dService;
import com.yundong.payment.entity.AccountD2d;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class AccountD2dServiceImpl  implements IAccountD2dService {

    @Autowired
    private IAccountD2dDao accountD2dDaoImpl;


    @Override
    public int saveAccountD2d(AccountD2d _accountD2d) {
    	return this.accountD2dDaoImpl.saveAccountD2d(_accountD2d);
    }

    @Override
    public AccountD2d getAccountD2dByID(Integer	_id) {
    	return this.accountD2dDaoImpl.getAccountD2dByID(_id);
    }
    @Override
    public int updateAccountD2d(AccountD2d _accountD2d) {
    	return this.accountD2dDaoImpl.updateAccountD2d(_accountD2d);
    }
}
