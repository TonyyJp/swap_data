package com.example.swap_data.service;

import com.example.swap_data.dao.SwapDataAdminMapper;
import com.example.swap_data.interceptor.JwtInterceptor;
import com.example.swap_data.model.SwapDataAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    @Autowired
    private SwapDataAdminMapper swapDataAdminMapper;

    private Logger logger = LoggerFactory.getLogger(JwtInterceptor.class);

    /**
     * 获取加密后的密码
     * @param account
     * @return
     */
    public String getPassword(String account){
        SwapDataAdmin swapDataAdmin = swapDataAdminMapper.selectByAccount(account);
        return swapDataAdmin.getPassword();
    }

    /**
     * 通过账号获取用户数据
     * @param account
     * @return
     */
    public SwapDataAdmin getUserResult(String account)
    {
        SwapDataAdmin swapDataAdmin = swapDataAdminMapper.selectByAccount(account);
        return swapDataAdmin;
    }
}
