package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【用户更换系列申请的原因】持久化对象 数据库表：m_application_conversion
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MApplicationConversion implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 过程【0新建1转换成功，-1 撤销】
    private Integer process;
    // 
    private Long uid;
    // 申请时间
    private Date applyTime;
    // 生效时间
    private Date forceTime;
    // 更换原因
    private String changeCause;
    // 
    private Long id;
    // 
    private Date updateTime;
    // 推荐人uid
    private Long refereerUid;

    /** 获取  */
    public Long getMuid() {
        return muid;
    }

    /** 设置  */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /** 获取 过程【0新建1转换成功，-1 撤销】 */
    public Integer getProcess() {
        return process;
    }

    /** 设置 过程【0新建1转换成功，-1 撤销】 */
    public void setProcess(Integer process) {
        this.process = process;
    }

    /** 获取  */
    public Long getUid() {
        return uid;
    }

    /** 设置  */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 申请时间 */
    public Date getApplyTime() {
        return applyTime;
    }

    /** 设置 申请时间 */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /** 获取 生效时间 */
    public Date getForceTime() {
        return forceTime;
    }

    /** 设置 生效时间 */
    public void setForceTime(Date forceTime) {
        this.forceTime = forceTime;
    }

    /** 获取 更换原因 */
    public String getChangeCause() {
        return changeCause;
    }

    /** 设置 更换原因 */
    public void setChangeCause(String changeCause) {
        this.changeCause = changeCause;
    }

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取  */
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 设置  */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 获取 推荐人uid */
    public Long getRefereerUid() {
        return refereerUid;
    }

    /** 设置 推荐人uid */
    public void setRefereerUid(Long refereerUid) {
        this.refereerUid = refereerUid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MApplicationConversion");
        sb.append("{muid=").append(muid);
        sb.append(", process=").append(process);
        sb.append(", uid=").append(uid);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", forceTime=").append(forceTime);
        sb.append(", changeCause=").append(changeCause);
        sb.append(", id=").append(id);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", refereerUid=").append(refereerUid);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MApplicationConversion) {
            MApplicationConversion mApplicationConversion = (MApplicationConversion) obj;
            if (this.getId().equals(mApplicationConversion.getId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getId();
        return pkStr.hashCode();
    }

}