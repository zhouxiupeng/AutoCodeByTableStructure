package com.yundong.payment.entity;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：activity
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class Activity implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 
    private String title;
    // 
    private Integer status;
    // 
    private Integer type;
    // 
    private Integer site;
    // 
    private Date start;
    // 
    private Date end;
    // 
    private Date createTime;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
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

    /** 获取  */
    public Integer getStatus() {
        return status;
    }

    /** 设置  */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取  */
    public Integer getType() {
        return type;
    }

    /** 设置  */
    public void setType(Integer type) {
        this.type = type;
    }

    /** 获取  */
    public Integer getSite() {
        return site;
    }

    /** 设置  */
    public void setSite(Integer site) {
        this.site = site;
    }

    /** 获取  */
    public Date getStart() {
        return start;
    }

    /** 设置  */
    public void setStart(Date start) {
        this.start = start;
    }

    /** 获取  */
    public Date getEnd() {
        return end;
    }

    /** 设置  */
    public void setEnd(Date end) {
        this.end = end;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Activity");
        sb.append("{id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", site=").append(site);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if () {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + ;
        return pkStr.hashCode();
    }

}