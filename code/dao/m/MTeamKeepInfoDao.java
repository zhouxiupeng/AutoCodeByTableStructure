package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamKeepInfo;

/**
 * 【当前考核周期内团队维持的总体数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-05
 * 
 */
public interface IMTeamKeepInfoDao{
	  String getPrefix();
	  int saveMTeamKeepInfo(MTeamKeepInfo _mTeamKeepInfo);
	  MTeamKeepInfo getMTeamKeepInfoByID(Long	_muid);
	  int updateMTeamKeepInfo(MTeamKeepInfo _mTeamKeepInfo);
}
