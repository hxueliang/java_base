package com.object.b03static;

/**
 * 静态方法只能访问静态变量/方法，不能访问成员变量/方法
 */
public class D02StaticMemberMethod {
    public static void main(String[] args) {
        D02Student stu = new D02Student();
        stu.ordinaryMethod();
        // stu.staticMethod();

        // D02Student.ordinaryMethod(); // 不能访问
        D02Student.staticMethod();
    }
}
