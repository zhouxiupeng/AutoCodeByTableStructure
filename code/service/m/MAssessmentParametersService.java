package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MAssessmentParameters;

/**
 * 【考试时变量参数信息】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMAssessmentParametersService {
	
    int saveMAssessmentParameters(MAssessmentParameters _mAssessmentParameters);
    MAssessmentParameters getMAssessmentParametersByID(Long	_id);
    int updateMAssessmentParameters(MAssessmentParameters _mAssessmentParameters);
}
