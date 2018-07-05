package com.yundong.payment.dao;

import com.yundong.payment.entity.OnlinePaymentState;

/**
 * 【待查询支付状态的订单列表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IOnlinePaymentStateDao{
	  String getPrefix();
	  int saveOnlinePaymentState(OnlinePaymentState _onlinePaymentState);
	  OnlinePaymentState getOnlinePaymentStateByID(Long	_order_id);
	  int updateOnlinePaymentState(OnlinePaymentState _onlinePaymentState);
}
