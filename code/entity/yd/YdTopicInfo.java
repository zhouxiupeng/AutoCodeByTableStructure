package com.yundong.api.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：yd_topic_info
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdTopicInfo implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 
    private Long topicId;
    // 
    private Long activityId;
    // 
    private Long uid;
    // 
    private Long mediaId;
    // 
    private Integer mediaType;
    // 
    private String picUrl;
    // 
    private String content;
    // 
    private Integer likeCount;
    // 0：不是；1：是
    private String isHot;
    // 是否推荐：0:不置顶；1：置顶
    private Integer isRecommend;
    // 是否是首页视频，0:false;1:true
    private Integer isPortal;
    // 0:不是；1：是
    private String isOfficial;
    // 0:无效；1：有效；2：已删除;4:前端不显示
    private Integer status;
    // 上传时间
    private Date createTime;
    // 
    private Date updateTime;
    // 0:UGC可见，活动相册可见；1：UGC不可见，活动相册可见；2：UGC可见，活动相册不可见
    private Integer ugcVisible;
    // 图片热度，等级1-5，5为最热，默认为0
    private Integer hotLevel;
    // 图片中人物的性别。0：默认；1：男；2：女
    private Integer sex;
    // 是否为UGC。0：否；1：是
    private Integer isUgc;
    // 点赞的数量
    private Integer favCount;
    // 热度与点赞的和
    private Integer hotFav;
    // 水印低清图片链接
    private String urlLq;
    // 水印标清图片链接
    private String url;
    // 水印高清图片链接
    private String urlHq;
    // 水印原始图片链接
    private String urlOrigin;
    // 拍摄日期
    private Date dateTimeOriginal;
    // 纬度值
    private Double gpsLatitude;
    // 经度值
    private Double gpsLongitude;
    // 图片高度
    private Integer imageHeight;
    // 图片宽度
    private Integer imageWidth;
    // 图片方向
    private Integer orientation;
    // 上传时间，判断是否为同一批上传
    private Date stamp;
    // 上传来源。1：app,2：后台,3:WiFi sd app,4:H5原图上传,5:python工具,6:H5组图上传,7:Android摄端,8:游乐场APP上传
    private Integer source;
    // 标清图片大小
    private Integer mqSize;
    // 高清图片大小
    private Integer hqSize;
    // 原始图片大小
    private Integer originSize;
    // 图片权重
    private Integer weight;
    // 
    private Long waterId;
    // 
    private String urlNoWatermark;
    // 
    private Integer noWatermarkSize;
    // 
    private String originFilename;
    // 
    private String gpsLatitudeRef;
    // 
    private String gpsLongitudeRef;
    // 
    private String md5;
    // 
    private String md5Simple;
    // 
    private Integer isOrigin;
    // 
    private String make;
    // 
    private String metaInfo;
    // 
    private Integer quality;
    // 
    private String model;
    // 
    private Date startTime;
    // 排序条件 sort=wight+fav_count
    private Integer sort;
    // 
    private Integer kmId;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取  */
    public Long getTopicId() {
        return topicId;
    }

    /** 设置  */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /** 获取  */
    public Long getActivityId() {
        return activityId;
    }

    /** 设置  */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /** 获取  */
    public Long getUid() {
        return uid;
    }

    /** 设置  */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取  */
    public Long getMediaId() {
        return mediaId;
    }

    /** 设置  */
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    /** 获取  */
    public Integer getMediaType() {
        return mediaType;
    }

    /** 设置  */
    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    /** 获取  */
    public String getPicUrl() {
        return picUrl;
    }

    /** 设置  */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /** 获取  */
    public String getContent() {
        return content;
    }

    /** 设置  */
    public void setContent(String content) {
        this.content = content;
    }

    /** 获取  */
    public Integer getLikeCount() {
        return likeCount;
    }

    /** 设置  */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /** 获取 0：不是；1：是 */
    public String getIsHot() {
        return isHot;
    }

    /** 设置 0：不是；1：是 */
    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    /** 获取 是否推荐：0:不置顶；1：置顶 */
    public Integer getIsRecommend() {
        return isRecommend;
    }

    /** 设置 是否推荐：0:不置顶；1：置顶 */
    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    /** 获取 是否是首页视频，0:false;1:true */
    public Integer getIsPortal() {
        return isPortal;
    }

    /** 设置 是否是首页视频，0:false;1:true */
    public void setIsPortal(Integer isPortal) {
        this.isPortal = isPortal;
    }

    /** 获取 0:不是；1：是 */
    public String getIsOfficial() {
        return isOfficial;
    }

    /** 设置 0:不是；1：是 */
    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    /** 获取 0:无效；1：有效；2：已删除;4:前端不显示 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 0:无效；1：有效；2：已删除;4:前端不显示 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 上传时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 上传时间 */
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

    /** 获取 0:UGC可见，活动相册可见；1：UGC不可见，活动相册可见；2：UGC可见，活动相册不可见 */
    public Integer getUgcVisible() {
        return ugcVisible;
    }

    /** 设置 0:UGC可见，活动相册可见；1：UGC不可见，活动相册可见；2：UGC可见，活动相册不可见 */
    public void setUgcVisible(Integer ugcVisible) {
        this.ugcVisible = ugcVisible;
    }

    /** 获取 图片热度，等级1-5，5为最热，默认为0 */
    public Integer getHotLevel() {
        return hotLevel;
    }

    /** 设置 图片热度，等级1-5，5为最热，默认为0 */
    public void setHotLevel(Integer hotLevel) {
        this.hotLevel = hotLevel;
    }

    /** 获取 图片中人物的性别。0：默认；1：男；2：女 */
    public Integer getSex() {
        return sex;
    }

    /** 设置 图片中人物的性别。0：默认；1：男；2：女 */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /** 获取 是否为UGC。0：否；1：是 */
    public Integer getIsUgc() {
        return isUgc;
    }

    /** 设置 是否为UGC。0：否；1：是 */
    public void setIsUgc(Integer isUgc) {
        this.isUgc = isUgc;
    }

    /** 获取 点赞的数量 */
    public Integer getFavCount() {
        return favCount;
    }

    /** 设置 点赞的数量 */
    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    /** 获取 热度与点赞的和 */
    public Integer getHotFav() {
        return hotFav;
    }

    /** 设置 热度与点赞的和 */
    public void setHotFav(Integer hotFav) {
        this.hotFav = hotFav;
    }

    /** 获取 水印低清图片链接 */
    public String getUrlLq() {
        return urlLq;
    }

    /** 设置 水印低清图片链接 */
    public void setUrlLq(String urlLq) {
        this.urlLq = urlLq;
    }

    /** 获取 水印标清图片链接 */
    public String getUrl() {
        return url;
    }

    /** 设置 水印标清图片链接 */
    public void setUrl(String url) {
        this.url = url;
    }

    /** 获取 水印高清图片链接 */
    public String getUrlHq() {
        return urlHq;
    }

    /** 设置 水印高清图片链接 */
    public void setUrlHq(String urlHq) {
        this.urlHq = urlHq;
    }

    /** 获取 水印原始图片链接 */
    public String getUrlOrigin() {
        return urlOrigin;
    }

    /** 设置 水印原始图片链接 */
    public void setUrlOrigin(String urlOrigin) {
        this.urlOrigin = urlOrigin;
    }

    /** 获取 拍摄日期 */
    public Date getDateTimeOriginal() {
        return dateTimeOriginal;
    }

    /** 设置 拍摄日期 */
    public void setDateTimeOriginal(Date dateTimeOriginal) {
        this.dateTimeOriginal = dateTimeOriginal;
    }

    /** 获取 纬度值 */
    public Double getGpsLatitude() {
        return gpsLatitude;
    }

    /** 设置 纬度值 */
    public void setGpsLatitude(Double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    /** 获取 经度值 */
    public Double getGpsLongitude() {
        return gpsLongitude;
    }

    /** 设置 经度值 */
    public void setGpsLongitude(Double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
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

    /** 获取 上传时间，判断是否为同一批上传 */
    public Date getStamp() {
        return stamp;
    }

    /** 设置 上传时间，判断是否为同一批上传 */
    public void setStamp(Date stamp) {
        this.stamp = stamp;
    }

    /** 获取 上传来源。1：app,2：后台,3:WiFi sd app,4:H5原图上传,5:python工具,6:H5组图上传,7:Android摄端,8:游乐场APP上传 */
    public Integer getSource() {
        return source;
    }

    /** 设置 上传来源。1：app,2：后台,3:WiFi sd app,4:H5原图上传,5:python工具,6:H5组图上传,7:Android摄端,8:游乐场APP上传 */
    public void setSource(Integer source) {
        this.source = source;
    }

    /** 获取 标清图片大小 */
    public Integer getMqSize() {
        return mqSize;
    }

    /** 设置 标清图片大小 */
    public void setMqSize(Integer mqSize) {
        this.mqSize = mqSize;
    }

    /** 获取 高清图片大小 */
    public Integer getHqSize() {
        return hqSize;
    }

    /** 设置 高清图片大小 */
    public void setHqSize(Integer hqSize) {
        this.hqSize = hqSize;
    }

    /** 获取 原始图片大小 */
    public Integer getOriginSize() {
        return originSize;
    }

    /** 设置 原始图片大小 */
    public void setOriginSize(Integer originSize) {
        this.originSize = originSize;
    }

    /** 获取 图片权重 */
    public Integer getWeight() {
        return weight;
    }

    /** 设置 图片权重 */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /** 获取  */
    public Long getWaterId() {
        return waterId;
    }

    /** 设置  */
    public void setWaterId(Long waterId) {
        this.waterId = waterId;
    }

    /** 获取  */
    public String getUrlNoWatermark() {
        return urlNoWatermark;
    }

    /** 设置  */
    public void setUrlNoWatermark(String urlNoWatermark) {
        this.urlNoWatermark = urlNoWatermark;
    }

    /** 获取  */
    public Integer getNoWatermarkSize() {
        return noWatermarkSize;
    }

    /** 设置  */
    public void setNoWatermarkSize(Integer noWatermarkSize) {
        this.noWatermarkSize = noWatermarkSize;
    }

    /** 获取  */
    public String getOriginFilename() {
        return originFilename;
    }

    /** 设置  */
    public void setOriginFilename(String originFilename) {
        this.originFilename = originFilename;
    }

    /** 获取  */
    public String getGpsLatitudeRef() {
        return gpsLatitudeRef;
    }

    /** 设置  */
    public void setGpsLatitudeRef(String gpsLatitudeRef) {
        this.gpsLatitudeRef = gpsLatitudeRef;
    }

    /** 获取  */
    public String getGpsLongitudeRef() {
        return gpsLongitudeRef;
    }

    /** 设置  */
    public void setGpsLongitudeRef(String gpsLongitudeRef) {
        this.gpsLongitudeRef = gpsLongitudeRef;
    }

    /** 获取  */
    public String getMd5() {
        return md5;
    }

    /** 设置  */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /** 获取  */
    public String getMd5Simple() {
        return md5Simple;
    }

    /** 设置  */
    public void setMd5Simple(String md5Simple) {
        this.md5Simple = md5Simple;
    }

    /** 获取  */
    public Integer getIsOrigin() {
        return isOrigin;
    }

    /** 设置  */
    public void setIsOrigin(Integer isOrigin) {
        this.isOrigin = isOrigin;
    }

    /** 获取  */
    public String getMake() {
        return make;
    }

    /** 设置  */
    public void setMake(String make) {
        this.make = make;
    }

    /** 获取  */
    public String getMetaInfo() {
        return metaInfo;
    }

    /** 设置  */
    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
    }

    /** 获取  */
    public Integer getQuality() {
        return quality;
    }

    /** 设置  */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /** 获取  */
    public String getModel() {
        return model;
    }

    /** 设置  */
    public void setModel(String model) {
        this.model = model;
    }

    /** 获取  */
    public Date getStartTime() {
        return startTime;
    }

    /** 设置  */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** 获取 排序条件 sort=wight+fav_count */
    public Integer getSort() {
        return sort;
    }

    /** 设置 排序条件 sort=wight+fav_count */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /** 获取  */
    public Integer getKmId() {
        return kmId;
    }

    /** 设置  */
    public void setKmId(Integer kmId) {
        this.kmId = kmId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdTopicInfo");
        sb.append("{id=").append(id);
        sb.append(", topicId=").append(topicId);
        sb.append(", activityId=").append(activityId);
        sb.append(", uid=").append(uid);
        sb.append(", mediaId=").append(mediaId);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", content=").append(content);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", isHot=").append(isHot);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", isPortal=").append(isPortal);
        sb.append(", isOfficial=").append(isOfficial);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ugcVisible=").append(ugcVisible);
        sb.append(", hotLevel=").append(hotLevel);
        sb.append(", sex=").append(sex);
        sb.append(", isUgc=").append(isUgc);
        sb.append(", favCount=").append(favCount);
        sb.append(", hotFav=").append(hotFav);
        sb.append(", urlLq=").append(urlLq);
        sb.append(", url=").append(url);
        sb.append(", urlHq=").append(urlHq);
        sb.append(", urlOrigin=").append(urlOrigin);
        sb.append(", dateTimeOriginal=").append(dateTimeOriginal);
        sb.append(", gpsLatitude=").append(gpsLatitude);
        sb.append(", gpsLongitude=").append(gpsLongitude);
        sb.append(", imageHeight=").append(imageHeight);
        sb.append(", imageWidth=").append(imageWidth);
        sb.append(", orientation=").append(orientation);
        sb.append(", stamp=").append(stamp);
        sb.append(", source=").append(source);
        sb.append(", mqSize=").append(mqSize);
        sb.append(", hqSize=").append(hqSize);
        sb.append(", originSize=").append(originSize);
        sb.append(", weight=").append(weight);
        sb.append(", waterId=").append(waterId);
        sb.append(", urlNoWatermark=").append(urlNoWatermark);
        sb.append(", noWatermarkSize=").append(noWatermarkSize);
        sb.append(", originFilename=").append(originFilename);
        sb.append(", gpsLatitudeRef=").append(gpsLatitudeRef);
        sb.append(", gpsLongitudeRef=").append(gpsLongitudeRef);
        sb.append(", md5=").append(md5);
        sb.append(", md5Simple=").append(md5Simple);
        sb.append(", isOrigin=").append(isOrigin);
        sb.append(", make=").append(make);
        sb.append(", metaInfo=").append(metaInfo);
        sb.append(", quality=").append(quality);
        sb.append(", model=").append(model);
        sb.append(", startTime=").append(startTime);
        sb.append(", sort=").append(sort);
        sb.append(", kmId=").append(kmId);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdTopicInfo) {
            YdTopicInfo ydTopicInfo = (YdTopicInfo) obj;
            if (this.getId().equals(ydTopicInfo.getId()) && this.getStartTime().equals(ydTopicInfo.getStartTime())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getId() + this.getStartTime();
        return pkStr.hashCode();
    }

}