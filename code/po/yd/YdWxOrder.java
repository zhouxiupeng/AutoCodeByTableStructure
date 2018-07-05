package com.yundong.m1_core.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：yd_wx_order
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class YdWxOrderVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 用户ID
    private Integer uid;
    // 商户订单号
    private String outTradeNo;
    // 图片id
    private Integer topicInfoId;
    // 订单金额分
    private Integer totalFee;
    // 商品描述
    private String body;
    // 创建时间
    private Date createTime;
    // 支付途径 0 : ios; 1 : android; 2 : h5
    private Integer way;
    // 订单状态 0 : 订单生成未支付; 1 : 已支付
    private Integer state;
    // 回调后收到的微信支付单号
    private String transactionId;
    // 回调时间
    private Date transactionTime;
    // 订单类型【0答谢订单默认，1购买订单】
    private Integer orderType;
    // 退款状态【0未退款，1已退款】
    private Integer refundState;
    // 退款总金额
    private Double refoudFee;
    // 客户端支付时间
    private Date clientPayTime;
    // 微信平台的支付状态码
    private String clientTradeState;
    // 客户端的支付状态1已支付
    private Integer clientPayState;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 获取 用户ID */
    public Integer getUid() {
        return uid;
    }

    /** 设置 用户ID */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /** 获取 商户订单号 */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /** 设置 商户订单号 */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /** 获取 图片id */
    public Integer getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 图片id */
    public void setTopicInfoId(Integer topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取 订单金额分 */
    public Integer getTotalFee() {
        return totalFee;
    }

    /** 设置 订单金额分 */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /** 获取 商品描述 */
    public String getBody() {
        return body;
    }

    /** 设置 商品描述 */
    public void setBody(String body) {
        this.body = body;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 支付途径 0 : ios; 1 : android; 2 : h5 */
    public Integer getWay() {
        return way;
    }

    /** 设置 支付途径 0 : ios; 1 : android; 2 : h5 */
    public void setWay(Integer way) {
        this.way = way;
    }

    /** 获取 订单状态 0 : 订单生成未支付; 1 : 已支付 */
    public Integer getState() {
        return state;
    }

    /** 设置 订单状态 0 : 订单生成未支付; 1 : 已支付 */
    public void setState(Integer state) {
        this.state = state;
    }

    /** 获取 回调后收到的微信支付单号 */
    public String getTransactionId() {
        return transactionId;
    }

    /** 设置 回调后收到的微信支付单号 */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /** 获取 回调时间 */
    public Date getTransactionTime() {
        return transactionTime;
    }

    /** 设置 回调时间 */
    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    /** 获取 订单类型【0答谢订单默认，1购买订单】 */
    public Integer getOrderType() {
        return orderType;
    }

    /** 设置 订单类型【0答谢订单默认，1购买订单】 */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /** 获取 退款状态【0未退款，1已退款】 */
    public Integer getRefundState() {
        return refundState;
    }

    /** 设置 退款状态【0未退款，1已退款】 */
    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    /** 获取 退款总金额 */
    public Double getRefoudFee() {
        return refoudFee;
    }

    /** 设置 退款总金额 */
    public void setRefoudFee(Double refoudFee) {
        this.refoudFee = refoudFee;
    }

    /** 获取 客户端支付时间 */
    public Date getClientPayTime() {
        return clientPayTime;
    }

    /** 设置 客户端支付时间 */
    public void setClientPayTime(Date clientPayTime) {
        this.clientPayTime = clientPayTime;
    }

    /** 获取 微信平台的支付状态码 */
    public String getClientTradeState() {
        return clientTradeState;
    }

    /** 设置 微信平台的支付状态码 */
    public void setClientTradeState(String clientTradeState) {
        this.clientTradeState = clientTradeState;
    }

    /** 获取 客户端的支付状态1已支付 */
    public Integer getClientPayState() {
        return clientPayState;
    }

    /** 设置 客户端的支付状态1已支付 */
    public void setClientPayState(Integer clientPayState) {
        this.clientPayState = clientPayState;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdWxOrderVO");
        sb.append("{id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", topicInfoId=").append(topicInfoId);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", body=").append(body);
        sb.append(", createTime=").append(createTime);
        sb.append(", way=").append(way);
        sb.append(", state=").append(state);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", transactionTime=").append(transactionTime);
        sb.append(", orderType=").append(orderType);
        sb.append(", refundState=").append(refundState);
        sb.append(", refoudFee=").append(refoudFee);
        sb.append(", clientPayTime=").append(clientPayTime);
        sb.append(", clientTradeState=").append(clientTradeState);
        sb.append(", clientPayState=").append(clientPayState);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdWxOrderVO) {
            YdWxOrderVO ydWxOrder = (YdWxOrderVO) obj;
            if (this.getId().equals(ydWxOrder.getId())) {
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