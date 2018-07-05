package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamUpgradeDailyReports;

/**
 * 【管理团队每天的统计】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamUpgradeDailyReportsDao{
	  String getPrefix();
	  int saveMTeamUpgradeDailyReports(MTeamUpgradeDailyReports _mTeamUpgradeDailyReports);
	  MTeamUpgradeDailyReports getMTeamUpgradeDailyReportsByID(Long	_muid,Date	_archiving_time);
	  int updateMTeamUpgradeDailyReports(MTeamUpgradeDailyReports _mTeamUpgradeDailyReports);
}
