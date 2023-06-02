package com.yql.guli.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

@Configuration
public class ThreadConfig {
    @Bean
    public ThreadPoolExecutor threadPoolExecutor(ThreadPoolConfigProperties threadPoolConfigProperties){
        Integer corePoolSize = threadPoolConfigProperties.getCorePoolSize(); //核心10
        Integer maxPoolSize = threadPoolConfigProperties.getMaxPoolSize(); //最多200个同时
        Integer keepAliveTime = threadPoolConfigProperties.getKeepAliveTime(); //时间
        TimeUnit unit = TimeUnit.SECONDS; //单位
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(200000); //队列 最多200个线程
        ThreadFactory threadFactory = Executors.defaultThreadFactory(); //默认工厂
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy(); //策略
        return new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }
}
