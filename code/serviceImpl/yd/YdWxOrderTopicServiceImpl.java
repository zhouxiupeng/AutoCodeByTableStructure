package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IYdWxOrderTopicDao;
import com.yundong.payment.service.IYdWxOrderTopicService;
import com.yundong.payment.entity.YdWxOrderTopic;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class YdWxOrderTopicServiceImpl  implements IYdWxOrderTopicService {

    @Autowired
    private IYdWxOrderTopicDao ydWxOrderTopicDaoImpl;


    @Override
    public int saveYdWxOrderTopic(YdWxOrderTopic _ydWxOrderTopic) {
    	return this.ydWxOrderTopicDaoImpl.saveYdWxOrderTopic(_ydWxOrderTopic);
    }

    @Override
    public YdWxOrderTopic getYdWxOrderTopicByID(Integer	_wx_order_id andInteger	_topic_info_id) {
    	return this.ydWxOrderTopicDaoImpl.getYdWxOrderTopicByID(_wx_order_id and_topic_info_id);
    }
    @Override
    public int updateYdWxOrderTopic(YdWxOrderTopic _ydWxOrderTopic) {
    	return this.ydWxOrderTopicDaoImpl.updateYdWxOrderTopic(_ydWxOrderTopic);
    }
}
