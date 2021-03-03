package lcw.dao;

import lcw.model.SwapDataAdmin;

public interface SwapDataAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SwapDataAdmin record);

    int insertSelective(SwapDataAdmin record);

    SwapDataAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SwapDataAdmin record);

    int updateByPrimaryKey(SwapDataAdmin record);
}