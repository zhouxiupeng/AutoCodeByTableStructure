package com.yundong.m1.core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【分成汇总记录表】持久化对象 数据库表：m_divided_summary
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MDividedSummary implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 分成者muid
    private Long dividedMuid;
    // 分成者uid
    private Long dividedUid;
    // 归档时间【yyyyMMdd】根据订单时间来
    private Date archivingTime;
    // 总分成金额
    private Long allShareAmount;
    // 培育总金额
    private Long allCultivationAmount;
    // 辅导总金额
    private Long allCoachAmount;
    // 成效总金额
    private Long allResultsAmount;
    // 创建时间
    private Date createTime;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 分成者muid */
    public Long getDividedMuid() {
        return dividedMuid;
    }

    /** 设置 分成者muid */
    public void setDividedMuid(Long dividedMuid) {
        this.dividedMuid = dividedMuid;
    }

    /** 获取 分成者uid */
    public Long getDividedUid() {
        return dividedUid;
    }

    /** 设置 分成者uid */
    public void setDividedUid(Long dividedUid) {
        this.dividedUid = dividedUid;
    }

    /** 获取 归档时间【yyyyMMdd】根据订单时间来 */
    public Date getArchivingTime() {
        return archivingTime;
    }

    /** 设置 归档时间【yyyyMMdd】根据订单时间来 */
    public void setArchivingTime(Date archivingTime) {
        this.archivingTime = archivingTime;
    }

    /** 获取 总分成金额 */
    public Long getAllShareAmount() {
        return allShareAmount;
    }

    /** 设置 总分成金额 */
    public void setAllShareAmount(Long allShareAmount) {
        this.allShareAmount = allShareAmount;
    }

    /** 获取 培育总金额 */
    public Long getAllCultivationAmount() {
        return allCultivationAmount;
    }

    /** 设置 培育总金额 */
    public void setAllCultivationAmount(Long allCultivationAmount) {
        this.allCultivationAmount = allCultivationAmount;
    }

    /** 获取 辅导总金额 */
    public Long getAllCoachAmount() {
        return allCoachAmount;
    }

    /** 设置 辅导总金额 */
    public void setAllCoachAmount(Long allCoachAmount) {
        this.allCoachAmount = allCoachAmount;
    }

    /** 获取 成效总金额 */
    public Long getAllResultsAmount() {
        return allResultsAmount;
    }

    /** 设置 成效总金额 */
    public void setAllResultsAmount(Long allResultsAmount) {
        this.allResultsAmount = allResultsAmount;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MDividedSummary");
        sb.append("{id=").append(id);
        sb.append(", dividedMuid=").append(dividedMuid);
        sb.append(", dividedUid=").append(dividedUid);
        sb.append(", archivingTime=").append(archivingTime);
        sb.append(", allShareAmount=").append(allShareAmount);
        sb.append(", allCultivationAmount=").append(allCultivationAmount);
        sb.append(", allCoachAmount=").append(allCoachAmount);
        sb.append(", allResultsAmount=").append(allResultsAmount);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MDividedSummary) {
            MDividedSummary mDividedSummary = (MDividedSummary) obj;
            if (this.getId().equals(mDividedSummary.getId())) {
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