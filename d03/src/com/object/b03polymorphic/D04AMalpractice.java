package com.object.b03polymorphic;

/*
    多态的弊端：多态格式下无法调用子类的特有内容
 */
public class D04AMalpractice {
    public static void main(String[] args) {
        D04Animal animal = new D04Dog("旺财", 2);
        animal.eat();
        // animal.swim(); // animal类型变量，无法调用子类的特有内容
    }
}
