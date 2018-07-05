package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamKeepInfo;

/**
 * 【当前考核周期内团队维持的总体数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
public interface IMTeamKeepInfoService {
	
    int saveMTeamKeepInfo(MTeamKeepInfo _mTeamKeepInfo);
    MTeamKeepInfo getMTeamKeepInfoByID(Long	_muid);
    int updateMTeamKeepInfo(MTeamKeepInfo _mTeamKeepInfo);
}
