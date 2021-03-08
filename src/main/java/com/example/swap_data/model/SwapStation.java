package com.example.swap_data.model;

import java.util.Date;

public class SwapStation {
    private Integer stationId;

    private String stationName;

    private String stationCode;

    private String stationModel;

    private String imei;

    private Integer warehouseNumber;

    private Integer storeId;

    private String ammeterValue;

    private Date ammeterTime;

    private String businessTimeS;

    private String businessTimeE;

    private String address;

    private String channelId;

    private String stationStatus;

    private String locationStatus;

    private String connectStatus;

    private Integer expirationDate;

    private String supplierId;

    private Date produceTime;

    private String hardwareVersion;

    private String softwareVersion;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String remark;

    private String delFlag;

    private String longitude;

    private String latitude;

    private String mainImg;

    private String imgList;

    private String timeList;

    private String timeType;

    private Integer electricityRead;

    private Date readTime;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode == null ? null : stationCode.trim();
    }

    public String getStationModel() {
        return stationModel;
    }

    public void setStationModel(String stationModel) {
        this.stationModel = stationModel == null ? null : stationModel.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Integer getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(Integer warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getAmmeterValue() {
        return ammeterValue;
    }

    public void setAmmeterValue(String ammeterValue) {
        this.ammeterValue = ammeterValue == null ? null : ammeterValue.trim();
    }

    public Date getAmmeterTime() {
        return ammeterTime;
    }

    public void setAmmeterTime(Date ammeterTime) {
        this.ammeterTime = ammeterTime;
    }

    public String getBusinessTimeS() {
        return businessTimeS;
    }

    public void setBusinessTimeS(String businessTimeS) {
        this.businessTimeS = businessTimeS == null ? null : businessTimeS.trim();
    }

    public String getBusinessTimeE() {
        return businessTimeE;
    }

    public void setBusinessTimeE(String businessTimeE) {
        this.businessTimeE = businessTimeE == null ? null : businessTimeE.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(String stationStatus) {
        this.stationStatus = stationStatus == null ? null : stationStatus.trim();
    }

    public String getLocationStatus() {
        return locationStatus;
    }

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus == null ? null : locationStatus.trim();
    }

    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus == null ? null : connectStatus.trim();
    }

    public Integer getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Integer expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public Date getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(Date produceTime) {
        this.produceTime = produceTime;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion == null ? null : hardwareVersion.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg == null ? null : mainImg.trim();
    }

    public String getImgList() {
        return imgList;
    }

    public void setImgList(String imgList) {
        this.imgList = imgList == null ? null : imgList.trim();
    }

    public String getTimeList() {
        return timeList;
    }

    public void setTimeList(String timeList) {
        this.timeList = timeList == null ? null : timeList.trim();
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType == null ? null : timeType.trim();
    }

    public Integer getElectricityRead() {
        return electricityRead;
    }

    public void setElectricityRead(Integer electricityRead) {
        this.electricityRead = electricityRead;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }
}