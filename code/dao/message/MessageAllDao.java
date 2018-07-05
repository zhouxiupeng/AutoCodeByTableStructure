package com.yundong.payment.dao;

import com.yundong.payment.entity.MessageAll;

/**
 * 【所有用户消息汇总表，当前包含push消息，短信消息，还可能包含邮件消息


message_type=8 动态定价 答谢者收到的下载推送
message_type=9 动态定价 被答谢者收到的红包推送】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMessageAllDao{
	  String getPrefix();
	  int saveMessageAll(MessageAll _messageAll);
	  MessageAll getMessageAllByID(Integer	_id andDate	_createtime);
	  int updateMessageAll(MessageAll _messageAll);
}
