package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.YdDownloadPic;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IYdDownloadPicService {
	
    int saveYdDownloadPic(YdDownloadPic _ydDownloadPic);
    YdDownloadPic getYdDownloadPicByID(Integer	_id);
    int updateYdDownloadPic(YdDownloadPic _ydDownloadPic);
}
