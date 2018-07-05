package com.yundong.m1_core.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【用户每月基本统计】持久化对象 数据库表：m_user_monthly_reports
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MUserMonthlyReportsVO implements Serializable {

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
    // 课程测试结果
    private Integer testResults;
    // 用户的等级
    private Integer userLevel;

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

    /** 获取 课程测试结果 */
    public Integer getTestResults() {
        return testResults;
    }

    /** 设置 课程测试结果 */
    public void setTestResults(Integer testResults) {
        this.testResults = testResults;
    }

    /** 获取 用户的等级 */
    public Integer getUserLevel() {
        return userLevel;
    }

    /** 设置 用户的等级 */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MUserMonthlyReportsVO");
        sb.append("{muid=").append(muid);
        sb.append(", archivingTime=").append(archivingTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", uploadCount=").append(uploadCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", thanksNumber=").append(thanksNumber);
        sb.append(", thanksAmount=").append(thanksAmount);
        sb.append(", testResults=").append(testResults);
        sb.append(", userLevel=").append(userLevel);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MUserMonthlyReportsVO) {
            MUserMonthlyReportsVO mUserMonthlyReports = (MUserMonthlyReportsVO) obj;
            if (this.getMuid().equals(mUserMonthlyReports.getMuid()) && this.getArchivingTime().equals(mUserMonthlyReports.getArchivingTime())) {
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