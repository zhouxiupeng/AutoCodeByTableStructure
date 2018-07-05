package com.yundong.api.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【话题媒体信息】持久化对象 数据库表：yd_topic_info_media
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdTopicInfoMedia implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 话题内容id
    private Long topicInfoId;
    // 媒体文件id
    private Long mediaId;
    // 
    private Date createTime;
    // 
    private Date updateTime;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 话题内容id */
    public Long getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 话题内容id */
    public void setTopicInfoId(Long topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取 媒体文件id */
    public Long getMediaId() {
        return mediaId;
    }

    /** 设置 媒体文件id */
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdTopicInfoMedia");
        sb.append("{id=").append(id);
        sb.append(", topicInfoId=").append(topicInfoId);
        sb.append(", mediaId=").append(mediaId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdTopicInfoMedia) {
            YdTopicInfoMedia ydTopicInfoMedia = (YdTopicInfoMedia) obj;
            if (this.getId().equals(ydTopicInfoMedia.getId())) {
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