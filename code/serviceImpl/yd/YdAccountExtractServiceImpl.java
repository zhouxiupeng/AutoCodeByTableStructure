package com.yundong.payment.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.payment.dao.IYdAccountExtractDao;
import com.yundong.payment.service.IYdAccountExtractService;
import com.yundong.payment.entity.YdAccountExtract;

/**
 * 【提现流水号关联表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
@Service
public class YdAccountExtractServiceImpl  implements IYdAccountExtractService {

    @Autowired
    private IYdAccountExtractDao ydAccountExtractDaoImpl;


    @Override
    public int saveYdAccountExtract(YdAccountExtract _ydAccountExtract) {
    	return this.ydAccountExtractDaoImpl.saveYdAccountExtract(_ydAccountExtract);
    }

    @Override
    public YdAccountExtract getYdAccountExtractByID(Integer	_id) {
    	return this.ydAccountExtractDaoImpl.getYdAccountExtractByID(_id);
    }
    @Override
    public int updateYdAccountExtract(YdAccountExtract _ydAccountExtract) {
    	return this.ydAccountExtractDaoImpl.updateYdAccountExtract(_ydAccountExtract);
    }
}
