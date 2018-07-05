package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamDailyReports;

/**
 * 【管理团队每天的统计】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamDailyReportsDao{
	  String getPrefix();
	  int saveMTeamDailyReports(MTeamDailyReports _mTeamDailyReports);
	  MTeamDailyReports getMTeamDailyReportsByID(Long	_muid,Date	_archiving_time);
	  int updateMTeamDailyReports(MTeamDailyReports _mTeamDailyReports);
}
