package com.yundong.payment.dao;

import com.yundong.payment.entity.BalanceRecord;

/**
 * 【账号交易明细数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
public interface IBalanceRecordDao{
	  String getPrefix();
	  int saveBalanceRecord(BalanceRecord _balanceRecord);
	  BalanceRecord getBalanceRecordByID(long	_balance_record_id);
	  int updateBalanceRecord(BalanceRecord _balanceRecord);
}
