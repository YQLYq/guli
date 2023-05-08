package com.yql.guli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ASUS
 */
@SpringBootApplication
@EnableWebMvc
@EnableDiscoveryClient
@MapperScan("com.yql.guli.product.dao")
public class ProductApplication {
    public static void main(String[] args){
        SpringApplication.run(ProductApplication.class,args);
    }
}
