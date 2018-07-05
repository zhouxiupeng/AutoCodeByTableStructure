package com.yundong.api.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：yd_photo_grapher
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdPhotoGrapherVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 状态 1:待审核 2：审核通过 0：删除
    private Integer status;
    // 更新时间
    private Date createTime;
    // 手机号
    private String tel;
    // 头像
    private String portrait;
    // 
    private Integer cityId;
    // 城市ID
    private String city;
    // 姓名
    private String realName;
    // 生日
    private Date birthday;
    // 微信号
    private String weixin;
    // qq
    private String qq;
    // 机身
    private String camera;
    // 机身其它
    private String cameraOther;
    // 镜头1
    private String lens1;
    // 镜头2
    private String lens2;
    // 镜关其它
    private String lensOther;
    // 从何时开始使用单反
    private Date useAps;
    // 是否为专职摄影师
    private Integer fulltime;
    // 是否拍摄过体育赛事
    private Integer sport;
    // 用户ID
    private Long uid;
    // 性别 1:男 2:女
    private Integer gender;
    // 昵称
    private String nickName;
    // 身份证号
    private String idCard;
    // 摄影师等级：0：-- 1：认证摄影师 2：注册摄影师 3：专业摄影师
    private Integer grapherLevel;
    // 摄影师积分
    private Integer grapherCredits;
    // 加入爱云动时间
    private Date joinIydTime;
    // 发展渠道: 0:朋友介绍；1:微信订阅号； 2:QQ群；3:赛事现场；4:其他
    private Integer develChannel;
    // 摄影经理等级：0:摄影经理助理 1:摄影经理 2:摄影总监
    private Integer graphManager;
    // 银行卡账号
    private String bankCard;
    // 支付宝账号
    private String alipay;
    // 其他
    private String other;
    // 审核通过时间
    private Date transitTime;
    // 银行卡开户行
    private String bankCardPlace;
    // 储存卡
    private String storage;
    // 推荐人uid 0:无
    private Long puid;
    // 是否职业摄影师 0:否 1:是
    private Integer isProfession;
    // nickname修改次数
    private Integer nickNameChangeCount;
    // 手持身份证照片
    private String identityImageUrl;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 状态 1:待审核 2：审核通过 0：删除 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态 1:待审核 2：审核通过 0：删除 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 更新时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 更新时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 手机号 */
    public String getTel() {
        return tel;
    }

    /** 设置 手机号 */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /** 获取 头像 */
    public String getPortrait() {
        return portrait;
    }

    /** 设置 头像 */
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    /** 获取  */
    public Integer getCityId() {
        return cityId;
    }

    /** 设置  */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /** 获取 城市ID */
    public String getCity() {
        return city;
    }

    /** 设置 城市ID */
    public void setCity(String city) {
        this.city = city;
    }

    /** 获取 姓名 */
    public String getRealName() {
        return realName;
    }

    /** 设置 姓名 */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /** 获取 生日 */
    public Date getBirthday() {
        return birthday;
    }

    /** 设置 生日 */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /** 获取 微信号 */
    public String getWeixin() {
        return weixin;
    }

    /** 设置 微信号 */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /** 获取 qq */
    public String getQq() {
        return qq;
    }

    /** 设置 qq */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /** 获取 机身 */
    public String getCamera() {
        return camera;
    }

    /** 设置 机身 */
    public void setCamera(String camera) {
        this.camera = camera;
    }

    /** 获取 机身其它 */
    public String getCameraOther() {
        return cameraOther;
    }

    /** 设置 机身其它 */
    public void setCameraOther(String cameraOther) {
        this.cameraOther = cameraOther;
    }

    /** 获取 镜头1 */
    public String getLens1() {
        return lens1;
    }

    /** 设置 镜头1 */
    public void setLens1(String lens1) {
        this.lens1 = lens1;
    }

    /** 获取 镜头2 */
    public String getLens2() {
        return lens2;
    }

    /** 设置 镜头2 */
    public void setLens2(String lens2) {
        this.lens2 = lens2;
    }

    /** 获取 镜关其它 */
    public String getLensOther() {
        return lensOther;
    }

    /** 设置 镜关其它 */
    public void setLensOther(String lensOther) {
        this.lensOther = lensOther;
    }

    /** 获取 从何时开始使用单反 */
    public Date getUseAps() {
        return useAps;
    }

    /** 设置 从何时开始使用单反 */
    public void setUseAps(Date useAps) {
        this.useAps = useAps;
    }

    /** 获取 是否为专职摄影师 */
    public Integer getFulltime() {
        return fulltime;
    }

    /** 设置 是否为专职摄影师 */
    public void setFulltime(Integer fulltime) {
        this.fulltime = fulltime;
    }

    /** 获取 是否拍摄过体育赛事 */
    public Integer getSport() {
        return sport;
    }

    /** 设置 是否拍摄过体育赛事 */
    public void setSport(Integer sport) {
        this.sport = sport;
    }

    /** 获取 用户ID */
    public Long getUid() {
        return uid;
    }

    /** 设置 用户ID */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 性别 1:男 2:女 */
    public Integer getGender() {
        return gender;
    }

    /** 设置 性别 1:男 2:女 */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /** 获取 昵称 */
    public String getNickName() {
        return nickName;
    }

    /** 设置 昵称 */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /** 获取 身份证号 */
    public String getIdCard() {
        return idCard;
    }

    /** 设置 身份证号 */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /** 获取 摄影师等级：0：-- 1：认证摄影师 2：注册摄影师 3：专业摄影师 */
    public Integer getGrapherLevel() {
        return grapherLevel;
    }

    /** 设置 摄影师等级：0：-- 1：认证摄影师 2：注册摄影师 3：专业摄影师 */
    public void setGrapherLevel(Integer grapherLevel) {
        this.grapherLevel = grapherLevel;
    }

    /** 获取 摄影师积分 */
    public Integer getGrapherCredits() {
        return grapherCredits;
    }

    /** 设置 摄影师积分 */
    public void setGrapherCredits(Integer grapherCredits) {
        this.grapherCredits = grapherCredits;
    }

    /** 获取 加入爱云动时间 */
    public Date getJoinIydTime() {
        return joinIydTime;
    }

    /** 设置 加入爱云动时间 */
    public void setJoinIydTime(Date joinIydTime) {
        this.joinIydTime = joinIydTime;
    }

    /** 获取 发展渠道: 0:朋友介绍；1:微信订阅号； 2:QQ群；3:赛事现场；4:其他 */
    public Integer getDevelChannel() {
        return develChannel;
    }

    /** 设置 发展渠道: 0:朋友介绍；1:微信订阅号； 2:QQ群；3:赛事现场；4:其他 */
    public void setDevelChannel(Integer develChannel) {
        this.develChannel = develChannel;
    }

    /** 获取 摄影经理等级：0:摄影经理助理 1:摄影经理 2:摄影总监 */
    public Integer getGraphManager() {
        return graphManager;
    }

    /** 设置 摄影经理等级：0:摄影经理助理 1:摄影经理 2:摄影总监 */
    public void setGraphManager(Integer graphManager) {
        this.graphManager = graphManager;
    }

    /** 获取 银行卡账号 */
    public String getBankCard() {
        return bankCard;
    }

    /** 设置 银行卡账号 */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    /** 获取 支付宝账号 */
    public String getAlipay() {
        return alipay;
    }

    /** 设置 支付宝账号 */
    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    /** 获取 其他 */
    public String getOther() {
        return other;
    }

    /** 设置 其他 */
    public void setOther(String other) {
        this.other = other;
    }

    /** 获取 审核通过时间 */
    public Date getTransitTime() {
        return transitTime;
    }

    /** 设置 审核通过时间 */
    public void setTransitTime(Date transitTime) {
        this.transitTime = transitTime;
    }

    /** 获取 银行卡开户行 */
    public String getBankCardPlace() {
        return bankCardPlace;
    }

    /** 设置 银行卡开户行 */
    public void setBankCardPlace(String bankCardPlace) {
        this.bankCardPlace = bankCardPlace;
    }

    /** 获取 储存卡 */
    public String getStorage() {
        return storage;
    }

    /** 设置 储存卡 */
    public void setStorage(String storage) {
        this.storage = storage;
    }

    /** 获取 推荐人uid 0:无 */
    public Long getPuid() {
        return puid;
    }

    /** 设置 推荐人uid 0:无 */
    public void setPuid(Long puid) {
        this.puid = puid;
    }

    /** 获取 是否职业摄影师 0:否 1:是 */
    public Integer getIsProfession() {
        return isProfession;
    }

    /** 设置 是否职业摄影师 0:否 1:是 */
    public void setIsProfession(Integer isProfession) {
        this.isProfession = isProfession;
    }

    /** 获取 nickname修改次数 */
    public Integer getNickNameChangeCount() {
        return nickNameChangeCount;
    }

    /** 设置 nickname修改次数 */
    public void setNickNameChangeCount(Integer nickNameChangeCount) {
        this.nickNameChangeCount = nickNameChangeCount;
    }

    /** 获取 手持身份证照片 */
    public String getIdentityImageUrl() {
        return identityImageUrl;
    }

    /** 设置 手持身份证照片 */
    public void setIdentityImageUrl(String identityImageUrl) {
        this.identityImageUrl = identityImageUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdPhotoGrapherVO");
        sb.append("{id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", tel=").append(tel);
        sb.append(", portrait=").append(portrait);
        sb.append(", cityId=").append(cityId);
        sb.append(", city=").append(city);
        sb.append(", realName=").append(realName);
        sb.append(", birthday=").append(birthday);
        sb.append(", weixin=").append(weixin);
        sb.append(", qq=").append(qq);
        sb.append(", camera=").append(camera);
        sb.append(", cameraOther=").append(cameraOther);
        sb.append(", lens1=").append(lens1);
        sb.append(", lens2=").append(lens2);
        sb.append(", lensOther=").append(lensOther);
        sb.append(", useAps=").append(useAps);
        sb.append(", fulltime=").append(fulltime);
        sb.append(", sport=").append(sport);
        sb.append(", uid=").append(uid);
        sb.append(", gender=").append(gender);
        sb.append(", nickName=").append(nickName);
        sb.append(", idCard=").append(idCard);
        sb.append(", grapherLevel=").append(grapherLevel);
        sb.append(", grapherCredits=").append(grapherCredits);
        sb.append(", joinIydTime=").append(joinIydTime);
        sb.append(", develChannel=").append(develChannel);
        sb.append(", graphManager=").append(graphManager);
        sb.append(", bankCard=").append(bankCard);
        sb.append(", alipay=").append(alipay);
        sb.append(", other=").append(other);
        sb.append(", transitTime=").append(transitTime);
        sb.append(", bankCardPlace=").append(bankCardPlace);
        sb.append(", storage=").append(storage);
        sb.append(", puid=").append(puid);
        sb.append(", isProfession=").append(isProfession);
        sb.append(", nickNameChangeCount=").append(nickNameChangeCount);
        sb.append(", identityImageUrl=").append(identityImageUrl);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdPhotoGrapherVO) {
            YdPhotoGrapherVO ydPhotoGrapher = (YdPhotoGrapherVO) obj;
            if (this.getId().equals(ydPhotoGrapher.getId())) {
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