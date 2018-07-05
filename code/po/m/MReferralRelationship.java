package com.yundong.m1_core.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【推荐人关系表，用于查询全辖直辖等】持久化对象 数据库表：m_referral_relationship
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MReferralRelationshipVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 有直接或间接关系的人
    private Long relationMuid;
    // 
    private Date createTime;
    // 
    private Integer muidLevel;
    // 
    private Integer relationMuidLevel;
    // muid是不是有效用户，0非有效，1有效数据
    private Integer status;

    /** 获取  */
    public Long getMuid() {
        return muid;
    }

    /** 设置  */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /** 获取 有直接或间接关系的人 */
    public Long getRelationMuid() {
        return relationMuid;
    }

    /** 设置 有直接或间接关系的人 */
    public void setRelationMuid(Long relationMuid) {
        this.relationMuid = relationMuid;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取  */
    public Integer getMuidLevel() {
        return muidLevel;
    }

    /** 设置  */
    public void setMuidLevel(Integer muidLevel) {
        this.muidLevel = muidLevel;
    }

    /** 获取  */
    public Integer getRelationMuidLevel() {
        return relationMuidLevel;
    }

    /** 设置  */
    public void setRelationMuidLevel(Integer relationMuidLevel) {
        this.relationMuidLevel = relationMuidLevel;
    }

    /** 获取 muid是不是有效用户，0非有效，1有效数据 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 muid是不是有效用户，0非有效，1有效数据 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MReferralRelationshipVO");
        sb.append("{muid=").append(muid);
        sb.append(", relationMuid=").append(relationMuid);
        sb.append(", createTime=").append(createTime);
        sb.append(", muidLevel=").append(muidLevel);
        sb.append(", relationMuidLevel=").append(relationMuidLevel);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MReferralRelationshipVO) {
            MReferralRelationshipVO mReferralRelationship = (MReferralRelationshipVO) obj;
            if (this.getMuid().equals(mReferralRelationship.getMuid())) {
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