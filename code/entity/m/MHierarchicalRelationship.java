package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【层级关系定义】持久化对象 数据库表：m_hierarchical_relationship
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MHierarchicalRelationship implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 
    private Long uid;
    // 创建时间
    private Date createTime;
    // 组长muid
    private Long groupleaderMuid;
    // 经理muid
    private Long managerMuid;
    // 总监muid
    private Long directorMuid;
    // 推荐人
    private Long refereerMuid;
    // 
    private Date updateTime;

    /** 获取  */
    public Long getMuid() {
        return muid;
    }

    /** 设置  */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /** 获取  */
    public Long getUid() {
        return uid;
    }

    /** 设置  */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 组长muid */
    public Long getGroupleaderMuid() {
        return groupleaderMuid;
    }

    /** 设置 组长muid */
    public void setGroupleaderMuid(Long groupleaderMuid) {
        this.groupleaderMuid = groupleaderMuid;
    }

    /** 获取 经理muid */
    public Long getManagerMuid() {
        return managerMuid;
    }

    /** 设置 经理muid */
    public void setManagerMuid(Long managerMuid) {
        this.managerMuid = managerMuid;
    }

    /** 获取 总监muid */
    public Long getDirectorMuid() {
        return directorMuid;
    }

    /** 设置 总监muid */
    public void setDirectorMuid(Long directorMuid) {
        this.directorMuid = directorMuid;
    }

    /** 获取 推荐人 */
    public Long getRefereerMuid() {
        return refereerMuid;
    }

    /** 设置 推荐人 */
    public void setRefereerMuid(Long refereerMuid) {
        this.refereerMuid = refereerMuid;
    }

    /** 获取  */
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 设置  */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MHierarchicalRelationship");
        sb.append("{muid=").append(muid);
        sb.append(", uid=").append(uid);
        sb.append(", createTime=").append(createTime);
        sb.append(", groupleaderMuid=").append(groupleaderMuid);
        sb.append(", managerMuid=").append(managerMuid);
        sb.append(", directorMuid=").append(directorMuid);
        sb.append(", refereerMuid=").append(refereerMuid);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MHierarchicalRelationship) {
            MHierarchicalRelationship mHierarchicalRelationship = (MHierarchicalRelationship) obj;
            if (this.getMuid().equals(mHierarchicalRelationship.getMuid())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getMuid();
        return pkStr.hashCode();
    }

}