package com.yundong.payment.dao;

import com.yundong.payment.entity.UmfAccountError;

/**
 * 【错误的对账数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IUmfAccountErrorDao{
	  String getPrefix();
	  int saveUmfAccountError(long key, UmfAccountError umfAccountError);
	  UmfAccountError getUmfAccountErrorByID(long key, String	order_id);
	  int updateUmfAccountError(long key, UmfAccountError umfAccountError);
}
