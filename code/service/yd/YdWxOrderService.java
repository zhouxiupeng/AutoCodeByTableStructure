package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.YdWxOrder;

/**
 * 【】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IYdWxOrderService {
	
    int saveYdWxOrder(YdWxOrder _ydWxOrder);
    YdWxOrder getYdWxOrderByID(Integer	_id);
    int updateYdWxOrder(YdWxOrder _ydWxOrder);
}
