package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MUserAssessmentRecord;

/**
 * 【用户历史考核记录】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserAssessmentRecordService {
	
    int saveMUserAssessmentRecord(MUserAssessmentRecord _mUserAssessmentRecord);
    MUserAssessmentRecord getMUserAssessmentRecordByID(Long	_muid ,String	_assess_time);
    int updateMUserAssessmentRecord(MUserAssessmentRecord _mUserAssessmentRecord);
}
