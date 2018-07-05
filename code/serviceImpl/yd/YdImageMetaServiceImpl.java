package com.yundong.image.storage.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.image.storage.dao.IYdImageMetaDao;
import com.yundong.image.storage.service.IYdImageMetaService;
import com.yundong.image.storage.entity.YdImageMeta;

/**
 * 【图片信息表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class YdImageMetaServiceImpl  implements IYdImageMetaService {

    @Autowired
    private IYdImageMetaDao ydImageMetaDaoImpl;


    @Override
    public int saveYdImageMeta(long key, YdImageMeta ydImageMeta) {
    	return this.ydImageMetaDaoImpl.saveYdImageMeta(key, ydImageMeta);
    }

    @Override
    public YdImageMeta getYdImageMetaByID(long key, Long	id) {
    	return this.ydImageMetaDaoImpl.getYdImageMetaByID(key, id);
    }
    @Override
    public int updateYdImageMeta(long key, YdImageMeta ydImageMeta) {
    	return this.ydImageMetaDaoImpl.updateYdImageMeta(key, ydImageMeta);
    }
}
