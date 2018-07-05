package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamKeepMonthlyReports;

/**
 * 【管理团队每月的统计, 维持数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
public interface IMTeamKeepMonthlyReportsService {
	
    int saveMTeamKeepMonthlyReports(MTeamKeepMonthlyReports _mTeamKeepMonthlyReports);
    MTeamKeepMonthlyReports getMTeamKeepMonthlyReportsByID(Long	_muid ,String	_archiving_time);
    int updateMTeamKeepMonthlyReports(MTeamKeepMonthlyReports _mTeamKeepMonthlyReports);
}
