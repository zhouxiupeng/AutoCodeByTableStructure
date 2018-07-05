package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdPhotoGrapherDao;
import com.yundong.api.service.IYdPhotoGrapherService;
import com.yundong.api.entity.YdPhotoGrapher;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdPhotoGrapherServiceImpl  implements IYdPhotoGrapherService {

    @Autowired
    private IYdPhotoGrapherDao ydPhotoGrapherDaoImpl;


    @Override
    public int saveYdPhotoGrapher(YdPhotoGrapher ydPhotoGrapher) {
    	return this.ydPhotoGrapherDaoImpl.saveYdPhotoGrapher(ydPhotoGrapher);
    }

    @Override
    public YdPhotoGrapher getYdPhotoGrapherByID(Long	id) {
    	return this.ydPhotoGrapherDaoImpl.getYdPhotoGrapherByID(id);
    }
    @Override
    public int updateYdPhotoGrapher(YdPhotoGrapher ydPhotoGrapher) {
    	return this.ydPhotoGrapherDaoImpl.updateYdPhotoGrapher(ydPhotoGrapher);
    }
}
