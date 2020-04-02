package com.ktz.solution.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonConfig
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/2 8:44
 * @Version V1.0.0
 **/
@Configuration
public class RibbonConfig {

    /**
     * @LoadBalanced:赋予RestTemplate负载均衡功能
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
