package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//包含了@EnableZuulServer注解，设置该内是网关的启动类
@EnableZuulProxy
//可以帮助Spring boot 应用将所有符合条件的@Configuration配置加载到当前Spring boot创建并使用的ioc容器中
@EnableAutoConfiguration
public class zuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(zuulApplication.class,args);
    }
}
