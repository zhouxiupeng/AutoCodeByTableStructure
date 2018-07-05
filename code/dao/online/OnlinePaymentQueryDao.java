package com.yundong.payment.dao;

import com.yundong.payment.entity.OnlinePaymentQuery;

/**
 * 【待查询支付状态的订单列表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IOnlinePaymentQueryDao{
	  String getPrefix();
	  int saveOnlinePaymentQuery(OnlinePaymentQuery _onlinePaymentQuery);
	  OnlinePaymentQuery getOnlinePaymentQueryByID(Long	_order_id);
	  int updateOnlinePaymentQuery(OnlinePaymentQuery _onlinePaymentQuery);
}
