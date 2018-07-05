package com.yundong.api.dao;

import com.yundong.api.entity.YdTopicInfo;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicInfoDao{
	  String getPrefix();
	  int saveYdTopicInfo(YdTopicInfo ydTopicInfo);
	  YdTopicInfo getYdTopicInfoByID(Long	id,Date	start_time);
	  int updateYdTopicInfo(YdTopicInfo ydTopicInfo);
}
