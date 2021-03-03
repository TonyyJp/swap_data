package com.example.swap_data.dao;

import com.example.swap_data.model.SwapDataAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface SwapDataAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SwapDataAdmin record);

    int insertSelective(SwapDataAdmin record);

    SwapDataAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SwapDataAdmin record);

    int updateByPrimaryKey(SwapDataAdmin record);
}