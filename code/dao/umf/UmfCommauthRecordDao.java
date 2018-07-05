package com.yundong.payment.dao;

import com.yundong.payment.entity.UmfCommauthRecord;

/**
 * 【公共验证对账】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IUmfCommauthRecordDao{
	  String getPrefix();
	  int saveUmfCommauthRecord(long key, UmfCommauthRecord umfCommauthRecord);
	  UmfCommauthRecord getUmfCommauthRecordByID(long key, String	order_id);
	  int updateUmfCommauthRecord(long key, UmfCommauthRecord umfCommauthRecord);
}
