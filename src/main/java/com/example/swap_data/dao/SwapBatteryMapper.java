package com.example.swap_data.dao;

import com.example.swap_data.model.SwapBattery;

public interface SwapBatteryMapper {
    int deleteByPrimaryKey(Integer batteryId);

    int insert(SwapBattery record);

    int insertSelective(SwapBattery record);

    SwapBattery selectByPrimaryKey(Integer batteryId);

    int updateByPrimaryKeySelective(SwapBattery record);

    int updateByPrimaryKey(SwapBattery record);
}