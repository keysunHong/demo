package com.example.demo.volatiledo;

import java.util.concurrent.TimeUnit;

class VolatilePo{
//    int count=0;
    volatile int count=0;
    public void addTo20(){
        this.count=20;
    }
}

public class VolatileTest {
    public static void main(String[] args) {
        /**
         * volatile保证可见性和有序性，不保证原子性
         */
        //可见性测试
        VolatilePo volatilePo = new VolatilePo();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            volatilePo.addTo20();
        },"AAA").start();
        while(volatilePo.count==0){
        }
        System.out.println(Thread.currentThread().getName()+" come out");

    }
    }
