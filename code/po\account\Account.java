package com.bluemobi.po.account;

import java.util.Date;

import com.appcore.model.AbstractObject;

/**
 * 【账户信息】持久化对象 数据库表：account
 * 
 * @author AutoCode 309444359@qq.com
 * @date 2017-12
 * 
 */
public class Account extends AbstractObject {

    public static final long serialVersionUID = 1L;

    // 账户ID
    private Long accountId;
    // 用户UID
    private Long userId;
    // 账户类型  1:个人账户;2:企业账户;
    private Byte userType;
    // 用户状态: -1.删除 ,0.冻结. 1. 正常
    private Byte status;
    // 创建时间，默认为0
    private Date createTime;
    // 
    private Date updateTime;

    /** 获取 账户ID */
    public Long getAccountId() {
        return accountId;
    }

    /** 设置 账户ID */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /** 获取 用户UID */
    public Long getUserId() {
        return userId;
    }

    /** 设置 用户UID */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 获取 账户类型  1:个人账户;2:企业账户; */
    public Byte getUserType() {
        return userType;
    }

    /** 设置 账户类型  1:个人账户;2:企业账户; */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /** 获取 用户状态: -1.删除 ,0.冻结. 1. 正常 */
    public Byte getStatus() {
        return status;
    }

    /** 设置 用户状态: -1.删除 ,0.冻结. 1. 正常 */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /** 获取 创建时间，默认为0 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间，默认为0 */
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Account");
        sb.append("{accountId=").append(accountId);
        sb.append(", userId=").append(userId);
        sb.append(", userType=").append(userType);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Account) {
            Account account = (Account) obj;
            if (this.getAccountId().equals(account.getAccountId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String pkStr = "" + this.getAccountId();
        return pkStr.hashCode();
    }

}