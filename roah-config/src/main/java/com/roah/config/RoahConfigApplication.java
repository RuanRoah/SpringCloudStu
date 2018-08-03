package com.roah.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 云配置启动
 *
 * @author Roah
 * @since 08/02/2018
 */
@SpringBootApplication
@EnableConfigServer
public class RoahConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoahConfigApplication.class,args);
    }
}
