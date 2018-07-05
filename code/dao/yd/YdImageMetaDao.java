package com.yundong.image.storage.dao;

import com.yundong.image.storage.entity.YdImageMeta;

/**
 * 【图片信息表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdImageMetaDao{
	  String getPrefix();
	  int saveYdImageMeta(long key, YdImageMeta ydImageMeta);
	  YdImageMeta getYdImageMetaByID(long key, Long	id);
	  int updateYdImageMeta(long key, YdImageMeta ydImageMeta);
}
