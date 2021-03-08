package com.example.swap_data.dao;

import com.example.swap_data.model.SwapRecord;

public interface SwapRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(SwapRecord record);

    int insertSelective(SwapRecord record);

    SwapRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(SwapRecord record);

    int updateByPrimaryKey(SwapRecord record);
}