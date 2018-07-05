package com.yundong.payment.dao;

import com.yundong.payment.entity.YdWxOrderTopic;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IYdWxOrderTopicDao{
	  String getPrefix();
	  int saveYdWxOrderTopic(YdWxOrderTopic _ydWxOrderTopic);
	  YdWxOrderTopic getYdWxOrderTopicByID(Integer	_wx_order_id andInteger	_topic_info_id);
	  int updateYdWxOrderTopic(YdWxOrderTopic _ydWxOrderTopic);
}
