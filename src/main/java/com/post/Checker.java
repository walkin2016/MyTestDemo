package com.post;

public interface Checker {
    int a = 10;

    static void check() {
    }

    static void check(boolean b) {
        if (!b) {
            throw new RuntimeException("");
        }
    }

    static void check(boolean b, String msg) {
        if (!b) {
            throw new RuntimeException(msg);
        }
    }

    static void check(boolean b, String format, Object... args) {
        if (!b) {
            throw new RuntimeException(String.format(format, args));
        }
    }

    static void checkNull(Object obj) {
        check(obj == null);
    }

    static void checkNull(Object obj, String format, Object... args) {
        check(obj == null, format, args);
    }

    static void checkNotNull(Object obj) {
        check(obj != null);
    }

    static void checkNotNull(Object obj, String format, Object... args) {
        check(obj != null, format, args);
    }

    static void checkNotEmpty(String s) {
        check(s != null && !s.isEmpty());
    }

    static void checkNotEmpty(String s, String format, Object... args) {
        check(s != null && !s.isEmpty(), format, args);
    }

    static void checkRange(int i, int min, int max) {
        check(i >= min && i <= max);
    }

    static void checkRange(int i, int min, int max, String format, Object... args) {
        check(i >= min && i <= max, format, args);
    }

    static void checkThread(Thread thread) {
        check(Thread.currentThread() == thread);
    }

    static void checkThread(Thread thread, String format, Object... args) {
        check(Thread.currentThread() == thread, format, args);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 9;
//        check(a == b);

        String str1 = "Aa";
        String str2 = "BB";
        check(str1.hashCode() == str2.hashCode());

        String s = null;
        assert s != null;
        check(s.isEmpty());
    }
}
