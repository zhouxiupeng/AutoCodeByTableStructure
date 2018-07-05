package com.yundong.m1_core.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.m1_core.dao.IMHierarchicalRelationshipDao;
import com.yundong.m1_core.service.IMHierarchicalRelationshipService;
import com.yundong.m1_core.entity.MHierarchicalRelationship;

/**
 * 【层级关系定义】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
@Service
public class MHierarchicalRelationshipServiceImpl  implements IMHierarchicalRelationshipService {

    @Autowired
    private IMHierarchicalRelationshipDao mHierarchicalRelationshipDaoImpl;


    @Override
    public int saveMHierarchicalRelationship(MHierarchicalRelationship _mHierarchicalRelationship) {
    	return this.mHierarchicalRelationshipDaoImpl.saveMHierarchicalRelationship(_mHierarchicalRelationship);
    }

    @Override
    public MHierarchicalRelationship getMHierarchicalRelationshipByID(Long	_muid) {
    	return this.mHierarchicalRelationshipDaoImpl.getMHierarchicalRelationshipByID(_muid);
    }
    @Override
    public int updateMHierarchicalRelationship(MHierarchicalRelationship _mHierarchicalRelationship) {
    	return this.mHierarchicalRelationshipDaoImpl.updateMHierarchicalRelationship(_mHierarchicalRelationship);
    }
}
