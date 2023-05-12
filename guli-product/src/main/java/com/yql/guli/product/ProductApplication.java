package com.yql.guli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ASUS
 */
@SpringBootApplication
@EnableWebMvc
@EnableDiscoveryClient
@EnableFeignClients("com.yql.guli.product.feign")
@MapperScan("com.yql.guli.product.dao")
@EnableTransactionManagement
public class ProductApplication {
    public static void main(String[] args){
        SpringApplication.run(ProductApplication.class,args);
    }
}
