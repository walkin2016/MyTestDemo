package com.thread.cpucache;

public class FalseShare implements Runnable {
    public static int NUM_THREADS = 4;
    public static final long ITERATIONS = 500L * 1000 * 1000;
    private final int arrayIndex;
    private static VolatileLong[] longs;

    public FalseShare(int arrayIndex){
        this.arrayIndex = arrayIndex;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Starting...");
        if (args.length == 1){
            NUM_THREADS = Integer.parseInt(args[0]);
        }

        longs = new VolatileLong[NUM_THREADS];
        for (int i = 0; i < longs.length; i++) {
            longs[i] = new VolatileLong();
        }
        final long start = System.currentTimeMillis();
        runTest();
        System.out.println("duration = " + (System.currentTimeMillis() - start));
    }

    private static void runTest() throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new FalseShare(i));
        }
        for (Thread t : threads){
            t.start();
        }
        for (Thread thread : threads) {
            thread.join();

        }

        // jmm是一种内存模型，内存模型描述了程序中各个变量之间的关系，以及在实际计算机系统中将变量存储到内存和从内存中取出变量这样的底层细节。
    }

    @Override
    public void run() {
        long i = ITERATIONS + 1;
        while (0 != --i) {
            longs[arrayIndex].value = i;
        }
    }

    static class VolatileLong{
        public volatile long value = 0;
        public long p1, p2, p3, p4, p5, p6;
    }
}
