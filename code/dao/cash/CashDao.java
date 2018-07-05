package com.yundong.payment.dao;

import com.yundong.payment.entity.Cash;

/**
 * 【】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface ICashDao{
	  String getPrefix();
	  int saveCash(Cash _cash);
	  Cash getCashByID(Integer	_id);
	  int updateCash(Cash _cash);
}
