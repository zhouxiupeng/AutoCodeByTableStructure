package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMAssessmentParametersDao;
import com.yundong.m1_core.service.IMAssessmentParametersService;
import com.yundong.m1_core.entity.MAssessmentParameters;

/**
 * 【考试时变量参数信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MAssessmentParametersServiceImpl  implements IMAssessmentParametersService {

    @Autowired
    private IMAssessmentParametersDao mAssessmentParametersDaoImpl;


    @Override
    public int saveMAssessmentParameters(MAssessmentParameters _mAssessmentParameters) {
    	return this.mAssessmentParametersDaoImpl.saveMAssessmentParameters(_mAssessmentParameters);
    }

    @Override
    public MAssessmentParameters getMAssessmentParametersByID(Long	_id) {
    	return this.mAssessmentParametersDaoImpl.getMAssessmentParametersByID(_id);
    }
    @Override
    public int updateMAssessmentParameters(MAssessmentParameters _mAssessmentParameters) {
    	return this.mAssessmentParametersDaoImpl.updateMAssessmentParameters(_mAssessmentParameters);
    }
}
