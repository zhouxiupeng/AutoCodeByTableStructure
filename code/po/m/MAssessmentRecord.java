package com.yundong.m1_core.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【考核最终结果数据】持久化对象 数据库表：m_assessment_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MAssessmentRecordVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 
    private Long uid;
    // 考核周期格式yyyy.MM.dd-yyyy.MM.dd
    private String assessTime;
    // 创建时间
    private Date createTime;
    // 考核前层级
    private Integer preLevel;
    // 考核前层级
    private Integer laterLevel;
    // 状态【-1降级、0维持、1升级】
    private Integer status;
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

    /** 获取 考核周期格式yyyy.MM.dd-yyyy.MM.dd */
    public String getAssessTime() {
        return assessTime;
    }

    /** 设置 考核周期格式yyyy.MM.dd-yyyy.MM.dd */
    public void setAssessTime(String assessTime) {
        this.assessTime = assessTime;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 考核前层级 */
    public Integer getPreLevel() {
        return preLevel;
    }

    /** 设置 考核前层级 */
    public void setPreLevel(Integer preLevel) {
        this.preLevel = preLevel;
    }

    /** 获取 考核前层级 */
    public Integer getLaterLevel() {
        return laterLevel;
    }

    /** 设置 考核前层级 */
    public void setLaterLevel(Integer laterLevel) {
        this.laterLevel = laterLevel;
    }

    /** 获取 状态【-1降级、0维持、1升级】 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态【-1降级、0维持、1升级】 */
    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append("MAssessmentRecordVO");
        sb.append("{muid=").append(muid);
        sb.append(", uid=").append(uid);
        sb.append(", assessTime=").append(assessTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", preLevel=").append(preLevel);
        sb.append(", laterLevel=").append(laterLevel);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MAssessmentRecordVO) {
            MAssessmentRecordVO mAssessmentRecord = (MAssessmentRecordVO) obj;
            if (this.getMuid().equals(mAssessmentRecord.getMuid()) && this.getAssessTime().equals(mAssessmentRecord.getAssessTime())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getMuid() + this.getAssessTime();
        return pkStr.hashCode();
    }

}