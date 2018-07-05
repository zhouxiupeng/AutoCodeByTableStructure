package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.Balance;

/**
 * 【账户余额表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-01
 * 
 */
public interface IBalanceService {
	
    int saveBalance(Balance _balance);
    Balance getBalanceByID(long	_balance_id);
    int updateBalance(Balance _balance);
}
