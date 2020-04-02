package com.ktz.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName RibbonServiceApplication
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/2 8:43
 * @Version V1.0.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplication.class, args);
    }

}
