package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMReferralRelationshipDao;
import com.yundong.m1_core.service.IMReferralRelationshipService;
import com.yundong.m1_core.entity.MReferralRelationship;

/**
 * 【推荐人关系表，用于查询全辖直辖等】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MReferralRelationshipServiceImpl  implements IMReferralRelationshipService {

    @Autowired
    private IMReferralRelationshipDao mReferralRelationshipDaoImpl;


    @Override
    public int saveMReferralRelationship(MReferralRelationship _mReferralRelationship) {
    	return this.mReferralRelationshipDaoImpl.saveMReferralRelationship(_mReferralRelationship);
    }

    @Override
    public MReferralRelationship getMReferralRelationshipByID(Long	_muid) {
    	return this.mReferralRelationshipDaoImpl.getMReferralRelationshipByID(_muid);
    }
    @Override
    public int updateMReferralRelationship(MReferralRelationship _mReferralRelationship) {
    	return this.mReferralRelationshipDaoImpl.updateMReferralRelationship(_mReferralRelationship);
    }
}
