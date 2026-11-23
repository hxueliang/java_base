package com.object.b02extends;

public class D07Zi extends D07Fu {
    int ziNum = 3;
    int a = 33;

    public void ziMethod() {
        int num = 4;
        int a = 44;
        System.out.println("子访问父：" + fuNum);
        System.out.println("子访问子：" + ziNum);
        System.out.println("子访问局部：" + num);
        System.out.println("========================");
        System.out.println("子访问父a：" + super.a);
        System.out.println("子访问子a：" + this.a);
        System.out.println("子访问局部a：" + a);
    }
}
