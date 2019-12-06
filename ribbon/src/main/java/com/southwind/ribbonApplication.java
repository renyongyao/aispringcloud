package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ribbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ribbonApplication.class,args);
    }
    @Bean
    //声明一个基于Ribbon的负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
