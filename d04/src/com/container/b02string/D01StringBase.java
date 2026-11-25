package com.container.b02string;

/*
    目标：掌握String对象的创建以及常见功能
    作用：String是一个不可改变的字符序列，存储字符和操作字符串的类
    创建：1.通过字符串常量创建(最常用)：String s = "hello";
         2.通过构造函数创建：
            String()：没啥用
            String(String str)：没啥用
            String(char[])：有可用场景
            String(byte[])：有可用场景

 */
public class D01StringBase {
    public static void main(String[] args) {
        // 通过字符串常量创建
        String s1 = "abc";
        // 通过构造函数创建
        String s2 = new String();
        String s3 = new String("abc");
        String s4 = new String(new char[]{'a', 'b', 'c'});
        String s5 = new String(new byte[]{97, 98, 99});

        System.out.println(s1); // abc
        System.out.println(s2); // ""
        System.out.println(s3); // abc
        System.out.println(s4); // abc
        System.out.println(s5); // abc
    }
}
