package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MReferralRelationship;

/**
 * 【推荐人关系表，用于查询全辖直辖等】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMReferralRelationshipDao{
	  String getPrefix();
	  int saveMReferralRelationship(MReferralRelationship _mReferralRelationship);
	  MReferralRelationship getMReferralRelationshipByID(Long	_muid);
	  int updateMReferralRelationship(MReferralRelationship _mReferralRelationship);
}
