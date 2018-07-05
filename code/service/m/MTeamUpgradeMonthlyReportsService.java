package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamUpgradeMonthlyReports;

/**
 * 【管理团队每月的统计, 维持数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
public interface IMTeamUpgradeMonthlyReportsService {
	
    int saveMTeamUpgradeMonthlyReports(MTeamUpgradeMonthlyReports _mTeamUpgradeMonthlyReports);
    MTeamUpgradeMonthlyReports getMTeamUpgradeMonthlyReportsByID(Long	_muid ,String	_archiving_time);
    int updateMTeamUpgradeMonthlyReports(MTeamUpgradeMonthlyReports _mTeamUpgradeMonthlyReports);
}
