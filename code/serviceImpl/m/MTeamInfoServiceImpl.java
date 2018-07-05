package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamInfoDao;
import com.yundong.m1_core.service.IMTeamInfoService;
import com.yundong.m1_core.entity.MTeamInfo;

/**
 * 【当前考核周期内团队的总体数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamInfoServiceImpl  implements IMTeamInfoService {

    @Autowired
    private IMTeamInfoDao mTeamInfoDaoImpl;


    @Override
    public int saveMTeamInfo(MTeamInfo _mTeamInfo) {
    	return this.mTeamInfoDaoImpl.saveMTeamInfo(_mTeamInfo);
    }

    @Override
    public MTeamInfo getMTeamInfoByID(Long	_muid) {
    	return this.mTeamInfoDaoImpl.getMTeamInfoByID(_muid);
    }
    @Override
    public int updateMTeamInfo(MTeamInfo _mTeamInfo) {
    	return this.mTeamInfoDaoImpl.updateMTeamInfo(_mTeamInfo);
    }
}
