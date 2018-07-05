package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MUserMonthlyReports;

/**
 * 【用户每月基本统计】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserMonthlyReportsDao{
	  String getPrefix();
	  int saveMUserMonthlyReports(MUserMonthlyReports _mUserMonthlyReports);
	  MUserMonthlyReports getMUserMonthlyReportsByID(Long	_muid,String	_archiving_time);
	  int updateMUserMonthlyReports(MUserMonthlyReports _mUserMonthlyReports);
}
