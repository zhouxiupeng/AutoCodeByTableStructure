package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【用户每天基本统计】持久化对象 数据库表：m_user_daily_reports
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MUserDailyReports implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 归档时间[yyyyMMdd]
    private Date archivingTime;
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
    private Long profit;

    /** 获取  */
    public Long getMuid() {
        return muid;
    }

    /** 设置  */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /** 获取 归档时间[yyyyMMdd] */
    public Date getArchivingTime() {
        return archivingTime;
    }

    /** 设置 归档时间[yyyyMMdd] */
    public void setArchivingTime(Date archivingTime) {
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
    public Long getProfit() {
        return profit;
    }

    /** 设置 收益 */
    public void setProfit(Long profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MUserDailyReports");
        sb.append("{muid=").append(muid);
        sb.append(", archivingTime=").append(archivingTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", uploadCount=").append(uploadCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", thanksNumber=").append(thanksNumber);
        sb.append(", thanksAmount=").append(thanksAmount);
        sb.append(", profit=").append(profit);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MUserDailyReports) {
            MUserDailyReports mUserDailyReports = (MUserDailyReports) obj;
            if (this.getMuid().equals(mUserDailyReports.getMuid()) && this.getArchivingTime().equals(mUserDailyReports.getArchivingTime())) {
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