package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamKeepMonthlyReports;

/**
 * 【管理团队每月的统计, 维持数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
public interface IMTeamKeepMonthlyReportsDao{
	  String getPrefix();
	  int saveMTeamKeepMonthlyReports(MTeamKeepMonthlyReports _mTeamKeepMonthlyReports);
	  MTeamKeepMonthlyReports getMTeamKeepMonthlyReportsByID(Long	_muid,String	_archiving_time);
	  int updateMTeamKeepMonthlyReports(MTeamKeepMonthlyReports _mTeamKeepMonthlyReports);
}
