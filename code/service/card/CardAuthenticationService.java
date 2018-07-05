package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.CardAuthentication;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface ICardAuthenticationService {
	
    int saveCardAuthentication(CardAuthentication _cardAuthentication);
    CardAuthentication getCardAuthenticationByID(Long	_order_id);
    int updateCardAuthentication(CardAuthentication _cardAuthentication);
}
