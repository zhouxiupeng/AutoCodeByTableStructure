package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【账号交易明细数据】持久化对象 数据库表：balance_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-01
 * 
 */
public class BalanceRecord implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private long balanceRecordId;
    // 
    private Date createTime;
    // 收款账号id
    private long accountId;
    // 关联账号，付款方id,
    private long relateAccount;
    // 10平台，20摄影师，30消费者；1:答谢;２购买；3:津贴;４:提现；５充值,6冲抵
    private int type;
    // 金额分
    private long money;
    // 
    private String comment;
    // 操作人员id
    private long operatorId;
    // 凭据ｉｄ
    private long evidenceId;
    // 变更前账号金额
    private long oldAmount;
    // 变更后金额
    private long newAmount;
    // 账户余额ID
    private long balanceId;

    /** 获取  */
    public long getBalanceRecordId() {
        return balanceRecordId;
    }

    /** 设置  */
    public void setBalanceRecordId(long balanceRecordId) {
        this.balanceRecordId = balanceRecordId;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 收款账号id */
    public long getAccountId() {
        return accountId;
    }

    /** 设置 收款账号id */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    /** 获取 关联账号，付款方id, */
    public long getRelateAccount() {
        return relateAccount;
    }

    /** 设置 关联账号，付款方id, */
    public void setRelateAccount(long relateAccount) {
        this.relateAccount = relateAccount;
    }

    /** 获取 10平台，20摄影师，30消费者；1:答谢;２购买；3:津贴;４:提现；５充值,6冲抵 */
    public int getType() {
        return type;
    }

    /** 设置 10平台，20摄影师，30消费者；1:答谢;２购买；3:津贴;４:提现；５充值,6冲抵 */
    public void setType(int type) {
        this.type = type;
    }

    /** 获取 金额分 */
    public long getMoney() {
        return money;
    }

    /** 设置 金额分 */
    public void setMoney(long money) {
        this.money = money;
    }

    /** 获取  */
    public String getComment() {
        return comment;
    }

    /** 设置  */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 获取 操作人员id */
    public long getOperatorId() {
        return operatorId;
    }

    /** 设置 操作人员id */
    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    /** 获取 凭据ｉｄ */
    public long getEvidenceId() {
        return evidenceId;
    }

    /** 设置 凭据ｉｄ */
    public void setEvidenceId(long evidenceId) {
        this.evidenceId = evidenceId;
    }

    /** 获取 变更前账号金额 */
    public long getOldAmount() {
        return oldAmount;
    }

    /** 设置 变更前账号金额 */
    public void setOldAmount(long oldAmount) {
        this.oldAmount = oldAmount;
    }

    /** 获取 变更后金额 */
    public long getNewAmount() {
        return newAmount;
    }

    /** 设置 变更后金额 */
    public void setNewAmount(long newAmount) {
        this.newAmount = newAmount;
    }

    /** 获取 账户余额ID */
    public long getBalanceId() {
        return balanceId;
    }

    /** 设置 账户余额ID */
    public void setBalanceId(long balanceId) {
        this.balanceId = balanceId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BalanceRecord");
        sb.append("{balanceRecordId=").append(balanceRecordId);
        sb.append(", createTime=").append(createTime);
        sb.append(", accountId=").append(accountId);
        sb.append(", relateAccount=").append(relateAccount);
        sb.append(", type=").append(type);
        sb.append(", money=").append(money);
        sb.append(", comment=").append(comment);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", evidenceId=").append(evidenceId);
        sb.append(", oldAmount=").append(oldAmount);
        sb.append(", newAmount=").append(newAmount);
        sb.append(", balanceId=").append(balanceId);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BalanceRecord) {
            BalanceRecord balanceRecord = (BalanceRecord) obj;
            if (this.getBalanceRecordId().equals(balanceRecord.getBalanceRecordId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getBalanceRecordId();
        return pkStr.hashCode();
    }

}