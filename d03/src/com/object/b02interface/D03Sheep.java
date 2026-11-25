package com.object.b02interface;

public class D03Sheep extends D03Animal {
    public D03Sheep() {
    }

    public D03Sheep(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的羊 is eating");
    }
}
