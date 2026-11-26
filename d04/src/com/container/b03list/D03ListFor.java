package com.container.b03list;

import java.util.ArrayList;
import java.util.Iterator;

/*
    目标：掌握集合的各种遍历

 */
public class D03ListFor {
    static ArrayList<String> list = new ArrayList();

    public static void main(String[] args) {
        list.add("张三");
        list.add("李四");

        // 普通for：适合有索引的单列集合
        ordinaryFor();
        System.out.println();

        // 迭代器：适合有/无索引的单列集合
        iteratorFor();
        System.out.println();

        // 增强for：适合所有单列集合
        enhancedFor();
        System.out.println();

        // jdk8.0 新特性：适合所有单列集合
        lambdaFor();
    }

    private static void lambdaFor() {
        list.forEach(s -> System.out.println(s));
        System.out.println();
    }

    private static void enhancedFor() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void iteratorFor() {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void ordinaryFor() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
