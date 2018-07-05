package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdTopicInfoMediaDao;
import com.yundong.api.service.IYdTopicInfoMediaService;
import com.yundong.api.entity.YdTopicInfoMedia;

/**
 * 【话题媒体信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdTopicInfoMediaServiceImpl  implements IYdTopicInfoMediaService {

    @Autowired
    private IYdTopicInfoMediaDao ydTopicInfoMediaDaoImpl;


    @Override
    public int saveYdTopicInfoMedia(YdTopicInfoMedia ydTopicInfoMedia) {
    	return this.ydTopicInfoMediaDaoImpl.saveYdTopicInfoMedia(ydTopicInfoMedia);
    }

    @Override
    public YdTopicInfoMedia getYdTopicInfoMediaByID(Long	id) {
    	return this.ydTopicInfoMediaDaoImpl.getYdTopicInfoMediaByID(id);
    }
    @Override
    public int updateYdTopicInfoMedia(YdTopicInfoMedia ydTopicInfoMedia) {
    	return this.ydTopicInfoMediaDaoImpl.updateYdTopicInfoMedia(ydTopicInfoMedia);
    }
}
