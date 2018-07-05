package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamDailyReportsDao;
import com.yundong.m1_core.service.IMTeamDailyReportsService;
import com.yundong.m1_core.entity.MTeamDailyReports;

/**
 * 【管理团队每天的统计】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamDailyReportsServiceImpl  implements IMTeamDailyReportsService {

    @Autowired
    private IMTeamDailyReportsDao mTeamDailyReportsDaoImpl;


    @Override
    public int saveMTeamDailyReports(MTeamDailyReports _mTeamDailyReports) {
    	return this.mTeamDailyReportsDaoImpl.saveMTeamDailyReports(_mTeamDailyReports);
    }

    @Override
    public MTeamDailyReports getMTeamDailyReportsByID(Long	_muid ,Date	_archiving_time) {
    	return this.mTeamDailyReportsDaoImpl.getMTeamDailyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMTeamDailyReports(MTeamDailyReports _mTeamDailyReports) {
    	return this.mTeamDailyReportsDaoImpl.updateMTeamDailyReports(_mTeamDailyReports);
    }
}
