package com.yundong.image.storage.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.image.storage.dao.IYdMediaMetaDao;
import com.yundong.image.storage.service.IYdMediaMetaService;
import com.yundong.image.storage.entity.YdMediaMeta;

/**
 * 【其它媒体信息表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdMediaMetaServiceImpl  implements IYdMediaMetaService {

    @Autowired
    private IYdMediaMetaDao ydMediaMetaDaoImpl;


    @Override
    public int saveYdMediaMeta(long key, YdMediaMeta ydMediaMeta) {
    	return this.ydMediaMetaDaoImpl.saveYdMediaMeta(key, ydMediaMeta);
    }

    @Override
    public YdMediaMeta getYdMediaMetaByID(long key, Long	id) {
    	return this.ydMediaMetaDaoImpl.getYdMediaMetaByID(key, id);
    }
    @Override
    public int updateYdMediaMeta(long key, YdMediaMeta ydMediaMeta) {
    	return this.ydMediaMetaDaoImpl.updateYdMediaMeta(key, ydMediaMeta);
    }
}
