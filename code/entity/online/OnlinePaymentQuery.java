package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【待查询支付状态的订单列表】持久化对象 数据库表：online_payment_query
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class OnlinePaymentQuery implements Serializable {

    public static final long serialVersionUID = 1L;

    // 订单id
    private Long orderId;
    // 订单时间yyyyMMdd
    private String merDate;
    // 下次状态查询时间
    private Date nestUpdateTime;
    // 数据创建时间
    private Date createTime;
    // 数据查询次数
    private Integer queryTimes;

    /** 获取 订单id */
    public Long getOrderId() {
        return orderId;
    }

    /** 设置 订单id */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /** 获取 订单时间yyyyMMdd */
    public String getMerDate() {
        return merDate;
    }

    /** 设置 订单时间yyyyMMdd */
    public void setMerDate(String merDate) {
        this.merDate = merDate;
    }

    /** 获取 下次状态查询时间 */
    public Date getNestUpdateTime() {
        return nestUpdateTime;
    }

    /** 设置 下次状态查询时间 */
    public void setNestUpdateTime(Date nestUpdateTime) {
        this.nestUpdateTime = nestUpdateTime;
    }

    /** 获取 数据创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 数据创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 数据查询次数 */
    public Integer getQueryTimes() {
        return queryTimes;
    }

    /** 设置 数据查询次数 */
    public void setQueryTimes(Integer queryTimes) {
        this.queryTimes = queryTimes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OnlinePaymentQuery");
        sb.append("{orderId=").append(orderId);
        sb.append(", merDate=").append(merDate);
        sb.append(", nestUpdateTime=").append(nestUpdateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", queryTimes=").append(queryTimes);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnlinePaymentQuery) {
            OnlinePaymentQuery onlinePaymentQuery = (OnlinePaymentQuery) obj;
            if (this.getOrderId().equals(onlinePaymentQuery.getOrderId())) {
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