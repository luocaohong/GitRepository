package com.java.test3;

public class Factory {
    private int product = 0;
    public synchronized void produceProduct(){
        if(product < 20){
            product++;
            System.out.println("生产者正在生产第" + product + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct(){
        if (product > 0) {
            System.out.println("正在消耗第" + product + "个产品");
            product--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
