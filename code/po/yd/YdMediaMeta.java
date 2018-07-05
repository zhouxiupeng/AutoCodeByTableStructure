package com.yundong.image.storage.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【其它媒体信息表】持久化对象 数据库表：yd_media_meta
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdMediaMetaVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 原始活动id
    private Long activityId;
    // 用户id
    private Long uid;
    // 封面图片
    private String titlePic;
    // 资源地址
    private String url;
    // 标题
    private String mediaTitle;
    // 0:未知 ; 2：视频；3:音频；4：网页；5：视频故事
    private Integer mediaType;
    // md5值
    private String md5;
    // 
    private Integer crc32;
    // 数据存储服务商1:阿里
    private Integer serviceDomainId;
    // 0:无效, 1:有效 , 2：删除
    private Integer status;
    // 
    private Date createTime;
    // 
    private Date updateTime;
    // 相机中原始文件名称
    private String originFilename;
    // 资源大小
    private Integer size;
    // 图片方向
    private Integer orientation;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 原始活动id */
    public Long getActivityId() {
        return activityId;
    }

    /** 设置 原始活动id */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /** 获取 用户id */
    public Long getUid() {
        return uid;
    }

    /** 设置 用户id */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 封面图片 */
    public String getTitlePic() {
        return titlePic;
    }

    /** 设置 封面图片 */
    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic;
    }

    /** 获取 资源地址 */
    public String getUrl() {
        return url;
    }

    /** 设置 资源地址 */
    public void setUrl(String url) {
        this.url = url;
    }

    /** 获取 标题 */
    public String getMediaTitle() {
        return mediaTitle;
    }

    /** 设置 标题 */
    public void setMediaTitle(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    /** 获取 0:未知 ; 2：视频；3:音频；4：网页；5：视频故事 */
    public Integer getMediaType() {
        return mediaType;
    }

    /** 设置 0:未知 ; 2：视频；3:音频；4：网页；5：视频故事 */
    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    /** 获取 md5值 */
    public String getMd5() {
        return md5;
    }

    /** 设置 md5值 */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /** 获取  */
    public Integer getCrc32() {
        return crc32;
    }

    /** 设置  */
    public void setCrc32(Integer crc32) {
        this.crc32 = crc32;
    }

    /** 获取 数据存储服务商1:阿里 */
    public Integer getServiceDomainId() {
        return serviceDomainId;
    }

    /** 设置 数据存储服务商1:阿里 */
    public void setServiceDomainId(Integer serviceDomainId) {
        this.serviceDomainId = serviceDomainId;
    }

    /** 获取 0:无效, 1:有效 , 2：删除 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 0:无效, 1:有效 , 2：删除 */
    public void setStatus(Integer status) {
        this.status = status;
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

    /** 获取 相机中原始文件名称 */
    public String getOriginFilename() {
        return originFilename;
    }

    /** 设置 相机中原始文件名称 */
    public void setOriginFilename(String originFilename) {
        this.originFilename = originFilename;
    }

    /** 获取 资源大小 */
    public Integer getSize() {
        return size;
    }

    /** 设置 资源大小 */
    public void setSize(Integer size) {
        this.size = size;
    }

    /** 获取 图片方向 */
    public Integer getOrientation() {
        return orientation;
    }

    /** 设置 图片方向 */
    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdMediaMetaVO");
        sb.append("{id=").append(id);
        sb.append(", activityId=").append(activityId);
        sb.append(", uid=").append(uid);
        sb.append(", titlePic=").append(titlePic);
        sb.append(", url=").append(url);
        sb.append(", mediaTitle=").append(mediaTitle);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", md5=").append(md5);
        sb.append(", crc32=").append(crc32);
        sb.append(", serviceDomainId=").append(serviceDomainId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", originFilename=").append(originFilename);
        sb.append(", size=").append(size);
        sb.append(", orientation=").append(orientation);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdMediaMetaVO) {
            YdMediaMetaVO ydMediaMeta = (YdMediaMetaVO) obj;
            if (this.getId().equals(ydMediaMeta.getId())) {
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