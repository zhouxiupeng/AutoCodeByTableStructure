package com.yundong.api.service;

import java.util.List;
import com.yundong.api.entity.YdTopicInfoMedia;

/**
 * 【话题媒体信息】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicInfoMediaService {
	
    int saveYdTopicInfoMedia(YdTopicInfoMedia ydTopicInfoMedia);
    YdTopicInfoMedia getYdTopicInfoMediaByID(Long	id);
    int updateYdTopicInfoMedia(YdTopicInfoMedia ydTopicInfoMedia);
}
