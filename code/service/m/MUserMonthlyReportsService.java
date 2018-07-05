package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MUserMonthlyReports;

/**
 * 【用户每月基本统计】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserMonthlyReportsService {
	
    int saveMUserMonthlyReports(MUserMonthlyReports _mUserMonthlyReports);
    MUserMonthlyReports getMUserMonthlyReportsByID(Long	_muid ,String	_archiving_time);
    int updateMUserMonthlyReports(MUserMonthlyReports _mUserMonthlyReports);
}
