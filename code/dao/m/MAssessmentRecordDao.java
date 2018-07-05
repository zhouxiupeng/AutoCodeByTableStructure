package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MAssessmentRecord;

/**
 * 【考核最终结果数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMAssessmentRecordDao{
	  String getPrefix();
	  int saveMAssessmentRecord(MAssessmentRecord _mAssessmentRecord);
	  MAssessmentRecord getMAssessmentRecordByID(Long	_muid,String	_assess_time);
	  int updateMAssessmentRecord(MAssessmentRecord _mAssessmentRecord);
}
