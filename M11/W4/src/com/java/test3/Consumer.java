package com.java.test3;

public class Consumer implements Runnable{
    private Factory factory;

    public Consumer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费.......");
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            factory.consumeProduct();
        }
    }
}
