package com.example.swap_data.model;

import java.util.Date;

public class SwapUserAccount {
    private Integer accountId;

    private Integer userId;

    private Integer accountIntegral;

    private Integer accountLevel;

    private Integer distanceBalance;

    private Date distanceValidity;

    private Date rechargeDate;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccountIntegral() {
        return accountIntegral;
    }

    public void setAccountIntegral(Integer accountIntegral) {
        this.accountIntegral = accountIntegral;
    }

    public Integer getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(Integer accountLevel) {
        this.accountLevel = accountLevel;
    }

    public Integer getDistanceBalance() {
        return distanceBalance;
    }

    public void setDistanceBalance(Integer distanceBalance) {
        this.distanceBalance = distanceBalance;
    }

    public Date getDistanceValidity() {
        return distanceValidity;
    }

    public void setDistanceValidity(Date distanceValidity) {
        this.distanceValidity = distanceValidity;
    }

    public Date getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
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
}