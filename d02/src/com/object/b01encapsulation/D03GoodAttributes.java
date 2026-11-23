package com.object.b01encapsulation;

/**
 * 如何写好对象的属性
 *  私有化成员变量，提供setter和getter方法来访问，提高了数据的安全性
 *
 * 封装的概念：
 *  为了提高代码复用性以及安全性的机制都叫封装
 *  隐藏实现细节
 *  对外提供访问方式
 */
public class D03GoodAttributes {
    public static void main(String[] args) {
        D03Student stu = new D03Student();
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0


        D03Student2 stu2 = new D03Student2();
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
    }
}
