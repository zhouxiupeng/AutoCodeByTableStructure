package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【待查询支付状态的订单列表】持久化对象 数据库表：online_payment_queue
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class OnlinePaymentQueueVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 订单id
    private Long orderId;
    // 订单时间yyyyMMdd
    private String merDate;
    // 下次状态查询时间
    private Date nestUpdateTime;
    // 系统最后一次更新数据的时间
    private Date lastUpdateTime;

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

    /** 获取 系统最后一次更新数据的时间 */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /** 设置 系统最后一次更新数据的时间 */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OnlinePaymentQueueVO");
        sb.append("{orderId=").append(orderId);
        sb.append(", merDate=").append(merDate);
        sb.append(", nestUpdateTime=").append(nestUpdateTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnlinePaymentQueueVO) {
            OnlinePaymentQueueVO onlinePaymentQueue = (OnlinePaymentQueueVO) obj;
            if (this.getOrderId().equals(onlinePaymentQueue.getOrderId())) {
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