package com.yundong.image.storage.service;

import java.util.List;
import com.yundong.image.storage.entity.YdMediaDistribute;

/**
 * 【图片分发记录表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdMediaDistributeService {
	
    int saveYdMediaDistribute(long key, YdMediaDistribute ydMediaDistribute);
    YdMediaDistribute getYdMediaDistributeByID(long key, Long	id ,Long	activity_id);
    int updateYdMediaDistribute(long key, YdMediaDistribute ydMediaDistribute);
}
