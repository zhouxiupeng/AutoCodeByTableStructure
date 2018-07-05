package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamInfo;

/**
 * 【当前考核周期内团队的总体数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamInfoService {
	
    int saveMTeamInfo(MTeamInfo _mTeamInfo);
    MTeamInfo getMTeamInfoByID(Long	_muid);
    int updateMTeamInfo(MTeamInfo _mTeamInfo);
}
