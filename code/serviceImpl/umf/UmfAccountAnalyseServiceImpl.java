package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IUmfAccountAnalyseDao;
import com.yundong.payment.service.IUmfAccountAnalyseService;
import com.yundong.payment.entity.UmfAccountAnalyse;

/**
 * 【联动支付系统账号对账数据的分析】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class UmfAccountAnalyseServiceImpl  implements IUmfAccountAnalyseService {

    @Autowired
    private IUmfAccountAnalyseDao umfAccountAnalyseDaoImpl;


    @Override
    public int saveUmfAccountAnalyse(long key, UmfAccountAnalyse umfAccountAnalyse) {
    	return this.umfAccountAnalyseDaoImpl.saveUmfAccountAnalyse(key, umfAccountAnalyse);
    }

    @Override
    public UmfAccountAnalyse getUmfAccountAnalyseByID(long key, Date	transfer_settle_date ,Integer	data_type) {
    	return this.umfAccountAnalyseDaoImpl.getUmfAccountAnalyseByID(key, transfer_settle_date ,data_type);
    }
    @Override
    public int updateUmfAccountAnalyse(long key, UmfAccountAnalyse umfAccountAnalyse) {
    	return this.umfAccountAnalyseDaoImpl.updateUmfAccountAnalyse(key, umfAccountAnalyse);
    }
}
