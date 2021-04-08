package com.thread.vol;

public class ClassInitTest {
    static {
        i = 0;
//        System.out.println(i);
    }
    static int i = 1;

    public static void main(String[] args) {
        System.out.println(i);
    }
}
