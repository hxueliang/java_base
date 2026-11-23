package com.object.b02extends;

public class D01ExtendsBase {
    public static void main(String[] args) {
        D01Zi zi = new D01Zi();
        System.out.println(zi.fuNum);
        zi.fuMethod();

        // System.out.println(zi.fuNum2); // 子无法直接使用父的私有属性
        System.out.println(zi.getFuNum2()); // 但可以通过父类提供的方法访问
    }
}
