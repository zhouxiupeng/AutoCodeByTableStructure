package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MUserDailyReports;

/**
 * 【用户每天基本统计】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserDailyReportsService {
	
    int saveMUserDailyReports(MUserDailyReports _mUserDailyReports);
    MUserDailyReports getMUserDailyReportsByID(Long	_muid ,Date	_archiving_time);
    int updateMUserDailyReports(MUserDailyReports _mUserDailyReports);
}
