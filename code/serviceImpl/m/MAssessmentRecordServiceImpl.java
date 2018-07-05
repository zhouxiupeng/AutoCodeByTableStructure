package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMAssessmentRecordDao;
import com.yundong.m1_core.service.IMAssessmentRecordService;
import com.yundong.m1_core.entity.MAssessmentRecord;

/**
 * 【考核最终结果数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MAssessmentRecordServiceImpl  implements IMAssessmentRecordService {

    @Autowired
    private IMAssessmentRecordDao mAssessmentRecordDaoImpl;


    @Override
    public int saveMAssessmentRecord(MAssessmentRecord _mAssessmentRecord) {
    	return this.mAssessmentRecordDaoImpl.saveMAssessmentRecord(_mAssessmentRecord);
    }

    @Override
    public MAssessmentRecord getMAssessmentRecordByID(Long	_muid ,String	_assess_time) {
    	return this.mAssessmentRecordDaoImpl.getMAssessmentRecordByID(_muid ,_assess_time);
    }
    @Override
    public int updateMAssessmentRecord(MAssessmentRecord _mAssessmentRecord) {
    	return this.mAssessmentRecordDaoImpl.updateMAssessmentRecord(_mAssessmentRecord);
    }
}
