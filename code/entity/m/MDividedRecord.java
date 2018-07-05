package com.yundong.m1_core.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【分成明细记录表】持久化对象 数据库表：m_divided_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MDividedRecord implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 凭据号码
    private String evidenceId;
    // 生产者muid
    private Long producerMuid;
    // 生产者uid
    private Long producerUid;
    // 分成者muid
    private Long dividedMuid;
    // 分成者uid
    private Long dividedUid;
    // 创建时间
    private Date createTime;
    // 分成金额
    private Integer shareAmount;
    // 资金类型。1:答谢;2:购买;3:培育;4:辅导;5:成效
    private Integer shareType;
    // 收益
    private Integer profit;
    // 订单时间
    private Date orderCreateTime;
    // 分成比例
    private Integer proportions;
    // 购买者uid
    private Long buyerUid;
    // 单张图片的支付金额
    private Integer payment;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 凭据号码 */
    public String getEvidenceId() {
        return evidenceId;
    }

    /** 设置 凭据号码 */
    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    /** 获取 生产者muid */
    public Long getProducerMuid() {
        return producerMuid;
    }

    /** 设置 生产者muid */
    public void setProducerMuid(Long producerMuid) {
        this.producerMuid = producerMuid;
    }

    /** 获取 生产者uid */
    public Long getProducerUid() {
        return producerUid;
    }

    /** 设置 生产者uid */
    public void setProducerUid(Long producerUid) {
        this.producerUid = producerUid;
    }

    /** 获取 分成者muid */
    public Long getDividedMuid() {
        return dividedMuid;
    }

    /** 设置 分成者muid */
    public void setDividedMuid(Long dividedMuid) {
        this.dividedMuid = dividedMuid;
    }

    /** 获取 分成者uid */
    public Long getDividedUid() {
        return dividedUid;
    }

    /** 设置 分成者uid */
    public void setDividedUid(Long dividedUid) {
        this.dividedUid = dividedUid;
    }

    /** 获取 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 分成金额 */
    public Integer getShareAmount() {
        return shareAmount;
    }

    /** 设置 分成金额 */
    public void setShareAmount(Integer shareAmount) {
        this.shareAmount = shareAmount;
    }

    /** 获取 资金类型。1:答谢;2:购买;3:培育;4:辅导;5:成效 */
    public Integer getShareType() {
        return shareType;
    }

    /** 设置 资金类型。1:答谢;2:购买;3:培育;4:辅导;5:成效 */
    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    /** 获取 收益 */
    public Integer getProfit() {
        return profit;
    }

    /** 设置 收益 */
    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    /** 获取 订单时间 */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /** 设置 订单时间 */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /** 获取 分成比例 */
    public Integer getProportions() {
        return proportions;
    }

    /** 设置 分成比例 */
    public void setProportions(Integer proportions) {
        this.proportions = proportions;
    }

    /** 获取 购买者uid */
    public Long getBuyerUid() {
        return buyerUid;
    }

    /** 设置 购买者uid */
    public void setBuyerUid(Long buyerUid) {
        this.buyerUid = buyerUid;
    }

    /** 获取 单张图片的支付金额 */
    public Integer getPayment() {
        return payment;
    }

    /** 设置 单张图片的支付金额 */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MDividedRecord");
        sb.append("{id=").append(id);
        sb.append(", evidenceId=").append(evidenceId);
        sb.append(", producerMuid=").append(producerMuid);
        sb.append(", producerUid=").append(producerUid);
        sb.append(", dividedMuid=").append(dividedMuid);
        sb.append(", dividedUid=").append(dividedUid);
        sb.append(", createTime=").append(createTime);
        sb.append(", shareAmount=").append(shareAmount);
        sb.append(", shareType=").append(shareType);
        sb.append(", profit=").append(profit);
        sb.append(", orderCreateTime=").append(orderCreateTime);
        sb.append(", proportions=").append(proportions);
        sb.append(", buyerUid=").append(buyerUid);
        sb.append(", payment=").append(payment);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MDividedRecord) {
            MDividedRecord mDividedRecord = (MDividedRecord) obj;
            if (this.getId().equals(mDividedRecord.getId())) {
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