package com.gf.crm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 * 线索主信息表
 *
 * @author 阿甘
 * @email zhaoyf@weilaicheng.com
 * @date 2019-03-15 10:38:53
 */
@TableName("clue")
public class ClueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private String id;
    /**
     * 原来系统的线索ID
     */
    private String accountId;
    /**
     * 线索来源渠道组ID
     */
    private String channelId;
    /**
     * 线索来源三级以下的渠道组ID
     */
    private String childChannelId;
    /**
     * 线索池ID
     */
    private String cluePoolId;
    /**
     * 线索阶段
     */
    private String stage;
    /**
     * 线索状态
     */
    private String status;
    /**
     * 线索注册时间
     */
    private Date registeredTime;
    /**
     * 线索创建时间
     */
    private Date createdTime;
    /**
     * 创建者
     */
    private String creatorId;
    /**
     * 最后修改时间
     */
    private Date lastUpdatedTime;
    /**
     * 最后修改人
     */
    private String lastUpdaterId;
    /**
     * 支付时间
     */
    private Date paidTime;
    /**
     * 线索归属人ID
     */
    private String userId;
    /**
     * 是否废弃
     */
    private String discard;
    /**
     * 废弃前的用户ID
     */
    private String beforeDiscardUserId;
    /**
     * 废弃者
     */
    private String discardedId;
    /**
     * 废弃时间
     */
    private Date discardedTime;
    /**
     * 废弃原因
     */
    private String descardCause;
    /**
     * 意向度
     */
    private String intentionality;
    /**
     * 拨打次数
     */
    private Integer dialledNum;
    /**
     * 接通次数
     */
    private Integer connectedNum;
    /**
     * 有效次数
     */
    private Integer validNum;
    /**
     * 设备检测次数
     */
    private Integer testNum;
    /**
     * 体验课次数
     */
    private Integer experienceNum;
    /**
     * 正式课次数
     */
    private Integer formalNum;
    /**
     * 回滚次数
     */
    private Integer rollBackNum;
    /**
     * 线索反馈
     */
    private String feedback;
    /**
     * 线索反馈来源
     */
    private String feedbackSource;
    /**
     *
     */
    private String note;

    /**
     * 设置：
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public String getId() {
        return id;
    }

    /**
     * 设置：原来系统的线索ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取：原来系统的线索ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置：线索来源渠道组ID
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取：线索来源渠道组ID
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置：线索来源三级以下的渠道组ID
     */
    public void setChildChannelId(String childChannelId) {
        this.childChannelId = childChannelId;
    }

    /**
     * 获取：线索来源三级以下的渠道组ID
     */
    public String getChildChannelId() {
        return childChannelId;
    }

    /**
     * 设置：线索池ID
     */
    public void setCluePoolId(String cluePoolId) {
        this.cluePoolId = cluePoolId;
    }

    /**
     * 获取：线索池ID
     */
    public String getCluePoolId() {
        return cluePoolId;
    }

    /**
     * 设置：线索阶段
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * 获取：线索阶段
     */
    public String getStage() {
        return stage;
    }

    /**
     * 设置：线索状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：线索状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置：线索注册时间
     */
    public void setRegisteredTime(Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    /**
     * 获取：线索注册时间
     */
    public Date getRegisteredTime() {
        return registeredTime;
    }

    /**
     * 设置：线索创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取：线索创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置：创建者
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取：创建者
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置：最后修改时间
     */
    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * 获取：最后修改时间
     */
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * 设置：最后修改人
     */
    public void setLastUpdaterId(String lastUpdaterId) {
        this.lastUpdaterId = lastUpdaterId;
    }

    /**
     * 获取：最后修改人
     */
    public String getLastUpdaterId() {
        return lastUpdaterId;
    }

    /**
     * 设置：支付时间
     */
    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    /**
     * 获取：支付时间
     */
    public Date getPaidTime() {
        return paidTime;
    }

    /**
     * 设置：线索归属人ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取：线索归属人ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置：是否废弃
     */
    public void setDiscard(String discard) {
        this.discard = discard;
    }

    /**
     * 获取：是否废弃
     */
    public String getDiscard() {
        return discard;
    }

    /**
     * 设置：废弃前的用户ID
     */
    public void setBeforeDiscardUserId(String beforeDiscardUserId) {
        this.beforeDiscardUserId = beforeDiscardUserId;
    }

    /**
     * 获取：废弃前的用户ID
     */
    public String getBeforeDiscardUserId() {
        return beforeDiscardUserId;
    }

    /**
     * 设置：废弃者
     */
    public void setDiscardedId(String discardedId) {
        this.discardedId = discardedId;
    }

    /**
     * 获取：废弃者
     */
    public String getDiscardedId() {
        return discardedId;
    }

    /**
     * 设置：废弃时间
     */
    public void setDiscardedTime(Date discardedTime) {
        this.discardedTime = discardedTime;
    }

    /**
     * 获取：废弃时间
     */
    public Date getDiscardedTime() {
        return discardedTime;
    }

    /**
     * 设置：废弃原因
     */
    public void setDescardCause(String descardCause) {
        this.descardCause = descardCause;
    }

    /**
     * 获取：废弃原因
     */
    public String getDescardCause() {
        return descardCause;
    }

    /**
     * 设置：意向度
     */
    public void setIntentionality(String intentionality) {
        this.intentionality = intentionality;
    }

    /**
     * 获取：意向度
     */
    public String getIntentionality() {
        return intentionality;
    }

    /**
     * 设置：拨打次数
     */
    public void setDialledNum(Integer dialledNum) {
        this.dialledNum = dialledNum;
    }

    /**
     * 获取：拨打次数
     */
    public Integer getDialledNum() {
        return dialledNum;
    }

    /**
     * 设置：接通次数
     */
    public void setConnectedNum(Integer connectedNum) {
        this.connectedNum = connectedNum;
    }

    /**
     * 获取：接通次数
     */
    public Integer getConnectedNum() {
        return connectedNum;
    }

    /**
     * 设置：有效次数
     */
    public void setValidNum(Integer validNum) {
        this.validNum = validNum;
    }

    /**
     * 获取：有效次数
     */
    public Integer getValidNum() {
        return validNum;
    }

    /**
     * 设置：设备检测次数
     */
    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }

    /**
     * 获取：设备检测次数
     */
    public Integer getTestNum() {
        return testNum;
    }

    /**
     * 设置：体验课次数
     */
    public void setExperienceNum(Integer experienceNum) {
        this.experienceNum = experienceNum;
    }

    /**
     * 获取：体验课次数
     */
    public Integer getExperienceNum() {
        return experienceNum;
    }

    /**
     * 设置：正式课次数
     */
    public void setFormalNum(Integer formalNum) {
        this.formalNum = formalNum;
    }

    /**
     * 获取：正式课次数
     */
    public Integer getFormalNum() {
        return formalNum;
    }

    /**
     * 设置：回滚次数
     */
    public void setRollBackNum(Integer rollBackNum) {
        this.rollBackNum = rollBackNum;
    }

    /**
     * 获取：回滚次数
     */
    public Integer getRollBackNum() {
        return rollBackNum;
    }

    /**
     * 设置：线索反馈
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * 获取：线索反馈
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * 设置：线索反馈来源
     */
    public void setFeedbackSource(String feedbackSource) {
        this.feedbackSource = feedbackSource;
    }

    /**
     * 获取：线索反馈来源
     */
    public String getFeedbackSource() {
        return feedbackSource;
    }

    /**
     * 设置：
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取：
     */
    public String getNote() {
        return note;
    }
}
