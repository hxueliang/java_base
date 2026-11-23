package com.object.b02extends;

/*
    ==
        基本数据类型：比较的是值
        引用数据类型：比较的是地址
    equals() - 默认是 == 比较
        基本数据类型：比较的是值
        引用数据类型：比较的是地址
    equals() - 重写
        基本数据类型：比较的是值
        引用数据类型：比较的是内容
 */
public class D06ObjectOverrideEquals {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        D06Student student1 = new D06Student("张三", 18);
        D06Student student2 = new D06Student("张三", 18);
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2)); // 默认：false，重写：true
    }
}
