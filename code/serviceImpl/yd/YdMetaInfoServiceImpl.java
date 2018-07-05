package com.yundong.image.storage.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.image.storage.dao.IYdMetaInfoDao;
import com.yundong.image.storage.service.IYdMetaInfoService;
import com.yundong.image.storage.entity.YdMetaInfo;

/**
 * 【图片meta信息表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class YdMetaInfoServiceImpl  implements IYdMetaInfoService {

    @Autowired
    private IYdMetaInfoDao ydMetaInfoDaoImpl;


    @Override
    public int saveYdMetaInfo(long key, YdMetaInfo ydMetaInfo) {
    	return this.ydMetaInfoDaoImpl.saveYdMetaInfo(key, ydMetaInfo);
    }

    @Override
    public YdMetaInfo getYdMetaInfoByID(long key, Long	id) {
    	return this.ydMetaInfoDaoImpl.getYdMetaInfoByID(key, id);
    }
    @Override
    public int updateYdMetaInfo(long key, YdMetaInfo ydMetaInfo) {
    	return this.ydMetaInfoDaoImpl.updateYdMetaInfo(key, ydMetaInfo);
    }
}
