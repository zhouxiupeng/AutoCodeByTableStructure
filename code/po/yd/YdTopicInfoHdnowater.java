package com.yundong.api.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：yd_topic_info_hdnowater
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdTopicInfoHdnowaterVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 图片表主键
    private Long topicInfoId;
    // 无水印高清图地址
    private String urlHdNowater;
    // 无水印高清图大小
    private Integer hdNowatersize;
    // 上传来源
    private Integer source;
    // 无水印1920超高清图地址
    private String urlUhdNowater;
    // 无水印1920超高清图大小
    private Integer uhdNowatersize;
    // 上传时间
    private Date createTime;

    /** 获取 图片表主键 */
    public Long getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 图片表主键 */
    public void setTopicInfoId(Long topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取 无水印高清图地址 */
    public String getUrlHdNowater() {
        return urlHdNowater;
    }

    /** 设置 无水印高清图地址 */
    public void setUrlHdNowater(String urlHdNowater) {
        this.urlHdNowater = urlHdNowater;
    }

    /** 获取 无水印高清图大小 */
    public Integer getHdNowatersize() {
        return hdNowatersize;
    }

    /** 设置 无水印高清图大小 */
    public void setHdNowatersize(Integer hdNowatersize) {
        this.hdNowatersize = hdNowatersize;
    }

    /** 获取 上传来源 */
    public Integer getSource() {
        return source;
    }

    /** 设置 上传来源 */
    public void setSource(Integer source) {
        this.source = source;
    }

    /** 获取 无水印1920超高清图地址 */
    public String getUrlUhdNowater() {
        return urlUhdNowater;
    }

    /** 设置 无水印1920超高清图地址 */
    public void setUrlUhdNowater(String urlUhdNowater) {
        this.urlUhdNowater = urlUhdNowater;
    }

    /** 获取 无水印1920超高清图大小 */
    public Integer getUhdNowatersize() {
        return uhdNowatersize;
    }

    /** 设置 无水印1920超高清图大小 */
    public void setUhdNowatersize(Integer uhdNowatersize) {
        this.uhdNowatersize = uhdNowatersize;
    }

    /** 获取 上传时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置 上传时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("YdTopicInfoHdnowaterVO");
        sb.append("{topicInfoId=").append(topicInfoId);
        sb.append(", urlHdNowater=").append(urlHdNowater);
        sb.append(", hdNowatersize=").append(hdNowatersize);
        sb.append(", source=").append(source);
        sb.append(", urlUhdNowater=").append(urlUhdNowater);
        sb.append(", uhdNowatersize=").append(uhdNowatersize);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdTopicInfoHdnowaterVO) {
            YdTopicInfoHdnowaterVO ydTopicInfoHdnowater = (YdTopicInfoHdnowaterVO) obj;
            if (this.getTopicInfoId().equals(ydTopicInfoHdnowater.getTopicInfoId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getTopicInfoId();
        return pkStr.hashCode();
    }

}