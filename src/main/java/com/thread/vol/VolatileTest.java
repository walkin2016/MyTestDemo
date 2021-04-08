package com.thread.vol;

public class VolatileTest {

    private int a;
    private boolean b;

    public void set1(){
        b = true;
        a = 1;
    }

    public void set2(){
        if (b){
            a = 3;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
//        test.set1();
//        test.set2();
//        System.out.println(test.a);

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                test.set1();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                test.set2();
//            }
//        });
//        t1.start();
//        t2.start();
    }
}
