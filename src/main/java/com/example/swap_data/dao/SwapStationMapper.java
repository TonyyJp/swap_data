package com.example.swap_data.dao;

import com.example.swap_data.model.SwapStation;

public interface SwapStationMapper {
    int deleteByPrimaryKey(Integer stationId);

    int insert(SwapStation record);

    int insertSelective(SwapStation record);

    SwapStation selectByPrimaryKey(Integer stationId);

    int updateByPrimaryKeySelective(SwapStation record);

    int updateByPrimaryKey(SwapStation record);
}