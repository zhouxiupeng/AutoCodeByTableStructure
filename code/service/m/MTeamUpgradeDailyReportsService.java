package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamUpgradeDailyReports;

/**
 * 【管理团队每天的统计】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamUpgradeDailyReportsService {
	
    int saveMTeamUpgradeDailyReports(MTeamUpgradeDailyReports _mTeamUpgradeDailyReports);
    MTeamUpgradeDailyReports getMTeamUpgradeDailyReportsByID(Long	_muid ,Date	_archiving_time);
    int updateMTeamUpgradeDailyReports(MTeamUpgradeDailyReports _mTeamUpgradeDailyReports);
}
