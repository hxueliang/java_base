package com.container.b03list;

import java.util.ArrayList;

/*
    目标：学会使用集合的增删改查
    集合：
        List集合：有序、可重复、有索引、有CRUD
            增：
                boolean add(E e)：向集合的末尾位置添加元素
                void add(int i, E e)：向集合的指定位置添加元素，覆盖索引i位置的元素，索引i及之后的元素向后移动
            删：
                boolean remove(E e)：删除集合中第一次出现的指定元素，如果删除成功返回true，否则返回false，索引i及之后的元素向前移动
                E remove(int i)：删除并返回集合中指定位置的元素，索引i及之后的元素向前移动
            改：
                E set(int i, E e)：修改集合中指定位置的元素，返回被修改的旧元素
            查：
                E get(int i)：返回集合中指定位置的元素
                int indexOf(E e)：返回集合中第一次出现的指定元素的索引，如果不存在返回-1
                int lastIndexOf(E e)：返回集合中最后一次出现的指定元素的索引，如果不存在返回-1
            长度：
                int size()：返回集合中元素的个数
 */
public class D02ArrayListCRUD {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("王五");
        list.add("王五");
        System.out.println(list); // [张三, 李四, 王五, 王五, 王五]
        System.out.println();

        list.add(1, "张三2");
        System.out.println(list); // [张三, 张三2, 李四, 王五, 王五, 王五]
        System.out.println();

        boolean b = list.remove("王五");
        System.out.println(b + " " + list); // true [张三, 张三2, 李四, 王五, 王五]
        System.out.println();

        String r = list.remove(1);
        System.out.println(r + " " + list);  // 张三2 [张三, 李四, 王五, 王五]
        System.out.println();

        String s = list.set(2, "赵六");
        System.out.println(s + " " + list);  // 王五 [张三, 李四, 赵六, 王五]
        System.out.println();

        String g = list.get(0);
        System.out.println(g); // 张三
        System.out.println();


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        list2.add("王五");
        list2.add("王五");
        System.out.println(list2);
        int i2 = list2.lastIndexOf("王五");
        int i1 = list2.indexOf("王五");
        System.out.println(i1); // 2
        System.out.println(i2); // 4
        System.out.println();


        System.out.println(list2.size()); // 5
    }
}
