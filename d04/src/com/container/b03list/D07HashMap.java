package com.container.b03list;

import java.util.HashMap;

/*
    目标：掌握HashMap的创建以及常见方法
    特点：键值对集合，一次存一对元素，其中键不能重复，值可以重复
    构造：HashMap<K, V> map = new HashMap<>();
    常见方法：
        1. 添加/修改元素：V put(K key, V value); // 将键值对存入集合，如果键不存在，则返回null，如果键存在，则返回被覆盖的旧值
        2. 获取元素：V get(Object key); // 根据键获取值
        3. 删除元素：V remove(Object key); // 根据键删除键值对，返回被删除的值，如果键不存在，则返回null
        4. 判断元素：boolean containsKey(Object key); // 判断键是否存在
        5. 判断元素：boolean containsValue(Object value); // 判断值是否存在
        6. 获取大小：int size(); // 获取集合中键值对的个数
        7. 清空集合：void clear(); // 清空集合
 */
public class D07HashMap {
    public static void main(String[] args) {
        putMethod();
        System.out.println("--------------------");
        otherMethod();
    }

    private static void putMethod() {
        // 创建HashMap集合，存放省份和省会
        HashMap<String, String> map = new HashMap<>();
        // 添加广东省 佛山市
        String res1 = map.put("广东省", "佛山市");
        System.out.println(res1); // null
        System.out.println(map); // {广东省=佛山市}

        // 添加广东省 广州市
        String res2 = map.put("广东省", "广州市");
        System.out.println(res2); // 佛山市
        System.out.println(map); // {广东省=广州市}
    }

    private static void otherMethod() {
        HashMap<String, String> map = new HashMap<>();
        map.put("广东省", "广州市");
        map.put("河南省", "郑州市");
        map.put("湖北省", "武汉市");
        System.out.println(map.get("广东省")); // 广州市

        String remove = map.remove("河南省");
        System.out.println(remove); // 郑州市
        System.out.println(map); // 广东省=广州市, 湖北省=武汉市}

        System.out.println(map.containsKey("广东省")); // true
        System.out.println(map.containsValue("郑州市")); // false

        System.out.println(map.size()); // 2
        System.out.println(map.isEmpty()); // false
    }
}
