package com.s686.mall.s686mallgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、开启服务注册发现
 * (配置nacos的注册中心地址)
 * 2、编写网关配置文件
 */

@EnableDiscoveryClient
//exclude = {DataSourceAutoConfiguration.class} 引入common的时候引入了mybatis的包,排除数据库配置,否则启动报错
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class S686mallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(S686mallGatewayApplication.class, args);
    }

}
