package com.starts.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by fei on 2017/8/10.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.starts")
@EnableEurekaClient
@EnableHystrix
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
