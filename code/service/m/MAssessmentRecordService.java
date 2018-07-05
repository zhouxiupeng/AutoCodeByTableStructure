package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MAssessmentRecord;

/**
 * 【考核最终结果数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMAssessmentRecordService {
	
    int saveMAssessmentRecord(MAssessmentRecord _mAssessmentRecord);
    MAssessmentRecord getMAssessmentRecordByID(Long	_muid ,String	_assess_time);
    int updateMAssessmentRecord(MAssessmentRecord _mAssessmentRecord);
}
