package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMTeamAssessmentRecordDao;
import com.yundong.m1_core.service.IMTeamAssessmentRecordService;
import com.yundong.m1_core.entity.MTeamAssessmentRecord;

/**
 * 【团队考核结果记录表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MTeamAssessmentRecordServiceImpl  implements IMTeamAssessmentRecordService {

    @Autowired
    private IMTeamAssessmentRecordDao mTeamAssessmentRecordDaoImpl;


    @Override
    public int saveMTeamAssessmentRecord(MTeamAssessmentRecord _mTeamAssessmentRecord) {
    	return this.mTeamAssessmentRecordDaoImpl.saveMTeamAssessmentRecord(_mTeamAssessmentRecord);
    }

    @Override
    public MTeamAssessmentRecord getMTeamAssessmentRecordByID(Long	_muid ,String	_assess_time) {
    	return this.mTeamAssessmentRecordDaoImpl.getMTeamAssessmentRecordByID(_muid ,_assess_time);
    }
    @Override
    public int updateMTeamAssessmentRecord(MTeamAssessmentRecord _mTeamAssessmentRecord) {
    	return this.mTeamAssessmentRecordDaoImpl.updateMTeamAssessmentRecord(_mTeamAssessmentRecord);
    }
}
