package com.java.test3;

import java.util.concurrent.Callable;

public class Producer implements Runnable {
    private Factory factory;

    public Producer(Factory factory){
        this.factory = factory;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产.......");
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            factory.produceProduct();
        }
    }
}
