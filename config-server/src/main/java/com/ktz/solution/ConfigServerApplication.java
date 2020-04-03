package com.ktz.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServiceApplication
 * @Description 获取配置文件信息的访问格式
 *          获取配置信息: /{label}/{application}-{profile}
 *          获取配置文件信息: /{label}/{application}-{profile}.yml
 *   占位符相关解释
 *      label：代表分支名称，对应配置文件中的spring.cloud.config.label；
 *      application：代表应用名称，默认为配置文件中的spring.application.name，如果配置了spring.cloud.config.name，则为该名称；
 *      profile：代表环境名称，对应配置文件中的spring.cloud.config.profile。
 * @Author kaituozhesh
 * @Date 2020/4/3 11:15
 * @Version V1.0.0
 **/
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}


