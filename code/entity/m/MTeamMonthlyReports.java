package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【管理团队每月的统计】持久化对象 数据库表：m_team_monthly_reports
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MTeamMonthlyReports implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 归档时间[yyyyMM]
    private String archivingTime;
    // 创建时间
    private Date createTime;
    // 上传数量
    private Long uploadCount;
    // 下载数
    private Long downloadCount;
    // 答谢人数
    private Integer thanksNumber;
    // 答谢金额
    private Long thanksAmount;
    // 收益
    private Long profitAll;
    // 培育奖金
    private Long cultivationAmount;
    // 辅导津贴
    private Long coachAmount;
    // 成效奖金
    private Long resultsAmount;
    // 活动人力
    private Integer activeManpower;
    // 一代培育人
    private Integer oneTrainingEducation;
    // 两代培育人
    private Integer twoTrainingEducation;

    /** 获取  */
    public Long getMuid() {
        return muid;
    }

    /** 设置  */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /** 获取 归档时间[yyyyMM] */
    public String getArchivingTime() {
        return archivingTime;
    }

    /** 设置 归档时间[yyyyMM] */
    public void setArchivingTime(String archivingTime) {
        this.archivingTime = archivingTime;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 上传数量 */
    public Long getUploadCount() {
        return uploadCount;
    }

    /** 设置 上传数量 */
    public void setUploadCount(Long uploadCount) {
        this.uploadCount = uploadCount;
    }

    /** 获取 下载数 */
    public Long getDownloadCount() {
        return downloadCount;
    }

    /** 设置 下载数 */
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

    /** 获取 收益 */
    public Long getProfitAll() {
        return profitAll;
    }

    /** 设置 收益 */
    public void setProfitAll(Long profitAll) {
        this.profitAll = profitAll;
    }

    /** 获取 培育奖金 */
    public Long getCultivationAmount() {
        return cultivationAmount;
    }

    /** 设置 培育奖金 */
    public void setCultivationAmount(Long cultivationAmount) {
        this.cultivationAmount = cultivationAmount;
    }

    /** 获取 辅导津贴 */
    public Long getCoachAmount() {
        return coachAmount;
    }

    /** 设置 辅导津贴 */
    public void setCoachAmount(Long coachAmount) {
        this.coachAmount = coachAmount;
    }

    /** 获取 成效奖金 */
    public Long getResultsAmount() {
        return resultsAmount;
    }

    /** 设置 成效奖金 */
    public void setResultsAmount(Long resultsAmount) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MTeamMonthlyReports");
        sb.append("{muid=").append(muid);
        sb.append(", archivingTime=").append(archivingTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", uploadCount=").append(uploadCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", thanksNumber=").append(thanksNumber);
        sb.append(", thanksAmount=").append(thanksAmount);
        sb.append(", profitAll=").append(profitAll);
        sb.append(", cultivationAmount=").append(cultivationAmount);
        sb.append(", coachAmount=").append(coachAmount);
        sb.append(", resultsAmount=").append(resultsAmount);
        sb.append(", activeManpower=").append(activeManpower);
        sb.append(", oneTrainingEducation=").append(oneTrainingEducation);
        sb.append(", twoTrainingEducation=").append(twoTrainingEducation);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MTeamMonthlyReports) {
            MTeamMonthlyReports mTeamMonthlyReports = (MTeamMonthlyReports) obj;
            if (this.getMuid().equals(mTeamMonthlyReports.getMuid()) && this.getArchivingTime().equals(mTeamMonthlyReports.getArchivingTime())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getMuid() + this.getArchivingTime();
        return pkStr.hashCode();
    }

}