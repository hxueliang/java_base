package com.container.b03list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    目标：掌握HashMap常见的遍历方式
    1. 遍历键：keySet()
    2. 遍历键值对：entrySet()
    3. forEach()遍历键值对
 */
public class D08HashMapFor {
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        initMap();

        // keySet
        keySetMethod();
        System.out.println();

        // entrySet
        entrySetMethod();
        System.out.println();

        // forEach
        forEachMethod();
    }

    private static void keySetMethod() {
        Set<String> keySet = map.keySet();
        for (String k : keySet) {
            String v = map.get(k);
            System.out.println(k + "=" + v);
        }
    }

    private static void entrySetMethod() {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private static void forEachMethod() {
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    private static void initMap() {
        map.put("广东省", "广州市");
        map.put("河南省", "郑州市");
        map.put("湖北省", "武汉市");
    }
}
