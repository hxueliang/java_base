package com.object.b03static;

public class D03AUsageScenario {
    public static void main(String[] args) {
        demo1();
        System.out.println("================");
        demo2();
    }

    private static void demo1() {
        D03MathUtils1 mathUtils1 = new D03MathUtils1();
        int max = mathUtils1.max(1, 2);
        int min = mathUtils1.min(1, 2);
        System.out.println(max);
        System.out.println(min);
    }

    private static void demo2() {
        int max = D03MathUtils2.max(1, 2);
        int min = D03MathUtils2.min(1, 2);
        System.out.println(max);
        System.out.println(min);
    }
}
