package com.object.b01encapsulation;

/**
 * 手机类
 */
public class D01Phone {
    /**
     * 电池容器
     */
    int batteryCapacity;
    /**
     * 手机尺寸
     */
    double size;
    /**
     * 手机颜色
     */
    String color;
    /**
     * 手机品牌
     */
    String brand;

    /**
     * 打电话
     */
    public void call(String number) {
        System.out.println("正在给" + number + "打电话");
    }

    /**
     * 发送短信
     */
    public void sendMessage(String message) {
        System.out.println("正在发送短信：" + message);
    }
}
