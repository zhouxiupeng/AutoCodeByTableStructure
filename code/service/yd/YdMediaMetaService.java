package com.yundong.image.storage.service;

import java.util.List;
import com.yundong.image.storage.entity.YdMediaMeta;

/**
 * 【其它媒体信息表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdMediaMetaService {
	
    int saveYdMediaMeta(long key, YdMediaMeta ydMediaMeta);
    YdMediaMeta getYdMediaMetaByID(long key, Long	id);
    int updateYdMediaMeta(long key, YdMediaMeta ydMediaMeta);
}
