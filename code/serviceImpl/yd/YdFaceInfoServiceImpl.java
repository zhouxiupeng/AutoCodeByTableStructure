package com.yundong.image.storage.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.image.storage.dao.IYdFaceInfoDao;
import com.yundong.image.storage.service.IYdFaceInfoService;
import com.yundong.image.storage.entity.YdFaceInfo;

/**
 * 【人脸特征信息表】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
@Service
public class YdFaceInfoServiceImpl  implements IYdFaceInfoService {

    @Autowired
    private IYdFaceInfoDao ydFaceInfoDaoImpl;


    @Override
    public int saveYdFaceInfo(long key, YdFaceInfo ydFaceInfo) {
    	return this.ydFaceInfoDaoImpl.saveYdFaceInfo(key, ydFaceInfo);
    }

    @Override
    public YdFaceInfo getYdFaceInfoByID(long key, Long	id ,Integer	face_id) {
    	return this.ydFaceInfoDaoImpl.getYdFaceInfoByID(key, id ,face_id);
    }
    @Override
    public int updateYdFaceInfo(long key, YdFaceInfo ydFaceInfo) {
    	return this.ydFaceInfoDaoImpl.updateYdFaceInfo(key, ydFaceInfo);
    }
}
