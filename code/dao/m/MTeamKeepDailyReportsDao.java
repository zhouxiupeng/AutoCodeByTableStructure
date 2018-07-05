package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamKeepDailyReports;

/**
 * 【管理团队每天维持的统计】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamKeepDailyReportsDao{
	  String getPrefix();
	  int saveMTeamKeepDailyReports(MTeamKeepDailyReports _mTeamKeepDailyReports);
	  MTeamKeepDailyReports getMTeamKeepDailyReportsByID(Long	_muid,Date	_archiving_time);
	  int updateMTeamKeepDailyReports(MTeamKeepDailyReports _mTeamKeepDailyReports);
}
