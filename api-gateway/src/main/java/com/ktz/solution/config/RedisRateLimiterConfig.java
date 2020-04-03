package com.ktz.solution.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @ClassName RedisRateLimiterConfig
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/3 16:01
 * @Version V1.0.0
 **/
@Configuration
public class RedisRateLimiterConfig {

    /**
     * 请求参数限流
     *
     * @return
     */
//    @Bean
//    KeyResolver userKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("username"));
//    }

    /**
     * IP限流
     *
     * @return
     */
    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

}
