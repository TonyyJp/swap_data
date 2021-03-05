package com.example.swap_data.config;

import com.example.swap_data.interceptor.JwtInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* *
 * @Author lsc
 * <p>拦截器配置 </p>
 * @Param
 * @Return
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    /* *
     * @Author lsc
     * <p> 设置拦截路径 </p>
     * @Param [registry]
     * @Return void
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //定义排除swagger访问的路径配置
        String[] swaggerExcludes=new String[]{"/doc.html","/SysUser/**","/webjars/**","/swagger-resources/**", "/v2/**","/swagger-ui.html/**","/statics/*"};

        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(swaggerExcludes);
        WebMvcConfigurer.super.addInterceptors(registry);
    }
    /* *
     * @Author lsc
     * <p> 将拦截器注入context </p>
     * @Param []
     * @Return com.zszxz.jwt.interceptor.JwtInterceptor
     */
    @Bean
    public JwtInterceptor authenticationInterceptor() {
        return new JwtInterceptor();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    /* *
     * @Author lsc
     * <p>跨域支持 </p>
     * @Param [registry]
     * @Return void
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*")
                .allowedMethods("GET", "POST")
                .allowCredentials(false).maxAge(1800);
    }
}
