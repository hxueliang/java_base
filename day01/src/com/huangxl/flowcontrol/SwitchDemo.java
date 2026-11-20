package com.huangxl.flowcontrol;

public class SwitchDemo {
    public static void main(String[] args) {
        logDay(1);
        logDay(5);
        logDay(6);
        logDay(8);
        System.out.println("========");
        logDayJDK12(1);
        logDayJDK12(5);
        logDayJDK12(6);
        logDayJDK12(8);
    }

    public static void logDay(int d) {

        switch (d) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("周末");
                break;
            default:
                System.out.println("输入错误");
        }
    }


    public static void logDayJDK12(int d) {

        /*
        switch (d) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("周末");
                break;
            default:
                System.out.println("输入错误");
        }
         */

        switch (d) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("工作日");
            }
            case 6, 7 -> System.out.println("周末");
            default -> System.out.println("输入错误");

        }
    }


}
