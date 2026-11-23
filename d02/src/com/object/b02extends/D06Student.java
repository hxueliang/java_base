package com.object.b02extends;

import java.util.Objects;

public class D06Student {
    String name;
    int age;

    public D06Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        @Override是jdk专门提供的注解，用于检查方法是否正确重写
        加不加都行，只要符合重写规则即可
        如果方法被@Override注解，但没有正确重写，编译器会报错
    */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        D06Student student = (D06Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
