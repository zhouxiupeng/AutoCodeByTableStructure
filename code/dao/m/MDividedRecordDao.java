package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MDividedRecord;

/**
 * 【分成明细记录表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMDividedRecordDao{
	  String getPrefix();
	  int saveMDividedRecord(MDividedRecord _mDividedRecord);
	  MDividedRecord getMDividedRecordByID(Long	_id);
	  int updateMDividedRecord(MDividedRecord _mDividedRecord);
}
