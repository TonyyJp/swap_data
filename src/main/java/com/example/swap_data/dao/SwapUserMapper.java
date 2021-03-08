package com.example.swap_data.dao;

import com.example.swap_data.model.SwapUser;

public interface SwapUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SwapUser record);

    int insertSelective(SwapUser record);

    SwapUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SwapUser record);

    int updateByPrimaryKey(SwapUser record);
}