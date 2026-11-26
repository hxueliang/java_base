package com.container.b03list;

import java.util.HashSet;

/*
    目标：掌握Set集合的基本使用
    特点：无序(有特例)、不重复、无索引
    构造：
        HashSet<String> set = new HashSet<>();
    方法：
        boolean add(E e) // 添加元素，返回添加成功与否
        boolean remove(E e) // 删除第一个查询到的元素，返回删除成功与否
        boolean contains(E e) // 判断元素是否存在
        int size() // 获取元素个数
        void clear() // 清空集合
        boolean isEmpty() // 判断集合是否为空
 */
public class D04SetBase {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // add
        set.add("张三");
        set.add("张三丰");
        set.add("李四");
        set.add("李思思");
        set.add("李思思");
        set.add("李思思");
        System.out.println(set);
        System.out.println();

        System.out.println(set.remove("张三"));
        System.out.println(set);
        System.out.println();

        System.out.println(set.contains("张三丰"));
        System.out.println();

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();

        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
