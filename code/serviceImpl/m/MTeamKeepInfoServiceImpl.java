package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamKeepInfoDao;
import com.yundong.m1_core.service.IMTeamKeepInfoService;
import com.yundong.m1_core.entity.MTeamKeepInfo;

/**
 * 【当前考核周期内团队维持的总体数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
@Service
public class MTeamKeepInfoServiceImpl  implements IMTeamKeepInfoService {

    @Autowired
    private IMTeamKeepInfoDao mTeamKeepInfoDaoImpl;


    @Override
    public int saveMTeamKeepInfo(MTeamKeepInfo _mTeamKeepInfo) {
    	return this.mTeamKeepInfoDaoImpl.saveMTeamKeepInfo(_mTeamKeepInfo);
    }

    @Override
    public MTeamKeepInfo getMTeamKeepInfoByID(Long	_muid) {
    	return this.mTeamKeepInfoDaoImpl.getMTeamKeepInfoByID(_muid);
    }
    @Override
    public int updateMTeamKeepInfo(MTeamKeepInfo _mTeamKeepInfo) {
    	return this.mTeamKeepInfoDaoImpl.updateMTeamKeepInfo(_mTeamKeepInfo);
    }
}
