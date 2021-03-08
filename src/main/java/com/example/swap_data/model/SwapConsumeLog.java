package com.example.swap_data.model;

import java.util.Date;

public class SwapConsumeLog {
    private Integer consumeId;

    private Integer accountId;

    private Integer orderId;

    private String scooterCode;

    private Integer consumeBefore;

    private Integer consumeValue;

    private Integer consumeLater;

    private Date consumeTime;

    private Date validityBefore;

    private Integer validityValue;

    private Date validityLater;

    private Integer mileageValue;

    private String consumeType;

    private String remark;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String startPoint;

    private String endPoint;

    private String payChannel;

    private String orderCode;

    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getScooterCode() {
        return scooterCode;
    }

    public void setScooterCode(String scooterCode) {
        this.scooterCode = scooterCode == null ? null : scooterCode.trim();
    }

    public Integer getConsumeBefore() {
        return consumeBefore;
    }

    public void setConsumeBefore(Integer consumeBefore) {
        this.consumeBefore = consumeBefore;
    }

    public Integer getConsumeValue() {
        return consumeValue;
    }

    public void setConsumeValue(Integer consumeValue) {
        this.consumeValue = consumeValue;
    }

    public Integer getConsumeLater() {
        return consumeLater;
    }

    public void setConsumeLater(Integer consumeLater) {
        this.consumeLater = consumeLater;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    public Date getValidityBefore() {
        return validityBefore;
    }

    public void setValidityBefore(Date validityBefore) {
        this.validityBefore = validityBefore;
    }

    public Integer getValidityValue() {
        return validityValue;
    }

    public void setValidityValue(Integer validityValue) {
        this.validityValue = validityValue;
    }

    public Date getValidityLater() {
        return validityLater;
    }

    public void setValidityLater(Date validityLater) {
        this.validityLater = validityLater;
    }

    public Integer getMileageValue() {
        return mileageValue;
    }

    public void setMileageValue(Integer mileageValue) {
        this.mileageValue = mileageValue;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType == null ? null : consumeType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint == null ? null : startPoint.trim();
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint == null ? null : endPoint.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }
}