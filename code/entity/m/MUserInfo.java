package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【m1系统用户基本信息表，里面的信息都是当前用户的最新数据】持久化对象 数据库表：m_user_info
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MUserInfo implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long muid;
    // 业务系统中的uid
    private Long uid;
    // 系列类型sys_type[1=P,2=M1]
    private Integer sysType;
    // 层级level【1,2,3,4
    private Integer userLevel;
    // 账户创建时间
    private Date createTime;
    // 上传数量
    private Long uploadCount;
    // 下载数量
    private Long downloadCount;
    // 答谢人数
    private Integer thanksNumber;
    // 答谢金额
    private Long thanksAmount;
    // 人员类型person_type【0正常人1历史摄影师】
    private Integer personType;
    // 考核起始时间
    private Date assessStartTime;
    // 考核结束时间
    private Date assessEndTime;
    // 收益比例，例如60%，写入60
    private Integer incomeRatio;
    // 状态1正常0无效
    private Integer status;
    // 过程【process=0创建中，1完成】
    private Integer process;
    // 最高层级当晋升后的level>=最高层级【top_level]时，top_level=level
    private Integer historyTopLevel;
    // 升级到最高层级的时间
    private Date historyTopLevelTime;
    // level变更时间，level上下有变化时更新这个值
    private Date levelChangeTime;
    // 表中的数据最后一次更新时间
    private Date updateTime;
    // 是否活跃，0不活跃1活跃，针对上个月的数据而言
    private Integer isActivity;
    // 每天数据归档时间
    private Date archivingTime;

    /** 获取  */
    public Long getMuid() {
        return muid;
    }

    /** 设置  */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /** 获取 业务系统中的uid */
    public Long getUid() {
        return uid;
    }

    /** 设置 业务系统中的uid */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 系列类型sys_type[1=P,2=M1] */
    public Integer getSysType() {
        return sysType;
    }

    /** 设置 系列类型sys_type[1=P,2=M1] */
    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    /** 获取 层级level【1,2,3,4 */
    public Integer getUserLevel() {
        return userLevel;
    }

    /** 设置 层级level【1,2,3,4 */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /** 获取 账户创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 账户创建时间 */
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

    /** 获取 人员类型person_type【0正常人1历史摄影师】 */
    public Integer getPersonType() {
        return personType;
    }

    /** 设置 人员类型person_type【0正常人1历史摄影师】 */
    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    /** 获取 考核起始时间 */
    public Date getAssessStartTime() {
        return assessStartTime;
    }

    /** 设置 考核起始时间 */
    public void setAssessStartTime(Date assessStartTime) {
        this.assessStartTime = assessStartTime;
    }

    /** 获取 考核结束时间 */
    public Date getAssessEndTime() {
        return assessEndTime;
    }

    /** 设置 考核结束时间 */
    public void setAssessEndTime(Date assessEndTime) {
        this.assessEndTime = assessEndTime;
    }

    /** 获取 收益比例，例如60%，写入60 */
    public Integer getIncomeRatio() {
        return incomeRatio;
    }

    /** 设置 收益比例，例如60%，写入60 */
    public void setIncomeRatio(Integer incomeRatio) {
        this.incomeRatio = incomeRatio;
    }

    /** 获取 状态1正常0无效 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态1正常0无效 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 过程【process=0创建中，1完成】 */
    public Integer getProcess() {
        return process;
    }

    /** 设置 过程【process=0创建中，1完成】 */
    public void setProcess(Integer process) {
        this.process = process;
    }

    /** 获取 最高层级当晋升后的level>=最高层级【top_level]时，top_level=level */
    public Integer getHistoryTopLevel() {
        return historyTopLevel;
    }

    /** 设置 最高层级当晋升后的level>=最高层级【top_level]时，top_level=level */
    public void setHistoryTopLevel(Integer historyTopLevel) {
        this.historyTopLevel = historyTopLevel;
    }

    /** 获取 升级到最高层级的时间 */
    public Date getHistoryTopLevelTime() {
        return historyTopLevelTime;
    }

    /** 设置 升级到最高层级的时间 */
    public void setHistoryTopLevelTime(Date historyTopLevelTime) {
        this.historyTopLevelTime = historyTopLevelTime;
    }

    /** 获取 level变更时间，level上下有变化时更新这个值 */
    public Date getLevelChangeTime() {
        return levelChangeTime;
    }

    /** 设置 level变更时间，level上下有变化时更新这个值 */
    public void setLevelChangeTime(Date levelChangeTime) {
        this.levelChangeTime = levelChangeTime;
    }

    /** 获取 表中的数据最后一次更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 设置 表中的数据最后一次更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 获取 是否活跃，0不活跃1活跃，针对上个月的数据而言 */
    public Integer getIsActivity() {
        return isActivity;
    }

    /** 设置 是否活跃，0不活跃1活跃，针对上个月的数据而言 */
    public void setIsActivity(Integer isActivity) {
        this.isActivity = isActivity;
    }

    /** 获取 每天数据归档时间 */
    public Date getArchivingTime() {
        return archivingTime;
    }

    /** 设置 每天数据归档时间 */
    public void setArchivingTime(Date archivingTime) {
        this.archivingTime = archivingTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MUserInfo");
        sb.append("{muid=").append(muid);
        sb.append(", uid=").append(uid);
        sb.append(", sysType=").append(sysType);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", createTime=").append(createTime);
        sb.append(", uploadCount=").append(uploadCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", thanksNumber=").append(thanksNumber);
        sb.append(", thanksAmount=").append(thanksAmount);
        sb.append(", personType=").append(personType);
        sb.append(", assessStartTime=").append(assessStartTime);
        sb.append(", assessEndTime=").append(assessEndTime);
        sb.append(", incomeRatio=").append(incomeRatio);
        sb.append(", status=").append(status);
        sb.append(", process=").append(process);
        sb.append(", historyTopLevel=").append(historyTopLevel);
        sb.append(", historyTopLevelTime=").append(historyTopLevelTime);
        sb.append(", levelChangeTime=").append(levelChangeTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isActivity=").append(isActivity);
        sb.append(", archivingTime=").append(archivingTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MUserInfo) {
            MUserInfo mUserInfo = (MUserInfo) obj;
            if (this.getMuid().equals(mUserInfo.getMuid())) {
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