package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdUserDao;
import com.yundong.api.service.IYdUserService;
import com.yundong.api.entity.YdUser;

/**
 * 【用户表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdUserServiceImpl  implements IYdUserService {

    @Autowired
    private IYdUserDao ydUserDaoImpl;


    @Override
    public int saveYdUser(YdUser ydUser) {
    	return this.ydUserDaoImpl.saveYdUser(ydUser);
    }

    @Override
    public YdUser getYdUserByID(Long	uid) {
    	return this.ydUserDaoImpl.getYdUserByID(uid);
    }
    @Override
    public int updateYdUser(YdUser ydUser) {
    	return this.ydUserDaoImpl.updateYdUser(ydUser);
    }
}
