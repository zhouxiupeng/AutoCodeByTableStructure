package com.yundong.api.service;

import java.util.List;
import com.yundong.api.entity.YdUser;

/**
 * 【用户表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdUserService {
	
    int saveYdUser(YdUser ydUser);
    YdUser getYdUserByID(Long	uid);
    int updateYdUser(YdUser ydUser);
}
