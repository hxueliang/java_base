package com.object.b03polymorphic;

public class D03AFruitJuiceDemo {
    public static void main(String[] args) {
        makeJuice(new D03Apple());
        makeJuice(new D03Banana());
        makeJuice(new D03Orange());
    }

    public static void makeJuice(D03Fruit fruit) {
        fruit.makeJuice();
        System.out.println("加糖~加香精~~~");
        System.out.println("装杯~");
        System.out.println("");
    }

    /**
     * 如果没有多态，只能使用方法重载
     */
    /*
    public static void makeJuice(D03Apple apple) {
        apple.makeJuice();
        System.out.println("加糖~加香精~~~");
        System.out.println("装杯~");
        System.out.println("");
    }

    public static void makeJuice(D03Banana banana) {
        banana.makeJuice();
        System.out.println("加糖~加香精~~~");
        System.out.println("装杯~");
        System.out.println("");
    }

    public static void makeJuice(D03Orange orange) {
        orange.makeJuice();
        System.out.println("加糖~加香精~~~");
        System.out.println("装杯~");
        System.out.println("");
    }
    */
}
