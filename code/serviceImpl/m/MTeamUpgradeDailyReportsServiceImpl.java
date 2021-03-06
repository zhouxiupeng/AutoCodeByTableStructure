package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamUpgradeDailyReportsDao;
import com.yundong.m1_core.service.IMTeamUpgradeDailyReportsService;
import com.yundong.m1_core.entity.MTeamUpgradeDailyReports;

/**
 * 【管理团队每天的统计】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamUpgradeDailyReportsServiceImpl  implements IMTeamUpgradeDailyReportsService {

    @Autowired
    private IMTeamUpgradeDailyReportsDao mTeamUpgradeDailyReportsDaoImpl;


    @Override
    public int saveMTeamUpgradeDailyReports(MTeamUpgradeDailyReports _mTeamUpgradeDailyReports) {
    	return this.mTeamUpgradeDailyReportsDaoImpl.saveMTeamUpgradeDailyReports(_mTeamUpgradeDailyReports);
    }

    @Override
    public MTeamUpgradeDailyReports getMTeamUpgradeDailyReportsByID(Long	_muid ,Date	_archiving_time) {
    	return this.mTeamUpgradeDailyReportsDaoImpl.getMTeamUpgradeDailyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMTeamUpgradeDailyReports(MTeamUpgradeDailyReports _mTeamUpgradeDailyReports) {
    	return this.mTeamUpgradeDailyReportsDaoImpl.updateMTeamUpgradeDailyReports(_mTeamUpgradeDailyReports);
    }
}
