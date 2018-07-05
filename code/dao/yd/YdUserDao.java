package com.yundong.api.dao;

import com.yundong.api.entity.YdUser;

/**
 * 【用户表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
public interface IYdUserDao{
	  String getPrefix();
	  int saveYdUser(YdUser ydUser);
	  YdUser getYdUserByID(Long	uid);
	  int updateYdUser(YdUser ydUser);
}
