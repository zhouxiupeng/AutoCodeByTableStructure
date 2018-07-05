package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【订单在线支付参数信息】持久化对象 数据库表：online_payment
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class OnlinePaymentVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 订单号
    private Long orderId;
    // uid
    private Long uid;
    // 收款方账号
    private String receAccount;
    // 付款金额
    private Long amount;
    // 凭据id
    private String evidenceId;
    // 支付状态
    private String tradeState;
    // 订单日期
    private String merDate;
    // 数据创建时间
    private Date createTime;
    // 最后更新时间
    private Date updateTime;
    // 返回码
    private String retCode;
    // 返回信息
    private String retMsg;
    // 手续费
    private Integer fee;
    // 手续费类型
    private Integer feeType;
    // 付款对账日期
    private String transferSettleDate;

    /** 获取 订单号 */
    public Long getOrderId() {
        return orderId;
    }

    /** 设置 订单号 */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /** 获取 uid */
    public Long getUid() {
        return uid;
    }

    /** 设置 uid */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /** 获取 收款方账号 */
    public String getReceAccount() {
        return receAccount;
    }

    /** 设置 收款方账号 */
    public void setReceAccount(String receAccount) {
        this.receAccount = receAccount;
    }

    /** 获取 付款金额 */
    public Long getAmount() {
        return amount;
    }

    /** 设置 付款金额 */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /** 获取 凭据id */
    public String getEvidenceId() {
        return evidenceId;
    }

    /** 设置 凭据id */
    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    /** 获取 支付状态 */
    public String getTradeState() {
        return tradeState;
    }

    /** 设置 支付状态 */
    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    /** 获取 订单日期 */
    public String getMerDate() {
        return merDate;
    }

    /** 设置 订单日期 */
    public void setMerDate(String merDate) {
        this.merDate = merDate;
    }

    /** 获取 数据创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 数据创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 最后更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 设置 最后更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 获取 返回码 */
    public String getRetCode() {
        return retCode;
    }

    /** 设置 返回码 */
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

    /** 获取 手续费 */
    public Integer getFee() {
        return fee;
    }

    /** 设置 手续费 */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /** 获取 手续费类型 */
    public Integer getFeeType() {
        return feeType;
    }

    /** 设置 手续费类型 */
    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    /** 获取 付款对账日期 */
    public String getTransferSettleDate() {
        return transferSettleDate;
    }

    /** 设置 付款对账日期 */
    public void setTransferSettleDate(String transferSettleDate) {
        this.transferSettleDate = transferSettleDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OnlinePaymentVO");
        sb.append("{orderId=").append(orderId);
        sb.append(", uid=").append(uid);
        sb.append(", receAccount=").append(receAccount);
        sb.append(", amount=").append(amount);
        sb.append(", evidenceId=").append(evidenceId);
        sb.append(", tradeState=").append(tradeState);
        sb.append(", merDate=").append(merDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", retCode=").append(retCode);
        sb.append(", retMsg=").append(retMsg);
        sb.append(", fee=").append(fee);
        sb.append(", feeType=").append(feeType);
        sb.append(", transferSettleDate=").append(transferSettleDate);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnlinePaymentVO) {
            OnlinePaymentVO onlinePayment = (OnlinePaymentVO) obj;
            if (this.getOrderId().equals(onlinePayment.getOrderId())) {
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