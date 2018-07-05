package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamKeepMonthlyReportsDao;
import com.yundong.m1_core.service.IMTeamKeepMonthlyReportsService;
import com.yundong.m1_core.entity.MTeamKeepMonthlyReports;

/**
 * 【管理团队每月的统计, 维持数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
@Service
public class MTeamKeepMonthlyReportsServiceImpl  implements IMTeamKeepMonthlyReportsService {

    @Autowired
    private IMTeamKeepMonthlyReportsDao mTeamKeepMonthlyReportsDaoImpl;


    @Override
    public int saveMTeamKeepMonthlyReports(MTeamKeepMonthlyReports _mTeamKeepMonthlyReports) {
    	return this.mTeamKeepMonthlyReportsDaoImpl.saveMTeamKeepMonthlyReports(_mTeamKeepMonthlyReports);
    }

    @Override
    public MTeamKeepMonthlyReports getMTeamKeepMonthlyReportsByID(Long	_muid ,String	_archiving_time) {
    	return this.mTeamKeepMonthlyReportsDaoImpl.getMTeamKeepMonthlyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMTeamKeepMonthlyReports(MTeamKeepMonthlyReports _mTeamKeepMonthlyReports) {
    	return this.mTeamKeepMonthlyReportsDaoImpl.updateMTeamKeepMonthlyReports(_mTeamKeepMonthlyReports);
    }
}
