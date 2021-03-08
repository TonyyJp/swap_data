package com.example.swap_data.dao;

import com.example.swap_data.model.SwapUserAccount;

public interface SwapUserAccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(SwapUserAccount record);

    int insertSelective(SwapUserAccount record);

    SwapUserAccount selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(SwapUserAccount record);

    int updateByPrimaryKey(SwapUserAccount record);
}