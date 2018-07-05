package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.YdDownloadPic;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IYdDownloadPicDao{
	  String getPrefix();
	  int saveYdDownloadPic(YdDownloadPic _ydDownloadPic);
	  YdDownloadPic getYdDownloadPicByID(Integer	_id);
	  int updateYdDownloadPic(YdDownloadPic _ydDownloadPic);
}
