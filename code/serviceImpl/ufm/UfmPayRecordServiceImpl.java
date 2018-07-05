package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IUfmPayRecordDao;
import com.yundong.payment.service.IUfmPayRecordService;
import com.yundong.payment.entity.UfmPayRecord;

/**
 * 【付款对账】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class UfmPayRecordServiceImpl  implements IUfmPayRecordService {

    @Autowired
    private IUfmPayRecordDao ufmPayRecordDaoImpl;


    @Override
    public int saveUfmPayRecord(long key, UfmPayRecord ufmPayRecord) {
    	return this.ufmPayRecordDaoImpl.saveUfmPayRecord(key, ufmPayRecord);
    }

    @Override
    public UfmPayRecord getUfmPayRecordByID(long key, String	order_id) {
    	return this.ufmPayRecordDaoImpl.getUfmPayRecordByID(key, order_id);
    }
    @Override
    public int updateUfmPayRecord(long key, UfmPayRecord ufmPayRecord) {
    	return this.ufmPayRecordDaoImpl.updateUfmPayRecord(key, ufmPayRecord);
    }
}
