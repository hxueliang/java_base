package com.container.b01array;

/*
    目标：掌握数组的定义格式
    概念：存储多个相同类型数据的容器
    格式：
        静态初始化：已知元素不知长度
            简写：数据类型[] 变量名 = {元素1, 元素2, 元素3, ...}
            完整：数据类型[] 变量名 = new 数据类型[]{元素1, 元素2, 元素3, ...}
            区别：简写格式定义的时候就要赋值；完整格式可以先定义后赋值（场景：方法形参先定义了变量，实参必须用完整格式传入）
        动态初始化：已知长度不知元素
            数据类型[] 变量名 = new 数据类型[长度];
 */
public class D01ArrayDefined {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        double[] arr2 = new double[]{1.1, 2.1, 3.1};

        // showArr({1,2,3}); // 报错，简写格式定义的时候就要赋值
        showArr(new int[]{1, 2, 3}); // 完整格式可以先定义后赋值

        // 动态初始化
        int[] arr3 = new int[3];
    }

    public static void showArr(int[] arr) {
        // ...
    }
}
