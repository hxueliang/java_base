package com.object.b03polymorphic;

public class D04Dog extends D04Animal implements D04Swim {
    public D04Dog() {
    }

    public D04Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的狗 is eating");
    }

    public void swim() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的狗 在 狗刨");
    }
}
