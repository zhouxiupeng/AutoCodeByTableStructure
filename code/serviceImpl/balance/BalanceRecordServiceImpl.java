package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IBalanceRecordDao;
import com.yundong.payment.service.IBalanceRecordService;
import com.yundong.payment.entity.BalanceRecord;

/**
 * 【账号交易明细数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
@Service
public class BalanceRecordServiceImpl  implements IBalanceRecordService {

    @Autowired
    private IBalanceRecordDao balanceRecordDaoImpl;


    @Override
    public int saveBalanceRecord(BalanceRecord _balanceRecord) {
    	return this.balanceRecordDaoImpl.saveBalanceRecord(_balanceRecord);
    }

    @Override
    public BalanceRecord getBalanceRecordByID(long	_balance_record_id) {
    	return this.balanceRecordDaoImpl.getBalanceRecordByID(_balance_record_id);
    }
    @Override
    public int updateBalanceRecord(BalanceRecord _balanceRecord) {
    	return this.balanceRecordDaoImpl.updateBalanceRecord(_balanceRecord);
    }
}
