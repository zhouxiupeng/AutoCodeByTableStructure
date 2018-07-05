package com.yundong.api.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【活动页面】持久化对象 数据库表：yd_activity
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdActivity implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 活动标题
    private String title;
    // 副标题
    private String subtitle;
    // 首页图片url
    private String portalPic;
    // 置顶时的文字图片链接
    private String headerTitle;
    // 详情页海报url
    private String poster;
    // 描述
    private String description;
    // 创建人员
    private Long creater;
    // 活动场地
    private String field;
    // 0：黑色；1：白色
    private String fontColor;
    // 活动收费
    private Integer fee;
    // 费用单位描述
    private String feeDescription;
    // 城市
    private String city;
    // 活动人数限制
    private Integer peopleNumber;
    // 场地经度
    private Double latitude;
    // 场地纬度
    private Double longitude;
    // 活动开始时间
    private Date startTime;
    // 结束时间
    private Date endTime;
    // 活动内容url
    private String contentUrl;
    // 
    private String detailContent;
    // 活动类型：0:官方活动；1:第三方活动；2.用户创建的活动；3.时刻与伙伴 4.专题
    private Integer type;
    // 状态：0：发布状态；1：运营赛事；2：执行赛事；3：已删除；4、赛事列表
    private Integer status;
    // 
    private Date createTime;
    // 
    private Date updateTime;
    // 创建者。0：官方；1：用户
    private Integer createrType;
    // 0：默认；1：多日程活动；2：多地点活动（类马拉松型）
    private Integer sort;
    // GPS半径，单位：米
    private Integer gpsRadius;
    // 活动类型。0：默认，1：马拉松
    private Integer activityType;
    // 
    private String gpsInfo;
    // 
    private Date albumStartTime;
    // 
    private Date albumEndTime;
    // 相册类型。0：赛事相册；1：活动相册
    private Integer albumType;
    // 是否是直播赛事。0：不是；1：是
    private Integer isLive;
    // {"wxLinked":"htgj"(微信服务号),"pages":0(0：均显示;1：仅直播页;2：仅订阅页),"photoTime":"0"(照片可显示下载时间)，"labelled":"0"(打完标签),"searchTime":"5月3日中午12点"(开放搜索时间),"originDownload":"5月4日中午12点"(开放原图下载),"watermark":"xxxx"(用户自定义水印)}
    private String property;
    // 是否机打标签 1 是 0 否
    private Integer tagType;
    // 是否可订阅；0：不可；1可
    private Integer isSubscribe;
    // 号牌格式
    private String numFormat;
    // 
    private String logo;
    // 赛事名称
    private String matchName;
    // 赛事规模: 0 1000以下；1 1001－3000；2 3001－6000；3 6001－10000；4 10001－20000；5 20001－30000；6 3000以上
    private Integer matchSize;
    // 赛事类型：0 马拉松；1 路跑；2 越野；3 自行车；4 铁三；5 羽毛球；6 足球；7 网球；8 会议/聚会; 9 活动  10：运动会 11 学校 12 商拍 13 平台
    private Integer matchType;
    // 官网地址
    private String homepage;
    // 起源年
    private Date foundTime;
    // 赛事级别：1 省会赛事；0 非省会
    private Integer matchLevel;
    // CAA级别：0 无级别赛事；1 铜牌赛事；2 银牌赛事；3 金牌赛事；
    private Integer caa;
    // IAAF级别：0 无级别赛事；1 钢标赛事；2 银标赛事；3 锦标赛事；
    private Integer iaaf;
    // 田协赛事：0 否；1 是
    private Integer matchTrack;
    // 跟进负责人
    private Integer director;
    // 是否官方影像服务：0 否；1 是；
    private Integer official;
    // 授权状态：0 授权；1 自建
    private Integer empower;
    // 商务状态：0 待接洽；1 跟进中；2 已签单；3 已交付；4 已收尾；5 不跟进；
    private Integer business;
    // 
    private Integer businessChannel;
    // 引荐人姓名
    private String businessReferrer;
    // city_id
    private Integer cityId;
    // 0 自己可见 1 全部人可见
    private Integer authority;
    // 发布状态 0:未发布 1:发布
    private Integer publishStatus;
    // 
    private Integer lowPrice;
    // 
    private Integer standardPrice;
    // 商务信息备注
    private String remark;
    // 执行状态: 1:接到需求 2:现场执行 3:上传完成 4:原片交付
    private Integer executeStatus;
    // 二维码
    private String qrcode;
    // 赛事规模: 0:大赛事 1:小赛事
    private Integer matchScale;
    // 是否人脸识别；0：不可；1可
    private Integer isFacesearch;
    // 人脸识别参数
    private String faceSearch;
    // 是否分成；0：不可；1可
    private Integer isGainsharing;
    // 分成比例
    private Double proportion;
    // 是否允许购买，0不可，1可以
    private Integer isCanbuy;
    // 售卖产品给摄影师分成比例
    private Double shareofbuy;
    // banner抬头文字
    private String bannerTitle;
    // banner具体的活动说明信息
    private String bannerMsgInfo;
    // 广告图片链接
    private String adImgUrl;
    // 广告链接地址
    private String adUrl;
    // 人脸识别服务器处理状态
    private Integer faceSearchServerState;
    // 拍摄形式：0：待确认；1:组织拍摄；2：平台使用
    private Integer photoSource;
    // 赛事信息：0：暂无；1：50公里以上；2：全马；3：半马；4:6-10公里；5:5公里以下
    private Integer info;
    // 是否需要打标签：0：不需要打标签；1：需要打标签
    private Integer isNeedTag;
    // 赛事活动的权重
    private Integer activityWeight;
    // 是否去掉爱云动水印 0：不去掉 1：去掉
    private Integer isNeedIydwatermark;
    // 活动详情
    private String activityDetail;
    // 是否开启答谢
    private Integer isOpenPay;
    // 商拍启动页图片url
    private String startPicUrl;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 活动标题 */
    public String getTitle() {
        return title;
    }

    /** 设置 活动标题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 获取 副标题 */
    public String getSubtitle() {
        return subtitle;
    }

    /** 设置 副标题 */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /** 获取 首页图片url */
    public String getPortalPic() {
        return portalPic;
    }

    /** 设置 首页图片url */
    public void setPortalPic(String portalPic) {
        this.portalPic = portalPic;
    }

    /** 获取 置顶时的文字图片链接 */
    public String getHeaderTitle() {
        return headerTitle;
    }

    /** 设置 置顶时的文字图片链接 */
    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    /** 获取 详情页海报url */
    public String getPoster() {
        return poster;
    }

    /** 设置 详情页海报url */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /** 获取 描述 */
    public String getDescription() {
        return description;
    }

    /** 设置 描述 */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 获取 创建人员 */
    public Long getCreater() {
        return creater;
    }

    /** 设置 创建人员 */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /** 获取 活动场地 */
    public String getField() {
        return field;
    }

    /** 设置 活动场地 */
    public void setField(String field) {
        this.field = field;
    }

    /** 获取 0：黑色；1：白色 */
    public String getFontColor() {
        return fontColor;
    }

    /** 设置 0：黑色；1：白色 */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /** 获取 活动收费 */
    public Integer getFee() {
        return fee;
    }

    /** 设置 活动收费 */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /** 获取 费用单位描述 */
    public String getFeeDescription() {
        return feeDescription;
    }

    /** 设置 费用单位描述 */
    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    /** 获取 城市 */
    public String getCity() {
        return city;
    }

    /** 设置 城市 */
    public void setCity(String city) {
        this.city = city;
    }

    /** 获取 活动人数限制 */
    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    /** 设置 活动人数限制 */
    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    /** 获取 场地经度 */
    public Double getLatitude() {
        return latitude;
    }

    /** 设置 场地经度 */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /** 获取 场地纬度 */
    public Double getLongitude() {
        return longitude;
    }

    /** 设置 场地纬度 */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /** 获取 活动开始时间 */
    public Date getStartTime() {
        return startTime;
    }

    /** 设置 活动开始时间 */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** 获取 结束时间 */
    public Date getEndTime() {
        return endTime;
    }

    /** 设置 结束时间 */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** 获取 活动内容url */
    public String getContentUrl() {
        return contentUrl;
    }

    /** 设置 活动内容url */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /** 获取  */
    public String getDetailContent() {
        return detailContent;
    }

    /** 设置  */
    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }

    /** 获取 活动类型：0:官方活动；1:第三方活动；2.用户创建的活动；3.时刻与伙伴 4.专题 */
    public Integer getType() {
        return type;
    }

    /** 设置 活动类型：0:官方活动；1:第三方活动；2.用户创建的活动；3.时刻与伙伴 4.专题 */
    public void setType(Integer type) {
        this.type = type;
    }

    /** 获取 状态：0：发布状态；1：运营赛事；2：执行赛事；3：已删除；4、赛事列表 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态：0：发布状态；1：运营赛事；2：执行赛事；3：已删除；4、赛事列表 */
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

    /** 获取 创建者。0：官方；1：用户 */
    public Integer getCreaterType() {
        return createrType;
    }

    /** 设置 创建者。0：官方；1：用户 */
    public void setCreaterType(Integer createrType) {
        this.createrType = createrType;
    }

    /** 获取 0：默认；1：多日程活动；2：多地点活动（类马拉松型） */
    public Integer getSort() {
        return sort;
    }

    /** 设置 0：默认；1：多日程活动；2：多地点活动（类马拉松型） */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /** 获取 GPS半径，单位：米 */
    public Integer getGpsRadius() {
        return gpsRadius;
    }

    /** 设置 GPS半径，单位：米 */
    public void setGpsRadius(Integer gpsRadius) {
        this.gpsRadius = gpsRadius;
    }

    /** 获取 活动类型。0：默认，1：马拉松 */
    public Integer getActivityType() {
        return activityType;
    }

    /** 设置 活动类型。0：默认，1：马拉松 */
    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    /** 获取  */
    public String getGpsInfo() {
        return gpsInfo;
    }

    /** 设置  */
    public void setGpsInfo(String gpsInfo) {
        this.gpsInfo = gpsInfo;
    }

    /** 获取  */
    public Date getAlbumStartTime() {
        return albumStartTime;
    }

    /** 设置  */
    public void setAlbumStartTime(Date albumStartTime) {
        this.albumStartTime = albumStartTime;
    }

    /** 获取  */
    public Date getAlbumEndTime() {
        return albumEndTime;
    }

    /** 设置  */
    public void setAlbumEndTime(Date albumEndTime) {
        this.albumEndTime = albumEndTime;
    }

    /** 获取 相册类型。0：赛事相册；1：活动相册 */
    public Integer getAlbumType() {
        return albumType;
    }

    /** 设置 相册类型。0：赛事相册；1：活动相册 */
    public void setAlbumType(Integer albumType) {
        this.albumType = albumType;
    }

    /** 获取 是否是直播赛事。0：不是；1：是 */
    public Integer getIsLive() {
        return isLive;
    }

    /** 设置 是否是直播赛事。0：不是；1：是 */
    public void setIsLive(Integer isLive) {
        this.isLive = isLive;
    }

    /** 获取 {"wxLinked":"htgj"(微信服务号),"pages":0(0：均显示;1：仅直播页;2：仅订阅页),"photoTime":"0"(照片可显示下载时间)，"labelled":"0"(打完标签),"searchTime":"5月3日中午12点"(开放搜索时间),"originDownload":"5月4日中午12点"(开放原图下载),"watermark":"xxxx"(用户自定义水印)} */
    public String getProperty() {
        return property;
    }

    /** 设置 {"wxLinked":"htgj"(微信服务号),"pages":0(0：均显示;1：仅直播页;2：仅订阅页),"photoTime":"0"(照片可显示下载时间)，"labelled":"0"(打完标签),"searchTime":"5月3日中午12点"(开放搜索时间),"originDownload":"5月4日中午12点"(开放原图下载),"watermark":"xxxx"(用户自定义水印)} */
    public void setProperty(String property) {
        this.property = property;
    }

    /** 获取 是否机打标签 1 是 0 否 */
    public Integer getTagType() {
        return tagType;
    }

    /** 设置 是否机打标签 1 是 0 否 */
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    /** 获取 是否可订阅；0：不可；1可 */
    public Integer getIsSubscribe() {
        return isSubscribe;
    }

    /** 设置 是否可订阅；0：不可；1可 */
    public void setIsSubscribe(Integer isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    /** 获取 号牌格式 */
    public String getNumFormat() {
        return numFormat;
    }

    /** 设置 号牌格式 */
    public void setNumFormat(String numFormat) {
        this.numFormat = numFormat;
    }

    /** 获取  */
    public String getLogo() {
        return logo;
    }

    /** 设置  */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /** 获取 赛事名称 */
    public String getMatchName() {
        return matchName;
    }

    /** 设置 赛事名称 */
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    /** 获取 赛事规模: 0 1000以下；1 1001－3000；2 3001－6000；3 6001－10000；4 10001－20000；5 20001－30000；6 3000以上 */
    public Integer getMatchSize() {
        return matchSize;
    }

    /** 设置 赛事规模: 0 1000以下；1 1001－3000；2 3001－6000；3 6001－10000；4 10001－20000；5 20001－30000；6 3000以上 */
    public void setMatchSize(Integer matchSize) {
        this.matchSize = matchSize;
    }

    /** 获取 赛事类型：0 马拉松；1 路跑；2 越野；3 自行车；4 铁三；5 羽毛球；6 足球；7 网球；8 会议/聚会; 9 活动  10：运动会 11 学校 12 商拍 13 平台 */
    public Integer getMatchType() {
        return matchType;
    }

    /** 设置 赛事类型：0 马拉松；1 路跑；2 越野；3 自行车；4 铁三；5 羽毛球；6 足球；7 网球；8 会议/聚会; 9 活动  10：运动会 11 学校 12 商拍 13 平台 */
    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    /** 获取 官网地址 */
    public String getHomepage() {
        return homepage;
    }

    /** 设置 官网地址 */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /** 获取 起源年 */
    public Date getFoundTime() {
        return foundTime;
    }

    /** 设置 起源年 */
    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }

    /** 获取 赛事级别：1 省会赛事；0 非省会 */
    public Integer getMatchLevel() {
        return matchLevel;
    }

    /** 设置 赛事级别：1 省会赛事；0 非省会 */
    public void setMatchLevel(Integer matchLevel) {
        this.matchLevel = matchLevel;
    }

    /** 获取 CAA级别：0 无级别赛事；1 铜牌赛事；2 银牌赛事；3 金牌赛事； */
    public Integer getCaa() {
        return caa;
    }

    /** 设置 CAA级别：0 无级别赛事；1 铜牌赛事；2 银牌赛事；3 金牌赛事； */
    public void setCaa(Integer caa) {
        this.caa = caa;
    }

    /** 获取 IAAF级别：0 无级别赛事；1 钢标赛事；2 银标赛事；3 锦标赛事； */
    public Integer getIaaf() {
        return iaaf;
    }

    /** 设置 IAAF级别：0 无级别赛事；1 钢标赛事；2 银标赛事；3 锦标赛事； */
    public void setIaaf(Integer iaaf) {
        this.iaaf = iaaf;
    }

    /** 获取 田协赛事：0 否；1 是 */
    public Integer getMatchTrack() {
        return matchTrack;
    }

    /** 设置 田协赛事：0 否；1 是 */
    public void setMatchTrack(Integer matchTrack) {
        this.matchTrack = matchTrack;
    }

    /** 获取 跟进负责人 */
    public Integer getDirector() {
        return director;
    }

    /** 设置 跟进负责人 */
    public void setDirector(Integer director) {
        this.director = director;
    }

    /** 获取 是否官方影像服务：0 否；1 是； */
    public Integer getOfficial() {
        return official;
    }

    /** 设置 是否官方影像服务：0 否；1 是； */
    public void setOfficial(Integer official) {
        this.official = official;
    }

    /** 获取 授权状态：0 授权；1 自建 */
    public Integer getEmpower() {
        return empower;
    }

    /** 设置 授权状态：0 授权；1 自建 */
    public void setEmpower(Integer empower) {
        this.empower = empower;
    }

    /** 获取 商务状态：0 待接洽；1 跟进中；2 已签单；3 已交付；4 已收尾；5 不跟进； */
    public Integer getBusiness() {
        return business;
    }

    /** 设置 商务状态：0 待接洽；1 跟进中；2 已签单；3 已交付；4 已收尾；5 不跟进； */
    public void setBusiness(Integer business) {
        this.business = business;
    }

    /** 获取  */
    public Integer getBusinessChannel() {
        return businessChannel;
    }

    /** 设置  */
    public void setBusinessChannel(Integer businessChannel) {
        this.businessChannel = businessChannel;
    }

    /** 获取 引荐人姓名 */
    public String getBusinessReferrer() {
        return businessReferrer;
    }

    /** 设置 引荐人姓名 */
    public void setBusinessReferrer(String businessReferrer) {
        this.businessReferrer = businessReferrer;
    }

    /** 获取 city_id */
    public Integer getCityId() {
        return cityId;
    }

    /** 设置 city_id */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /** 获取 0 自己可见 1 全部人可见 */
    public Integer getAuthority() {
        return authority;
    }

    /** 设置 0 自己可见 1 全部人可见 */
    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    /** 获取 发布状态 0:未发布 1:发布 */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /** 设置 发布状态 0:未发布 1:发布 */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /** 获取  */
    public Integer getLowPrice() {
        return lowPrice;
    }

    /** 设置  */
    public void setLowPrice(Integer lowPrice) {
        this.lowPrice = lowPrice;
    }

    /** 获取  */
    public Integer getStandardPrice() {
        return standardPrice;
    }

    /** 设置  */
    public void setStandardPrice(Integer standardPrice) {
        this.standardPrice = standardPrice;
    }

    /** 获取 商务信息备注 */
    public String getRemark() {
        return remark;
    }

    /** 设置 商务信息备注 */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /** 获取 执行状态: 1:接到需求 2:现场执行 3:上传完成 4:原片交付 */
    public Integer getExecuteStatus() {
        return executeStatus;
    }

    /** 设置 执行状态: 1:接到需求 2:现场执行 3:上传完成 4:原片交付 */
    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    /** 获取 二维码 */
    public String getQrcode() {
        return qrcode;
    }

    /** 设置 二维码 */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    /** 获取 赛事规模: 0:大赛事 1:小赛事 */
    public Integer getMatchScale() {
        return matchScale;
    }

    /** 设置 赛事规模: 0:大赛事 1:小赛事 */
    public void setMatchScale(Integer matchScale) {
        this.matchScale = matchScale;
    }

    /** 获取 是否人脸识别；0：不可；1可 */
    public Integer getIsFacesearch() {
        return isFacesearch;
    }

    /** 设置 是否人脸识别；0：不可；1可 */
    public void setIsFacesearch(Integer isFacesearch) {
        this.isFacesearch = isFacesearch;
    }

    /** 获取 人脸识别参数 */
    public String getFaceSearch() {
        return faceSearch;
    }

    /** 设置 人脸识别参数 */
    public void setFaceSearch(String faceSearch) {
        this.faceSearch = faceSearch;
    }

    /** 获取 是否分成；0：不可；1可 */
    public Integer getIsGainsharing() {
        return isGainsharing;
    }

    /** 设置 是否分成；0：不可；1可 */
    public void setIsGainsharing(Integer isGainsharing) {
        this.isGainsharing = isGainsharing;
    }

    /** 获取 分成比例 */
    public Double getProportion() {
        return proportion;
    }

    /** 设置 分成比例 */
    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    /** 获取 是否允许购买，0不可，1可以 */
    public Integer getIsCanbuy() {
        return isCanbuy;
    }

    /** 设置 是否允许购买，0不可，1可以 */
    public void setIsCanbuy(Integer isCanbuy) {
        this.isCanbuy = isCanbuy;
    }

    /** 获取 售卖产品给摄影师分成比例 */
    public Double getShareofbuy() {
        return shareofbuy;
    }

    /** 设置 售卖产品给摄影师分成比例 */
    public void setShareofbuy(Double shareofbuy) {
        this.shareofbuy = shareofbuy;
    }

    /** 获取 banner抬头文字 */
    public String getBannerTitle() {
        return bannerTitle;
    }

    /** 设置 banner抬头文字 */
    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    /** 获取 banner具体的活动说明信息 */
    public String getBannerMsgInfo() {
        return bannerMsgInfo;
    }

    /** 设置 banner具体的活动说明信息 */
    public void setBannerMsgInfo(String bannerMsgInfo) {
        this.bannerMsgInfo = bannerMsgInfo;
    }

    /** 获取 广告图片链接 */
    public String getAdImgUrl() {
        return adImgUrl;
    }

    /** 设置 广告图片链接 */
    public void setAdImgUrl(String adImgUrl) {
        this.adImgUrl = adImgUrl;
    }

    /** 获取 广告链接地址 */
    public String getAdUrl() {
        return adUrl;
    }

    /** 设置 广告链接地址 */
    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    /** 获取 人脸识别服务器处理状态 */
    public Integer getFaceSearchServerState() {
        return faceSearchServerState;
    }

    /** 设置 人脸识别服务器处理状态 */
    public void setFaceSearchServerState(Integer faceSearchServerState) {
        this.faceSearchServerState = faceSearchServerState;
    }

    /** 获取 拍摄形式：0：待确认；1:组织拍摄；2：平台使用 */
    public Integer getPhotoSource() {
        return photoSource;
    }

    /** 设置 拍摄形式：0：待确认；1:组织拍摄；2：平台使用 */
    public void setPhotoSource(Integer photoSource) {
        this.photoSource = photoSource;
    }

    /** 获取 赛事信息：0：暂无；1：50公里以上；2：全马；3：半马；4:6-10公里；5:5公里以下 */
    public Integer getInfo() {
        return info;
    }

    /** 设置 赛事信息：0：暂无；1：50公里以上；2：全马；3：半马；4:6-10公里；5:5公里以下 */
    public void setInfo(Integer info) {
        this.info = info;
    }

    /** 获取 是否需要打标签：0：不需要打标签；1：需要打标签 */
    public Integer getIsNeedTag() {
        return isNeedTag;
    }

    /** 设置 是否需要打标签：0：不需要打标签；1：需要打标签 */
    public void setIsNeedTag(Integer isNeedTag) {
        this.isNeedTag = isNeedTag;
    }

    /** 获取 赛事活动的权重 */
    public Integer getActivityWeight() {
        return activityWeight;
    }

    /** 设置 赛事活动的权重 */
    public void setActivityWeight(Integer activityWeight) {
        this.activityWeight = activityWeight;
    }

    /** 获取 是否去掉爱云动水印 0：不去掉 1：去掉 */
    public Integer getIsNeedIydwatermark() {
        return isNeedIydwatermark;
    }

    /** 设置 是否去掉爱云动水印 0：不去掉 1：去掉 */
    public void setIsNeedIydwatermark(Integer isNeedIydwatermark) {
        this.isNeedIydwatermark = isNeedIydwatermark;
    }

    /** 获取 活动详情 */
    public String getActivityDetail() {
        return activityDetail;
    }

    /** 设置 活动详情 */
    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
    }

    /** 获取 是否开启答谢 */
    public Integer getIsOpenPay() {
        return isOpenPay;
    }

    /** 设置 是否开启答谢 */
    public void setIsOpenPay(Integer isOpenPay) {
        this.isOpenPay = isOpenPay;
    }

    /** 获取 商拍启动页图片url */
    public String getStartPicUrl() {
        return startPicUrl;
    }

    /** 设置 商拍启动页图片url */
    public void setStartPicUrl(String startPicUrl) {
        this.startPicUrl = startPicUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdActivity");
        sb.append("{id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", portalPic=").append(portalPic);
        sb.append(", headerTitle=").append(headerTitle);
        sb.append(", poster=").append(poster);
        sb.append(", description=").append(description);
        sb.append(", creater=").append(creater);
        sb.append(", field=").append(field);
        sb.append(", fontColor=").append(fontColor);
        sb.append(", fee=").append(fee);
        sb.append(", feeDescription=").append(feeDescription);
        sb.append(", city=").append(city);
        sb.append(", peopleNumber=").append(peopleNumber);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", contentUrl=").append(contentUrl);
        sb.append(", detailContent=").append(detailContent);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createrType=").append(createrType);
        sb.append(", sort=").append(sort);
        sb.append(", gpsRadius=").append(gpsRadius);
        sb.append(", activityType=").append(activityType);
        sb.append(", gpsInfo=").append(gpsInfo);
        sb.append(", albumStartTime=").append(albumStartTime);
        sb.append(", albumEndTime=").append(albumEndTime);
        sb.append(", albumType=").append(albumType);
        sb.append(", isLive=").append(isLive);
        sb.append(", property=").append(property);
        sb.append(", tagType=").append(tagType);
        sb.append(", isSubscribe=").append(isSubscribe);
        sb.append(", numFormat=").append(numFormat);
        sb.append(", logo=").append(logo);
        sb.append(", matchName=").append(matchName);
        sb.append(", matchSize=").append(matchSize);
        sb.append(", matchType=").append(matchType);
        sb.append(", homepage=").append(homepage);
        sb.append(", foundTime=").append(foundTime);
        sb.append(", matchLevel=").append(matchLevel);
        sb.append(", caa=").append(caa);
        sb.append(", iaaf=").append(iaaf);
        sb.append(", matchTrack=").append(matchTrack);
        sb.append(", director=").append(director);
        sb.append(", official=").append(official);
        sb.append(", empower=").append(empower);
        sb.append(", business=").append(business);
        sb.append(", businessChannel=").append(businessChannel);
        sb.append(", businessReferrer=").append(businessReferrer);
        sb.append(", cityId=").append(cityId);
        sb.append(", authority=").append(authority);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", lowPrice=").append(lowPrice);
        sb.append(", standardPrice=").append(standardPrice);
        sb.append(", remark=").append(remark);
        sb.append(", executeStatus=").append(executeStatus);
        sb.append(", qrcode=").append(qrcode);
        sb.append(", matchScale=").append(matchScale);
        sb.append(", isFacesearch=").append(isFacesearch);
        sb.append(", faceSearch=").append(faceSearch);
        sb.append(", isGainsharing=").append(isGainsharing);
        sb.append(", proportion=").append(proportion);
        sb.append(", isCanbuy=").append(isCanbuy);
        sb.append(", shareofbuy=").append(shareofbuy);
        sb.append(", bannerTitle=").append(bannerTitle);
        sb.append(", bannerMsgInfo=").append(bannerMsgInfo);
        sb.append(", adImgUrl=").append(adImgUrl);
        sb.append(", adUrl=").append(adUrl);
        sb.append(", faceSearchServerState=").append(faceSearchServerState);
        sb.append(", photoSource=").append(photoSource);
        sb.append(", info=").append(info);
        sb.append(", isNeedTag=").append(isNeedTag);
        sb.append(", activityWeight=").append(activityWeight);
        sb.append(", isNeedIydwatermark=").append(isNeedIydwatermark);
        sb.append(", activityDetail=").append(activityDetail);
        sb.append(", isOpenPay=").append(isOpenPay);
        sb.append(", startPicUrl=").append(startPicUrl);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdActivity) {
            YdActivity ydActivity = (YdActivity) obj;
            if (this.getId().equals(ydActivity.getId())) {
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