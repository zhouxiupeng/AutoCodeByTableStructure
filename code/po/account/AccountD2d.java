package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【】持久化对象 数据库表：account_d2d
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-03
 * 
 */
public class AccountD2dVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 
    private Date createTime;
    // 
    private Integer uid;
    // 来自uid
    private Integer fuid;
    // 0:提现；1:红包答谢; 2:冲抵；3:津贴;4:答谢分成5客户购买
    private Integer type;
    // 金额分
    private Integer money;
    // 状态：0 未操作；1 成功 ； 2 失败 ；3 接受申请
    private Integer status;
    // 
    private String comment;
    // 
    private String idCard;
    // 
    private String name;
    // 
    private String bank;
    // 操作时间
    private Date operationTime;
    // 操作人员uid
    private Integer ydAdminUid;
    // 冲抵号
    private Integer chargeAgainst;
    // 流水表记录微信订单ID,以便来源排查
    private Integer ydWxOrderId;
    // 赛事id
    private Integer activityId;
    // 图片id
    private Integer topicInfoId;
    // 
    private Integer isCheck;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
        this.id = id;
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
    public Integer getUid() {
        return uid;
    }

    /** 设置  */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /** 获取 来自uid */
    public Integer getFuid() {
        return fuid;
    }

    /** 设置 来自uid */
    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }

    /** 获取 0:提现；1:红包答谢; 2:冲抵；3:津贴;4:答谢分成5客户购买 */
    public Integer getType() {
        return type;
    }

    /** 设置 0:提现；1:红包答谢; 2:冲抵；3:津贴;4:答谢分成5客户购买 */
    public void setType(Integer type) {
        this.type = type;
    }

    /** 获取 金额分 */
    public Integer getMoney() {
        return money;
    }

    /** 设置 金额分 */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /** 获取 状态：0 未操作；1 成功 ； 2 失败 ；3 接受申请 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 状态：0 未操作；1 成功 ； 2 失败 ；3 接受申请 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取  */
    public String getComment() {
        return comment;
    }

    /** 设置  */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 获取  */
    public String getIdCard() {
        return idCard;
    }

    /** 设置  */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /** 获取  */
    public String getName() {
        return name;
    }

    /** 设置  */
    public void setName(String name) {
        this.name = name;
    }

    /** 获取  */
    public String getBank() {
        return bank;
    }

    /** 设置  */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /** 获取 操作时间 */
    public Date getOperationTime() {
        return operationTime;
    }

    /** 设置 操作时间 */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /** 获取 操作人员uid */
    public Integer getYdAdminUid() {
        return ydAdminUid;
    }

    /** 设置 操作人员uid */
    public void setYdAdminUid(Integer ydAdminUid) {
        this.ydAdminUid = ydAdminUid;
    }

    /** 获取 冲抵号 */
    public Integer getChargeAgainst() {
        return chargeAgainst;
    }

    /** 设置 冲抵号 */
    public void setChargeAgainst(Integer chargeAgainst) {
        this.chargeAgainst = chargeAgainst;
    }

    /** 获取 流水表记录微信订单ID,以便来源排查 */
    public Integer getYdWxOrderId() {
        return ydWxOrderId;
    }

    /** 设置 流水表记录微信订单ID,以便来源排查 */
    public void setYdWxOrderId(Integer ydWxOrderId) {
        this.ydWxOrderId = ydWxOrderId;
    }

    /** 获取 赛事id */
    public Integer getActivityId() {
        return activityId;
    }

    /** 设置 赛事id */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /** 获取 图片id */
    public Integer getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 图片id */
    public void setTopicInfoId(Integer topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取  */
    public Integer getIsCheck() {
        return isCheck;
    }

    /** 设置  */
    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AccountD2dVO");
        sb.append("{id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", uid=").append(uid);
        sb.append(", fuid=").append(fuid);
        sb.append(", type=").append(type);
        sb.append(", money=").append(money);
        sb.append(", status=").append(status);
        sb.append(", comment=").append(comment);
        sb.append(", idCard=").append(idCard);
        sb.append(", name=").append(name);
        sb.append(", bank=").append(bank);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", ydAdminUid=").append(ydAdminUid);
        sb.append(", chargeAgainst=").append(chargeAgainst);
        sb.append(", ydWxOrderId=").append(ydWxOrderId);
        sb.append(", activityId=").append(activityId);
        sb.append(", topicInfoId=").append(topicInfoId);
        sb.append(", isCheck=").append(isCheck);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountD2dVO) {
            AccountD2dVO accountD2d = (AccountD2dVO) obj;
            if (this.getId().equals(accountD2d.getId())) {
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