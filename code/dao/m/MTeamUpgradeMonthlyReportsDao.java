package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamUpgradeMonthlyReports;

/**
 * 【管理团队每月的统计, 维持数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
public interface IMTeamUpgradeMonthlyReportsDao{
	  String getPrefix();
	  int saveMTeamUpgradeMonthlyReports(MTeamUpgradeMonthlyReports _mTeamUpgradeMonthlyReports);
	  MTeamUpgradeMonthlyReports getMTeamUpgradeMonthlyReportsByID(Long	_muid,String	_archiving_time);
	  int updateMTeamUpgradeMonthlyReports(MTeamUpgradeMonthlyReports _mTeamUpgradeMonthlyReports);
}
