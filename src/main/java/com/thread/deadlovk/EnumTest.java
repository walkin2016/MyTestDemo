package com.thread.deadlovk;

import com.ObjectUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public enum EnumTest {
    a,
    b,
    c,
    d;

    static EnumTest[] e = EnumTest.values();

    public static void main(String[] args) {
//        EnumTest[] e2 = EnumTest.values();
//        System.out.println(EnumTest.e == e2);
//
//        BigInteger bigInteger = new BigInteger("56565656565655656");
//        BigInteger add = bigInteger.add(new BigInteger("100000000000"));
//        System.out.println(add.toString());

        int a = 100;
        long b = 240;
        int val = 10000000;
        System.out.println(a + b * val);

        float f = 1234567891234567890000000000f;
        System.out.println(f + 12344561);

        String str = "10000000000000000000";
        System.out.println(ObjectUtil.obj2long(str));

        BigInteger bigInteger = new BigInteger(str);
        String s = String.valueOf(bigInteger.add(new BigInteger("100")));
        System.out.println(s);
        BigInteger bigInteger2 = new BigInteger(s);
        System.out.println(bigInteger.compareTo(bigInteger2));

        String s2 = String.valueOf(bigInteger.subtract(new BigInteger("100")));
        System.out.println(s2);

        String s3 = "5";
        BigInteger bigInteger1 = new BigInteger("100");
//        System.out.println(bigInteger1.multiply(new BigInteger(s3)));
        System.out.println("100".equals(bigInteger1.toString()));

        BigDecimal bd = new BigDecimal("28000000000000000000");
        long l = bd.longValue();
        System.out.println(l);
    }

}
