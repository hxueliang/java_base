package com.huangxl.b03flowcontrol;

import java.util.Scanner;

public class D05Scanner {
    /**
     * 键盘录入：Scanner
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入整数:");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("输入小数:");
        Double d = sc.nextDouble();
        System.out.println(d);
        System.out.println("输入字符串:");
        String s = sc.next();
        System.out.println(s);
    }
}
