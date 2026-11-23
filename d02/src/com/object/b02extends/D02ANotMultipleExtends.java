package com.object.b02extends;

public class D02ANotMultipleExtends {
    public static void main(String[] args) {
        D02Zi zi = new D02Zi();

        zi.method(); // 如果能多继承，zi中没有method方法，会去父类中找，但两个父类中都有method方法，程序不知道要执行哪个
    }
}
