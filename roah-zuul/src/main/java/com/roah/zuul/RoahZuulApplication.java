package com.roah.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关启动入口
 *
 * @author Roah
 * @since 08/02/2018
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class RoahZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoahZuulApplication.class,args);
    }
}
