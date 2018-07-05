package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IOnlinePaymentRecordDao;
import com.yundong.payment.service.IOnlinePaymentRecordService;
import com.yundong.payment.entity.OnlinePaymentRecord;

/**
 * 【订单在线支付参数信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class OnlinePaymentRecordServiceImpl  implements IOnlinePaymentRecordService {

    @Autowired
    private IOnlinePaymentRecordDao onlinePaymentRecordDaoImpl;


    @Override
    public int saveOnlinePaymentRecord(OnlinePaymentRecord _onlinePaymentRecord) {
    	return this.onlinePaymentRecordDaoImpl.saveOnlinePaymentRecord(_onlinePaymentRecord);
    }

    @Override
    public OnlinePaymentRecord getOnlinePaymentRecordByID(Long	_order_id) {
    	return this.onlinePaymentRecordDaoImpl.getOnlinePaymentRecordByID(_order_id);
    }
    @Override
    public int updateOnlinePaymentRecord(OnlinePaymentRecord _onlinePaymentRecord) {
    	return this.onlinePaymentRecordDaoImpl.updateOnlinePaymentRecord(_onlinePaymentRecord);
    }
}
