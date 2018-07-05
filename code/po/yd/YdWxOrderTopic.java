package com.yundong.payment.vo;


import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：yd_wx_order_topic
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class YdWxOrderTopicVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 订单主表id
    private Integer wxOrderId;
    // 图片id
    private Integer topicInfoId;
    // 原始图片上传完成【0未完成，1已完成，2不处理】
    private Integer isOrigin;
    // 图片单价
    private Double price;
    // 是否已退款0未退1已退
    private Integer isRefund;
    // 无水印高清图地址
    private String urlHqOrigin;
    // 高清图大小
    private Integer hqSize;
    // 原图地址
    private String urlNoWatermark;
    // 原图大小,取origin_size 值
    private Integer noWatermarkSize;
    // 是否已分成0为分成1已分成
    private Integer isShare;
    // 是否使用打印卷
    private Integer isPrint;

    /** 获取 订单主表id */
    public Integer getWxOrderId() {
        return wxOrderId;
    }

    /** 设置 订单主表id */
    public void setWxOrderId(Integer wxOrderId) {
        this.wxOrderId = wxOrderId;
    }

    /** 获取 图片id */
    public Integer getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 图片id */
    public void setTopicInfoId(Integer topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取 原始图片上传完成【0未完成，1已完成，2不处理】 */
    public Integer getIsOrigin() {
        return isOrigin;
    }

    /** 设置 原始图片上传完成【0未完成，1已完成，2不处理】 */
    public void setIsOrigin(Integer isOrigin) {
        this.isOrigin = isOrigin;
    }

    /** 获取 图片单价 */
    public Double getPrice() {
        return price;
    }

    /** 设置 图片单价 */
    public void setPrice(Double price) {
        this.price = price;
    }

    /** 获取 是否已退款0未退1已退 */
    public Integer getIsRefund() {
        return isRefund;
    }

    /** 设置 是否已退款0未退1已退 */
    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    /** 获取 无水印高清图地址 */
    public String getUrlHqOrigin() {
        return urlHqOrigin;
    }

    /** 设置 无水印高清图地址 */
    public void setUrlHqOrigin(String urlHqOrigin) {
        this.urlHqOrigin = urlHqOrigin;
    }

    /** 获取 高清图大小 */
    public Integer getHqSize() {
        return hqSize;
    }

    /** 设置 高清图大小 */
    public void setHqSize(Integer hqSize) {
        this.hqSize = hqSize;
    }

    /** 获取 原图地址 */
    public String getUrlNoWatermark() {
        return urlNoWatermark;
    }

    /** 设置 原图地址 */
    public void setUrlNoWatermark(String urlNoWatermark) {
        this.urlNoWatermark = urlNoWatermark;
    }

    /** 获取 原图大小,取origin_size 值 */
    public Integer getNoWatermarkSize() {
        return noWatermarkSize;
    }

    /** 设置 原图大小,取origin_size 值 */
    public void setNoWatermarkSize(Integer noWatermarkSize) {
        this.noWatermarkSize = noWatermarkSize;
    }

    /** 获取 是否已分成0为分成1已分成 */
    public Integer getIsShare() {
        return isShare;
    }

    /** 设置 是否已分成0为分成1已分成 */
    public void setIsShare(Integer isShare) {
        this.isShare = isShare;
    }

    /** 获取 是否使用打印卷 */
    public Integer getIsPrint() {
        return isPrint;
    }

    /** 设置 是否使用打印卷 */
    public void setIsPrint(Integer isPrint) {
        this.isPrint = isPrint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdWxOrderTopicVO");
        sb.append("{wxOrderId=").append(wxOrderId);
        sb.append(", topicInfoId=").append(topicInfoId);
        sb.append(", isOrigin=").append(isOrigin);
        sb.append(", price=").append(price);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", urlHqOrigin=").append(urlHqOrigin);
        sb.append(", hqSize=").append(hqSize);
        sb.append(", urlNoWatermark=").append(urlNoWatermark);
        sb.append(", noWatermarkSize=").append(noWatermarkSize);
        sb.append(", isShare=").append(isShare);
        sb.append(", isPrint=").append(isPrint);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdWxOrderTopicVO) {
            YdWxOrderTopicVO ydWxOrderTopic = (YdWxOrderTopicVO) obj;
            if (this.getWxOrderId().equals(ydWxOrderTopic.getWxOrderId()) && this.getTopicInfoId().equals(ydWxOrderTopic.getTopicInfoId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getWxOrderId() + this.getTopicInfoId();
        return pkStr.hashCode();
    }

}