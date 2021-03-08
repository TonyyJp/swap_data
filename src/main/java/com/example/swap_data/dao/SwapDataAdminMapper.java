package com.example.swap_data.dao;

import com.example.swap_data.model.SwapDataAdmin;

public interface SwapDataAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SwapDataAdmin record);

    int insertSelective(SwapDataAdmin record);

    SwapDataAdmin selectByPrimaryKey(Long id);

    SwapDataAdmin selectByAccount(String id);

    int updateByPrimaryKeySelective(SwapDataAdmin record);

    int updateByPrimaryKey(SwapDataAdmin record);
}