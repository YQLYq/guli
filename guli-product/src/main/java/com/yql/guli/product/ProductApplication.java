package com.yql.guli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ASUS
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.yql.guli.product.feign")
@MapperScan("com.yql.guli.product.dao")
@EnableTransactionManagement
@RefreshScope
public class ProductApplication {
    public static void main(String[] args){
        SpringApplication.run(ProductApplication.class,args);
    }
}
