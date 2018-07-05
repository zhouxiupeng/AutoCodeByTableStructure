package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.AccountD2d;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IAccountD2dService {
	
    int saveAccountD2d(AccountD2d _accountD2d);
    AccountD2d getAccountD2dByID(Integer	_id);
    int updateAccountD2d(AccountD2d _accountD2d);
}
