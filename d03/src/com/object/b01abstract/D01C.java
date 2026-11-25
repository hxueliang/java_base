package com.object.b01abstract;

public class D01C extends D01B {
    // 要么子类重写抽象方法
    @Override
    public void method() {
        System.out.println("我在子类D01C中，我重D01B的抽象方法");
    }
}
