package com.object.b01abstract;

public class D02AEmployeeDemo {
    public static void main(String[] args) {
        // new D02Employee(); // ` D02Employee `是抽象的；不能实例化

        D02Manager hxl = new D02Manager(1, "hxl", 30000.0, 20000.0);
        hxl.work();

        D02Coder xl = new D02Coder(2, "xl", 40000.0);
        xl.work();
    }
}
