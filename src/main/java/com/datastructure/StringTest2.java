package com.datastructure;

public class StringTest2 {
    public static void main(String[] args) {
        String s0 = "java No.1";
        String s1 = "java" ;
        String s2 = "No.1";
        String s3 = "java " + "No.1";
        String s4 = s1 + "No.1";
        String s5 = s1 + s2;
        System.out.println(s3 == s0);
        System.out.println(s4 == s0);
        System.out.println(s5 == s0);
        System.out.println(s5 == s4);
        System.out.println("---------------------------");
        final String s6 = "I am ";
        final String s7 = "jj";
        String s8 = "I am jj";
        String s9 = s6 + s7;
        System.out.println(s8 == s9);
    }
}
