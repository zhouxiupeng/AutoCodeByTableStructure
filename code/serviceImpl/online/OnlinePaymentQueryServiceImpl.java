package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IOnlinePaymentQueryDao;
import com.yundong.payment.service.IOnlinePaymentQueryService;
import com.yundong.payment.entity.OnlinePaymentQuery;

/**
 * 【待查询支付状态的订单列表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class OnlinePaymentQueryServiceImpl  implements IOnlinePaymentQueryService {

    @Autowired
    private IOnlinePaymentQueryDao onlinePaymentQueryDaoImpl;


    @Override
    public int saveOnlinePaymentQuery(OnlinePaymentQuery _onlinePaymentQuery) {
    	return this.onlinePaymentQueryDaoImpl.saveOnlinePaymentQuery(_onlinePaymentQuery);
    }

    @Override
    public OnlinePaymentQuery getOnlinePaymentQueryByID(Long	_order_id) {
    	return this.onlinePaymentQueryDaoImpl.getOnlinePaymentQueryByID(_order_id);
    }
    @Override
    public int updateOnlinePaymentQuery(OnlinePaymentQuery _onlinePaymentQuery) {
    	return this.onlinePaymentQueryDaoImpl.updateOnlinePaymentQuery(_onlinePaymentQuery);
    }
}
