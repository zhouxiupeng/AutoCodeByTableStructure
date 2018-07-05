package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IYdWxOrderDao;
import com.yundong.m1_core.service.IYdWxOrderService;
import com.yundong.m1_core.entity.YdWxOrder;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class YdWxOrderServiceImpl  implements IYdWxOrderService {

    @Autowired
    private IYdWxOrderDao ydWxOrderDaoImpl;


    @Override
    public int saveYdWxOrder(YdWxOrder _ydWxOrder) {
    	return this.ydWxOrderDaoImpl.saveYdWxOrder(_ydWxOrder);
    }

    @Override
    public YdWxOrder getYdWxOrderByID(Integer	_id) {
    	return this.ydWxOrderDaoImpl.getYdWxOrderByID(_id);
    }
    @Override
    public int updateYdWxOrder(YdWxOrder _ydWxOrder) {
    	return this.ydWxOrderDaoImpl.updateYdWxOrder(_ydWxOrder);
    }
}
