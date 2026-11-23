package com.object.b01encapsulation;

/**
 * 如何写好对象的行为
 */
public class D02GoodMethods {
    public static void main(String[] args) {
        D02Student stu = new D02Student();
        stu.name = "张三";
        stu.study("李四");
        stu.study("李四四");

        D02Student stu2 = new D02Student();
        stu2.name = "王五";
        stu2.study("赵六");
        stu2.study("赵六六");
    }
}
