package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamMonthlyReportsDao;
import com.yundong.m1_core.service.IMTeamMonthlyReportsService;
import com.yundong.m1_core.entity.MTeamMonthlyReports;

/**
 * 【管理团队每月的统计】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamMonthlyReportsServiceImpl  implements IMTeamMonthlyReportsService {

    @Autowired
    private IMTeamMonthlyReportsDao mTeamMonthlyReportsDaoImpl;


    @Override
    public int saveMTeamMonthlyReports(MTeamMonthlyReports _mTeamMonthlyReports) {
    	return this.mTeamMonthlyReportsDaoImpl.saveMTeamMonthlyReports(_mTeamMonthlyReports);
    }

    @Override
    public MTeamMonthlyReports getMTeamMonthlyReportsByID(Long	_muid ,String	_archiving_time) {
    	return this.mTeamMonthlyReportsDaoImpl.getMTeamMonthlyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMTeamMonthlyReports(MTeamMonthlyReports _mTeamMonthlyReports) {
    	return this.mTeamMonthlyReportsDaoImpl.updateMTeamMonthlyReports(_mTeamMonthlyReports);
    }
}
