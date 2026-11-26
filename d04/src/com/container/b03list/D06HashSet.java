package com.container.b03list;

import java.util.HashSet;

/*
    HashSet如何去重：
        Hash值：
            默认在我们Object类中提供了一个hashcode()，这个方法默认被native关键字修饰
            被native关键字修饰的方法叫本地方法，这些是c及c++语言交互的桥梁，这种方法没有方法体，底层是c或c++写的
            hash值底层是根据真实的内存地址算出来的一个伪地址，我们称为hash值
        去重的原则：
            底层是根据元素的 hash值 以及 equals 两个方法决定去重
            只有两个方法都判断为相同，才会去重
        小结：
            包装类、String这些常见的类，都是重写过hasCode以及equals方法
            自定义的类如果要用HastSet去重，要手动重写hasCode以及equals方法
 */
public class D06HashSet {
    public static void main(String[] args) {
        HashSet<D06Student> hashSet = new HashSet<>();

        hashSet.add(new D06Student("hxl", 18));
        hashSet.add(new D06Student("hxl", 18));
        hashSet.add(new D06Student("hxl", 18));
        hashSet.add(new D06Student("hxl", 18));
        hashSet.add(new D06Student("hxl", 18));

        System.out.println(hashSet.size());
    }
}
