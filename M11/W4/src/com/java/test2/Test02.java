package com.java.test2;

import java.util.concurrent.*;

public class Test02 {
    public static void main(String[] args) {
//        new Thread(new MyRunnable(),"窗口一").start();
//        new Thread(new MyRunnable(),"窗口二").start();
//        new Thread(new MyRunnable(),"窗口三").start();

        ExecutorService pool = new ThreadPoolExecutor(2,4,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Runnable task = new MyRunnable();
        pool.execute(task);
        pool.execute(task);

        pool.execute(task);
        pool.execute(task);
        pool.execute(task);

        pool.execute(task);
        pool.execute(task);
    }
}
