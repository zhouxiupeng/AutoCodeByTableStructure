package com.yundong.payment.dao;

import com.yundong.payment.entity.UfmPayRecord;

/**
 * 【付款对账】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IUfmPayRecordDao{
	  String getPrefix();
	  int saveUfmPayRecord(long key, UfmPayRecord ufmPayRecord);
	  UfmPayRecord getUfmPayRecordByID(long key, String	order_id);
	  int updateUfmPayRecord(long key, UfmPayRecord ufmPayRecord);
}
