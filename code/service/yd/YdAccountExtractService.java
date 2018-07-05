package com.yundong.payment.service;

import java.util.List;
import com.yundong.payment.entity.YdAccountExtract;

/**
 * 【提现流水号关联表】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-03
 * 
 */
public interface IYdAccountExtractService {
	
    int saveYdAccountExtract(YdAccountExtract _ydAccountExtract);
    YdAccountExtract getYdAccountExtractByID(Integer	_id);
    int updateYdAccountExtract(YdAccountExtract _ydAccountExtract);
}
