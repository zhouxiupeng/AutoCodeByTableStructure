package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.BalanceRecord;

/**
 * 【账号交易明细数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
public interface IBalanceRecordService {
	
    int saveBalanceRecord(BalanceRecord _balanceRecord);
    BalanceRecord getBalanceRecordByID(long	_balance_record_id);
    int updateBalanceRecord(BalanceRecord _balanceRecord);
}
