package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MApplicationConversion;

/**
 * 【用户更换系列申请的原因】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMApplicationConversionDao{
	  String getPrefix();
	  int saveMApplicationConversion(MApplicationConversion _mApplicationConversion);
	  MApplicationConversion getMApplicationConversionByID(Long	_id);
	  int updateMApplicationConversion(MApplicationConversion _mApplicationConversion);
}
