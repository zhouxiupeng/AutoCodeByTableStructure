package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【团队考核结果记录表】持久化对象 数据库表：m_team_assessment_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MTeamAssessmentRecord implements Serializable {

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
    // 培育奖金
    private Integer cultivationAmount;
    // 辅导津贴
    private Integer coachAmount;
    // 成效奖金
    private Integer resultsAmount;
    // 活动人力
    private Integer activeManpower;
    // 一代培育人
    private Integer oneTrainingEducation;
    // 两代培育人
    private Integer twoTrainingEducation;
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

    /** 获取 培育奖金 */
    public Integer getCultivationAmount() {
        return cultivationAmount;
    }

    /** 设置 培育奖金 */
    public void setCultivationAmount(Integer cultivationAmount) {
        this.cultivationAmount = cultivationAmount;
    }

    /** 获取 辅导津贴 */
    public Integer getCoachAmount() {
        return coachAmount;
    }

    /** 设置 辅导津贴 */
    public void setCoachAmount(Integer coachAmount) {
        this.coachAmount = coachAmount;
    }

    /** 获取 成效奖金 */
    public Integer getResultsAmount() {
        return resultsAmount;
    }

    /** 设置 成效奖金 */
    public void setResultsAmount(Integer resultsAmount) {
        this.resultsAmount = resultsAmount;
    }

    /** 获取 活动人力 */
    public Integer getActiveManpower() {
        return activeManpower;
    }

    /** 设置 活动人力 */
    public void setActiveManpower(Integer activeManpower) {
        this.activeManpower = activeManpower;
    }

    /** 获取 一代培育人 */
    public Integer getOneTrainingEducation() {
        return oneTrainingEducation;
    }

    /** 设置 一代培育人 */
    public void setOneTrainingEducation(Integer oneTrainingEducation) {
        this.oneTrainingEducation = oneTrainingEducation;
    }

    /** 获取 两代培育人 */
    public Integer getTwoTrainingEducation() {
        return twoTrainingEducation;
    }

    /** 设置 两代培育人 */
    public void setTwoTrainingEducation(Integer twoTrainingEducation) {
        this.twoTrainingEducation = twoTrainingEducation;
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
        sb.append("MTeamAssessmentRecord");
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
        sb.append(", cultivationAmount=").append(cultivationAmount);
        sb.append(", coachAmount=").append(coachAmount);
        sb.append(", resultsAmount=").append(resultsAmount);
        sb.append(", activeManpower=").append(activeManpower);
        sb.append(", oneTrainingEducation=").append(oneTrainingEducation);
        sb.append(", twoTrainingEducation=").append(twoTrainingEducation);
        sb.append(", parametersId=").append(parametersId);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MTeamAssessmentRecord) {
            MTeamAssessmentRecord mTeamAssessmentRecord = (MTeamAssessmentRecord) obj;
            if (this.getMuid().equals(mTeamAssessmentRecord.getMuid()) && this.getAssessTime().equals(mTeamAssessmentRecord.getAssessTime())) {
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