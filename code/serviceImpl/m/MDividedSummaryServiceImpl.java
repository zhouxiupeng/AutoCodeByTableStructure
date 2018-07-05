package com.yundong.m1.core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1.core.dao.IMDividedSummaryDao;
import com.yundong.m1.core.service.IMDividedSummaryService;
import com.yundong.m1.core.entity.MDividedSummary;

/**
 * 【分成汇总记录表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MDividedSummaryServiceImpl  implements IMDividedSummaryService {

    @Autowired
    private IMDividedSummaryDao mDividedSummaryDaoImpl;


    @Override
    public int saveMDividedSummary(MDividedSummary _mDividedSummary) {
    	return this.mDividedSummaryDaoImpl.saveMDividedSummary(_mDividedSummary);
    }

    @Override
    public MDividedSummary getMDividedSummaryByID(Long	_id) {
    	return this.mDividedSummaryDaoImpl.getMDividedSummaryByID(_id);
    }
    @Override
    public int updateMDividedSummary(MDividedSummary _mDividedSummary) {
    	return this.mDividedSummaryDaoImpl.updateMDividedSummary(_mDividedSummary);
    }
}
