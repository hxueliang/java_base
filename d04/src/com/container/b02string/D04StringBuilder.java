package com.container.b02string;


public class D04StringBuilder {
    public static int count = 100000;

    public static void main(String[] args) {
        stringDemo();
        System.out.println("----------------------------");
        stringBuilderDemo();
    }

    private static void stringDemo() {
        long start = System.currentTimeMillis();
        String s = "aaa";
        for (int i = 0; i < count; i++) {
            s += "bbb";
        }
        long end = System.currentTimeMillis();
        System.out.println("length为" + s.length() + "，花费" + (end - start) + "ms"); // length为300003，花费2159ms
    }

    private static void stringBuilderDemo() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("aaa");
        for (int i = 0; i < count; i++) {
            sb.append("bbb");
        }
        long end = System.currentTimeMillis();
        System.out.println("length为" + sb.length() + "，花费" + (end - start) + "ms"); // length为300003，花费5ms
    }
}
