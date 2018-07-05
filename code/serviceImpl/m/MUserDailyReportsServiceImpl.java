package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMUserDailyReportsDao;
import com.yundong.m1_core.service.IMUserDailyReportsService;
import com.yundong.m1_core.entity.MUserDailyReports;

/**
 * 【用户每天基本统计】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MUserDailyReportsServiceImpl  implements IMUserDailyReportsService {

    @Autowired
    private IMUserDailyReportsDao mUserDailyReportsDaoImpl;


    @Override
    public int saveMUserDailyReports(MUserDailyReports _mUserDailyReports) {
    	return this.mUserDailyReportsDaoImpl.saveMUserDailyReports(_mUserDailyReports);
    }

    @Override
    public MUserDailyReports getMUserDailyReportsByID(Long	_muid ,Date	_archiving_time) {
    	return this.mUserDailyReportsDaoImpl.getMUserDailyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMUserDailyReports(MUserDailyReports _mUserDailyReports) {
    	return this.mUserDailyReportsDaoImpl.updateMUserDailyReports(_mUserDailyReports);
    }
}
