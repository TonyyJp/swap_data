package com.example.swap_data.model;

import java.util.Date;

public class SwapRecord {
    private Integer recordId;

    private String recordNumber;

    private Integer userId;

    private Integer storeId;

    private Integer scooterId;

    private Integer batteryId;

    private Integer stationId;

    private Integer lastElectricQuantity;

    private Integer thisElectricQuantity;

    private Integer lastMileageValue;

    private Integer thisMileageValue;

    private String warehouseCode;

    private Date orderTimeS;

    private Date orderTimeE;

    private String orderStatus;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber == null ? null : recordNumber.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getScooterId() {
        return scooterId;
    }

    public void setScooterId(Integer scooterId) {
        this.scooterId = scooterId;
    }

    public Integer getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(Integer batteryId) {
        this.batteryId = batteryId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getLastElectricQuantity() {
        return lastElectricQuantity;
    }

    public void setLastElectricQuantity(Integer lastElectricQuantity) {
        this.lastElectricQuantity = lastElectricQuantity;
    }

    public Integer getThisElectricQuantity() {
        return thisElectricQuantity;
    }

    public void setThisElectricQuantity(Integer thisElectricQuantity) {
        this.thisElectricQuantity = thisElectricQuantity;
    }

    public Integer getLastMileageValue() {
        return lastMileageValue;
    }

    public void setLastMileageValue(Integer lastMileageValue) {
        this.lastMileageValue = lastMileageValue;
    }

    public Integer getThisMileageValue() {
        return thisMileageValue;
    }

    public void setThisMileageValue(Integer thisMileageValue) {
        this.thisMileageValue = thisMileageValue;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public Date getOrderTimeS() {
        return orderTimeS;
    }

    public void setOrderTimeS(Date orderTimeS) {
        this.orderTimeS = orderTimeS;
    }

    public Date getOrderTimeE() {
        return orderTimeE;
    }

    public void setOrderTimeE(Date orderTimeE) {
        this.orderTimeE = orderTimeE;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
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