package com.example.demo.volatiledo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class VolatilePo {
    //    int count=0;
    volatile int count = 0;
    AtomicInteger count2=new AtomicInteger(0);
    public void addTo20() {
        this.count = 20;
    }
    public void addOne() {
        this.count++;
    }

    public void addOne2() {
        this.count2.getAndIncrement();
    }
}

public class VolatileTest {
    public static void main(String[] args) {
        /**
         * volatile保证可见性和有序性，不保证原子性
         * 禁API调用工程师，增删改查程序员
         */
        //visibility();
        noAtomic();

    }

    private static void noAtomic() {
        VolatilePo volatilePo = new VolatilePo();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                try {
//                    System.out.println(Thread.currentThread().getName() + " come in");
                    for(int j=0;j<1000;j++){
                        volatilePo.addOne();
                        volatilePo.addOne2();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
        while (Thread.activeCount()>2) {
            Thread.yield();
        }
        System.out.println(volatilePo.count);
        System.out.println(volatilePo.count2);
    }

    private static void visibility() {
        //可见性测试
        VolatilePo volatilePo = new VolatilePo();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            volatilePo.addTo20();
        }, "AAA").start();

        System.out.println(Thread.currentThread().getName() + " come out");
    }
}
