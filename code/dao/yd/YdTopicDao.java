package com.yundong.api.dao;

import com.yundong.api.entity.YdTopic;

/**
 * 【话题】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicDao{
	  String getPrefix();
	  int saveYdTopic(YdTopic ydTopic);
	  YdTopic getYdTopicByID(Long	id);
	  int updateYdTopic(YdTopic ydTopic);
}
