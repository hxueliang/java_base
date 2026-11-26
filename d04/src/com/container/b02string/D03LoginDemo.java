package com.container.b02string;


import java.util.Scanner;

public class D03LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();

            if (name.equals("hxl") && pwd.equals("123")) {
                System.out.println("欢迎登录系统~");
                break;
            } else {
                int count = 2 - i;
                if (count == 0) {
                    System.out.println("账号已锁定，系统退出");
                    break;
                }
                System.out.println("账号或密码错误" + "剩下" + count + "次机会");
                System.out.println("-----------------------------");
            }
        }
    }
}
