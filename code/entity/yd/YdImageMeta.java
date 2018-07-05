package com.yundong.image.storage.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【图片信息表】持久化对象 数据库表：yd_image_meta
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class YdImageMeta implements Serializable {

    public static final long serialVersionUID = 1L;

    // 图片id
    private Long id;
    // 原始活动id
    private Long activityId;
    // 用户id
    private Long uid;
    // 无水印图片
    private String urlNoWatermark;
    // 原图大小
    private Integer noWatermarkSize;
    // md5值
    private String md5;
    // 
    private Integer crc32;
    // 纬度
    private Double gpsLatitude;
    // 纬度方向
    private String gpsLatitudeRef;
    // 经度
    private Double gpsLongitude;
    // 经度方向
    private String gpsLongitudeRef;
    // 图片高度
    private Integer imageHeight;
    // 图片宽度
    private Integer imageWidth;
    // 图片方向
    private Integer orientation;
    // 是否原图。0：不是，1：是
    private Integer isOrigin;
    // 无水印高清图片
    private String urlHlNoWatermark;
    // 无水印高清大小
    private Integer hqSize;
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

    /** 获取 图片id */
    public Long getId() {
        return id;
    }

    /** 设置 图片id */
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

    /** 获取 无水印图片 */
    public String getUrlNoWatermark() {
        return urlNoWatermark;
    }

    /** 设置 无水印图片 */
    public void setUrlNoWatermark(String urlNoWatermark) {
        this.urlNoWatermark = urlNoWatermark;
    }

    /** 获取 原图大小 */
    public Integer getNoWatermarkSize() {
        return noWatermarkSize;
    }

    /** 设置 原图大小 */
    public void setNoWatermarkSize(Integer noWatermarkSize) {
        this.noWatermarkSize = noWatermarkSize;
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

    /** 获取 纬度 */
    public Double getGpsLatitude() {
        return gpsLatitude;
    }

    /** 设置 纬度 */
    public void setGpsLatitude(Double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    /** 获取 纬度方向 */
    public String getGpsLatitudeRef() {
        return gpsLatitudeRef;
    }

    /** 设置 纬度方向 */
    public void setGpsLatitudeRef(String gpsLatitudeRef) {
        this.gpsLatitudeRef = gpsLatitudeRef;
    }

    /** 获取 经度 */
    public Double getGpsLongitude() {
        return gpsLongitude;
    }

    /** 设置 经度 */
    public void setGpsLongitude(Double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    /** 获取 经度方向 */
    public String getGpsLongitudeRef() {
        return gpsLongitudeRef;
    }

    /** 设置 经度方向 */
    public void setGpsLongitudeRef(String gpsLongitudeRef) {
        this.gpsLongitudeRef = gpsLongitudeRef;
    }

    /** 获取 图片高度 */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /** 设置 图片高度 */
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    /** 获取 图片宽度 */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /** 设置 图片宽度 */
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    /** 获取 图片方向 */
    public Integer getOrientation() {
        return orientation;
    }

    /** 设置 图片方向 */
    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    /** 获取 是否原图。0：不是，1：是 */
    public Integer getIsOrigin() {
        return isOrigin;
    }

    /** 设置 是否原图。0：不是，1：是 */
    public void setIsOrigin(Integer isOrigin) {
        this.isOrigin = isOrigin;
    }

    /** 获取 无水印高清图片 */
    public String getUrlHlNoWatermark() {
        return urlHlNoWatermark;
    }

    /** 设置 无水印高清图片 */
    public void setUrlHlNoWatermark(String urlHlNoWatermark) {
        this.urlHlNoWatermark = urlHlNoWatermark;
    }

    /** 获取 无水印高清大小 */
    public Integer getHqSize() {
        return hqSize;
    }

    /** 设置 无水印高清大小 */
    public void setHqSize(Integer hqSize) {
        this.hqSize = hqSize;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdImageMeta");
        sb.append("{id=").append(id);
        sb.append(", activityId=").append(activityId);
        sb.append(", uid=").append(uid);
        sb.append(", urlNoWatermark=").append(urlNoWatermark);
        sb.append(", noWatermarkSize=").append(noWatermarkSize);
        sb.append(", md5=").append(md5);
        sb.append(", crc32=").append(crc32);
        sb.append(", gpsLatitude=").append(gpsLatitude);
        sb.append(", gpsLatitudeRef=").append(gpsLatitudeRef);
        sb.append(", gpsLongitude=").append(gpsLongitude);
        sb.append(", gpsLongitudeRef=").append(gpsLongitudeRef);
        sb.append(", imageHeight=").append(imageHeight);
        sb.append(", imageWidth=").append(imageWidth);
        sb.append(", orientation=").append(orientation);
        sb.append(", isOrigin=").append(isOrigin);
        sb.append(", urlHlNoWatermark=").append(urlHlNoWatermark);
        sb.append(", hqSize=").append(hqSize);
        sb.append(", serviceDomainId=").append(serviceDomainId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", originFilename=").append(originFilename);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdImageMeta) {
            YdImageMeta ydImageMeta = (YdImageMeta) obj;
            if (this.getId().equals(ydImageMeta.getId())) {
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