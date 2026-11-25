package com.object.b04constantenum;

/*
    目标：掌握枚举的作用
    作用：更加专业的描述选项，屏蔽非法选项
    本质：枚举类型是一个类，将构造方法私有化，维护若干通过静态代码块初始化对象
    优点：使用对象表示选项，而对象的数量可以固定的，没有非法选项
    格式：
        public enum 枚举名{
            枚举值1，枚举值2，枚举值3，枚举值4，枚举值5;
        }
 */
public class D03Enum {
    public static void main(String[] args) {
        method(D03Week.MONDAY);
        method(D03Week.TUESDAY);
    }

    public static void method(D03Week week) {
        switch (week) {
            case MONDAY -> System.out.println("星期一");
            case TUESDAY -> System.out.println("星期二");
            case WEDNESDAY -> System.out.println("星期三");
            case THURSDAY -> System.out.println("星期四");
            case FRIDAY -> System.out.println("星期五");
            case SATURDAY -> System.out.println("星期六");
            case SUNDAY -> System.out.println("星期日");
        }
    }
}
