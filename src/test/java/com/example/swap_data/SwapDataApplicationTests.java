package com.example.swap_data;

import com.example.swap_data.dao.SwapDataAdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwapDataApplicationTests {

    @Autowired
    private SwapDataAdminMapper dataAdminMapper;

    @Test
    void contextLoads() {
        dataAdminMapper.selectByPrimaryKey(new Long(1));
    }

}
