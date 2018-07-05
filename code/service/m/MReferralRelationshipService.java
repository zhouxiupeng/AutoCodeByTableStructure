package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MReferralRelationship;

/**
 * 【推荐人关系表，用于查询全辖直辖等】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMReferralRelationshipService {
	
    int saveMReferralRelationship(MReferralRelationship _mReferralRelationship);
    MReferralRelationship getMReferralRelationshipByID(Long	_muid);
    int updateMReferralRelationship(MReferralRelationship _mReferralRelationship);
}
