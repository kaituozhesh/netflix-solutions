package com.ktz.solution.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description feign日志配置
 * @Author kaituozhesh
 * @Date 2020/4/3 8:51
 * @Version V1.0.0
 **/
@Configuration
public class FeignConfig {

    /**
     * 日志级别:
     * NONE: 默认的,不显示任何日志
     * BASIC: 仅记录请求方法,URL,响应状态码及执行时间
     * HEADERS: 处了BASIC中定义的信息之外,还有请求和响应的头信息
     * FULL: 处了HEADERS中定义的信息之外,还有请求和响应的正文及元数据
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
