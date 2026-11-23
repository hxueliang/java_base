package com.object.b02extends;

public class D08Student {
    String name;
    int age;

    public D08Student() {
    }

    public D08Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "D08Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
