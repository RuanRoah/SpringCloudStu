package com.roah.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * feign demo
 *
 * @author Roah
 * @since 08/02/2018
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RoahFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoahFeignApplication.class, args);
    }

}
