package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IOnlinePaymentStateDao;
import com.yundong.payment.service.IOnlinePaymentStateService;
import com.yundong.payment.entity.OnlinePaymentState;

/**
 * 【待查询支付状态的订单列表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class OnlinePaymentStateServiceImpl  implements IOnlinePaymentStateService {

    @Autowired
    private IOnlinePaymentStateDao onlinePaymentStateDaoImpl;


    @Override
    public int saveOnlinePaymentState(OnlinePaymentState _onlinePaymentState) {
    	return this.onlinePaymentStateDaoImpl.saveOnlinePaymentState(_onlinePaymentState);
    }

    @Override
    public OnlinePaymentState getOnlinePaymentStateByID(Long	_order_id) {
    	return this.onlinePaymentStateDaoImpl.getOnlinePaymentStateByID(_order_id);
    }
    @Override
    public int updateOnlinePaymentState(OnlinePaymentState _onlinePaymentState) {
    	return this.onlinePaymentStateDaoImpl.updateOnlinePaymentState(_onlinePaymentState);
    }
}
