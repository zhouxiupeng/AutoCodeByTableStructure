package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.UmfAccountAnalyse;

/**
 * 【联动支付系统账号对账数据的分析】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-06
 * 
 */
public interface IUmfAccountAnalyseService {
	
    int saveUmfAccountAnalyse(long key, UmfAccountAnalyse umfAccountAnalyse);
    UmfAccountAnalyse getUmfAccountAnalyseByID(long key, Date	transfer_settle_date ,Integer	data_type);
    int updateUmfAccountAnalyse(long key, UmfAccountAnalyse umfAccountAnalyse);
}
