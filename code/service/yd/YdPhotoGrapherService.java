package com.yundong.api.service;

import java.util.List;
import com.yundong.api.entity.YdPhotoGrapher;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdPhotoGrapherService {
	
    int saveYdPhotoGrapher(YdPhotoGrapher ydPhotoGrapher);
    YdPhotoGrapher getYdPhotoGrapherByID(Long	id);
    int updateYdPhotoGrapher(YdPhotoGrapher ydPhotoGrapher);
}
