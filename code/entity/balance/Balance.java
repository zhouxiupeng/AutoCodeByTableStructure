package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【账户余额表】持久化对象 数据库表：balance
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-01
 * 
 */
public class Balance implements Serializable {

    public static final long serialVersionUID = 1L;

    // 账户余额ID
    private long balanceId;
    // 账户id
    private long accountId;
    // 类型: 1.主账户. 2. 副账户. 3.发票账户
    private int balanceType;
    // 账户余额，单位：分
    private long amount;
    // 累积充值额度
    private long totalRechargeAmount;
    // 累积消费额度
    private long totalConsumeAmount;
    // 状态: -1. 冻结,0.未初始化. 1. 正常
    private int status;
    // 属性，1：可消费;4:可提现
    private int attribute;
    // 币种
    private String currency;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;
    // 累计提现金额(单位：分)
    private long totalWithdrawAmount;
    // 系统账户
    private long userId;

    /** 获取 账户余额ID */
    public long getBalanceId() {
        return balanceId;
    }

    /** 设置 账户余额ID */
    public void setBalanceId(long balanceId) {
        this.balanceId = balanceId;
    }

    /** 获取 账户id */
    public long getAccountId() {
        return accountId;
    }

    /** 设置 账户id */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    /** 获取 类型: 1.主账户. 2. 副账户. 3.发票账户 */
    public int getBalanceType() {
        return balanceType;
    }

    /** 设置 类型: 1.主账户. 2. 副账户. 3.发票账户 */
    public void setBalanceType(int balanceType) {
        this.balanceType = balanceType;
    }

    /** 获取 账户余额，单位：分 */
    public long getAmount() {
        return amount;
    }

    /** 设置 账户余额，单位：分 */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    /** 获取 累积充值额度 */
    public long getTotalRechargeAmount() {
        return totalRechargeAmount;
    }

    /** 设置 累积充值额度 */
    public void setTotalRechargeAmount(long totalRechargeAmount) {
        this.totalRechargeAmount = totalRechargeAmount;
    }

    /** 获取 累积消费额度 */
    public long getTotalConsumeAmount() {
        return totalConsumeAmount;
    }

    /** 设置 累积消费额度 */
    public void setTotalConsumeAmount(long totalConsumeAmount) {
        this.totalConsumeAmount = totalConsumeAmount;
    }

    /** 获取 状态: -1. 冻结,0.未初始化. 1. 正常 */
    public int getStatus() {
        return status;
    }

    /** 设置 状态: -1. 冻结,0.未初始化. 1. 正常 */
    public void setStatus(int status) {
        this.status = status;
    }

    /** 获取 属性，1：可消费;4:可提现 */
    public int getAttribute() {
        return attribute;
    }

    /** 设置 属性，1：可消费;4:可提现 */
    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    /** 获取 币种 */
    public String getCurrency() {
        return currency;
    }

    /** 设置 币种 */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 设置 更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 获取 累计提现金额(单位：分) */
    public long getTotalWithdrawAmount() {
        return totalWithdrawAmount;
    }

    /** 设置 累计提现金额(单位：分) */
    public void setTotalWithdrawAmount(long totalWithdrawAmount) {
        this.totalWithdrawAmount = totalWithdrawAmount;
    }

    /** 获取 系统账户 */
    public long getUserId() {
        return userId;
    }

    /** 设置 系统账户 */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Balance");
        sb.append("{balanceId=").append(balanceId);
        sb.append(", accountId=").append(accountId);
        sb.append(", balanceType=").append(balanceType);
        sb.append(", amount=").append(amount);
        sb.append(", totalRechargeAmount=").append(totalRechargeAmount);
        sb.append(", totalConsumeAmount=").append(totalConsumeAmount);
        sb.append(", status=").append(status);
        sb.append(", attribute=").append(attribute);
        sb.append(", currency=").append(currency);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", totalWithdrawAmount=").append(totalWithdrawAmount);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Balance) {
            Balance balance = (Balance) obj;
            if (this.getBalanceId().equals(balance.getBalanceId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getBalanceId();
        return pkStr.hashCode();
    }

}