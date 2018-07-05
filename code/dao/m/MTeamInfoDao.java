package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MTeamInfo;

/**
 * 【当前考核周期内团队的总体数据】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMTeamInfoDao{
	  String getPrefix();
	  int saveMTeamInfo(MTeamInfo _mTeamInfo);
	  MTeamInfo getMTeamInfoByID(Long	_muid);
	  int updateMTeamInfo(MTeamInfo _mTeamInfo);
}
