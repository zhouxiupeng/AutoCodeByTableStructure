package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IOnlinePaymentQueueDao;
import com.yundong.payment.service.IOnlinePaymentQueueService;
import com.yundong.payment.entity.OnlinePaymentQueue;

/**
 * 【待查询支付状态的订单列表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class OnlinePaymentQueueServiceImpl  implements IOnlinePaymentQueueService {

    @Autowired
    private IOnlinePaymentQueueDao onlinePaymentQueueDaoImpl;


    @Override
    public int saveOnlinePaymentQueue(OnlinePaymentQueue _onlinePaymentQueue) {
    	return this.onlinePaymentQueueDaoImpl.saveOnlinePaymentQueue(_onlinePaymentQueue);
    }

    @Override
    public OnlinePaymentQueue getOnlinePaymentQueueByID(Long	_order_id) {
    	return this.onlinePaymentQueueDaoImpl.getOnlinePaymentQueueByID(_order_id);
    }
    @Override
    public int updateOnlinePaymentQueue(OnlinePaymentQueue _onlinePaymentQueue) {
    	return this.onlinePaymentQueueDaoImpl.updateOnlinePaymentQueue(_onlinePaymentQueue);
    }
}
