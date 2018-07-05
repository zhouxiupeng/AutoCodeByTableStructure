package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMDividedRecordDao;
import com.yundong.m1_core.service.IMDividedRecordService;
import com.yundong.m1_core.entity.MDividedRecord;

/**
 * 【分成明细记录表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MDividedRecordServiceImpl  implements IMDividedRecordService {

    @Autowired
    private IMDividedRecordDao mDividedRecordDaoImpl;


    @Override
    public int saveMDividedRecord(MDividedRecord _mDividedRecord) {
    	return this.mDividedRecordDaoImpl.saveMDividedRecord(_mDividedRecord);
    }

    @Override
    public MDividedRecord getMDividedRecordByID(Long	_id) {
    	return this.mDividedRecordDaoImpl.getMDividedRecordByID(_id);
    }
    @Override
    public int updateMDividedRecord(MDividedRecord _mDividedRecord) {
    	return this.mDividedRecordDaoImpl.updateMDividedRecord(_mDividedRecord);
    }
}
