package com.yundong.m1_core.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【考试时变量参数信息】持久化对象 数据库表：m_assessment_parameters
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MAssessmentParametersVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Long id;
    // 考核周期
    private String assessTime;
    // 
    private Date createTime;
    // 参数集合,json 格式保存
    private String parameters;
    // 服务器ip信息，每台服务器记录自己的参数信息
    private String serverIp;

    /** 获取  */
    public Long getId() {
        return id;
    }

    /** 设置  */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取 考核周期 */
    public String getAssessTime() {
        return assessTime;
    }

    /** 设置 考核周期 */
    public void setAssessTime(String assessTime) {
        this.assessTime = assessTime;
    }

    /** 获取  */
    public Date getCreateTime() {
        return createTime;
    }

    /** 设置  */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 获取 参数集合,json 格式保存 */
    public String getParameters() {
        return parameters;
    }

    /** 设置 参数集合,json 格式保存 */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /** 获取 服务器ip信息，每台服务器记录自己的参数信息 */
    public String getServerIp() {
        return serverIp;
    }

    /** 设置 服务器ip信息，每台服务器记录自己的参数信息 */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MAssessmentParametersVO");
        sb.append("{id=").append(id);
        sb.append(", assessTime=").append(assessTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", parameters=").append(parameters);
        sb.append(", serverIp=").append(serverIp);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MAssessmentParametersVO) {
            MAssessmentParametersVO mAssessmentParameters = (MAssessmentParametersVO) obj;
            if (this.getId().equals(mAssessmentParameters.getId())) {
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