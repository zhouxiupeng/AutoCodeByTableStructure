package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MUserInfo;

/**
 * 【m1系统用户基本信息表，里面的信息都是当前用户的最新数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMUserInfoService {
	
    int saveMUserInfo(MUserInfo _mUserInfo);
    MUserInfo getMUserInfoByID(Long	_muid);
    int updateMUserInfo(MUserInfo _mUserInfo);
}
