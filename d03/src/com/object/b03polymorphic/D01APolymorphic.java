package com.object.b03polymorphic;

/*
    多态：父类引用指向子类对象，通过父类引用调用子类方法
    格式：父类型 变量名 = new 子类型();
    条件：两个类必须有关系，要么继承关系，要么实现关系
 */
public class D01APolymorphic {
    public static void main(String[] args) {
        D01Fu fu = new D01Zi();
    }
}
