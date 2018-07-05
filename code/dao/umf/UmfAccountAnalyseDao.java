package com.yundong.payment.dao;

import com.yundong.payment.entity.UmfAccountAnalyse;

/**
 * 【联动支付系统账号对账数据的分析】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IUmfAccountAnalyseDao{
	  String getPrefix();
	  int saveUmfAccountAnalyse(long key, UmfAccountAnalyse umfAccountAnalyse);
	  UmfAccountAnalyse getUmfAccountAnalyseByID(long key, Date	transfer_settle_date,Integer	data_type);
	  int updateUmfAccountAnalyse(long key, UmfAccountAnalyse umfAccountAnalyse);
}
