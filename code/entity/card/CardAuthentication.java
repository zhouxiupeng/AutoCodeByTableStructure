package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：card_authentication
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class CardAuthentication implements Serializable {

    public static final long serialVersionUID = 1L;

    // 商户订单号
    private Long orderId;
    // 商户编号
    private String merId;
    // 银行卡号
    private byte[] bankAccount;
    // 账号姓名
    private String accountName;
    // 身份证号
    private byte[] idectityCode;
    // 手机号码
    private String mobileId;
    // 手续费承担方- 手续费从现金账户扣除2- 手续费从手续费账户扣除
    private String comAmtType;
    // 创建时间
    private Date createTime;
    // 0000鉴权通过
    private String retCode;
    // 返回信息
    private String retMsg;
    // 是否计费	定长1	0-计费；验证成功及提供明确验证结果的验证订单进行计费。
其他-不计费：系统、通讯及未获取明确验证结果等情况不计费
    private String isCharge;
    // 用户在业务系统中的id
    private Long uid;

    /** 获取 商户订单号 */
    public Long getOrderId() {
        return orderId;
    }

    /** 设置 商户订单号 */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /** 获取 商户编号 */
    public String getMerId() {
        return merId;
    }

    /** 设置 商户编号 */
    public void setMerId(String merId) {
        this.merId = merId;
    }

    /** 获取 银行卡号 */
    public byte[] getBankAccount() {
        return bankAccount;
    }

    /** 设置 银行卡号 */
    public void setBankAccount(byte[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    /** 获取 账号姓名 */
    public String getAccountName() {
        return accountName;
    }

    /** 设置 账号姓名 */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /** 获取 身份证号 */
    public byte[] getIdectityCode() {
        return idectityCode;
    }

    /** 设置 身份证号 */
    public void setIdectityCode(byte[] idectityCode) {
        this.idectityCode = idectityCode;
    }

    /** 获取 手机号码 */
    public String getMobileId() {
        return mobileId;
    }

    /** 设置 手机号码 */
    public void setMobileId(String mobileId) {
        this.mobileId = mobileId;
    }

    /** 获取 手续费承担方- 手续费从现金账户扣除2- 手续费从手续费账户扣除 */
    public String getComAmtType() {
        return comAmtType;
    }

    /** 设置 手续费承担方- 手续费从现金账户扣除2- 手续费从手续费账户扣除 */
    public void setComAmtType(String comAmtType) {
        this.comAmtType = comAmtType;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 0000鉴权通过 */
    public String getRetCode() {
        return retCode;
    }

    /** 设置 0000鉴权通过 */
    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    /** 获取 返回信息 */
    public String getRetMsg() {
        return retMsg;
    }

    /** 设置 返回信息 */
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    /** 获取 是否计费	定长1	0-计费；验证成功及提供明确验证结果的验证订单进行计费。
其他-不计费：系统、通讯及未获取明确验证结果等情况不计费 */
    public String getIsCharge() {
        return isCharge;
    }

    /** 设置 是否计费	定长1	0-计费；验证成功及提供明确验证结果的验证订单进行计费。
其他-不计费：系统、通讯及未获取明确验证结果等情况不计费 */
    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge;
    }

    /** 获取 用户在业务系统中的id */
    public Long getUid() {
        return uid;
    }

    /** 设置 用户在业务系统中的id */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CardAuthentication");
        sb.append("{orderId=").append(orderId);
        sb.append(", merId=").append(merId);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", accountName=").append(accountName);
        sb.append(", idectityCode=").append(idectityCode);
        sb.append(", mobileId=").append(mobileId);
        sb.append(", comAmtType=").append(comAmtType);
        sb.append(", createTime=").append(createTime);
        sb.append(", retCode=").append(retCode);
        sb.append(", retMsg=").append(retMsg);
        sb.append(", isCharge=").append(isCharge);
        sb.append(", uid=").append(uid);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardAuthentication) {
            CardAuthentication cardAuthentication = (CardAuthentication) obj;
            if (this.getOrderId().equals(cardAuthentication.getOrderId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getOrderId();
        return pkStr.hashCode();
    }

}