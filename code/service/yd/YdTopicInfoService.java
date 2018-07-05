package com.yundong.api.service;

import java.util.List;
import com.yundong.api.entity.YdTopicInfo;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdTopicInfoService {
	
    int saveYdTopicInfo(YdTopicInfo ydTopicInfo);
    YdTopicInfo getYdTopicInfoByID(Long	id ,Date	start_time);
    int updateYdTopicInfo(YdTopicInfo ydTopicInfo);
}
