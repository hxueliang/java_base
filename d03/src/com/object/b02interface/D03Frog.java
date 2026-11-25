package com.object.b02interface;

public class D03Frog extends D03Animal implements D03Swim {
    public D03Frog() {
    }

    public D03Frog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的青蛙 is eating");
    }

    public void swim() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的青蛙 在 蛙泳");
    }
}
