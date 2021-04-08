package com.datastructure;

import java.lang.ref.WeakReference;

public class WeakTest {
    public static void main(String[] args) {
        Object[] objects = new Object[1024 * 100 * 1024];
        WeakReference<Object> weakReference = new WeakReference<>(objects);
        System.gc();
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
        System.gc();
        Object[] o = (Object[])weakReference.get();
        System.out.println(o == null);

        WeakReference<String> sr = new WeakReference<String>(new String("hello"));
        System.out.println(sr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());

        abc:
        for (int i = 0; i < 100; i++) {
            if(i / 5 == 0) continue abc;
        }
    }
}
