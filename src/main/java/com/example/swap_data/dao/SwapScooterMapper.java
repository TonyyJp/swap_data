package com.example.swap_data.dao;

import com.example.swap_data.model.SwapScooter;

public interface SwapScooterMapper {
    int deleteByPrimaryKey(Integer scooterId);

    int insert(SwapScooter record);

    int insertSelective(SwapScooter record);

    SwapScooter selectByPrimaryKey(Integer scooterId);

    int updateByPrimaryKeySelective(SwapScooter record);

    int updateByPrimaryKey(SwapScooter record);
}