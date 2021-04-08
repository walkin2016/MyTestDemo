package com.post;

public class SyncTest {
    public void add(){
        synchronized (SyncTest.class){}
    }
}
