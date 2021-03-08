package com.example.swap_data.dao;

import com.example.swap_data.model.SwapConsumeLog;

public interface SwapConsumeLogMapper {
    int deleteByPrimaryKey(Integer consumeId);

    int insert(SwapConsumeLog record);

    int insertSelective(SwapConsumeLog record);

    SwapConsumeLog selectByPrimaryKey(Integer consumeId);

    int updateByPrimaryKeySelective(SwapConsumeLog record);

    int updateByPrimaryKey(SwapConsumeLog record);
}