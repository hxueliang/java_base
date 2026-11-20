package com.huangxl.b02operator;

public class D04Comparison {
    /**
     * 比较运算符
     * >
     * >=
     * <
     * <=
     * ==
     * !=
     */
    public static void main(String[] args) {
        int a = 10; // 11 12 12
        int b = 20; // 20 20 20
        System.out.println(a++ > 10 && b++ >= 20); // false
        System.out.println(a++ > 10 || b++ >= 20); // true
        System.out.println(!(a++ > 10)); // false
        System.out.println(a++ > 10 ^ b++ > 20); // true ^ false = true

    }
}
