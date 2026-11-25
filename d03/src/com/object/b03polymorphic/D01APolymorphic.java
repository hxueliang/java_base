package com.object.b03polymorphic;

/*
    多态：父类引用指向子类对象，通过父类引用调用子类方法
    格式：父类型 变量名 = new 子类型();
    条件：
        1.必须有继承关系或实现关系
        2.必须有父类引用指向子类对象
        3.必须调用子类重写父类的方法
            因为多态格式只能访问父类中定义的共性内容，如果没对父类进行重写，那么多态格式就没有意义，
            访问的只是父类已经定义的内容，那和 new 父类() 没有区别了，没有必要多态
            多态最大的意义，行为多态，不同子类对象调用相同方法，表现出不同行为
 */
public class D01APolymorphic {
    public static void main(String[] args) {
        D01Fu fu = new D01Zi();
    }
}
