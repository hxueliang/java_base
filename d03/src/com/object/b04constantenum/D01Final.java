package com.object.b04constantenum;

import java.util.Scanner;

/*
    final：
        修饰类：该类不能再被继承
            使用场景：当一个类不需要被继承时，可以使用final进行修饰
        修饰方法：该方法不能再被重写
            使用场景：当一个方法不需要被重写时，可以使用final进行修饰
        修饰变量：该变量是一个常量，不能再被修改
            局部变量：和普通变量一样的命名规范，即小驼峰命名法
            成员变量：自定义常量，命名规范：全部大写，单词之间用下划线连接
                使用场景：可以让普通常量更加见名知意，经常用于作为选项使用
 */
public class D01Final {
    // 人工服务
    static final int ARTIFICIAL_SERVICE = 0;
    // 自动服务
    static final int AUTOMATIC_SERVICE = 1;
    // 重听
    static final int REHEAR_SERVICE = 2;
    // 咨询
    static final int CONSULT_SERVICE = 3;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的选择");
        int choice = sc.nextInt();
        switch (choice) {
            case ARTIFICIAL_SERVICE -> System.out.println("人工服务");
            case AUTOMATIC_SERVICE -> System.out.println("自动服务");
            case REHEAR_SERVICE -> System.out.println("重听");
            case CONSULT_SERVICE -> System.out.println("咨询");
            default -> System.out.println("输入错误");
        }
    }
}
