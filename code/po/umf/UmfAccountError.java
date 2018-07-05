package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【错误的对账数据】持久化对象 数据库表：umf_account_error
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class UmfAccountErrorVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 对账日期	交易的对账日期
    private Date transferSettleDate;
    // 数据类型1支付2付款3验证4公司账号
    private Integer dataType;
    // iyd系统中订单id
    private String orderId;
    // umf金额，单位分
    private Integer umfMonye;
    // 金额单位分
    private Integer iydMoney;
    // 错误信息
    private String errorMessage;

    /** 获取 对账日期	交易的对账日期 */
    public Date getTransferSettleDate() {
        return transferSettleDate;
    }

    /** 设置 对账日期	交易的对账日期 */
    public void setTransferSettleDate(Date transferSettleDate) {
        this.transferSettleDate = transferSettleDate;
    }

    /** 获取 数据类型1支付2付款3验证4公司账号 */
    public Integer getDataType() {
        return dataType;
    }

    /** 设置 数据类型1支付2付款3验证4公司账号 */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /** 获取 iyd系统中订单id */
    public String getOrderId() {
        return orderId;
    }

    /** 设置 iyd系统中订单id */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /** 获取 umf金额，单位分 */
    public Integer getUmfMonye() {
        return umfMonye;
    }

    /** 设置 umf金额，单位分 */
    public void setUmfMonye(Integer umfMonye) {
        this.umfMonye = umfMonye;
    }

    /** 获取 金额单位分 */
    public Integer getIydMoney() {
        return iydMoney;
    }

    /** 设置 金额单位分 */
    public void setIydMoney(Integer iydMoney) {
        this.iydMoney = iydMoney;
    }

    /** 获取 错误信息 */
    public String getErrorMessage() {
        return errorMessage;
    }

    /** 设置 错误信息 */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UmfAccountErrorVO");
        sb.append("{transferSettleDate=").append(transferSettleDate);
        sb.append(", dataType=").append(dataType);
        sb.append(", orderId=").append(orderId);
        sb.append(", umfMonye=").append(umfMonye);
        sb.append(", iydMoney=").append(iydMoney);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UmfAccountErrorVO) {
            UmfAccountErrorVO umfAccountError = (UmfAccountErrorVO) obj;
            if (this.getOrderId().equals(umfAccountError.getOrderId())) {
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