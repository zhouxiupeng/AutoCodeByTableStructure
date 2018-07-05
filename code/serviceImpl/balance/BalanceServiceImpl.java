package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IBalanceDao;
import com.yundong.payment.service.IBalanceService;
import com.yundong.payment.entity.Balance;

/**
 * 【账户余额表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
@Service
public class BalanceServiceImpl  implements IBalanceService {

    @Autowired
    private IBalanceDao balanceDaoImpl;


    @Override
    public int saveBalance(Balance _balance) {
    	return this.balanceDaoImpl.saveBalance(_balance);
    }

    @Override
    public Balance getBalanceByID(long	_balance_id) {
    	return this.balanceDaoImpl.getBalanceByID(_balance_id);
    }
    @Override
    public int updateBalance(Balance _balance) {
    	return this.balanceDaoImpl.updateBalance(_balance);
    }
}
