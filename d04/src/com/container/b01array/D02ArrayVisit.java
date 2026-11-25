package com.container.b01array;

/*
    目标：数组的访问与遍历
    访问：数组名[下标]
    遍历：for(int i = 0; i < arr.lenght; i++) {}
 */
public class D02ArrayVisit {
    public static void main(String[] args) {
        demo1();
        System.out.println("");
        demo2();
    }

    private static void demo1() {
        int[] arr = {10, 20, 30};
        System.out.println(arr[0]);
        arr[0] = 100;
        System.out.println(arr[0]);
    }

    private static void demo2() {
        int[] arr = {10, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
