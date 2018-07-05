package com.yundong.image.storage.dao;

import com.yundong.image.storage.entity.YdMetaInfo;

/**
 * 【图片meta信息表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdMetaInfoDao{
	  String getPrefix();
	  int saveYdMetaInfo(long key, YdMetaInfo ydMetaInfo);
	  YdMetaInfo getYdMetaInfoByID(long key, Long	id);
	  int updateYdMetaInfo(long key, YdMetaInfo ydMetaInfo);
}
