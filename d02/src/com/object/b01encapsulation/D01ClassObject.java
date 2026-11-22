package com.object.b01encapsulation;

/**
 * 类和对象
 */
public class D01ClassObject {
    public static void main(String[] args) {
        D01Phone phone = new D01Phone();
        phone.batteryCapacity = 4000;
        phone.brand = "HUAWEI";
        phone.size = 14.5;
        phone.color = "black";
        System.out.println("手机品牌：" + phone.brand +
                ", 电池容量：" + phone.batteryCapacity +
                ", 手机尺寸：" + phone.size +
                ", 手机颜色：" + phone.color
        );

        System.out.println("===========");
        phone.call("12345678901");
        phone.sendMessage("Hello, World!");
    }
}