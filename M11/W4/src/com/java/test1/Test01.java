package com.java.test1;

public class Test01 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(() -> System.out.print("A"));
            t1.start();t1.join();
            Thread t2 = new Thread(() -> System.out.print("B"));
            t2.start();t2.join();
            Thread t3 = new Thread(() -> System.out.print("C"));
            t3.start();t3.join();
        }
    }
}
