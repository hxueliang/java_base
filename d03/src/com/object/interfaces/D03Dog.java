package com.object.interfaces;

public class D03Dog extends D03Animal implements D03Swim {
    public D03Dog() {
    }

    public D03Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的狗 is eating");
    }

    public void swim() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的狗 在 狗刨");
    }
}
