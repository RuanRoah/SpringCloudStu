package com.roah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO: Add Description
 *
 * @author Roah
 * @since 07/31/2018
 */
@SpringBootApplication
@EnableEurekaClient
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }


}
