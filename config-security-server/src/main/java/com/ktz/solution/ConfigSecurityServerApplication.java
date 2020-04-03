package com.ktz.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigSecurityServerApplication
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/3 11:27
 * @Version V1.0.0
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigSecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigSecurityServerApplication.class, args);
    }
}
