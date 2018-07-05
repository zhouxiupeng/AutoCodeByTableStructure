package com.yundong.image.storage.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【图片meta信息表】持久化对象 数据库表：yd_meta_info
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class YdMetaInfoVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 图片id
    private Long id;
    // 元数据
    private String metaInfo;
    // 
    private Date createTime;

    /** 获取 图片id */
    public Long getId() {
        return id;
    }

    /** 设置 图片id */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 元数据 */
    public String getMetaInfo() {
        return metaInfo;
    }

    /** 设置 元数据 */
    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
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
        sb.append("YdMetaInfoVO");
        sb.append("{id=").append(id);
        sb.append(", metaInfo=").append(metaInfo);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdMetaInfoVO) {
            YdMetaInfoVO ydMetaInfo = (YdMetaInfoVO) obj;
            if (this.getId().equals(ydMetaInfo.getId())) {
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