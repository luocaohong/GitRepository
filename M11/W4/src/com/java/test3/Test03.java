package com.java.test3;

public class Test03 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Producer producer = new Producer(factory);
        Consumer consumer = new Consumer(factory);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
