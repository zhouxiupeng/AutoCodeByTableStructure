package com.yundong.api.service;

import java.util.List;
import com.yundong.api.entity.YdTopic;

/**
 * 【话题】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicService {
	
    int saveYdTopic(YdTopic ydTopic);
    YdTopic getYdTopicByID(Long	id);
    int updateYdTopic(YdTopic ydTopic);
}
