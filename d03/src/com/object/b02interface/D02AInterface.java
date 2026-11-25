package com.object.b02interface;

/*
    如何使用，定义一个类实现接口：
    public class 类名 implements 接口名{
        // 重写接口中的抽象方法
    }
 */
public class D02AInterface {
    public static void main(String[] args) {
        D02BImpl impl = new D02BImpl();
        impl.method();
    }
}
