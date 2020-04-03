package com.ktz.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName FeignServiceApplication
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/3 8:38
 * @Version V1.0.0
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServiceApplication.class, args);
    }

}
