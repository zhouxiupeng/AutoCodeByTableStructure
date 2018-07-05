package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamAssessmentRecord;

/**
 * 【团队考核结果记录表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamAssessmentRecordDao{
	  String getPrefix();
	  int saveMTeamAssessmentRecord(MTeamAssessmentRecord _mTeamAssessmentRecord);
	  MTeamAssessmentRecord getMTeamAssessmentRecordByID(Long	_muid,String	_assess_time);
	  int updateMTeamAssessmentRecord(MTeamAssessmentRecord _mTeamAssessmentRecord);
}
