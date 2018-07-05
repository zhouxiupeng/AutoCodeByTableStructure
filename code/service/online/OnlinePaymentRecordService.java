package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.OnlinePaymentRecord;

/**
 * 【订单在线支付参数信息】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IOnlinePaymentRecordService {
	
    int saveOnlinePaymentRecord(OnlinePaymentRecord _onlinePaymentRecord);
    OnlinePaymentRecord getOnlinePaymentRecordByID(Long	_order_id);
    int updateOnlinePaymentRecord(OnlinePaymentRecord _onlinePaymentRecord);
}
