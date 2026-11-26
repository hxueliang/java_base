package com.container.b02string;

/*
    目标：掌握StringBuilder
    构造：
        sb = StringBuilder(); // ""
        sb = StringBuilder(String str); // 创建可变字符串默认值是给定的内容
    功能：StringBuilder是可变的字符串，擅长字符串拼接
        sb.append(any); // 拼接内容并返回自己
        sb.reverse(); // 反转字符串并返回自己
        sb.toString(); // 将可变字符串转换为不可变字符串并返回
        sb.length(); // 获取可变字符串的长度
 */
public class D05StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hxl");
        StringBuilder sb2 = sb1.append("abc");
        System.out.println(sb1 == sb2); // 说明调append返回原地址，这样设计可以链式调用
        System.out.println();

        sb1.append("x").append("y").append("z").append("123");
        System.out.println(sb1);
        System.out.println();

        sb1.reverse();
        System.out.println(sb1);
        System.out.println();

        System.out.println(sb1.length());
        System.out.println();

        String s1 = sb1.toString();
        System.out.println(s1);
        System.out.println(s1.getClass()); // class java.lang.String
        System.out.println(sb1.getClass()); // class java.lang.StringBuilder
    }
}
