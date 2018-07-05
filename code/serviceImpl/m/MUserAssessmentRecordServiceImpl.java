package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMUserAssessmentRecordDao;
import com.yundong.m1_core.service.IMUserAssessmentRecordService;
import com.yundong.m1_core.entity.MUserAssessmentRecord;

/**
 * 【用户历史考核记录】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MUserAssessmentRecordServiceImpl  implements IMUserAssessmentRecordService {

    @Autowired
    private IMUserAssessmentRecordDao mUserAssessmentRecordDaoImpl;


    @Override
    public int saveMUserAssessmentRecord(MUserAssessmentRecord _mUserAssessmentRecord) {
    	return this.mUserAssessmentRecordDaoImpl.saveMUserAssessmentRecord(_mUserAssessmentRecord);
    }

    @Override
    public MUserAssessmentRecord getMUserAssessmentRecordByID(Long	_muid ,String	_assess_time) {
    	return this.mUserAssessmentRecordDaoImpl.getMUserAssessmentRecordByID(_muid ,_assess_time);
    }
    @Override
    public int updateMUserAssessmentRecord(MUserAssessmentRecord _mUserAssessmentRecord) {
    	return this.mUserAssessmentRecordDaoImpl.updateMUserAssessmentRecord(_mUserAssessmentRecord);
    }
}
