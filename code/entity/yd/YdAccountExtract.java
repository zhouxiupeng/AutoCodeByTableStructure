package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【提现流水号关联表】持久化对象 数据库表：yd_account_extract
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class YdAccountExtract implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 提现id
    private Integer accountId;
    // 订单流水号
    private String orderNo;
    // 创建时间
    private Date createTime;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 获取 提现id */
    public Integer getAccountId() {
        return accountId;
    }

    /** 设置 提现id */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /** 获取 订单流水号 */
    public String getOrderNo() {
        return orderNo;
    }

    /** 设置 订单流水号 */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdAccountExtract");
        sb.append("{id=").append(id);
        sb.append(", accountId=").append(accountId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdAccountExtract) {
            YdAccountExtract ydAccountExtract = (YdAccountExtract) obj;
            if (this.getId().equals(ydAccountExtract.getId())) {
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