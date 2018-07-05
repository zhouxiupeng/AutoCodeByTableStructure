package com.yundong.m1_core.dao;

import com.yundong.m1_core.entity.MHierarchicalRelationship;

/**
 * 【层级关系定义】 数据访问对象 接口
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-04
 * 
 */
public interface IMHierarchicalRelationshipDao{
	  String getPrefix();
	  int saveMHierarchicalRelationship(MHierarchicalRelationship _mHierarchicalRelationship);
	  MHierarchicalRelationship getMHierarchicalRelationshipByID(Long	_muid);
	  int updateMHierarchicalRelationship(MHierarchicalRelationship _mHierarchicalRelationship);
}
