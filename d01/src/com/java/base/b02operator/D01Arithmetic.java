package com.java.base.b02operator;

public class D01Arithmetic {
    /**
     * 算数运算符
     * +
     * -
     * *
     * /
     * %
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println("----------");
        System.out.println(a / b); // 3
        System.out.println("----------");
        System.out.println(a % b);


        System.out.println("abc" + a + b); // abc103
        System.out.println(a + b + "abc"); // 13abc
        System.out.println('a' + 'a' + "abc"); // 194abc
        System.out.println("abc" + 'a'); // abca

    }
}
