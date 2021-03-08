package com.example.swap_data.dao;

import com.example.swap_data.model.SwapUserScooterBattery;

public interface SwapUserScooterBatteryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SwapUserScooterBattery record);

    int insertSelective(SwapUserScooterBattery record);

    SwapUserScooterBattery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SwapUserScooterBattery record);

    int updateByPrimaryKey(SwapUserScooterBattery record);
}