package com.container.b03list;

import java.util.HashSet;
import java.util.Iterator;


/*
    目标：掌握Set集合的基本使用
 */
public class D05SetFor {
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        initSet();

        // 迭代器
        iteratorFor();
        System.out.println();

        // 增加for
        increaseFor();
        System.out.println();

        // foreach
        foreachFor();
    }

    private static void iteratorFor() {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void increaseFor() {
        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void foreachFor() {
        set.forEach(s -> System.out.println(s));
    }

    public static void initSet() {
        set.add("张三");
        set.add("张三丰");
        set.add("李四");
        set.add("李思思");
    }
}
