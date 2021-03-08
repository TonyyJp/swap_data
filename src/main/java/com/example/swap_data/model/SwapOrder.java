package com.example.swap_data.model;

import java.util.Date;

public class SwapOrder {
    private String orderCode;

    private Integer userId;

    private Integer scooterId;

    private Integer planId;

    private Integer distance;

    private Long planPrice;

    private Integer discount;

    private Integer ailableTime;

    private Integer count;

    private Integer sumTime;

    private Long planTotal;

    private String discounts;

    private Long totalPrices;

    private String planType;

    private Integer distanceSum;

    private String payStatus;

    private String payCode;

    private String callbackResult;

    private Date payTime;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String remark;

    private String delFlag;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getScooterId() {
        return scooterId;
    }

    public void setScooterId(Integer scooterId) {
        this.scooterId = scooterId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Long getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(Long planPrice) {
        this.planPrice = planPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getAilableTime() {
        return ailableTime;
    }

    public void setAilableTime(Integer ailableTime) {
        this.ailableTime = ailableTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSumTime() {
        return sumTime;
    }

    public void setSumTime(Integer sumTime) {
        this.sumTime = sumTime;
    }

    public Long getPlanTotal() {
        return planTotal;
    }

    public void setPlanTotal(Long planTotal) {
        this.planTotal = planTotal;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts == null ? null : discounts.trim();
    }

    public Long getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(Long totalPrices) {
        this.totalPrices = totalPrices;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType == null ? null : planType.trim();
    }

    public Integer getDistanceSum() {
        return distanceSum;
    }

    public void setDistanceSum(Integer distanceSum) {
        this.distanceSum = distanceSum;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getCallbackResult() {
        return callbackResult;
    }

    public void setCallbackResult(String callbackResult) {
        this.callbackResult = callbackResult == null ? null : callbackResult.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }


}