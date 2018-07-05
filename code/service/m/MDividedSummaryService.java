package com.yundong.m1.core.service;

import java.util.List;
import com.yundong.m1.core.entity.MDividedSummary;

/**
 * 【分成汇总记录表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMDividedSummaryService {
	
    int saveMDividedSummary(MDividedSummary _mDividedSummary);
    MDividedSummary getMDividedSummaryByID(Long	_id);
    int updateMDividedSummary(MDividedSummary _mDividedSummary);
}
