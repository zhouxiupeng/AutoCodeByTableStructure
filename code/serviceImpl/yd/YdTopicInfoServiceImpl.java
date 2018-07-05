package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdTopicInfoDao;
import com.yundong.api.service.IYdTopicInfoService;
import com.yundong.api.entity.YdTopicInfo;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdTopicInfoServiceImpl  implements IYdTopicInfoService {

    @Autowired
    private IYdTopicInfoDao ydTopicInfoDaoImpl;


    @Override
    public int saveYdTopicInfo(YdTopicInfo ydTopicInfo) {
    	return this.ydTopicInfoDaoImpl.saveYdTopicInfo(ydTopicInfo);
    }

    @Override
    public YdTopicInfo getYdTopicInfoByID(Long	id ,Date	start_time) {
    	return this.ydTopicInfoDaoImpl.getYdTopicInfoByID(id ,start_time);
    }
    @Override
    public int updateYdTopicInfo(YdTopicInfo ydTopicInfo) {
    	return this.ydTopicInfoDaoImpl.updateYdTopicInfo(ydTopicInfo);
    }
}
