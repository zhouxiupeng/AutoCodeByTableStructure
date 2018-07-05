package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MAssessmentParameters;

/**
 * 【考试时变量参数信息】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMAssessmentParametersDao{
	  String getPrefix();
	  int saveMAssessmentParameters(MAssessmentParameters _mAssessmentParameters);
	  MAssessmentParameters getMAssessmentParametersByID(Long	_id);
	  int updateMAssessmentParameters(MAssessmentParameters _mAssessmentParameters);
}
