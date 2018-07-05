package com.yundong.payment.dao;

import com.yundong.payment.entity.YdAccountExtract;

/**
 * 【提现流水号关联表】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IYdAccountExtractDao{
	  String getPrefix();
	  int saveYdAccountExtract(YdAccountExtract _ydAccountExtract);
	  YdAccountExtract getYdAccountExtractByID(Integer	_id);
	  int updateYdAccountExtract(YdAccountExtract _ydAccountExtract);
}
