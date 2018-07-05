package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamKeepDailyReportsDao;
import com.yundong.m1_core.service.IMTeamKeepDailyReportsService;
import com.yundong.m1_core.entity.MTeamKeepDailyReports;

/**
 * 【管理团队每天维持的统计】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamKeepDailyReportsServiceImpl  implements IMTeamKeepDailyReportsService {

    @Autowired
    private IMTeamKeepDailyReportsDao mTeamKeepDailyReportsDaoImpl;


    @Override
    public int saveMTeamKeepDailyReports(MTeamKeepDailyReports _mTeamKeepDailyReports) {
    	return this.mTeamKeepDailyReportsDaoImpl.saveMTeamKeepDailyReports(_mTeamKeepDailyReports);
    }

    @Override
    public MTeamKeepDailyReports getMTeamKeepDailyReportsByID(Long	_muid ,Date	_archiving_time) {
    	return this.mTeamKeepDailyReportsDaoImpl.getMTeamKeepDailyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMTeamKeepDailyReports(MTeamKeepDailyReports _mTeamKeepDailyReports) {
    	return this.mTeamKeepDailyReportsDaoImpl.updateMTeamKeepDailyReports(_mTeamKeepDailyReports);
    }
}
