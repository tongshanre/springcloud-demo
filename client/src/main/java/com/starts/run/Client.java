package com.starts.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by fei on 2017/8/10.
 */
@ComponentScan(basePackages = "com.starts")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.starts")
public class Client {
    public static void main(String[] args) {
        SpringApplication.run(Client.class,args);
    }
}
