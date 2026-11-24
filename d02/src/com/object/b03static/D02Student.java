package com.object.b03static;

public class D02Student {
    String name = "默认 hxl"; // 实例变量
    static String nationality = "默认 中国"; // 静态变量

    public void ordinaryMethod() {
        System.out.println(1 + name);
        System.out.println(2 + nationality);
    }

    public static void staticMethod() {
        // System.out.println(name); // 静态方法只能访问静态变量/方法，不能访问实例变量/方法
        System.out.println(4 + nationality);
    }
}



