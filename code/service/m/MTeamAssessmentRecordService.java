package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamAssessmentRecord;

/**
 * 【团队考核结果记录表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamAssessmentRecordService {
	
    int saveMTeamAssessmentRecord(MTeamAssessmentRecord _mTeamAssessmentRecord);
    MTeamAssessmentRecord getMTeamAssessmentRecordByID(Long	_muid ,String	_assess_time);
    int updateMTeamAssessmentRecord(MTeamAssessmentRecord _mTeamAssessmentRecord);
}
