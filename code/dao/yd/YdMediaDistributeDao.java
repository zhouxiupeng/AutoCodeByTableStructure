package com.yundong.image.storage.dao;

import com.yundong.image.storage.entity.YdMediaDistribute;

/**
 * 【图片分发记录表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdMediaDistributeDao{
	  String getPrefix();
	  int saveYdMediaDistribute(long key, YdMediaDistribute ydMediaDistribute);
	  YdMediaDistribute getYdMediaDistributeByID(long key, Long	id,Long	activity_id);
	  int updateYdMediaDistribute(long key, YdMediaDistribute ydMediaDistribute);
}
