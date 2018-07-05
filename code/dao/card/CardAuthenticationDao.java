package com.yundong.payment.dao;

import com.yundong.payment.entity.CardAuthentication;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface ICardAuthenticationDao{
	  String getPrefix();
	  int saveCardAuthentication(CardAuthentication _cardAuthentication);
	  CardAuthentication getCardAuthenticationByID(Long	_order_id);
	  int updateCardAuthentication(CardAuthentication _cardAuthentication);
}
