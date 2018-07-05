package com.yundong.m1_core.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【用户历史考核记录】持久化对象 数据库表：m_user_assessment_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MUserAssessmentRecordVO implements Serializable {

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
    // 上传数量
    private Long uploadCount;
    // 下载数量
    private Long downloadCount;
    // 答谢人数
    private Integer thanksNumber;
    // 答谢金额
    private Long thanksAmount;
    // 是否通过测试
    private Integer testResults;
    // 状态【-1降级、0维持、1升级】
    private Integer status;
    // 执行计算时参数集合信息
    private Long parametersId;

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

    /** 获取 上传数量 */
    public Long getUploadCount() {
        return uploadCount;
    }

    /** 设置 上传数量 */
    public void setUploadCount(Long uploadCount) {
        this.uploadCount = uploadCount;
    }

    /** 获取 下载数量 */
    public Long getDownloadCount() {
        return downloadCount;
    }

    /** 设置 下载数量 */
    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    /** 获取 答谢人数 */
    public Integer getThanksNumber() {
        return thanksNumber;
    }

    /** 设置 答谢人数 */
    public void setThanksNumber(Integer thanksNumber) {
        this.thanksNumber = thanksNumber;
    }

    /** 获取 答谢金额 */
    public Long getThanksAmount() {
        return thanksAmount;
    }

    /** 设置 答谢金额 */
    public void setThanksAmount(Long thanksAmount) {
        this.thanksAmount = thanksAmount;
    }

    /** 获取 是否通过测试 */
    public Integer getTestResults() {
        return testResults;
    }

    /** 设置 是否通过测试 */
    public void setTestResults(Integer testResults) {
        this.testResults = testResults;
    }

    /** 获取 状态【-1降级、0维持、1升级】 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态【-1降级、0维持、1升级】 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 执行计算时参数集合信息 */
    public Long getParametersId() {
        return parametersId;
    }

    /** 设置 执行计算时参数集合信息 */
    public void setParametersId(Long parametersId) {
        this.parametersId = parametersId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MUserAssessmentRecordVO");
        sb.append("{muid=").append(muid);
        sb.append(", uid=").append(uid);
        sb.append(", assessTime=").append(assessTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", preLevel=").append(preLevel);
        sb.append(", uploadCount=").append(uploadCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", thanksNumber=").append(thanksNumber);
        sb.append(", thanksAmount=").append(thanksAmount);
        sb.append(", testResults=").append(testResults);
        sb.append(", status=").append(status);
        sb.append(", parametersId=").append(parametersId);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MUserAssessmentRecordVO) {
            MUserAssessmentRecordVO mUserAssessmentRecord = (MUserAssessmentRecordVO) obj;
            if (this.getMuid().equals(mUserAssessmentRecord.getMuid()) && this.getAssessTime().equals(mUserAssessmentRecord.getAssessTime())) {
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