package com.yundong.image.storage.service;

import java.util.List;
import com.yundong.image.storage.entity.YdFaceInfo;

/**
 * 【人脸特征信息表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IYdFaceInfoService {
	
    int saveYdFaceInfo(long key, YdFaceInfo ydFaceInfo);
    YdFaceInfo getYdFaceInfoByID(long key, Long	id ,Integer	face_id);
    int updateYdFaceInfo(long key, YdFaceInfo ydFaceInfo);
}
