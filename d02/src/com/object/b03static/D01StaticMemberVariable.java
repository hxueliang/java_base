package com.object.b03static;

/*
    被static修饰的成员变量支持类名访问,
    随着类的加载在堆中静态区只会初始化一次, 也称为类变量
    被这个类的所有对象所共享
 */
public class D01StaticMemberVariable {
    public static void main(String[] args) {
        demo1();
        System.out.println("=========================");
        demo2();
    }

    private static void demo1() {
        // D01Student.name = "张三"; // 不能访问,实例变量不能通过类名访问

        D01Student s1 = new D01Student();
        D01Student s2 = new D01Student();
        D01Student s3 = new D01Student();

        s1.name = "hxl";
        System.out.println(s1.name); // hxl 实例变量属于每一个对象, 只有s1可以取到刚才设置的值
        System.out.println(s2.name); // null 实例变量属于每一个对象, 只有s1可以取到刚才设置的值
        System.out.println(s3.name); // null 实例变量属于每一个对象, 只有s1可以取到刚才设置的值
    }


    private static void demo2() {
        // 静态变量支持类名访问
        D01Student.nationality = "中华人民共和国";

        D01Student s1 = new D01Student();
        s1.name = "张三";
        D01Student s2 = new D01Student();
        s2.name = "李四";
        // 静态变量被这个类所有对象所共享
        System.out.println(s1.name + " " + s1.nationality);
        System.out.println(s2.name + " " + s2.nationality);
    }
}
