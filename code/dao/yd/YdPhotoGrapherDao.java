package com.yundong.api.dao;

import com.yundong.api.entity.YdPhotoGrapher;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdPhotoGrapherDao{
	  String getPrefix();
	  int saveYdPhotoGrapher(YdPhotoGrapher ydPhotoGrapher);
	  YdPhotoGrapher getYdPhotoGrapherByID(Long	id);
	  int updateYdPhotoGrapher(YdPhotoGrapher ydPhotoGrapher);
}
