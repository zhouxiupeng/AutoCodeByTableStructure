package com.yundong.image.storage.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【图片分发记录表】持久化对象 数据库表：yd_media_distribute
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class YdMediaDistributeVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 图片id
    private Long id;
    // 图片展示活动id
    private Long activityId;
    // 
    private Date createTime;

    /** 获取 图片id */
    public Long getId() {
        return id;
    }

    /** 设置 图片id */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 图片展示活动id */
    public Long getActivityId() {
        return activityId;
    }

    /** 设置 图片展示活动id */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdMediaDistributeVO");
        sb.append("{id=").append(id);
        sb.append(", activityId=").append(activityId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdMediaDistributeVO) {
            YdMediaDistributeVO ydMediaDistribute = (YdMediaDistributeVO) obj;
            if (this.getId().equals(ydMediaDistribute.getId()) && this.getActivityId().equals(ydMediaDistribute.getActivityId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getId() + this.getActivityId();
        return pkStr.hashCode();
    }

}