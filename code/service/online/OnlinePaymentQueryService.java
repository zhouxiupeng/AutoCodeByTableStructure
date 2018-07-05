package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.OnlinePaymentQuery;

/**
 * 【待查询支付状态的订单列表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IOnlinePaymentQueryService {
	
    int saveOnlinePaymentQuery(OnlinePaymentQuery _onlinePaymentQuery);
    OnlinePaymentQuery getOnlinePaymentQueryByID(Long	_order_id);
    int updateOnlinePaymentQuery(OnlinePaymentQuery _onlinePaymentQuery);
}
