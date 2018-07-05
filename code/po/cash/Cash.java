package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：cash
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class CashVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 
    private Integer amount;
    // 
    private Integer uid;
    // 
    private Date updateTime;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 获取  */
    public Integer getAmount() {
        return amount;
    }

    /** 设置  */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /** 获取  */
    public Integer getUid() {
        return uid;
    }

    /** 设置  */
    public void setUid(Integer uid) {
        this.uid = uid;
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
        sb.append("CashVO");
        sb.append("{id=").append(id);
        sb.append(", amount=").append(amount);
        sb.append(", uid=").append(uid);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CashVO) {
            CashVO cash = (CashVO) obj;
            if (this.getId().equals(cash.getId())) {
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