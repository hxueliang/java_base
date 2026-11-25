package com.object.b03polymorphic;

public class D04Cat extends D04Animal {
    public D04Cat() {
    }

    public D04Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("名字叫" + getName() + "，" + getAge() + "岁的猫 is eating");
    }
}
