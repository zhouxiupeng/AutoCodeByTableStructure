package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：yd_download_pic
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class YdDownloadPic implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 图片topic_info_id
    private Integer topicInfoId;
    // 下载用户的uid
    private Integer uid;
    // 图片质量。1：低清；2：标清；3：高清；4：原图
    private Integer quality;
    // 
    private Date createTime;
    // 
    private Date updateTime;
    // 摄影师id
    private Integer photographerUid;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 获取 图片topic_info_id */
    public Integer getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 图片topic_info_id */
    public void setTopicInfoId(Integer topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取 下载用户的uid */
    public Integer getUid() {
        return uid;
    }

    /** 设置 下载用户的uid */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /** 获取 图片质量。1：低清；2：标清；3：高清；4：原图 */
    public Integer getQuality() {
        return quality;
    }

    /** 设置 图片质量。1：低清；2：标清；3：高清；4：原图 */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取  */
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 设置  */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 获取 摄影师id */
    public Integer getPhotographerUid() {
        return photographerUid;
    }

    /** 设置 摄影师id */
    public void setPhotographerUid(Integer photographerUid) {
        this.photographerUid = photographerUid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdDownloadPic");
        sb.append("{id=").append(id);
        sb.append(", topicInfoId=").append(topicInfoId);
        sb.append(", uid=").append(uid);
        sb.append(", quality=").append(quality);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", photographerUid=").append(photographerUid);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdDownloadPic) {
            YdDownloadPic ydDownloadPic = (YdDownloadPic) obj;
            if (this.getId().equals(ydDownloadPic.getId())) {
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