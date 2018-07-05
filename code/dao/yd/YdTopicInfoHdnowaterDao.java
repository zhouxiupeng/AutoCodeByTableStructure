package com.yundong.api.dao;

import com.yundong.api.entity.YdTopicInfoHdnowater;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicInfoHdnowaterDao{
	  String getPrefix();
	  int saveYdTopicInfoHdnowater(YdTopicInfoHdnowater ydTopicInfoHdnowater);
	  YdTopicInfoHdnowater getYdTopicInfoHdnowaterByID(Long	topic_info_id);
	  int updateYdTopicInfoHdnowater(YdTopicInfoHdnowater ydTopicInfoHdnowater);
}
