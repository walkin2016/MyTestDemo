package com.thread.deadlovk;

import static java.lang.Thread.sleep;

public class DeadLockDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Runnable target;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o1){
                    try {
                        sleep(200);
                        System.out.println("t1-o1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o2){
                        System.out.println("t1-o2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o2){
                    System.out.println("t2-o2");
                    synchronized (o1){
                        System.out.println("t2-o1");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
