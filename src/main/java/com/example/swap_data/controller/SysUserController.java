package com.example.swap_data.controller;

import com.example.swap_data.common.BaseMessage;
import com.example.swap_data.common.JwtUtil;
import com.example.swap_data.model.SwapDataAdmin;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "登陆")
@RequestMapping("SysUser")
@RestController
public class SysUserController {

    @GetMapping(value = "/login")
    public Object login(@RequestBody SwapDataAdmin sysUser){
        String account = sysUser.getAccount();
        String password = sysUser.getPassword();
        // 省略 账号密码验证
        // 验证成功后发送token
        String token = JwtUtil.sign(account,password);
        if (token != null){
            return  BaseMessage.newInstance().success()
                    .msg("认证成功")
                    .addData("token", token);
        }
        return  BaseMessage.newInstance().error(403)
                .msg("认证成功");
    }
}
