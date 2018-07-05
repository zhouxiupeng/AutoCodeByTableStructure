package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMUserInfoDao;
import com.yundong.m1_core.service.IMUserInfoService;
import com.yundong.m1_core.entity.MUserInfo;

/**
 * 【m1系统用户基本信息表，里面的信息都是当前用户的最新数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MUserInfoServiceImpl  implements IMUserInfoService {

    @Autowired
    private IMUserInfoDao mUserInfoDaoImpl;


    @Override
    public int saveMUserInfo(MUserInfo _mUserInfo) {
    	return this.mUserInfoDaoImpl.saveMUserInfo(_mUserInfo);
    }

    @Override
    public MUserInfo getMUserInfoByID(Long	_muid) {
    	return this.mUserInfoDaoImpl.getMUserInfoByID(_muid);
    }
    @Override
    public int updateMUserInfo(MUserInfo _mUserInfo) {
    	return this.mUserInfoDaoImpl.updateMUserInfo(_mUserInfo);
    }
}
