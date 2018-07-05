package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MTeamUpgradeInfo;

/**
 * 【当前考核周期内团队升级的总体数据】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamUpgradeInfoService {
	
    int saveMTeamUpgradeInfo(MTeamUpgradeInfo _mTeamUpgradeInfo);
    MTeamUpgradeInfo getMTeamUpgradeInfoByID(Long	_muid);
    int updateMTeamUpgradeInfo(MTeamUpgradeInfo _mTeamUpgradeInfo);
}
