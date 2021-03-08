package com.example.swap_data.dao;

import com.example.swap_data.model.SwapOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SwapOrderMapper {
    int deleteByPrimaryKey(SwapOrder key);

    int insert(SwapOrder record);

    int insertSelective(SwapOrder record);

    SwapOrder selectByPrimaryKey(SwapOrder key);

    int updateByPrimaryKeySelective(SwapOrder record);

    int updateByPrimaryKey(SwapOrder record);

    int selectSum();
}