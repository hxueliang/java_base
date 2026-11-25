package com.object.b01abstract;

public class D03APayDemo {
    public static void main(String[] args) {
        D03CardGold cardGold = new D03CardGold("hxl", 1600);
        cardGold.pay(1000);
        cardGold.pay(1000);
        cardGold.pay(1000);
        System.out.println("==================================");

        D03CardSilver cardSilver = new D03CardSilver("hxl", 1600);
        cardSilver.pay(1000);
        cardSilver.pay(1000);
        cardSilver.pay(1000);
    }
}
