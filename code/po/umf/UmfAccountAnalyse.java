package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【联动支付系统账号对账数据的分析】持久化对象 数据库表：umf_account_analyse
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class UmfAccountAnalyseVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Date transferSettleDate;
    // 数据业务类型代码1支付2付款3验证4公司账号
    private Integer dataType;
    // 状态0失败1成功
    private Integer status;
    // 总交易次数

    private Integer allTradeFrequency;
    // 总交易金额
    private Long allTradeMoney;
    // 内扣总的服务费用
    private Integer allInServiceCharge;
    // 总外扣服务费用
    private Integer allOutServiceCharge;

    /** 获取  */
    public Date getTransferSettleDate() {
        return transferSettleDate;
    }

    /** 设置  */
    public void setTransferSettleDate(Date transferSettleDate) {
        this.transferSettleDate = transferSettleDate;
    }

    /** 获取 数据业务类型代码1支付2付款3验证4公司账号 */
    public Integer getDataType() {
        return dataType;
    }

    /** 设置 数据业务类型代码1支付2付款3验证4公司账号 */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /** 获取 状态0失败1成功 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态0失败1成功 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 总交易次数
 */
    public Integer getAllTradeFrequency() {
        return allTradeFrequency;
    }

    /** 设置 总交易次数
 */
    public void setAllTradeFrequency(Integer allTradeFrequency) {
        this.allTradeFrequency = allTradeFrequency;
    }

    /** 获取 总交易金额 */
    public Long getAllTradeMoney() {
        return allTradeMoney;
    }

    /** 设置 总交易金额 */
    public void setAllTradeMoney(Long allTradeMoney) {
        this.allTradeMoney = allTradeMoney;
    }

    /** 获取 内扣总的服务费用 */
    public Integer getAllInServiceCharge() {
        return allInServiceCharge;
    }

    /** 设置 内扣总的服务费用 */
    public void setAllInServiceCharge(Integer allInServiceCharge) {
        this.allInServiceCharge = allInServiceCharge;
    }

    /** 获取 总外扣服务费用 */
    public Integer getAllOutServiceCharge() {
        return allOutServiceCharge;
    }

    /** 设置 总外扣服务费用 */
    public void setAllOutServiceCharge(Integer allOutServiceCharge) {
        this.allOutServiceCharge = allOutServiceCharge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UmfAccountAnalyseVO");
        sb.append("{transferSettleDate=").append(transferSettleDate);
        sb.append(", dataType=").append(dataType);
        sb.append(", status=").append(status);
        sb.append(", allTradeFrequency=").append(allTradeFrequency);
        sb.append(", allTradeMoney=").append(allTradeMoney);
        sb.append(", allInServiceCharge=").append(allInServiceCharge);
        sb.append(", allOutServiceCharge=").append(allOutServiceCharge);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UmfAccountAnalyseVO) {
            UmfAccountAnalyseVO umfAccountAnalyse = (UmfAccountAnalyseVO) obj;
            if (this.getTransferSettleDate().equals(umfAccountAnalyse.getTransferSettleDate()) && this.getDataType().equals(umfAccountAnalyse.getDataType())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getTransferSettleDate() + this.getDataType();
        return pkStr.hashCode();
    }

}