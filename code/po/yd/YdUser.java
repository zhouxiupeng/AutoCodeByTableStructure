package com.yundong.api.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【用户表】持久化对象 数据库表：yd_user
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdUserVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long uid;
    // 昵称
    private String name;
    // 
    private String tel;
    // 密码
    private String passwd;
    // 0:正常  1被删除
    private Integer del;
    // 头像
    private String userImg;
    // 用户页背景图片
    private String backgroundImg;
    // 状态 禁用
    private Integer status;
    // 首次注册来源：0：手机；1：sina weibo；2：qq ；3：匿名注册；4：邮箱注册；5：wx。默认0
    private Integer firstRegisterRet;
    // 性别 1：男 ；2：女；0：未知；默认0
    private Integer sex;
    // 真实姓名
    private String realName;
    // 身高，单位cm
    private Integer height;
    // 体重，单位kg
    private Double weight;
    // 年龄
    private Integer age;
    // 省份id
    private Integer provinceId;
    // 市id
    private Integer cityId;
    // 邮编编码
    private String postcode;
    // 地址
    private String address;
    // QQ_openid
    private String qqOpenid;
    // 微信unionid
    private String wxUnionid;
    // 微信_openid
    private String wxOpenid;
    // 微博uid
    private String sinaUid;
    // 
    private String namePinyin;
    // 纬度
    private Double latitude;
    // 经度
    private Double longitude;
    // 用户类型，0：真实用户，1：运营马甲,3:摄影师
    private Integer utype;
    // 积分
    private Integer points;
    // 
    private Date createtime;
    // 
    private Date updatetime;
    // 个性签名
    private String signature;
    // 绑定的手机号(号码牌订阅)
    private String boundTel;
    // 用户类型(1：个人用户  2：企业用户 3：员工 4：平台)
    private Integer userType;

    /** 获取  */
    public Long getUid() {
        return uid;
    }

    /** 设置  */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 昵称 */
    public String getName() {
        return name;
    }

    /** 设置 昵称 */
    public void setName(String name) {
        this.name = name;
    }

    /** 获取  */
    public String getTel() {
        return tel;
    }

    /** 设置  */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /** 获取 密码 */
    public String getPasswd() {
        return passwd;
    }

    /** 设置 密码 */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /** 获取 0:正常  1被删除 */
    public Integer getDel() {
        return del;
    }

    /** 设置 0:正常  1被删除 */
    public void setDel(Integer del) {
        this.del = del;
    }

    /** 获取 头像 */
    public String getUserImg() {
        return userImg;
    }

    /** 设置 头像 */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    /** 获取 用户页背景图片 */
    public String getBackgroundImg() {
        return backgroundImg;
    }

    /** 设置 用户页背景图片 */
    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    /** 获取 状态 禁用 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态 禁用 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 首次注册来源：0：手机；1：sina weibo；2：qq ；3：匿名注册；4：邮箱注册；5：wx。默认0 */
    public Integer getFirstRegisterRet() {
        return firstRegisterRet;
    }

    /** 设置 首次注册来源：0：手机；1：sina weibo；2：qq ；3：匿名注册；4：邮箱注册；5：wx。默认0 */
    public void setFirstRegisterRet(Integer firstRegisterRet) {
        this.firstRegisterRet = firstRegisterRet;
    }

    /** 获取 性别 1：男 ；2：女；0：未知；默认0 */
    public Integer getSex() {
        return sex;
    }

    /** 设置 性别 1：男 ；2：女；0：未知；默认0 */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /** 获取 真实姓名 */
    public String getRealName() {
        return realName;
    }

    /** 设置 真实姓名 */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /** 获取 身高，单位cm */
    public Integer getHeight() {
        return height;
    }

    /** 设置 身高，单位cm */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /** 获取 体重，单位kg */
    public Double getWeight() {
        return weight;
    }

    /** 设置 体重，单位kg */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /** 获取 年龄 */
    public Integer getAge() {
        return age;
    }

    /** 设置 年龄 */
    public void setAge(Integer age) {
        this.age = age;
    }

    /** 获取 省份id */
    public Integer getProvinceId() {
        return provinceId;
    }

    /** 设置 省份id */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /** 获取 市id */
    public Integer getCityId() {
        return cityId;
    }

    /** 设置 市id */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /** 获取 邮编编码 */
    public String getPostcode() {
        return postcode;
    }

    /** 设置 邮编编码 */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /** 获取 地址 */
    public String getAddress() {
        return address;
    }

    /** 设置 地址 */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 获取 QQ_openid */
    public String getQqOpenid() {
        return qqOpenid;
    }

    /** 设置 QQ_openid */
    public void setQqOpenid(String qqOpenid) {
        this.qqOpenid = qqOpenid;
    }

    /** 获取 微信unionid */
    public String getWxUnionid() {
        return wxUnionid;
    }

    /** 设置 微信unionid */
    public void setWxUnionid(String wxUnionid) {
        this.wxUnionid = wxUnionid;
    }

    /** 获取 微信_openid */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /** 设置 微信_openid */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /** 获取 微博uid */
    public String getSinaUid() {
        return sinaUid;
    }

    /** 设置 微博uid */
    public void setSinaUid(String sinaUid) {
        this.sinaUid = sinaUid;
    }

    /** 获取  */
    public String getNamePinyin() {
        return namePinyin;
    }

    /** 设置  */
    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    /** 获取 纬度 */
    public Double getLatitude() {
        return latitude;
    }

    /** 设置 纬度 */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /** 获取 经度 */
    public Double getLongitude() {
        return longitude;
    }

    /** 设置 经度 */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /** 获取 用户类型，0：真实用户，1：运营马甲,3:摄影师 */
    public Integer getUtype() {
        return utype;
    }

    /** 设置 用户类型，0：真实用户，1：运营马甲,3:摄影师 */
    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    /** 获取 积分 */
    public Integer getPoints() {
        return points;
    }

    /** 设置 积分 */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /** 获取  */
    public Date getCreatetime() {
        return createtime;
    }

    /** 设置  */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /** 获取  */
    public Date getUpdatetime() {
        return updatetime;
    }

    /** 设置  */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /** 获取 个性签名 */
    public String getSignature() {
        return signature;
    }

    /** 设置 个性签名 */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /** 获取 绑定的手机号(号码牌订阅) */
    public String getBoundTel() {
        return boundTel;
    }

    /** 设置 绑定的手机号(号码牌订阅) */
    public void setBoundTel(String boundTel) {
        this.boundTel = boundTel;
    }

    /** 获取 用户类型(1：个人用户  2：企业用户 3：员工 4：平台) */
    public Integer getUserType() {
        return userType;
    }

    /** 设置 用户类型(1：个人用户  2：企业用户 3：员工 4：平台) */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdUserVO");
        sb.append("{uid=").append(uid);
        sb.append(", name=").append(name);
        sb.append(", tel=").append(tel);
        sb.append(", passwd=").append(passwd);
        sb.append(", del=").append(del);
        sb.append(", userImg=").append(userImg);
        sb.append(", backgroundImg=").append(backgroundImg);
        sb.append(", status=").append(status);
        sb.append(", firstRegisterRet=").append(firstRegisterRet);
        sb.append(", sex=").append(sex);
        sb.append(", realName=").append(realName);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", age=").append(age);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", postcode=").append(postcode);
        sb.append(", address=").append(address);
        sb.append(", qqOpenid=").append(qqOpenid);
        sb.append(", wxUnionid=").append(wxUnionid);
        sb.append(", wxOpenid=").append(wxOpenid);
        sb.append(", sinaUid=").append(sinaUid);
        sb.append(", namePinyin=").append(namePinyin);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", utype=").append(utype);
        sb.append(", points=").append(points);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", signature=").append(signature);
        sb.append(", boundTel=").append(boundTel);
        sb.append(", userType=").append(userType);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdUserVO) {
            YdUserVO ydUser = (YdUserVO) obj;
            if (this.getUid().equals(ydUser.getUid())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getUid();
        return pkStr.hashCode();
    }

}