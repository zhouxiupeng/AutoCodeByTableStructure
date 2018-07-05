package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamUpgradeMonthlyReportsDao;
import com.yundong.m1_core.service.IMTeamUpgradeMonthlyReportsService;
import com.yundong.m1_core.entity.MTeamUpgradeMonthlyReports;

/**
 * 【管理团队每月的统计, 维持数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
@Service
public class MTeamUpgradeMonthlyReportsServiceImpl  implements IMTeamUpgradeMonthlyReportsService {

    @Autowired
    private IMTeamUpgradeMonthlyReportsDao mTeamUpgradeMonthlyReportsDaoImpl;


    @Override
    public int saveMTeamUpgradeMonthlyReports(MTeamUpgradeMonthlyReports _mTeamUpgradeMonthlyReports) {
    	return this.mTeamUpgradeMonthlyReportsDaoImpl.saveMTeamUpgradeMonthlyReports(_mTeamUpgradeMonthlyReports);
    }

    @Override
    public MTeamUpgradeMonthlyReports getMTeamUpgradeMonthlyReportsByID(Long	_muid ,String	_archiving_time) {
    	return this.mTeamUpgradeMonthlyReportsDaoImpl.getMTeamUpgradeMonthlyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMTeamUpgradeMonthlyReports(MTeamUpgradeMonthlyReports _mTeamUpgradeMonthlyReports) {
    	return this.mTeamUpgradeMonthlyReportsDaoImpl.updateMTeamUpgradeMonthlyReports(_mTeamUpgradeMonthlyReports);
    }
}
