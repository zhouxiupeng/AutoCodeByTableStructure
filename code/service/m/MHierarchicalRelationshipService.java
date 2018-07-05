package com.yundong.m1_core.service;

import java.util.List;
import com.yundong.m1_core.entity.MHierarchicalRelationship;

/**
 * 【层级关系定义】 服务类 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMHierarchicalRelationshipService {
	
    int saveMHierarchicalRelationship(MHierarchicalRelationship _mHierarchicalRelationship);
    MHierarchicalRelationship getMHierarchicalRelationshipByID(Long	_muid);
    int updateMHierarchicalRelationship(MHierarchicalRelationship _mHierarchicalRelationship);
}
