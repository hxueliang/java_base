package com.object.interfaces;

public class D03Man extends D03Animal implements D03Swim, D03Drive {
    public D03Man() {
    }

    public D03Man(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的男人 在 吃饭");
    }

    public void swim() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的男人 在 自由泳");
    }

    public void drive() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的男人 在 开车");
    }
}
