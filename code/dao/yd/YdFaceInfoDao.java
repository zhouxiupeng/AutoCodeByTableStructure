package com.yundong.image.storage.dao;

import com.yundong.image.storage.entity.YdFaceInfo;

/**
 * 【人脸特征信息表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdFaceInfoDao{
	  String getPrefix();
	  int saveYdFaceInfo(long key, YdFaceInfo ydFaceInfo);
	  YdFaceInfo getYdFaceInfoByID(long key, Long	id,Integer	face_id);
	  int updateYdFaceInfo(long key, YdFaceInfo ydFaceInfo);
}
