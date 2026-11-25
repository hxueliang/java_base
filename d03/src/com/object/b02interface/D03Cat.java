package com.object.b02interface;

public class D03Cat extends D03Animal {
    public D03Cat() {
    }

    public D03Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的猫 is eating");
    }
}
