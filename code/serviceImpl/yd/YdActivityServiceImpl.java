package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdActivityDao;
import com.yundong.api.service.IYdActivityService;
import com.yundong.api.entity.YdActivity;

/**
 * 【活动页面】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdActivityServiceImpl  implements IYdActivityService {

    @Autowired
    private IYdActivityDao ydActivityDaoImpl;


    @Override
    public int saveYdActivity(YdActivity ydActivity) {
    	return this.ydActivityDaoImpl.saveYdActivity(ydActivity);
    }

    @Override
    public YdActivity getYdActivityByID(Long	id) {
    	return this.ydActivityDaoImpl.getYdActivityByID(id);
    }
    @Override
    public int updateYdActivity(YdActivity ydActivity) {
    	return this.ydActivityDaoImpl.updateYdActivity(ydActivity);
    }
}
