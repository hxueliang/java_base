package com.container.b03list;

import java.util.ArrayList;
import java.util.Iterator;

/*
    目标：掌握每种遍历方式的注意事项

    1.普通for：必须有索引才能遍历；进行删除操作时，要手动把索引进行调整
    2.迭代器：在迭代器遍历集合时，不能进行集合的增删操作；如果进行增删操作，使用迭代器进行增删操作
    3.增强for：底层使用"迭代器"实现，"迭代器"的缺点它都有；并且因为它是迭代器的简化版，并且看不到迭代器，所以不能进行增删操作
    4.forEach：底层使用"增强for"，"增强for"的缺点它都有；并且..
 */
public class D03ListFor2 {
    static ArrayList<String> list = new ArrayList();

    public static void main(String[] args) {
        list.add("张三");
        list.add("张三丰");
        list.add("李四");
        list.add("李思思");

        // 迭代器
        iteratorFor();

    }


    private static void iteratorFor() {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.length() < 3) {
                // list.remove(name); // 报错
                it.remove();
            }
        }
        System.out.println(list);
    }

}
