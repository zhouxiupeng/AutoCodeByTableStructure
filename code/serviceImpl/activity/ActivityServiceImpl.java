package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IActivityDao;
import com.yundong.payment.service.IActivityService;
import com.yundong.payment.entity.Activity;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class ActivityServiceImpl  implements IActivityService {

    @Autowired
    private IActivityDao activityDaoImpl;


    @Override
    public int saveActivity(Activity _activity) {
    	return this.activityDaoImpl.saveActivity(_activity);
    }

    @Override
    public Activity getActivityByID() {
    	return this.activityDaoImpl.getActivityByID();
    }
    @Override
    public int updateActivity(Activity _activity) {
    	return this.activityDaoImpl.updateActivity(_activity);
    }
}
