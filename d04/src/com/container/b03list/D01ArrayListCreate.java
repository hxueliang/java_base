package com.container.b03list;

import java.util.ArrayList;

/*
    目标：掌握ArrayList集合的创建
    构造：
        ArrayList<E>()：创建一个空的集合对象
    泛型：
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList();
        注意：
            1.遇到泛型，如果我们不确定，则会被jvm默认确定成Object类型
            2.泛型只能确定成引用数据类型，不能确定成基本数据类型
            3.如果确定成基本数据类型，可以使用包装类 Integer, Character, Boolean, Byte, Short, Long, Float, Double
                包装类型可以看成是基本数据类型来使用，但是有区别
                区别：
                    1.包装类型毕竟是引用类型，可以存储null，而基本数据类型不能存储null
                    2.包装类型有一些方法，基本数据类型没有
                        常见的方法：
                            static xxx Xxx.parseXxx(String s)：将字符串转换成指定类型
                            static int Integer.parseInt(String s)：将字符串转换成整数
    方法：
        add(E e)：向集合的末尾位置添加元素
 */
public class D01ArrayListCreate {
    public static void main(String[] args) {
        create();
        packageClass();
    }

    private static void create() {
        ArrayList<String> list = new ArrayList();
        list.add("张三");

        ArrayList<Integer> list1 = new ArrayList();
        list1.add(123);
    }

    private static void packageClass() {
        String s = "12,34,56,100";
        String[] arr = s.split(",");
        int sum = 0;
        for (String str : arr) {
            int num = Integer.parseInt(str);
            sum += num;
        }
        System.out.println(sum);
    }
}
