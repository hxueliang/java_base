package com.huangxl.operator;

public class Demo3 {
    public static void main(String[] args) {
        int a = 10; // 11 12 12
        int b = 20; // 20 20 20
        System.out.println(a++ > 10 && b++ >= 20); // false
        System.out.println(a++ > 10 || b++ >= 20); // true
        System.out.println(!(a++ > 10)); // false
        System.out.println(a++ > 10 ^ b++ > 20); // true ^ false = true

    }
}
