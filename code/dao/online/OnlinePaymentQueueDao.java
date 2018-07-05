package com.yundong.payment.dao;

import com.yundong.payment.entity.OnlinePaymentQueue;

/**
 * 【待查询支付状态的订单列表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IOnlinePaymentQueueDao{
	  String getPrefix();
	  int saveOnlinePaymentQueue(OnlinePaymentQueue _onlinePaymentQueue);
	  OnlinePaymentQueue getOnlinePaymentQueueByID(Long	_order_id);
	  int updateOnlinePaymentQueue(OnlinePaymentQueue _onlinePaymentQueue);
}
