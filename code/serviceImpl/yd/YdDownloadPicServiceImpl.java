package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IYdDownloadPicDao;
import com.yundong.m1_core.service.IYdDownloadPicService;
import com.yundong.m1_core.entity.YdDownloadPic;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class YdDownloadPicServiceImpl  implements IYdDownloadPicService {

    @Autowired
    private IYdDownloadPicDao ydDownloadPicDaoImpl;


    @Override
    public int saveYdDownloadPic(YdDownloadPic _ydDownloadPic) {
    	return this.ydDownloadPicDaoImpl.saveYdDownloadPic(_ydDownloadPic);
    }

    @Override
    public YdDownloadPic getYdDownloadPicByID(Integer	_id) {
    	return this.ydDownloadPicDaoImpl.getYdDownloadPicByID(_id);
    }
    @Override
    public int updateYdDownloadPic(YdDownloadPic _ydDownloadPic) {
    	return this.ydDownloadPicDaoImpl.updateYdDownloadPic(_ydDownloadPic);
    }
}
