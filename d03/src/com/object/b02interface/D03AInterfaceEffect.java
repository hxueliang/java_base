package com.object.b02interface;

/*
    接口的作用：
        弥补单继承的不足
        可以让类继承父类的同时，实现多个接口
        可以给类更多的身份，
        可以结合多态，完成将接口相关内容筛选出来的目的
    接口和抽象类的区别：
        接口定义规则比较灵活，可以让类选择实现的接口                 抽象类则必须实现抽象类中定义的抽象方法
        接口没有构造方法                                        抽象类有构造方法
        接口只有静态变量                                        抽象类可以有静态变量，也可以有实例变量
        接口在jdk1.7以及之前只能定义抽象方法                      抽象类可以定义抽象方法，也可以定义普通方法

 */
public class D03AInterfaceEffect {
    public static void main(String[] args) {
        D03Cat cat = new D03Cat("小白", 2);
        cat.eat();
        System.out.print("\n");

        D03Sheep sheep = new D03Sheep("小黑", 3);
        sheep.eat();
        System.out.print("\n");

        D03Dog dog = new D03Dog("小黄", 4);
        dog.eat();
        dog.swim();
        System.out.print("\n");

        D03Frog frog = new D03Frog("小绿", 1);
        frog.eat();
        frog.swim();
        System.out.print("\n");

        D03Man man = new D03Man("小张", 20);
        man.eat();
        man.swim();
        man.drive();
    }
}
