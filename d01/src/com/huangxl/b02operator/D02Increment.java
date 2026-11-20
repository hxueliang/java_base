package com.huangxl.b02operator;

public class D02Increment {
    /**
     * 自增自减运算符
     * ++
     * --
     */
    public static void main(String[] args) {
        int a = 10; // 9 10 11 12
        int b = a-- + ++a; // 10+10=20 19 18
        int c = a++ * b-- + a++ / b--; // 10*20+11/19=200+0=200

        System.out.println(a); // 12
        System.out.println(b); // 18
        System.out.println(c); // 200

        System.out.println("=======");

        int x = 10;
        x = x++; // 先取值 再自增 再赋值，即：取x为10 => 然后x变11 => 10再赋值给x
        System.out.println(x);
        // <=>
        int y = 10;
        int z = y++;
        System.out.println(z);
    }
}
