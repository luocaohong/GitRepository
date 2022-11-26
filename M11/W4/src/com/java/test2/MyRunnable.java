package com.java.test2;

public class MyRunnable implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第"
                            + ticket + "张票，剩余" + --ticket + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "票已卖完");
                    break;
                }
            }
        }
    }
}
