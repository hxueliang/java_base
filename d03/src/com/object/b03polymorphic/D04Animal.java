package com.object.b03polymorphic;

public abstract class D04Animal {
    private String name;
    private int age;

    public abstract void eat();

    public D04Animal() {
    }

    public D04Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
