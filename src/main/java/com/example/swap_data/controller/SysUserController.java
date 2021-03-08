package com.example.swap_data.controller;

import cn.hutool.crypto.SecureUtil;
import com.example.swap_data.common.BaseMessage;
import com.example.swap_data.common.JwtUtil;
import com.example.swap_data.dao.SwapDataAdminMapper;
import com.example.swap_data.interceptor.JwtInterceptor;
import com.example.swap_data.model.SwapDataAdmin;
import com.example.swap_data.service.SysUserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "登陆")
@RequestMapping("/SysUser")
@RestController
public class SysUserController {

    private Logger logger = LoggerFactory.getLogger(JwtInterceptor.class);

    @Autowired
    private SysUserService sysUserService;

    @PostMapping(value = "/login")
    public Object login(@RequestBody SwapDataAdmin sysUser){
        String account = sysUser.getAccount();
        String password = sysUser.getPassword();
        password = SecureUtil.md5(password);

        logger.info("/login param-account:{}", account);
        logger.info("/login param-password：{}", password);

        SwapDataAdmin userinfo = sysUserService.getUserResult(account);
        if (userinfo != null) {
            logger.info("mysql password：{}", userinfo.getPassword());
            logger.info("user password：{}", password);
            // 账号密码验证
            if (userinfo.getPassword().equals(password) ) {
                // 验证成功后发送token
                String token = JwtUtil.sign(userinfo.getId(),userinfo.getAccount(),password);
                if (token != null){
                    return  BaseMessage.newInstance().success()
                            .msg("认证成功")
                            .addData("token", token);
                }
            }
            return  BaseMessage.newInstance().error(403)
                    .msg("认证失败");
        }else{
            return BaseMessage.newInstance().error(404)
                    .msg("用户不存在");
        }
    }
}
