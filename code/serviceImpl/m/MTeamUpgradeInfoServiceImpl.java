package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamUpgradeInfoDao;
import com.yundong.m1_core.service.IMTeamUpgradeInfoService;
import com.yundong.m1_core.entity.MTeamUpgradeInfo;

/**
 * 【当前考核周期内团队升级的总体数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamUpgradeInfoServiceImpl  implements IMTeamUpgradeInfoService {

    @Autowired
    private IMTeamUpgradeInfoDao mTeamUpgradeInfoDaoImpl;


    @Override
    public int saveMTeamUpgradeInfo(MTeamUpgradeInfo _mTeamUpgradeInfo) {
    	return this.mTeamUpgradeInfoDaoImpl.saveMTeamUpgradeInfo(_mTeamUpgradeInfo);
    }

    @Override
    public MTeamUpgradeInfo getMTeamUpgradeInfoByID(Long	_muid) {
    	return this.mTeamUpgradeInfoDaoImpl.getMTeamUpgradeInfoByID(_muid);
    }
    @Override
    public int updateMTeamUpgradeInfo(MTeamUpgradeInfo _mTeamUpgradeInfo) {
    	return this.mTeamUpgradeInfoDaoImpl.updateMTeamUpgradeInfo(_mTeamUpgradeInfo);
    }
}
