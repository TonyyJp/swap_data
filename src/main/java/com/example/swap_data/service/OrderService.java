package com.example.swap_data.service;

import com.example.swap_data.dao.SwapOrderMapper;
import com.example.swap_data.interceptor.JwtInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private SwapOrderMapper swapOrderMapper;

    private Logger logger = LoggerFactory.getLogger(JwtInterceptor.class);
}
