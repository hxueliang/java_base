package com.java.base.b01variable;

public class D01BasicDataType {
    /**
     * 基本数据类型：
     * 整数：
     * byte(1字节)：-128 ~ 127
     * short(2字节)：-32768 ~ 32767
     * int(4字节)：-2147483648 ~ 2147483647
     * long(8字节)：-9223372036854775808 ~ 9223372036854775807
     * 小数：
     * float(4字节)：1.4E-45 ~ 3.4028235E38
     * double(8字节)：4.9E-324 ~ 1.7976931348623157E308
     * 字符：
     * char(2字节)：'\u0000' ~ '\uffff'
     * 布尔：
     * boolean(1字节)：true, false
     */
    public static void main(String[] args) {
        byte b = 128 - 1;
        short s = 32768 - 1;
        // int i = 2147483648 - 1;
        int i = 2147483647;
        long l = 2147483648L; // 2147483648，存储的整数过大，必须加上L修饰

        // float f = 3.14;
        float f = 3.14F; // 小数默认是double类型，如果要存储float类型，必须加上F修饰
        double d = 3.14;

        // char c = '10';
        char c = '1';

        boolean bool = true;
    }
}
