package com.yql.guli.search.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class threadTest {
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            int i = 10 / 4;
            log.info("当前线程:{},值:{}" , Thread.currentThread().getId(), i);
            return i;
        }, executorService);
        CompletableFuture<Integer> integerCompletableFuture1 = CompletableFuture.supplyAsync(() -> {
            int i = 10 / 2;
            log.info("当前线程:{},值:{}" , Thread.currentThread().getId(), i);
            return i;
        }, executorService);
//
        CompletableFuture.allOf(integerCompletableFuture,integerCompletableFuture1).get();
        executorService.shutdown();
    }

    public static class Thread01 extends Thread {
        @Override
        public void run() {
            log.info("当前线程" + Thread.currentThread().getId());
            int i = 10 / 2;
            log.info(String.valueOf(i));
        }
    }

    public static class Thread02 implements Runnable {

        @Override
        public void run() {
            log.info("当前线程" + Thread.currentThread().getId());
            int i = 10 / 2;
            log.info(String.valueOf(i));
        }
    }

    public static class Callble01 implements Callable<Integer> {

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Integer call() throws Exception {
            log.info("当前线程" + Thread.currentThread().getId());
            int i = 10 / 2;
            log.info(String.valueOf(i));
            return i;
        }
    }
}
