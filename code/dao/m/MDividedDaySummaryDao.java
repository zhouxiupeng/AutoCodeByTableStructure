package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MDividedDaySummary;

/**
 * 【分成汇总记录表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMDividedDaySummaryDao{
	  String getPrefix();
	  int saveMDividedDaySummary(MDividedDaySummary _mDividedDaySummary);
	  MDividedDaySummary getMDividedDaySummaryByID(Long	_id);
	  int updateMDividedDaySummary(MDividedDaySummary _mDividedDaySummary);
}
