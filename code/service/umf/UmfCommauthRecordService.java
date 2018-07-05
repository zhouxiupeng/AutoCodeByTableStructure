package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.UmfCommauthRecord;

/**
 * 【公共验证对账】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IUmfCommauthRecordService {
	
    int saveUmfCommauthRecord(long key, UmfCommauthRecord umfCommauthRecord);
    UmfCommauthRecord getUmfCommauthRecordByID(long key, String	order_id);
    int updateUmfCommauthRecord(long key, UmfCommauthRecord umfCommauthRecord);
}
