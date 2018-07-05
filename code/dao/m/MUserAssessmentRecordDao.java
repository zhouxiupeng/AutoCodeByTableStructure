package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MUserAssessmentRecord;

/**
 * 【用户历史考核记录】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserAssessmentRecordDao{
	  String getPrefix();
	  int saveMUserAssessmentRecord(MUserAssessmentRecord _mUserAssessmentRecord);
	  MUserAssessmentRecord getMUserAssessmentRecordByID(Long	_muid,String	_assess_time);
	  int updateMUserAssessmentRecord(MUserAssessmentRecord _mUserAssessmentRecord);
}
