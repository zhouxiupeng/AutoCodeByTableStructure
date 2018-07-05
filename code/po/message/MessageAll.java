package com.yundong.payment.vo;

import java.util.Date;

import java.io.Serializable;

/**
 * 【所有用户消息汇总表，当前包含push消息，短信消息，还可能包含邮件消息


message_type=8 动态定价 答谢者收到的下载推送
message_type=9 动态定价 被答谢者收到的红包推送】持久化对象 数据库表：message_all
 * 
 * @author 代码自动生成 113857118@qq.com 
 * @date 2018-04
 * 
 */
public class MessageAllVO implements Serializable {

    public static final long serialVersionUID = 1L;

    // 
    private Integer id;
    // 接收消息用户，app
    private String receiverId;
    // 标题
    private String title;
    // 具体的消息内容
    private String content;
    // 图片url
    private String imgUrl;
    // 缩略图片url
    private String imgMinUrl;
    // 详细消息类型,记录某事件对应的消息类型，暂时没有定义（6001-6999）
    private Integer type;
    // 消息类型 0:其他，1：push消息，2：sms ，3：email
    private Integer msgType;
    // 消息发送者pk app uid值，也可能是sys等
    private String senderId;
    // 消息发送者姓名
    private String senderName;
    // 发送状态 0：正确，1：错误   2:删除
    private Integer status;
    // 读取消息标识 0：未读，1：已读
    private Integer isread;
    // 消息分组：1：pk相关，2：系统消息
    private Integer group;
    // 点击内容的跳转方式， 0：不跳转，1：跳转到外部url（webview），2：跳转到app内部页面
    private Integer redirectType;
    // 点击内容跳转的url，如果redirect_type=1,此值是一个完整的url；如果是app内部的跳转，此处是参数key，value的串，例如：message_type=1&pkid=1
    private String redirectUri;
    // 简介内容
    private String summary;
    // 创建时间
    private Date createtime;
    // 创建时间
    private Date updatetime;
    // 图片活动id
    private Long topicInfoId;
    // 消息类型id
    private Integer messageType;
    // 是否评论
    private Integer isComment;

    /** 获取  */
    public Integer getId() {
        return id;
    }

    /** 设置  */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 获取 接收消息用户，app */
    public String getReceiverId() {
        return receiverId;
    }

    /** 设置 接收消息用户，app */
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    /** 获取 标题 */
    public String getTitle() {
        return title;
    }

    /** 设置 标题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 获取 具体的消息内容 */
    public String getContent() {
        return content;
    }

    /** 设置 具体的消息内容 */
    public void setContent(String content) {
        this.content = content;
    }

    /** 获取 图片url */
    public String getImgUrl() {
        return imgUrl;
    }

    /** 设置 图片url */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /** 获取 缩略图片url */
    public String getImgMinUrl() {
        return imgMinUrl;
    }

    /** 设置 缩略图片url */
    public void setImgMinUrl(String imgMinUrl) {
        this.imgMinUrl = imgMinUrl;
    }

    /** 获取 详细消息类型,记录某事件对应的消息类型，暂时没有定义（6001-6999） */
    public Integer getType() {
        return type;
    }

    /** 设置 详细消息类型,记录某事件对应的消息类型，暂时没有定义（6001-6999） */
    public void setType(Integer type) {
        this.type = type;
    }

    /** 获取 消息类型 0:其他，1：push消息，2：sms ，3：email */
    public Integer getMsgType() {
        return msgType;
    }

    /** 设置 消息类型 0:其他，1：push消息，2：sms ，3：email */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /** 获取 消息发送者pk app uid值，也可能是sys等 */
    public String getSenderId() {
        return senderId;
    }

    /** 设置 消息发送者pk app uid值，也可能是sys等 */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /** 获取 消息发送者姓名 */
    public String getSenderName() {
        return senderName;
    }

    /** 设置 消息发送者姓名 */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /** 获取 发送状态 0：正确，1：错误   2:删除 */
    public Integer getStatus() {
        return status;
    }

    /** 设置 发送状态 0：正确，1：错误   2:删除 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 获取 读取消息标识 0：未读，1：已读 */
    public Integer getIsread() {
        return isread;
    }

    /** 设置 读取消息标识 0：未读，1：已读 */
    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    /** 获取 消息分组：1：pk相关，2：系统消息 */
    public Integer getGroup() {
        return group;
    }

    /** 设置 消息分组：1：pk相关，2：系统消息 */
    public void setGroup(Integer group) {
        this.group = group;
    }

    /** 获取 点击内容的跳转方式， 0：不跳转，1：跳转到外部url（webview），2：跳转到app内部页面 */
    public Integer getRedirectType() {
        return redirectType;
    }

    /** 设置 点击内容的跳转方式， 0：不跳转，1：跳转到外部url（webview），2：跳转到app内部页面 */
    public void setRedirectType(Integer redirectType) {
        this.redirectType = redirectType;
    }

    /** 获取 点击内容跳转的url，如果redirect_type=1,此值是一个完整的url；如果是app内部的跳转，此处是参数key，value的串，例如：message_type=1&pkid=1 */
    public String getRedirectUri() {
        return redirectUri;
    }

    /** 设置 点击内容跳转的url，如果redirect_type=1,此值是一个完整的url；如果是app内部的跳转，此处是参数key，value的串，例如：message_type=1&pkid=1 */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /** 获取 简介内容 */
    public String getSummary() {
        return summary;
    }

    /** 设置 简介内容 */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /** 获取 创建时间 */
    public Date getCreatetime() {
        return createtime;
    }

    /** 设置 创建时间 */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /** 获取 创建时间 */
    public Date getUpdatetime() {
        return updatetime;
    }

    /** 设置 创建时间 */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /** 获取 图片活动id */
    public Long getTopicInfoId() {
        return topicInfoId;
    }

    /** 设置 图片活动id */
    public void setTopicInfoId(Long topicInfoId) {
        this.topicInfoId = topicInfoId;
    }

    /** 获取 消息类型id */
    public Integer getMessageType() {
        return messageType;
    }

    /** 设置 消息类型id */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /** 获取 是否评论 */
    public Integer getIsComment() {
        return isComment;
    }

    /** 设置 是否评论 */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MessageAllVO");
        sb.append("{id=").append(id);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", imgMinUrl=").append(imgMinUrl);
        sb.append(", type=").append(type);
        sb.append(", msgType=").append(msgType);
        sb.append(", senderId=").append(senderId);
        sb.append(", senderName=").append(senderName);
        sb.append(", status=").append(status);
        sb.append(", isread=").append(isread);
        sb.append(", group=").append(group);
        sb.append(", redirectType=").append(redirectType);
        sb.append(", redirectUri=").append(redirectUri);
        sb.append(", summary=").append(summary);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", topicInfoId=").append(topicInfoId);
        sb.append(", messageType=").append(messageType);
        sb.append(", isComment=").append(isComment);
        sb.append('}');
        return sb.toString();
    }

   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageAllVO) {
            MessageAllVO messageAll = (MessageAllVO) obj;
            if (this.getId().equals(messageAll.getId()) && this.getCreatetime().equals(messageAll.getCreatetime())) {
                return true;
            }
        }
        return false;
    }*/

    public int hashCode() {
        String pkStr = "" + this.getId() + this.getCreatetime();
        return pkStr.hashCode();
    }

}