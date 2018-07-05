package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMApplicationConversionDao;
import com.yundong.m1_core.service.IMApplicationConversionService;
import com.yundong.m1_core.entity.MApplicationConversion;

/**
 * 【用户更换系列申请的原因】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MApplicationConversionServiceImpl  implements IMApplicationConversionService {

    @Autowired
    private IMApplicationConversionDao mApplicationConversionDaoImpl;


    @Override
    public int saveMApplicationConversion(MApplicationConversion _mApplicationConversion) {
    	return this.mApplicationConversionDaoImpl.saveMApplicationConversion(_mApplicationConversion);
    }

    @Override
    public MApplicationConversion getMApplicationConversionByID(Long	_id) {
    	return this.mApplicationConversionDaoImpl.getMApplicationConversionByID(_id);
    }
    @Override
    public int updateMApplicationConversion(MApplicationConversion _mApplicationConversion) {
    	return this.mApplicationConversionDaoImpl.updateMApplicationConversion(_mApplicationConversion);
    }
}
