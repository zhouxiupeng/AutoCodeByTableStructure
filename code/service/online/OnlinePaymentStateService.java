package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.OnlinePaymentState;

/**
 * 【待查询支付状态的订单列表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IOnlinePaymentStateService {
	
    int saveOnlinePaymentState(OnlinePaymentState _onlinePaymentState);
    OnlinePaymentState getOnlinePaymentStateByID(Long	_order_id);
    int updateOnlinePaymentState(OnlinePaymentState _onlinePaymentState);
}
