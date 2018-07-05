package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MUserDailyReports;

/**
 * 【用户每天基本统计】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserDailyReportsDao{
	  String getPrefix();
	  int saveMUserDailyReports(MUserDailyReports _mUserDailyReports);
	  MUserDailyReports getMUserDailyReportsByID(Long	_muid,Date	_archiving_time);
	  int updateMUserDailyReports(MUserDailyReports _mUserDailyReports);
}
