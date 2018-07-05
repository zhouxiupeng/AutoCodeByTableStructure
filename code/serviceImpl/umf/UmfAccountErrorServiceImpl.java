package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IUmfAccountErrorDao;
import com.yundong.payment.service.IUmfAccountErrorService;
import com.yundong.payment.entity.UmfAccountError;

/**
 * 【错误的对账数据】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class UmfAccountErrorServiceImpl  implements IUmfAccountErrorService {

    @Autowired
    private IUmfAccountErrorDao umfAccountErrorDaoImpl;


    @Override
    public int saveUmfAccountError(long key, UmfAccountError umfAccountError) {
    	return this.umfAccountErrorDaoImpl.saveUmfAccountError(key, umfAccountError);
    }

    @Override
    public UmfAccountError getUmfAccountErrorByID(long key, String	order_id) {
    	return this.umfAccountErrorDaoImpl.getUmfAccountErrorByID(key, order_id);
    }
    @Override
    public int updateUmfAccountError(long key, UmfAccountError umfAccountError) {
    	return this.umfAccountErrorDaoImpl.updateUmfAccountError(key, umfAccountError);
    }
}
