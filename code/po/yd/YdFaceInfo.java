package com.yundong.image.storage.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【人脸特征信息表】持久化对象 数据库表：yd_face_info
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-06
 * 
 */
public class YdFaceInfoVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 图片id
    private Long id;
    // 人脸序号
    private Integer faceId;
    // 人脸坐标左侧值
    private Integer faceCoordLeft;
    // 人脸坐标上部值
    private Integer faceCoordTop;
    // 人脸坐标右侧值
    private Integer faceCoordRight;
    // 人脸坐标下部值
    private Integer faceCoordBottom;
    // 人脸特征
    private String faceEncodes;
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

    /** 获取 人脸序号 */
    public Integer getFaceId() {
        return faceId;
    }

    /** 设置 人脸序号 */
    public void setFaceId(Integer faceId) {
        this.faceId = faceId;
    }

    /** 获取 人脸坐标左侧值 */
    public Integer getFaceCoordLeft() {
        return faceCoordLeft;
    }

    /** 设置 人脸坐标左侧值 */
    public void setFaceCoordLeft(Integer faceCoordLeft) {
        this.faceCoordLeft = faceCoordLeft;
    }

    /** 获取 人脸坐标上部值 */
    public Integer getFaceCoordTop() {
        return faceCoordTop;
    }

    /** 设置 人脸坐标上部值 */
    public void setFaceCoordTop(Integer faceCoordTop) {
        this.faceCoordTop = faceCoordTop;
    }

    /** 获取 人脸坐标右侧值 */
    public Integer getFaceCoordRight() {
        return faceCoordRight;
    }

    /** 设置 人脸坐标右侧值 */
    public void setFaceCoordRight(Integer faceCoordRight) {
        this.faceCoordRight = faceCoordRight;
    }

    /** 获取 人脸坐标下部值 */
    public Integer getFaceCoordBottom() {
        return faceCoordBottom;
    }

    /** 设置 人脸坐标下部值 */
    public void setFaceCoordBottom(Integer faceCoordBottom) {
        this.faceCoordBottom = faceCoordBottom;
    }

    /** 获取 人脸特征 */
    public String getFaceEncodes() {
        return faceEncodes;
    }

    /** 设置 人脸特征 */
    public void setFaceEncodes(String faceEncodes) {
        this.faceEncodes = faceEncodes;
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
        sb.append("YdFaceInfoVO");
        sb.append("{id=").append(id);
        sb.append(", faceId=").append(faceId);
        sb.append(", faceCoordLeft=").append(faceCoordLeft);
        sb.append(", faceCoordTop=").append(faceCoordTop);
        sb.append(", faceCoordRight=").append(faceCoordRight);
        sb.append(", faceCoordBottom=").append(faceCoordBottom);
        sb.append(", faceEncodes=").append(faceEncodes);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YdFaceInfoVO) {
            YdFaceInfoVO ydFaceInfo = (YdFaceInfoVO) obj;
            if (this.getId().equals(ydFaceInfo.getId()) && this.getFaceId().equals(ydFaceInfo.getFaceId())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getId() + this.getFaceId();
        return pkStr.hashCode();
    }

}