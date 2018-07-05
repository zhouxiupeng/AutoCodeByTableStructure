package com.yundong.api.dao;

import com.yundong.api.entity.YdTopicInfoMedia;

/**
 * 【话题媒体信息】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicInfoMediaDao{
	  String getPrefix();
	  int saveYdTopicInfoMedia(YdTopicInfoMedia ydTopicInfoMedia);
	  YdTopicInfoMedia getYdTopicInfoMediaByID(Long	id);
	  int updateYdTopicInfoMedia(YdTopicInfoMedia ydTopicInfoMedia);
}
