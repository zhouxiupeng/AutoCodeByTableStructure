package com.yundong.image.storage.service;

import java.util.List;
import com.yundong.image.storage.entity.YdMetaInfo;

/**
 * 【图片meta信息表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdMetaInfoService {
	
    int saveYdMetaInfo(long key, YdMetaInfo ydMetaInfo);
    YdMetaInfo getYdMetaInfoByID(long key, Long	id);
    int updateYdMetaInfo(long key, YdMetaInfo ydMetaInfo);
}
