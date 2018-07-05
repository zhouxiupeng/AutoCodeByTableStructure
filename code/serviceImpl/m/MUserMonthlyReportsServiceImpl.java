package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMUserMonthlyReportsDao;
import com.yundong.m1_core.service.IMUserMonthlyReportsService;
import com.yundong.m1_core.entity.MUserMonthlyReports;

/**
 * 【用户每月基本统计】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MUserMonthlyReportsServiceImpl  implements IMUserMonthlyReportsService {

    @Autowired
    private IMUserMonthlyReportsDao mUserMonthlyReportsDaoImpl;


    @Override
    public int saveMUserMonthlyReports(MUserMonthlyReports _mUserMonthlyReports) {
    	return this.mUserMonthlyReportsDaoImpl.saveMUserMonthlyReports(_mUserMonthlyReports);
    }

    @Override
    public MUserMonthlyReports getMUserMonthlyReportsByID(Long	_muid ,String	_archiving_time) {
    	return this.mUserMonthlyReportsDaoImpl.getMUserMonthlyReportsByID(_muid ,_archiving_time);
    }
    @Override
    public int updateMUserMonthlyReports(MUserMonthlyReports _mUserMonthlyReports) {
    	return this.mUserMonthlyReportsDaoImpl.updateMUserMonthlyReports(_mUserMonthlyReports);
    }
}
