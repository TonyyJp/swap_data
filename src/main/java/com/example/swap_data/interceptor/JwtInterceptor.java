package com.example.swap_data.interceptor;

import com.example.swap_data.common.JwtUtil;
import com.example.swap_data.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class JwtInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(JwtInterceptor.class);

    @Autowired
    SysUserService sysUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 从 http 请求头中取出 token
        String token = request.getHeader("token");
        logger.info("获取到token：{}", token);

        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        if (token != null){
            String account = JwtUtil.getUserNameByToken(request);
            logger.info("昵称：{}", account);
            // 这边拿到的 用户名 应该去数据库查询获得密码，简略，步骤在service直接获取密码
            boolean result = JwtUtil.verify(token,account,sysUserService.getPassword(account));
            if(result){
                logger.info("通过验证");
                return true;
            }
        }
        logger.info("未通过验证");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
