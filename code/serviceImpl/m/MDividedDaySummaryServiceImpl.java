package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMDividedDaySummaryDao;
import com.yundong.m1_core.service.IMDividedDaySummaryService;
import com.yundong.m1_core.entity.MDividedDaySummary;

/**
 * 【分成汇总记录表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MDividedDaySummaryServiceImpl  implements IMDividedDaySummaryService {

    @Autowired
    private IMDividedDaySummaryDao mDividedDaySummaryDaoImpl;


    @Override
    public int saveMDividedDaySummary(MDividedDaySummary _mDividedDaySummary) {
    	return this.mDividedDaySummaryDaoImpl.saveMDividedDaySummary(_mDividedDaySummary);
    }

    @Override
    public MDividedDaySummary getMDividedDaySummaryByID(Long	_id) {
    	return this.mDividedDaySummaryDaoImpl.getMDividedDaySummaryByID(_id);
    }
    @Override
    public int updateMDividedDaySummary(MDividedDaySummary _mDividedDaySummary) {
    	return this.mDividedDaySummaryDaoImpl.updateMDividedDaySummary(_mDividedDaySummary);
    }
}
