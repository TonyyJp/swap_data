package com.example.swap_data;

import com.example.swap_data.dao.SwapDataAdminMapper;
import com.example.swap_data.dao.SwapOrderMapper;
import com.example.swap_data.interceptor.JwtInterceptor;
import com.example.swap_data.model.SwapDataAdmin;
import com.example.swap_data.model.SwapOrder;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwapDataApplicationTests {

//    @Autowired
//    private SwapDataAdminMapper dataAdminMapper;

    @Autowired
    private SwapOrderMapper swapOrderMapper;

    private Logger logger = LoggerFactory.getLogger(SwapDataApplicationTests.class);

//    @Test
//    void contextLoads() {
//        SwapDataAdmin admin=dataAdminMapper.selectByPrimaryKey(new Long(1));
//    }
//
//    @Test
//    void getAccount() {
//        SwapDataAdmin admin=dataAdminMapper.selectByAccount("admin");
//    }

    @Test
    void getTotal() {
        Integer num= swapOrderMapper.selectSum();
        logger.info("num:{}",num);
    }

}
