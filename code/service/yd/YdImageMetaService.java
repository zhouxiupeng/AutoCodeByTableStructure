package com.yundong.image.storage.service;

import java.util.List;
import com.yundong.image.storage.entity.YdImageMeta;

/**
 * 【图片信息表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdImageMetaService {
	
    int saveYdImageMeta(long key, YdImageMeta ydImageMeta);
    YdImageMeta getYdImageMetaByID(long key, Long	id);
    int updateYdImageMeta(long key, YdImageMeta ydImageMeta);
}
