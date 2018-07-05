package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【公共验证对账】持久化对象 数据库表：umf_commauth_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class UmfCommauthRecord implements Serializable {

    public static final long serialVersionUID = 1L;

    // 商户号	平台统一分配的商户号
    private String merId;
    // 订单号	商户下单时提交的orderId
    private String orderId;
    // 
    private Date transferSettleDate;
    // 记账日期	账户记账日期
    private Date transferAccDate;
    // 验证模式	0|4|5-实名认证 1-扣款 2-代付 3-身份认证 6-借记卡认证 7-贷记卡认证
    private Integer authMode;
    // 交易状态	0-收费,1-不收费
    private Integer tranState;

    /** 获取 商户号	平台统一分配的商户号 */
    public String getMerId() {
        return merId;
    }

    /** 设置 商户号	平台统一分配的商户号 */
    public void setMerId(String merId) {
        this.merId = merId;
    }

    /** 获取 订单号	商户下单时提交的orderId */
    public String getOrderId() {
        return orderId;
    }

    /** 设置 订单号	商户下单时提交的orderId */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /** 获取  */
    public Date getTransferSettleDate() {
        return transferSettleDate;
    }

    /** 设置  */
    public void setTransferSettleDate(Date transferSettleDate) {
        this.transferSettleDate = transferSettleDate;
    }

    /** 获取 记账日期	账户记账日期 */
    public Date getTransferAccDate() {
        return transferAccDate;
    }

    /** 设置 记账日期	账户记账日期 */
    public void setTransferAccDate(Date transferAccDate) {
        this.transferAccDate = transferAccDate;
    }

    /** 获取 验证模式	0|4|5-实名认证 1-扣款 2-代付 3-身份认证 6-借记卡认证 7-贷记卡认证 */
    public Integer getAuthMode() {
        return authMode;
    }

    /** 设置 验证模式	0|4|5-实名认证 1-扣款 2-代付 3-身份认证 6-借记卡认证 7-贷记卡认证 */
    public void setAuthMode(Integer authMode) {
        this.authMode = authMode;
    }

    /** 获取 交易状态	0-收费,1-不收费 */
    public Integer getTranState() {
        return tranState;
    }

    /** 设置 交易状态	0-收费,1-不收费 */
    public void setTranState(Integer tranState) {
        this.tranState = tranState;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UmfCommauthRecord");
        sb.append("{merId=").append(merId);
        sb.append(", orderId=").append(orderId);
        sb.append(", transferSettleDate=").append(transferSettleDate);
        sb.append(", transferAccDate=").append(transferAccDate);
        sb.append(", authMode=").append(authMode);
        sb.append(", tranState=").append(tranState);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UmfCommauthRecord) {
            UmfCommauthRecord umfCommauthRecord = (UmfCommauthRecord) obj;
            if (this.getOrderId().equals(umfCommauthRecord.getOrderId())) {
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