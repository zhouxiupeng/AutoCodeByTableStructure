package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.Cash;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface ICashService {
	
    int saveCash(Cash _cash);
    Cash getCashByID(Integer	_id);
    int updateCash(Cash _cash);
}
