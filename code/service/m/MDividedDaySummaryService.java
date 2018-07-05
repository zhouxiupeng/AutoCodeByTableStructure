package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MDividedDaySummary;

/**
 * 【分成汇总记录表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMDividedDaySummaryService {
	
    int saveMDividedDaySummary(MDividedDaySummary _mDividedDaySummary);
    MDividedDaySummary getMDividedDaySummaryByID(Long	_id);
    int updateMDividedDaySummary(MDividedDaySummary _mDividedDaySummary);
}
