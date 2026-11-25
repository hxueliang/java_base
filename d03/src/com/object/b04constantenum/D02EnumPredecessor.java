package com.object.b04constantenum;

public class D02EnumPredecessor {

    public static void main(String[] args) {

        method(D02Week.MONDAY);
        method(D02Week.TUESDAY);
    }

    public static void method(D02Week week) {

        if (week == D02Week.MONDAY) {
            System.out.println("星期一");
        } else if (week == D02Week.TUESDAY) {
            System.out.println("星期二");
        } else if (week == D02Week.WEDNESDAY) {
            System.out.println("星期三");
        } else if (week == D02Week.THURSDAY) {
            System.out.println("星期四");
        } else if (week == D02Week.FRIDAY) {
            System.out.println("星期五");
        } else if (week == D02Week.SATURDAY) {
            System.out.println("星期六");
        } else if (week == D02Week.SUNDAY) {
            System.out.println("星期日");
        } else {
            System.out.println("你输入的星期数有误");
        }

    }
}
