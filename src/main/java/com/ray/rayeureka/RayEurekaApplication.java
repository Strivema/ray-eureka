package com.ray.rayeureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RayEurekaApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(RayEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RayEurekaApplication.class, args);

        LOGGER.info("注册中心启动成功");
    }


}
