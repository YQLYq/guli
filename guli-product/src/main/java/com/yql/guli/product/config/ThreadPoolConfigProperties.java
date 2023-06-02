package com.yql.guli.product.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "guli.thread")
@Component
@Data
public class ThreadPoolConfigProperties {
    /**
     * 初始化核心
     */
   private Integer corePoolSize;
    /**
     * 最多核心
     */
   private Integer maxPoolSize;
    /**
     * 等待时间
     */
   private Integer keepAliveTime;
}
