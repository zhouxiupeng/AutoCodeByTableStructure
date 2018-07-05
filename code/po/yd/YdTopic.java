package com.yundong.api.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【话题】持久化对象 数据库表：yd_topic
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-07
 * 
 */
public class YdTopicVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 
    private String title;
    // 副标题
    private String subtitle;
    // 
    private String portalPic;
    // 置顶时的文字图片链接
    private String headerTitle;
    // 
    private String detail;
    // 
    private String poster;
    // 0：黑色；1：白色
    private String fontColor;
    // 
    private Integer creater;
    // 关联活动id，没有则为null
    private Long activityId;
    // 0：无效；1：有效；2:已删除
    private Integer status;
    // 
    private Date createTime;
    // 
    private Date updateTime;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取  */
    public String getTitle() {
        return title;
    }

    /** 设置  */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 获取 副标题 */
    public String getSubtitle() {
        return subtitle;
    }

    /** 设置 副标题 */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /** 获取  */
    public String getPortalPic() {
        return portalPic;
    }

    /** 设置  */
    public void setPortalPic(String portalPic) {
        this.portalPic = portalPic;
    }

    /** 获取 置顶时的文字图片链接 */
    public String getHeaderTitle() {
        return headerTitle;
    }

    /** 设置 置顶时的文字图片链接 */
    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    /** 获取  */
    public String getDetail() {
        return detail;
    }

    /** 设置  */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /** 获取  */
    public String getPoster() {
        return poster;
    }

    /** 设置  */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /** 获取 0：黑色；1：白色 */
    public String getFontColor() {
        return fontColor;
    }

    /** 设置 0：黑色；1：白色 */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /** 获取  */
    public Integer getCreater() {
        return creater;
    }

    /** 设置  */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /** 获取 关联活动id，没有则为null */
    public Long getActivityId() {
        return activityId;
    }

    /** 设置 关联活动id，没有则为null */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /** 获取 0：无效；1：有效；2:已删除 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 0：无效；1：有效；2:已删除 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append("YdTopicVO");
        sb.append("{id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", portalPic=").append(portalPic);
        sb.append(", headerTitle=").append(headerTitle);
        sb.append(", detail=").append(detail);
        sb.append(", poster=").append(poster);
        sb.append(", fontColor=").append(fontColor);
        sb.append(", creater=").append(creater);
        sb.append(", activityId=").append(activityId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdTopicVO) {
            YdTopicVO ydTopic = (YdTopicVO) obj;
            if (this.getId().equals(ydTopic.getId())) {
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