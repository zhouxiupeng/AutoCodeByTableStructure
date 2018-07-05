package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.ICardAuthenticationDao;
import com.yundong.payment.service.ICardAuthenticationService;
import com.yundong.payment.entity.CardAuthentication;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class CardAuthenticationServiceImpl  implements ICardAuthenticationService {

    @Autowired
    private ICardAuthenticationDao cardAuthenticationDaoImpl;


    @Override
    public int saveCardAuthentication(CardAuthentication _cardAuthentication) {
    	return this.cardAuthenticationDaoImpl.saveCardAuthentication(_cardAuthentication);
    }

    @Override
    public CardAuthentication getCardAuthenticationByID(Long	_order_id) {
    	return this.cardAuthenticationDaoImpl.getCardAuthenticationByID(_order_id);
    }
    @Override
    public int updateCardAuthentication(CardAuthentication _cardAuthentication) {
    	return this.cardAuthenticationDaoImpl.updateCardAuthentication(_cardAuthentication);
    }
}
