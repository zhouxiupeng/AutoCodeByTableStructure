package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IOnlinePaymentDao;
import com.yundong.payment.service.IOnlinePaymentService;
import com.yundong.payment.entity.OnlinePayment;

/**
 * 【订单在线支付参数信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class OnlinePaymentServiceImpl  implements IOnlinePaymentService {

    @Autowired
    private IOnlinePaymentDao onlinePaymentDaoImpl;


    @Override
    public int saveOnlinePayment(OnlinePayment _onlinePayment) {
    	return this.onlinePaymentDaoImpl.saveOnlinePayment(_onlinePayment);
    }

    @Override
    public OnlinePayment getOnlinePaymentByID(Long	_order_id) {
    	return this.onlinePaymentDaoImpl.getOnlinePaymentByID(_order_id);
    }
    @Override
    public int updateOnlinePayment(OnlinePayment _onlinePayment) {
    	return this.onlinePaymentDaoImpl.updateOnlinePayment(_onlinePayment);
    }
}
