package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamMonthlyReports;

/**
 * 【管理团队每月的统计】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamMonthlyReportsDao{
	  String getPrefix();
	  int saveMTeamMonthlyReports(MTeamMonthlyReports _mTeamMonthlyReports);
	  MTeamMonthlyReports getMTeamMonthlyReportsByID(Long	_muid,String	_archiving_time);
	  int updateMTeamMonthlyReports(MTeamMonthlyReports _mTeamMonthlyReports);
}
