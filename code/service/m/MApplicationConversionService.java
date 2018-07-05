package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MApplicationConversion;

/**
 * 【用户更换系列申请的原因】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMApplicationConversionService {
	
    int saveMApplicationConversion(MApplicationConversion _mApplicationConversion);
    MApplicationConversion getMApplicationConversionByID(Long	_id);
    int updateMApplicationConversion(MApplicationConversion _mApplicationConversion);
}
