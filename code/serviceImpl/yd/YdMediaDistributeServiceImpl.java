package com.yundong.image.storage.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.image.storage.dao.IYdMediaDistributeDao;
import com.yundong.image.storage.service.IYdMediaDistributeService;
import com.yundong.image.storage.entity.YdMediaDistribute;

/**
 * 【图片分发记录表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class YdMediaDistributeServiceImpl  implements IYdMediaDistributeService {

    @Autowired
    private IYdMediaDistributeDao ydMediaDistributeDaoImpl;


    @Override
    public int saveYdMediaDistribute(long key, YdMediaDistribute ydMediaDistribute) {
    	return this.ydMediaDistributeDaoImpl.saveYdMediaDistribute(key, ydMediaDistribute);
    }

    @Override
    public YdMediaDistribute getYdMediaDistributeByID(long key, Long	id ,Long	activity_id) {
    	return this.ydMediaDistributeDaoImpl.getYdMediaDistributeByID(key, id ,activity_id);
    }
    @Override
    public int updateYdMediaDistribute(long key, YdMediaDistribute ydMediaDistribute) {
    	return this.ydMediaDistributeDaoImpl.updateYdMediaDistribute(key, ydMediaDistribute);
    }
}
