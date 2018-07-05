package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdTopicDao;
import com.yundong.api.service.IYdTopicService;
import com.yundong.api.entity.YdTopic;

/**
 * 【话题】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdTopicServiceImpl  implements IYdTopicService {

    @Autowired
    private IYdTopicDao ydTopicDaoImpl;


    @Override
    public int saveYdTopic(YdTopic ydTopic) {
    	return this.ydTopicDaoImpl.saveYdTopic(ydTopic);
    }

    @Override
    public YdTopic getYdTopicByID(Long	id) {
    	return this.ydTopicDaoImpl.getYdTopicByID(id);
    }
    @Override
    public int updateYdTopic(YdTopic ydTopic) {
    	return this.ydTopicDaoImpl.updateYdTopic(ydTopic);
    }
}
