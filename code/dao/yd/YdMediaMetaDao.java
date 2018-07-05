package com.yundong.image.storage.dao;

import com.yundong.image.storage.entity.YdMediaMeta;

/**
 * 【其它媒体信息表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdMediaMetaDao{
	  String getPrefix();
	  int saveYdMediaMeta(long key, YdMediaMeta ydMediaMeta);
	  YdMediaMeta getYdMediaMetaByID(long key, Long	id);
	  int updateYdMediaMeta(long key, YdMediaMeta ydMediaMeta);
}
