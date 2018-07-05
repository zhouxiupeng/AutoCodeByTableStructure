package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.ICashDao;
import com.yundong.payment.service.ICashService;
import com.yundong.payment.entity.Cash;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class CashServiceImpl  implements ICashService {

    @Autowired
    private ICashDao cashDaoImpl;


    @Override
    public int saveCash(Cash _cash) {
    	return this.cashDaoImpl.saveCash(_cash);
    }

    @Override
    public Cash getCashByID(Integer	_id) {
    	return this.cashDaoImpl.getCashByID(_id);
    }
    @Override
    public int updateCash(Cash _cash) {
    	return this.cashDaoImpl.updateCash(_cash);
    }
}
