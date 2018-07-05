package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IUmfCommauthRecordDao;
import com.yundong.payment.service.IUmfCommauthRecordService;
import com.yundong.payment.entity.UmfCommauthRecord;

/**
 * 【公共验证对账】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class UmfCommauthRecordServiceImpl  implements IUmfCommauthRecordService {

    @Autowired
    private IUmfCommauthRecordDao umfCommauthRecordDaoImpl;


    @Override
    public int saveUmfCommauthRecord(long key, UmfCommauthRecord umfCommauthRecord) {
    	return this.umfCommauthRecordDaoImpl.saveUmfCommauthRecord(key, umfCommauthRecord);
    }

    @Override
    public UmfCommauthRecord getUmfCommauthRecordByID(long key, String	order_id) {
    	return this.umfCommauthRecordDaoImpl.getUmfCommauthRecordByID(key, order_id);
    }
    @Override
    public int updateUmfCommauthRecord(long key, UmfCommauthRecord umfCommauthRecord) {
    	return this.umfCommauthRecordDaoImpl.updateUmfCommauthRecord(key, umfCommauthRecord);
    }
}
