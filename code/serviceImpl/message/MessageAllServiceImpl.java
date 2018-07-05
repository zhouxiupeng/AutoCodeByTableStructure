package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IMessageAllDao;
import com.yundong.payment.service.IMessageAllService;
import com.yundong.payment.entity.MessageAll;

/**
 * 【所有用户消息汇总表，当前包含push消息，短信消息，还可能包含邮件消息


message_type=8 动态定价 答谢者收到的下载推送
message_type=9 动态定价 被答谢者收到的红包推送】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MessageAllServiceImpl  implements IMessageAllService {

    @Autowired
    private IMessageAllDao messageAllDaoImpl;


    @Override
    public int saveMessageAll(MessageAll _messageAll) {
    	return this.messageAllDaoImpl.saveMessageAll(_messageAll);
    }

    @Override
    public MessageAll getMessageAllByID(Integer	_id andDate	_createtime) {
    	return this.messageAllDaoImpl.getMessageAllByID(_id and_createtime);
    }
    @Override
    public int updateMessageAll(MessageAll _messageAll) {
    	return this.messageAllDaoImpl.updateMessageAll(_messageAll);
    }
}
