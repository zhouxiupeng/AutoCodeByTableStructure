package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【付款对账】持久化对象 数据库表：ufm_pay_record
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class UfmPayRecordVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 商户号
    private String merId;
    // 交易类型
    private String funCode;
    // 商户下单时提交的orderId
    private String orderId;
    // 商户下单时提交的merDate
    private String merDate;
    // 付款金额，以分为单位
    private Long amount;
    // 付款的手续费，金额以分为单位
    private Integer comAmt;
    // 交易的对账日期
    private Date transferSettleDate;
    // 账户记账日期
    private Date transferAccDate;
    // 交易状态
    private String transState;
    // 联动的流水号
    private String tradeNo;
    // 手续费承担方	1- 手续费从现金账户扣除2- 手续费从手续费账户扣除
    private Integer comAmtType;
    // 支付产品编号	联动定义的支付产品
    private String productId;

    /** 获取 商户号 */
    public String getMerId() {
        return merId;
    }

    /** 设置 商户号 */
    public void setMerId(String merId) {
        this.merId = merId;
    }

    /** 获取 交易类型 */
    public String getFunCode() {
        return funCode;
    }

    /** 设置 交易类型 */
    public void setFunCode(String funCode) {
        this.funCode = funCode;
    }

    /** 获取 商户下单时提交的orderId */
    public String getOrderId() {
        return orderId;
    }

    /** 设置 商户下单时提交的orderId */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /** 获取 商户下单时提交的merDate */
    public String getMerDate() {
        return merDate;
    }

    /** 设置 商户下单时提交的merDate */
    public void setMerDate(String merDate) {
        this.merDate = merDate;
    }

    /** 获取 付款金额，以分为单位 */
    public Long getAmount() {
        return amount;
    }

    /** 设置 付款金额，以分为单位 */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /** 获取 付款的手续费，金额以分为单位 */
    public Integer getComAmt() {
        return comAmt;
    }

    /** 设置 付款的手续费，金额以分为单位 */
    public void setComAmt(Integer comAmt) {
        this.comAmt = comAmt;
    }

    /** 获取 交易的对账日期 */
    public Date getTransferSettleDate() {
        return transferSettleDate;
    }

    /** 设置 交易的对账日期 */
    public void setTransferSettleDate(Date transferSettleDate) {
        this.transferSettleDate = transferSettleDate;
    }

    /** 获取 账户记账日期 */
    public Date getTransferAccDate() {
        return transferAccDate;
    }

    /** 设置 账户记账日期 */
    public void setTransferAccDate(Date transferAccDate) {
        this.transferAccDate = transferAccDate;
    }

    /** 获取 交易状态 */
    public String getTransState() {
        return transState;
    }

    /** 设置 交易状态 */
    public void setTransState(String transState) {
        this.transState = transState;
    }

    /** 获取 联动的流水号 */
    public String getTradeNo() {
        return tradeNo;
    }

    /** 设置 联动的流水号 */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /** 获取 手续费承担方	1- 手续费从现金账户扣除2- 手续费从手续费账户扣除 */
    public Integer getComAmtType() {
        return comAmtType;
    }

    /** 设置 手续费承担方	1- 手续费从现金账户扣除2- 手续费从手续费账户扣除 */
    public void setComAmtType(Integer comAmtType) {
        this.comAmtType = comAmtType;
    }

    /** 获取 支付产品编号	联动定义的支付产品 */
    public String getProductId() {
        return productId;
    }

    /** 设置 支付产品编号	联动定义的支付产品 */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UfmPayRecordVO");
        sb.append("{merId=").append(merId);
        sb.append(", funCode=").append(funCode);
        sb.append(", orderId=").append(orderId);
        sb.append(", merDate=").append(merDate);
        sb.append(", amount=").append(amount);
        sb.append(", comAmt=").append(comAmt);
        sb.append(", transferSettleDate=").append(transferSettleDate);
        sb.append(", transferAccDate=").append(transferAccDate);
        sb.append(", transState=").append(transState);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", comAmtType=").append(comAmtType);
        sb.append(", productId=").append(productId);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UfmPayRecordVO) {
            UfmPayRecordVO ufmPayRecord = (UfmPayRecordVO) obj;
            if (this.getOrderId().equals(ufmPayRecord.getOrderId())) {
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